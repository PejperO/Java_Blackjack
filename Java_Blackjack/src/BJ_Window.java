import javax.swing.*;
import java.awt.*;

public class BJ_Window extends JFrame {

    public static int windowSizeX = 1_280;
    public static int windowSizeY = 920;

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
        buttonHit.setBounds(880, 750, 90, 100);
        buttonHit.setText("HIT");
        buttonHit.setFocusable(false);
        add(buttonHit);

        JButton buttonDouble = new JButton();
        buttonDouble.setBounds(740, 750, 90, 100);
        buttonDouble.setText("Double");
        buttonDouble.setFocusable(false);
        add(buttonDouble);

        JButton buttonSplit = new JButton();

        buttonSplit.setBounds(460, 750, 90, 100);

        ImageIcon icon = new ImageIcon("data/img/doublem.png");
        buttonSplit.setHorizontalTextPosition(JButton.CENTER);
        buttonSplit.setIcon(icon);

        buttonSplit.setText("Split");
        buttonSplit.setFont(new Font("Comic Sans", Font.BOLD,25));
        buttonSplit.setVerticalTextPosition(JButton.BOTTOM);
        buttonSplit.setForeground(Color.BLACK);

        buttonSplit.setFocusable(false);
        buttonSplit.setVisible(true);
        buttonSplit.setOpaque(false);
        buttonSplit.setContentAreaFilled(false);
        buttonSplit.setBorderPainted(false);
        //buttonSplit.setBorder(BorderFactory.createEtchedBorder());

        add(buttonSplit);

        JButton buttonStay = new JButton();
        buttonStay.setBounds(320, 750, 90, 100);
        buttonStay.setText("Stay");
        buttonStay.setFocusable(false);
        add(buttonStay);
        //buttonStay.setEnabled(false);
    }
}
