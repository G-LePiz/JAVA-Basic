package week03.PackageExample.main;

import week03.PackageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {

        // 클래스의 일부분이며, 하위 패키지를 도트로 구분한다.
//        week03.PackageExample.pk1.Car car1 = new week03.PackageExample.pk1.Car();
//        week03.PackageExample.pk2.Car car2 = new week03.PackageExample.pk2.Car();
//
//        car1.horn();
//        car2.horn();

        Car car = new Car();
        week03.PackageExample.pk2.Car Car2 = new week03.PackageExample.pk2.Car();
        car.horn();
        Car2.horn();
    }
}
