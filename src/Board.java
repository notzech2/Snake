import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Board extends JPanel implements ActionListener {
    Game game;
    Food food;
    Timer timer;
    Snake snake;



    public Board(Game game){
        this.game = game;
        setPreferredSize(new Dimension(900,900));
        setBackground(Color.BLACK);


    }
    public void setUp(){
//        ArrayList<Snake> snake = new ArrayList<Snake>();
        food = new Food(this);
        snake = new Snake(this);
        timer = new Timer(1000/20,this);
        timer.start();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (game.isLeft()){
            snake.moveLeft();}
        else if (game.isRight()){
            snake.moveRight();}
        else if(game.isDown()){
            snake.moveDown();
        }
        else if (game.isUp()){
            snake.moveUP();
        }



        System.out.println("Game is running");
        repaint();
    }

    public void paint(Graphics g){

        super.paintComponent(g);
        snake.paint(g);
        food.paint(g);


    }
}
