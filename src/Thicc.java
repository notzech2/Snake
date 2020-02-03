import java.awt.*;
import java.util.ArrayList;

public class Thicc {
    Snake snake;
    ArrayList<Snake> Thiccness = new ArrayList<Snake>();
    public Thicc(){
        
    }
    public void thicc(Board board){
        Thiccness.add(new Snake(board));
    }
    public void addThicc(Board board){
        Thiccness.add(new Snake(board));
    }



}

