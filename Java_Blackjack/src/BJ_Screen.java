import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BJ_Screen extends JPanel implements Runnable{

    public Thread thread;
    public final Calculations calculations;
    public static BJ_Cards bj_cards;
    public static int card_position = 0;
    public static boolean hitButton = false;


    public BJ_Screen(){
        thread = new Thread(this);
        bj_cards = new BJ_Cards();
        calculations = new Calculations();
    }

    public void start(){
        thread = new Thread(this);
        thread.start();
    }

    public void drawStats(Graphics g){
        g.setFont(new Font("Times new roman", Font.BOLD,20));
        g.setColor(Color.GRAY);
        g.drawString("YOUR MONEY: " + calculations.yourMoney, 20, 30);
        g.drawString("Bet Value: " + calculations.betValue, 20, 55);
    }

    public static void backGround(Graphics g) throws IOException{
        g.drawImage(ImageIO.read(new File("data/img/BGround/BGround3.2.png")),0,0,null);
        for(int i=0; i < 12; i=i+2)
            bj_cards.drawReverse(g, 1115, 10 + i);
    }

    public static void HitCard(Graphics g) throws IOException{
        bj_cards.getCard(g, 590 + card_position,500);
        card_position += 40;
    }

    public static void testedCards(Graphics g) throws IOException, InterruptedException {

        //1st player card
        bj_cards.getCard(g, 550, 500);

        //2nd player card
        bj_cards.getCard(g,590,500);

        //1st dealer card
        bj_cards.getCard(g,550,50);

        //2nd dealer card
        bj_cards.drawReverse(g, 590, 50);
    }

    @Override
    public void run() {

    }

    @Override
    public void paint(Graphics g) {

        try {
            backGround(g);
            testedCards(g);

            if(hitButton) {
                HitCard(g);
                hitButton = false;
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        drawStats(g);
    }
}
