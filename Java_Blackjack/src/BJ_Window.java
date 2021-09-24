import javax.swing.*;
import java.awt.*;

public class BJ_Window extends JFrame {

    public static int windowSizeX = 1_280;  //window size...
    public static int windowSizeY = 920;

    public BJ_Window() {
        super("Black Jack");    //making window look better
        setSize(windowSizeX, windowSizeY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageICO = new ImageIcon("data/img/icon.png");
        setIconImage(imageICO.getImage());
        setResizable(false);

        buttonPanel();

        BJ_Screen bj = new BJ_Screen(); //for now just background
        add(bj);
    }

    public static void main(String[] args) {
        BJ_Window bj = new BJ_Window(); //making window
        bj.setVisible(true);
    }

    public void buttonPanel(){

        JButton buttonHit = new JButton();  //setting button
        buttonHit.setBounds(880, 750, 90, 100);
        buttonHit.setIcon(new ImageIcon("data/img/hit.png"));
        buttonHit.setText("HIT");
        buttonProperties(buttonHit);    //more properties
        buttonHit.addActionListener(e -> System.out.println("HIT :>")); //after click - shot message
        add(buttonHit);

        JButton buttonDouble = new JButton();
        buttonDouble.setBounds(700, 750, 130, 100);
        buttonDouble.setIcon(new ImageIcon("data/img/double.png"));
        buttonDouble.setText("DOUBLE");
        buttonProperties(buttonDouble);
        buttonDouble.addActionListener(e -> System.out.println("DOUBLE :>"));
        add(buttonDouble);

        JButton buttonSplit = new JButton();
        buttonSplit.setBounds(460, 750, 90, 100);
        buttonSplit.setIcon(new ImageIcon("data/img/split.png"));
        buttonSplit.setText("SPLIT");
        buttonProperties(buttonSplit);
        buttonSplit.addActionListener(e -> System.out.println("SPLIT :>"));
        add(buttonSplit);

        JButton buttonStay = new JButton(); // I know there is a vay to compress the buttons
        buttonStay.setBounds(320, 750, 90, 100);
        buttonStay.setIcon(new ImageIcon("data/img/stay.png"));
        buttonStay.setText("STAY");
        buttonProperties(buttonStay);
        buttonStay.addActionListener(e -> System.out.println("STAY :>"));
        add(buttonStay);
    }

    private void buttonProperties(JButton button) { //mutual button properties
        button.setFont(new Font("Comic Sans", Font.BOLD,20));    //font
        button.setHorizontalTextPosition(JButton.CENTER);   //making button look better
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setForeground(Color.BLACK);
        button.setFocusable(false);
        button.setVisible(true);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }
}
