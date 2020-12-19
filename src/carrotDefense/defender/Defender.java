package carrotDefense.defender;

public class Defender {

    private final int row, col;
    protected int price, range;
//    public  int price;

    public Defender(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getPrice() {
        return price;
    }

    public void speak() {
        System.out.printf("I'm at (%d, %d)\n", row, col);
        System.out.printf("My price and range are %d, %d\n", price, range);
    }
}
