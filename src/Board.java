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
    public void checkCollisions(){
        if (snake.getX() >= this.getWidth() || snake.getX() <= 0 ){
            snake.setLocation(this);
        }
        if(snake.getY() >= this.getHeight() || snake.getY() <= 0){
            snake.setLocation(this);
        }
       if(snake.getBounds().intersects(food.getBounds())){
           food.setLocation(this);
       }


    }





    @Override
    public void actionPerformed(ActionEvent e) {
        checkCollisions();
        if (game.isLeft()){
            snake.moveLeft();}
        else if (game.isRight()){
            snake.moveRight();}
        else if(game.isDown()){
            snake.moveDown();
        }
        else if (game.isUp()){
            snake.moveUp();
        }
//        food.setLocation(this);

        System.out.println("Game is running");
        repaint();
    }

    public void paint(Graphics g){

        super.paintComponent(g);
        snake.paint(g);
        food.paint(g);

    }
}
