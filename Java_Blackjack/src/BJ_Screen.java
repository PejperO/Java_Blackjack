import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BJ_Screen extends JPanel {

    @Override
    public void paint(Graphics g){ //making a background

        try {
            g.drawImage(ImageIO.read(new File("data/img/BGround.jpg")),0,0,null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            g.drawImage(ImageIO.read(new File("data/img/Cards/11M.png")),550,500,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            g.drawImage(ImageIO.read(new File("data/img/Cards/131M.png")),590,500,null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            g.drawImage(ImageIO.read(new File("data/img/Cards/11M.png")),550,50,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            g.drawImage(ImageIO.read(new File("data/img/Cards/reverse.png")),590,50,null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            g.drawImage(ImageIO.read(new File("data/img/Cards/reverse.png")),1115,10,null);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
