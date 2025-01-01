package week02.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        //Queue : FIFO
        // add(추가), peak(조회), poll
        // Queue : 생성자가 없는 인터페이스 <-
        Queue<Integer> intQueue = new LinkedList<>(); // queue를 선언하고 생성

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        // 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        // peak
        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
