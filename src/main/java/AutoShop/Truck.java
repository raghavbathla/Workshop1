package AutoShop;

public class Truck extends Car{

   private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice()
    {
if(weight>2000){
   double dis = 0.1*super.getSalePrice();
   return super.getSalePrice()-dis;
}
else
{
    double dis = 0.2*super.getSalePrice();
    return super.getSalePrice()-dis;
}
    }


}
