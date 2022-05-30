package pc;

import javax.swing.*;
import java.awt.*;

public class Setting {
    static String path = System.getProperty("user.dir");
    static Image newGame = (new JPanel()).getToolkit().getImage(path + "\\Textures\\Source\\01. Choose game\\01.png");
    static Image newGamePressing = (new JPanel()).getToolkit().getImage(path + "\\Textures\\Source\\01. Choose game\\03.png");
    static Image color = (new JPanel()).getToolkit().getImage(path + "/Textures/circleprev.png");
    static Image colorPressing = (new JPanel()).getToolkit().getImage(path + "/Textures/circleprev copy pressed.png");


}
