package week05.thread;

public class Main {
    public static void main(String[] args) {
//        TestThread thread = new TestThread();
//        thread.start();
//        Runnable run = new TestRunable();
//        Thread thread = new Thread(run);
//
//        thread.start();
        Runnable task = () -> { //람다식
            int sum = 0; // 익명함수처럼 사용가능
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }

}
