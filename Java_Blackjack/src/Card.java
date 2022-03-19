import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Card {

    private static int cardValue;
    private static int cardColor;
    private static BufferedImage cardImage;

    public void getCard(Graphics g, int x, int y) throws IOException {
        cardSelection();
        cardImage();
        drawCard(g,x,y);
    }

    public static void cardSelection(){
        cardValue = (int) (Math.random() * 13) + 1; //getting the value of a card (1 - 13)
        //cardColor = (int) (Math.random() * 4) + 1;  //getting the color of a card (1 - 4)
        cardColor = 1;  //for now only having one color
    }

    public void drawCard(Graphics g, int x, int y) throws IOException {
        g.drawImage(cardImage, x, y, null); //drawing a card
    }

    public void drawReverse(Graphics g, int x, int y){
        try {   //drawing a reverse of a card
            g.drawImage(ImageIO.read(new File("data/img/Cards/reverse.png")), x, y, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cardImage() throws IOException {    //giving a card right image
        switch (cardValue) {
            case 1:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/11.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/12.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/13.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/14.png"));
                }
                break;
            case 2:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/21.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/22.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/23.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/24.png"));
                }
                break;
            case 3:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/31.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/32.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/33.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/34.png"));
                }
                break;
            case 4:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/41.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/42.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/43.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/44.png"));
                }
                break;
            case 5:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/51.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/52.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/53.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/54.png"));
                }
                break;
            case 6:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/61.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/62.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/63.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/64.png"));
                }
                break;
            case 7:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/71.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/72.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/73.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/74.png"));
                }
                break;
            case 8:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/81.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/82.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/83.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/84.png"));
                }
                break;
            case 9:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/91.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/92.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/93.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/94.png"));
                }
                break;
            case 10:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/101.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/102.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/103.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/104.png"));
                }
                break;
            case 11:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/111.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/112.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/113.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/114.png"));
                }
                break;
            case 12:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/121.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/122.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/123.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/124.png"));
                }
                break;
            case 13:
                switch (cardColor) {
                    case 1 -> cardImage = ImageIO.read(new File("data/img/Cards/131.png"));
                    case 2 -> cardImage = ImageIO.read(new File("data/img/Cards/132.png"));
                    case 3 -> cardImage = ImageIO.read(new File("data/img/Cards/133.png"));
                    case 4 -> cardImage = ImageIO.read(new File("data/img/Cards/134.png"));
                }
                break;
        }
    }
}
