import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Game game;
    Food food;
    Thicc Thicc;


    public Board(Game game){
        this.game = game;
        setPreferredSize(new Dimension(900,900));
        setBackground(Color.BLACK);

    }
    public void setUp(){
        Thicc = new Thicc();
        Thicc.thicc(this);
        food = new Food(this);

    }

    public void paint(Graphics g){
        super.paintComponent(g);



    }
}
