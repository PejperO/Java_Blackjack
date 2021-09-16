import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BJ_Screen extends JPanel {

    /*
    private Thread thread;
    private Card card;

    public BJ_Screen() {
        thread = new Thread((Runnable) this);
        card = new Card();
    }

    public void start() {
        thread = new Thread((Runnable) this);
        thread.start(); //actually idk why imo useless
    }
    */

    public void background(Graphics g) throws IOException {
        g.drawImage(ImageIO.read(new File("data/img/BackgroundHD.jpg")),0,0,null);
    }

    @Override
    public void paint(Graphics g){
        try {
            background(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
