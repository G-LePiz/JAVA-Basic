package week05.thread.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> { // 3실행순서
            try {
                //(1) 예외처리 필수!
                // -interrupt()를 만나면 다시 실행되기때문에
                // -interruptException이 발생할 수 있어요.
                //(2) 특정 쓰레드 지목 불가
                Thread.sleep(2000); // TIMED_WATTING(주어진 시간 동안 기다리는 상태) // 실행순서 : 2초동안 기달려라 //쓰레드 자체
                //를 멈추게 하는 것 // 2초 이따가 출력
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread"); // 실행순서 1
        thread.start(); // 실행순서 2

        try {
            thread.sleep(1000); // 1초 있다가 먼저 출력
            System.out.println("sleep(1000) : " + Thread.currentThread().getName()); //실행순서4
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
