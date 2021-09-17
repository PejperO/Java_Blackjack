import javax.swing.*;

public class BJ_Window extends JFrame {

    public static int windowSizeX = 1_280;
    public static int windowSizeY = 720;

    public BJ_Window() {
        super("Black Jack");
        setSize(windowSizeX, windowSizeY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageICO = new ImageIcon("data/img/icon.png");
        setIconImage(imageICO.getImage());
        setResizable(false);

        buttonPanel();

        BJ_Screen bj = new BJ_Screen();
        add(bj);
    }

    public static void main(String[] args) {
        BJ_Window bj = new BJ_Window();
        bj.setVisible(true);
    }

    public void buttonPanel(){
        JButton buttonHit = new JButton();
        buttonHit.setBounds(880, 550, 80, 80);
        buttonHit.setText("HIT");
        buttonHit.setFocusable(false);
        add(buttonHit);

        JButton buttonDouble = new JButton();
        buttonDouble.setBounds(740, 550, 80, 80);
        buttonDouble.setText("Double");
        buttonDouble.setFocusable(false);
        add(buttonDouble);

        JButton buttonSplit = new JButton();
        buttonSplit.setBounds(460, 550, 80, 80);
        buttonSplit.setText("Split");
        buttonSplit.setFocusable(false);
        add(buttonSplit);

        JButton buttonStay = new JButton();
        buttonStay.setBounds(320, 550, 80, 80);
        buttonStay.setText("Stay");
        buttonStay.setFocusable(false);
        add(buttonStay);
    }
}
