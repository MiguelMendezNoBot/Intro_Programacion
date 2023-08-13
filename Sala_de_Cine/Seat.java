public class Seat {
    private char column;
    private int row;
    private boolean busy;

    public Seat(int row, char column) {
        this.row = row;
        this.column = column;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
    public void setBusy(boolean busy){
        this.busy = busy;
    }
    
    public boolean getBusy(){
        return busy;
    }

    @Override
    public String toString() {
        return "{" + row + column + "-Lleno:" + busy + "}";
    }
}

