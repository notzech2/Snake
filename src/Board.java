import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Game game;

    public Board(Game game){
        this.game = game;
        setPreferredSize(new Dimension(900,900));
        setBackground(Color.BLACK);
    }
}
