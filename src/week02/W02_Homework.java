package week02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class W02_Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("저장할 형태를 입력하세요(Ex: List, Set, Map): ");
        String str = sc.nextLine(); //저장할 형태
        System.out.println("요리 제목을 입력하세요: ");
        String cook = sc.nextLine(); //요리 제목

        if(str.equals("List")){
            ArrayList<String> cList = new ArrayList<>();//선언+생성
            cList.add(cook);

            ArrayList<String> strList = new ArrayList<>();//선언+생성
            String book="";
            while(!(book.equals("끝"))){
                book = sc.nextLine();
                strList.add(book);
            }
            System.out.println("[ "+str+" 로 저장된 "+cList.get(0)+" ]");
            for(int i=0;i<strList.size()-1;i++){
                if(!(strList.get(i)).equals("끝")){
                    int box=i+1;
                    System.out.println(box+". "+strList.get(i));
                }
            }
        }
    }
}
