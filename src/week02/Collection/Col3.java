package week02.Collection;

import java.util.Stack;

public class Col3 {
    // Stack
    // 수직으로 값을 쌓아놓고, 넣었다가 뺀다. FIFO
    // push, peek, pop
    // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        while (!intStack.isEmpty()) { // 비어지지않을때까지
            System.out.println(intStack.pop());
        }

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        System.out.println(intStack.peek());
        System.out.println(intStack.size());

    }
}
