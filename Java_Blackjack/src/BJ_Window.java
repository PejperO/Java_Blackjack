import javax.swing.*;

public class BJ_Window extends JFrame {

    public static int windowSizeX = 1_280;  //window size...
    public static int windowSizeY = 920;

    public BJ_Window(){
        super("Black Jack");    //making window look better
        setSize(windowSizeX, windowSizeY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageICO = new ImageIcon("data/img/icon.png");
        setIconImage(imageICO.getImage());
        setResizable(false);

        BJ_Screen bj_screen = new BJ_Screen(); //adding a playable environment
        add(bj_screen);
        bj_screen.start();

        Buttons buttons = new Buttons();
        add(buttons);
        buttons.buttonPanel();
    }

    public static void main(String[] args){
        BJ_Window bj = new BJ_Window(); //making window
        bj.setVisible(true);
    }
}
