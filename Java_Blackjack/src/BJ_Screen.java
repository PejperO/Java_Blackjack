import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BJ_Screen extends JPanel implements Runnable{

    private Thread thread;
    private final Calculations engine;  //adding different files
    private static Card card;

    public  BJ_Screen(){    //for easier work on different files
        thread = new Thread(this);
        card = new Card();
        engine = new Calculations();
    }

    public void start(){    //IDK why I use thread
        thread = new Thread(this);
        thread.start();
    }

    public void drawStats(Graphics g){  //some stats
        //setFont(new Font("Comic Sans", Font.BOLD,20));
        g.drawString("YOUR MONEY: " + engine.yourMoney, 20, 20);
        g.drawString("Bet Value" + engine.betValue, 20, 40);
    }

    public static void backGround(Graphics g) throws IOException{ //making a background
        g.drawImage(ImageIO.read(new File("data/img/BGround/BGround3.2.png")),0,0,null);   //table

        for(int i=0; i < 12; i=i+2) //adding all cards look
            card.drawReverse(g, 1115, 10 + i);
    }

    public static void testedCards(Graphics g) throws IOException, InterruptedException { //to see how it should look like
        int x = 1115, y = 22;
        //1st player card
        /*
        for(int i = y; i <= 500; ++i) {
            card.getCard(g, 1115, i);
            Thread.sleep(0, 1);
        }
        for(int i = x; i >= 550; --i) {
            card.getCard(g, i, 500);
            Thread.sleep(0, 1);
        }
        */
        card.getCard(g, 550, 500);

        //2nd player card
        card.getCard(g,590,500);

        //1st dealer card
        card.getCard(g,550,50);

        //2nd dealer card
        card.drawReverse(g, 590, 50);
    }

    @Override
    public void run() {
        //empty for now :>
    }

    @Override
    public void paint(Graphics g){
        try {
            backGround(g);  //making a background
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            testedCards(g); //preview
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        drawStats(g);   //adding stats for better look
    }
}
