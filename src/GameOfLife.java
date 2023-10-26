import java.util.ArrayList;

public class GameOfLife extends Engine {
    Engine e;
    private ArrayList<Cell> cells = new ArrayList<>();

    public GameOfLife(int w, int h, int scale)  {
        super(w,h,scale);
        cells.add(new Cell(50, 50, true));
        cells.add(new Cell(51, 50, true));
        cells.add(new Cell(50, 51, true));
    }

    public void update() {
        for (Cell c : cells) {
            drawPixel(c.getX(), c.getY(), 0xFFFF00);
            c.checkRules();
        }
    }
}
