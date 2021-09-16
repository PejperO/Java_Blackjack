package JavaBlackjack;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Card {

    private static int value;
    private static int color;
    private static BufferedImage image;

    public static void CardSelection() throws IOException {
        Random random = new Random();
        value = random.nextInt(12) + 1; //getting the value of a card
        color = random.nextInt(3) + 1;  //getting the color of a card

        CardImage();
    }

    public static void CardImage() throws IOException {    //giving a card right image
        switch (value) {
            case 1:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/11.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/12.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/13.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/14.png"));
                }
            case 2:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/21.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/22.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/23.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/24.png"));
                }
            case 3:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/31.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/32.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/33.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/34.png"));
                }
            case 4:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/41.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/42.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/43.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/44.png"));
                }
            case 5:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/51.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/52.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/53.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/54.png"));
                }
            case 6:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/61.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/62.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/63.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/64.png"));
                }
            case 7:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/71.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/72.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/73.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/74.png"));
                }
            case 8:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/81.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/82.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/83.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/84.png"));
                }
            case 9:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/91.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/92.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/93.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/94.png"));
                }
            case 10:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/101.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/102.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/103.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/104.png"));
                }
            case 11:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/111.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/112.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/113.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/114.png"));
                }
            case 12:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/121.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/122.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/123.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/124.png"));
                }
            case 13:
                switch (color){
                    case 1:
                        image = ImageIO.read(new File("data/img/131.png"));
                    case 2:
                        image = ImageIO.read(new File("data/img/132.png"));
                    case 3:
                        image = ImageIO.read(new File("data/img/133.png"));
                    case 4:
                        image = ImageIO.read(new File("data/img/134.png"));
                }
        }
    }
}