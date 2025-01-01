package week03;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        Car car2 = new Car(); //new는 생성자를 호출하기 위해서
//
//        System.out.println(car1); //car1이 가지고 있는 주소

//        Car[] carArray = new Car[3];
//        Car car1 = new Car();
//        car1.changeGear('P');
//        carArray[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArray[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArray[2] = car3;
//
//        for(Car car: carArray){
//            System.out.println("car.gear =" + car.gear);
//        }
//
//        Tire tire1 = new Tire();
//        Door door1 = new Door();
//        Handle handle1 = new Handle();
//        Car car = new Car(); // 객체 생성
//
//        // 초기값 기본 값 확인: 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
//        System.out.println("car.mode = " + car.model);
//        System.out.println("car.color = " + car.color);
//        System.out.println();
//
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.gear = " + car.gear);
//        System.out.println("car.lights = " + car.lights);
//        System.out.println();
//
//        System.out.println();
//
//        // 필드 사용
//        car.color = "blue"; // 필드 color에 "blue" 데이터 저장
//        car.speed = 100;
//        car.lights = false;
//
//        System.out.println("car.color = " + car.color);
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.lights = " + car.lights);

        // 메서드 사용
        Car car = new Car();
        System.out.println("패달 밟기 전 car.gear = " + car.gear);
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);
        boolean lights = car.onoffLight();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("패달 밟고 난 후 car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);




    }
}
