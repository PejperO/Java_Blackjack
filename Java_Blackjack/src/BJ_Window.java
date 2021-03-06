import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BJ_Window extends JFrame {

    public static int windowSizeX = 1_280;
    public static int windowSizeY = 920;

    public BJ_Window(){
        super("Black Jack");
        setSize(windowSizeX, windowSizeY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon imageICO = new ImageIcon("data/img/icon.png");
        setIconImage(imageICO.getImage());
        setResizable(false);

        buttonPanel();

        BJ_Screen bj = new BJ_Screen();
        add(bj);
        bj.start();
    }

    public static void main(String[] args){
        BJ_Window bj = new BJ_Window();
        bj.setVisible(true);
    }

    public void buttonPanel(){
        buttonHit();
        buttonDouble();
        buttonSplit();
        buttonStay();
    }

    public void buttonHit() {
        JButton buttonHit = new JButton();
        buttonHit.setBounds(880, 750, 90, 100);
        buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit.png"));
        buttonHit.setText("HIT");
        buttonProperties(buttonHit);
        //buttonHit.addActionListener(e -> buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit_h.png")));
        buttonHit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit_e.png"));
                buttonHit.setForeground(Color.GRAY);
            }

            public void mouseExited(MouseEvent me) {
                buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit.png"));
                buttonHit.setForeground(Color.BLACK);
            }

            public void mousePressed(MouseEvent me) {
                buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit_h.png"));
                buttonHit.setForeground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent me) {
                buttonHit.setIcon(new ImageIcon("data/img/Buttons/hit_e.png"));
                buttonHit.setForeground(Color.GRAY);
            }

            public void mouseClicked(MouseEvent me) {
                System.out.println("HIT");
                BJ_Screen.hitButton = true;
            }
        });
        add(buttonHit);
    }

    public void buttonDouble(){
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
    }

    public void buttonSplit(){
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
    }

    public void buttonStay(){
        JButton buttonStay = new JButton();
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

    public static void buttonProperties(JButton button) {

        button.setFont(new Font("Comic Sans", Font.BOLD,20));

        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setForeground(Color.BLACK);

        button.setFocusable(false);
        button.setVisible(true);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }
}
