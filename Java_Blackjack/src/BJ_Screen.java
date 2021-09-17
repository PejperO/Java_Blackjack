import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BJ_Screen extends JPanel {

    JButton button;

    public void Buttons(){
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
    }

    @Override
    public void  paint(Graphics g){
        try {
            g.drawImage(ImageIO.read(new File("data/img/BackgroundHD.jpg")),0,0,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
