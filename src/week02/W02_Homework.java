package week02;

import javax.swing.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class W02_Homework {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<String>(); //Set 선언 및 생성

        Scanner sc = new Scanner(System.in); //입력받을 준비를 함
        System.out.println("자료구조를 입력하세요!: ");
        String set = sc.nextLine(); // 자료구조 입력
        System.out.println("내가 좋아하는 음식의 제목을 입력하세요!: ");
        String title = sc.nextLine(); // 음식의 제목 정하기
        System.out.println("1. ");
        String t1 = sc.nextLine(); // 1. 입력받음
        System.out.println("2. ");
        String t2 = sc.nextLine(); // 2. 입력받음
        System.out.println("3. ");
        String t3 = sc.nextLine(); // 3. 입력받음
        System.out.println("4. ");
        String t4 = sc.nextLine(); // 4. 입력받음
        System.out.println("5. ");
        String t5 = sc.nextLine(); // 5. 입력받음
        System.out.println("6. ");
        String t6 = sc.nextLine(); // 6. 입력받음
        System.out.println("7. ");
        String t7 = sc.nextLine(); // 7. 입력받음
        System.out.println("8. ");
        String t8 = sc.nextLine(); // 8. 입력받음
        System.out.println("9. ");
        String t9 = sc.nextLine(); // 9. 입력받음
        System.out.println("10. ");
        String t10 = sc.nextLine(); // 10. 입력받음
        System.out.println("마지막으로 할말은?: ");
        String end = sc.nextLine(); // 끝!

        // set에 입력받은 것을 넣음
        stringSet.add(set);
        stringSet.add(title);
        stringSet.add(t1);
        stringSet.add(t2);
        stringSet.add(t3);
        stringSet.add(t4);
        stringSet.add(t5);
        stringSet.add(t6);
        stringSet.add(t7);
        stringSet.add(t8);
        stringSet.add(t9);
        stringSet.add(t10);
        stringSet.add(end);

        //set에 입력받은 것을 출력
        System.out.println("[" + set + "으로 저장된" + title +"]");
        System.out.println("1. " + t1);
        System.out.println("2. " + t2);
        System.out.println("3. " + t3);
        System.out.println("4. " + t4);
        System.out.println("5. " + t5);
        System.out.println("6. " + t6);
        System.out.println("7. " + t7);
        System.out.println("8. " + t8);
        System.out.println("9. " + t9);
        System.out.println("10. " + t10);
        System.out.println(end);
    }
}
