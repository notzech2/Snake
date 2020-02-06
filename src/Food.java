import java.awt.*;

public class Food {

    int x,y;
    final int width = 30, height = 30;
   Rectangle r;


    public Food(Board board){
        x = (int)(Math.random() * (board.getWidth()) + 0);
        y = (int)(Math.random() * (board.getHeight()) + 0);
    }

    public Rectangle getBounds(){
        return r = new Rectangle(x,y,width,height);
    }

    public void setLocation(Board board){
        x = (int)(Math.random() * (board.getWidth()) + 0);
        y = (int)(Math.random() * (board.getHeight()) + 0);
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x,y,width,height);

    }
}
