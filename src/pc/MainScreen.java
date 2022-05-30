package pc;

import bit.Bitboard;
import movegen.Magic;

import javax.swing.*;

public class MainScreen extends JFrame{
    public MainScreen() {
        Magic.init();
        BoardScreen panel = new BoardScreen(new Bitboard());
        this.add(panel);
        this.setTitle("星光");
        ImageIcon img = new ImageIcon(System.getProperty("user.dir") + "/Texture/white_cro.png");
        this.setIconImage(img.getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(false);
        this.setVisible(true);
        this.setSize(650, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
