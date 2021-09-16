import javax.swing.*;
import java.io.IOException;

public class BJ_Window extends JFrame{

    public static int windowSizeX = 1_280;
    public static int windowSizeY = 720;

    public BJ_Window() throws IOException {
        super("Black Jack");
        setSize(windowSizeX, windowSizeY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        BJ_Window bj = new BJ_Window();
        bj.setVisible(true);
    }
}
