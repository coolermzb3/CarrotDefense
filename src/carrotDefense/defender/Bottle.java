package carrotDefense.defender;

public class Bottle extends Defender{

//    private int price;
//    private int range;

    public Bottle(int row, int col) {
        super(row, col);
        super.price = 150;
        super.range = 5;
    }

    public void speak() {
        super.speak();
        System.out.printf("My price and range are %d, %d\n", super.price, range);
    }

    public static void main(String[] args) {
        Bottle bt = new Bottle(14,5);
        bt.setPrice(23);
        bt.speak();
        Bottle sd = new Bottle(3,4);
        sd.speak();
    }
}

