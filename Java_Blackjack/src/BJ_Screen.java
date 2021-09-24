import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BJ_Screen extends JPanel {

    @Override
    public void paint(Graphics g){

        backGround(g);  //making a background
        testedCards(g); //preview

        try {
            new Card().getCard(g);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void backGround(Graphics g){ //making a background
        try {
            g.drawImage(ImageIO.read(new File("data/img/BGround.jpg")),0,0,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testedCards(Graphics g){ //to see how it should look like
        try {   //1st player card
            g.drawImage(ImageIO.read(new File("data/img/Cards/11.png")),550,500,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {   //2nd player card
            g.drawImage(ImageIO.read(new File("data/img/Cards/131.png")),590,500,null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {   //all cards
            g.drawImage(ImageIO.read(new File("data/img/Cards/11.png")),550,50,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {   //1st dealer card
            g.drawImage(ImageIO.read(new File("data/img/Cards/reverse.png")),590,50,null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {   //2nd dealer card
            g.drawImage(ImageIO.read(new File("data/img/Cards/reverse.png")),1115,10,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
