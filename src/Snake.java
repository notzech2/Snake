public class Snake {
    final int width = 30; final int height = 30;
    int x, y;
    int dx, dy;
    public Snake(Board board){
        x = (int)(Math.random() *(board.getWidth() - 0) + 0);
        y = (int)(Math.random() * (board.getHeight() - 0) + 0);
    }
}
