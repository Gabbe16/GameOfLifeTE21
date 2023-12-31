public class Cell {
    private int x;
    private int y;
    private boolean isAlive;

    private Rules rule;

    public Cell(int x, int y, boolean isAlive) {
        this.x = x;
        this.y = y;
        this.isAlive = isAlive;
        this.rule = new Rules();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void checkRules() {

    }
}
