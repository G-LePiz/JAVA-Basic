package week05.thread.join;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> { //3
            try {
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread"); //1

        thread.start(); //2. new -> runnable

        long start = System.currentTimeMillis();

        try {
            // 시간을 지정하지 않았기때문에 thread의 작업이 끝날때까지 main 쓰레드는 기다리게 됨
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}
