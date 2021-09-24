import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BJ_Screen extends JPanel {

    @Override
    public void  paint(Graphics g){ //making a background
        try {
            g.drawImage(ImageIO.read(new File("data/img/BGround.jpg")),0,0,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
