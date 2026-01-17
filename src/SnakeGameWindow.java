import javax.swing.*;
import java.awt.*;

public class SnakeGameWindow extends JFrame {

   ImageIcon icon = new ImageIcon("public/icon.png");
   Image iconImage = icon.getImage();
    SnakeGameWindow(){
        this.add(new SnakeGameBoard());
        this.setTitle("Snake game by DimaXDD");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(iconImage);
        this.pack();
        this.setLocationRelativeTo(null); // именно тут
        this.setVisible(true);
    }
}
