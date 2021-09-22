package AutoShop;

public class MyOwnAutoShop {

    public static void main(String[] args) {
Sedan sedan = new Sedan(300,400,"orange",40);
Ford ford1 = new Ford(500,40000,"Purple",2009,500);
Ford ford2 = new Ford(600,50000,"Yellow",2010,600);
Car car = new Car(550,60000,"White");
System.out.println(sedan.getSalePrice());
System.out.println(ford1.getSalePrice());
System.out.println(ford2.getSalePrice());
System.out.println(car.getSalePrice());
    }
}
