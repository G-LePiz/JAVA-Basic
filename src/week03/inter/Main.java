package week03.inter;

//public class Main extends D implements C {
//
//    @Override
//    public void a() {
//        System.out.println("A");
//    }
//
//    @Override
//    public void b() {
//        System.out.println("B");
//    }
//
//    @Override
//    void d() {
//        super.d();
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.a();
//        main.b();
//        main.d();
//    }
//}
//
//interface A {
//    void a();
//}
//
//interface B {
//    void b();
//}
//
//interface C extends A, B {
//}
//
//class D {
//    void d() {
//        System.out.println("D");
//    }
//}
public class Main {
    public static void main(String[] args) {

        // LG TV 구현체를 조작
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff();
        mrc.volumeUp();
        mrc.channelDown();
        mrc.channelUp();
        mrc.turnOnOff();

        // 조작 대상을 Samsung TV로 교체
        System.out.println("\n<Samsung TV로 교체>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();
        mrc.channelUp();
        mrc.volumeDown();
        mrc.volumeUp();
        mrc.turnOnOff();

        // 매개변수, 반환타입 다형성 체크
        System.out.println("\n<매개변수, 반환타입 다형성 체크>");

        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));
        samsung.turnOnOff();

        SamsungTv samsungTv = (SamsungTv) samsung;
        samsungTv.turnOnOff();


        System.out.println();
        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();

        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();

    }
}