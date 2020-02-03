import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    Board board;
    public Game(){
        setTitle("Snek Lel");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new Board(this);
        add(board);
        pack();

        board.setUp();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
       new Game();
   }
   public void paintComponent(Graphics g){
        super.paintComponents(g);
   }
}
