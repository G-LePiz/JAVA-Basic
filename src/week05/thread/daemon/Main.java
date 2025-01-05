package week05.thread.daemon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> { //람다식
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i + "번째 demon");
            }
        };
        // 우선순위가 낮다! => 상대적으로 다른 쓰레드에 비해 리소스를 적게 할당받아요.
        Thread thread = new Thread(demon);
        thread.setDaemon(true); // true로 설정시 데몬스레드로 실행됨

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + "번째 task");
        }
    }
}