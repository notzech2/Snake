import java.awt.*;

public class Snake {
    final int width = 30; final int height = 30;
    int x, y;
    int dx = 30 , dy = 30;
    public Snake(Board board){
        x = (int)(Math.random() * (board.getWidth()) + 0);
        y = (int)(Math.random() * (board.getHeight()) + 0);


    }
    public void moveLeft(){
        x-=dx;
    }
    public void moveRight(){
        x+=dx;
    }
    public void moveUP(){

    }
    public void moveDown(){

    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);

    }


}
