package AutoShop;

public class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        if (length > 20) {
            double dis = 0.5 * super.getSalePrice();
            return super.getSalePrice() - dis;
        } else {
            double dis = 0.10 * super.getSalePrice();
            return super.getSalePrice() - dis;
        }

    }
}
