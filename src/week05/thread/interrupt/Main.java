package week05.thread.interrupt;

public class Main {
// 1. 예외처리를 한 상황

//        public static void main(String[] args) {
//            Runnable task = () -> {
//                try {
//                    Thread.sleep(1000); //3
//                    System.out.println(Thread.currentThread().getName());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("task : " + Thread.currentThread().getName());
//            };
//
//            Thread thread = new Thread(task, "Thread"); // 1
//            thread.start(); // 2
//
//            thread.interrupt(); // 4. 1초동안 자는데, 중간에 일시정지를 때려서 catch문으로 예외처리가 됨
//
//            System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//        }

// 2. 예외처리를 안한 상황

    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) { //3 인터럽트 상황이 아니면
                try { //4 시도
                    Thread.sleep(1000); // 쓰레드를 1초동안 재움
                    System.out.println(Thread.currentThread().getName()); // 자는 동안 인터럽트 당해서 실행 안됨
                } catch (InterruptedException e) {
                    break; // 5 break로 빠져나옴
                }
            }
            System.out.println("task : " + Thread.currentThread().getName()); // 6 출력
        };

        Thread thread = new Thread(task, "Thread"); //1
        thread.start(); //2

        thread.interrupt(); // 1초 동안 재우는 동안 인터럽트 발생

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted()); // 7 인터럽트 상황이니까 true 출력

    }
}
