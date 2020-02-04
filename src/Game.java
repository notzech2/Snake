import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {
    Board board;
    boolean up, down, left, right;
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            left = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            up = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            right = true;
        }  if (e.getKeyCode() == KeyEvent.VK_DOWN){
            down = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            left = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            up = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            right = false;
        }  if (e.getKeyCode() == KeyEvent.VK_DOWN){
            down = false;
        }
    }
    public boolean isDown() {
        return down;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

}
