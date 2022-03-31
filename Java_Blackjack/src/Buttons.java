import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Buttons extends JFrame{

    public Buttons(){

    }

    public void buttonPanel(){

        JButton buttonHit = new JButton();  //setting button
        buttonHit.setBounds(880, 750, 90, 100);
        buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit.png"));
        buttonHit.setText("HIT");
        buttonProperties(buttonHit);    //more properties
        buttonHit.addActionListener(e -> buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit_h.png")));
        buttonHit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me){
                buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit_e.png"));
                buttonHit.setForeground(Color.GRAY);
            }
            public void mouseExited(MouseEvent me){
                buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit.png"));
                buttonHit.setForeground(Color.BLACK);
            }
            public void mousePressed(MouseEvent me){
                buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit_h.png"));
                buttonHit.setForeground(Color.WHITE);
            }
            public void mouseReleased(MouseEvent me){
                buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit_e.png"));
                buttonHit.setForeground(Color.GRAY);
            }
            public void mouseClicked(MouseEvent me){
                System.out.println("HIT");  //after click - shot message
                BJ_Screen.hitButton = true;
            }
        });
        add(buttonHit);

        JButton buttonDouble = new JButton();
        buttonDouble.setBounds(710, 750, 120, 100);
        buttonDouble.setIcon(new ImageIcon("data/img/Buttons/double.png"));
        buttonDouble.setText("DOUBLE");
        buttonProperties(buttonDouble);
        buttonDouble.addActionListener(e -> System.out.println("DOUBLE"));
        buttonDouble.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me){
                buttonDouble.setIcon(new ImageIcon("data/img/Buttons/double_e.png"));
                buttonDouble.setForeground(Color.GRAY);
            }
            public void mouseExited(MouseEvent me){
                buttonDouble.setIcon(new ImageIcon("data/img/Buttons/double.png"));
                buttonDouble.setForeground(Color.BLACK);
            }
            public void mousePressed(MouseEvent me){
                buttonDouble.setIcon(new ImageIcon("data/img/Buttons/double_h.png"));
                buttonDouble.setForeground(Color.WHITE);
            }
            public void mouseReleased(MouseEvent me){
                buttonDouble.setIcon(new ImageIcon("data/img/Buttons/double_e.png"));
                buttonDouble.setForeground(Color.GRAY);
            }
        });
        add(buttonDouble);

        JButton buttonSplit = new JButton();
        buttonSplit.setBounds(460, 750, 90, 100);
        buttonSplit.setIcon(new ImageIcon("data/img/Buttons/split.png"));
        buttonSplit.setText("SPLIT");
        buttonProperties(buttonSplit);
        buttonSplit.addActionListener(e -> System.out.println("SPLIT"));
        buttonSplit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me){
                buttonSplit.setIcon(new ImageIcon("data/img/Buttons/split_e.png"));
                buttonSplit.setForeground(Color.GRAY);
            }
            public void mouseExited(MouseEvent me){
                buttonSplit.setIcon(new ImageIcon("data/img/Buttons/split.png"));
                buttonSplit.setForeground(Color.BLACK);
            }
            public void mousePressed(MouseEvent me){
                buttonSplit.setIcon(new ImageIcon("data/img/Buttons/split_h.png"));
                buttonSplit.setForeground(Color.WHITE);
            }
            public void mouseReleased(MouseEvent me){
                buttonSplit.setIcon(new ImageIcon("data/img/Buttons/split_e.png"));
                buttonSplit.setForeground(Color.GRAY);
            }
        });
        add(buttonSplit);

        JButton buttonStay = new JButton(); // I know there is a vay to compress the buttons
        buttonStay.setBounds(320, 750, 90, 100);
        buttonStay.setIcon(new ImageIcon("data/img/Buttons/stay.png"));
        buttonStay.setText("STAY");
        buttonProperties(buttonStay);
        buttonStay.addActionListener(e -> System.out.println("STAY"));
        buttonStay.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me){
                buttonStay.setIcon(new ImageIcon("data/img/Buttons/stay_e.png"));
                buttonStay.setForeground(Color.GRAY);
            }
            public void mouseExited(MouseEvent me){
                buttonStay.setIcon(new ImageIcon("data/img/Buttons/stay.png"));
                buttonStay.setForeground(Color.BLACK);
            }
            public void mousePressed(MouseEvent me){
                buttonStay.setIcon(new ImageIcon("data/img/Buttons/stay_h.png"));
                buttonStay.setForeground(Color.WHITE);
            }
            public void mouseReleased(MouseEvent me){
                buttonStay.setIcon(new ImageIcon("data/img/Buttons/stay_e.png"));
                buttonStay.setForeground(Color.GRAY);
            }
        });
        add(buttonStay);
    }

    private static void buttonProperties(JButton button) { //mutual button properties

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
