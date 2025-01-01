package week03.abs;

public class Main {
    public static void main(String[] args) {
        Car car1 = new BenzCar();
        car1.horn();
        System.out.println();

        Car car2 = new ZenesisCar();
        car2.horn();
        System.out.println();

        Car car3 = new AudiCar();
        car3.horn();
        System.out.println();
    }
}
