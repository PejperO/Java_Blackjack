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
        ImageIcon iconHit = new ImageIcon("data/img/hit.png");
        buttonHit.setHorizontalTextPosition(JButton.CENTER);
        buttonHit.setIcon(iconHit);
        buttonHit.setText("HIT");
        buttonHit.setFont(new Font("Comic Sans", Font.BOLD,20));
        buttonHit.setVerticalTextPosition(JButton.BOTTOM);
        buttonHit.setForeground(Color.BLACK);
        buttonHit.setFocusable(false);
        buttonHit.setVisible(true);
        buttonHit.setOpaque(false);
        buttonHit.setContentAreaFilled(false);
        buttonHit.setBorderPainted(false);
        add(buttonHit);

        JButton buttonDouble = new JButton();
        buttonDouble.setBounds(700, 750, 130, 100);
        ImageIcon iconDouble = new ImageIcon("data/img/double.png");
        buttonDouble.setHorizontalTextPosition(JButton.CENTER);
        buttonDouble.setIcon(iconDouble);
        buttonDouble.setText("DOUBLE");
        buttonDouble.setFont(new Font("Comic Sans", Font.BOLD,20));
        buttonDouble.setVerticalTextPosition(JButton.BOTTOM);
        buttonDouble.setForeground(Color.BLACK);
        buttonDouble.setFocusable(false);
        buttonDouble.setVisible(true);
        buttonDouble.setOpaque(false);
        buttonDouble.setContentAreaFilled(false);
        buttonDouble.setBorderPainted(false);
        add(buttonDouble);

        JButton buttonSplit = new JButton();
        buttonSplit.setBounds(460, 750, 90, 100);
        ImageIcon iconSplit = new ImageIcon("data/img/split.png");
        buttonSplit.setHorizontalTextPosition(JButton.CENTER);
        buttonSplit.setIcon(iconSplit);
        buttonSplit.setText("SPLIT");
        buttonSplit.setFont(new Font("Comic Sans", Font.BOLD,20));
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
        ImageIcon iconStay = new ImageIcon("data/img/stay.png");
        buttonStay.setHorizontalTextPosition(JButton.CENTER);
        buttonStay.setIcon(iconStay);
        buttonStay.setText("STAY");
        buttonStay.setFont(new Font("Comic Sans", Font.BOLD,20));
        buttonStay.setVerticalTextPosition(JButton.BOTTOM);
        buttonStay.setForeground(Color.BLACK);
        buttonStay.setFocusable(false);
        buttonStay.setVisible(true);
        buttonStay.setOpaque(false);
        buttonStay.setContentAreaFilled(false);
        buttonStay.setBorderPainted(false);
        add(buttonStay);
        //buttonStay.setEnabled(false);
    }
}
