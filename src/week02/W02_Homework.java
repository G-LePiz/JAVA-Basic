package week02;

import java.util.*;

public class W02_Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("저장할 자료형을 입력하세요(List/Set/Map): ");
        String printlist = sc.nextLine(); // 저장할 자료형 입력받음
        System.out.println(printlist); // 입력받은 자료형 출력
        switch (printlist) {

            case "List" :
                ArrayList<String> list = new ArrayList<>();
                while(true){
                    String text = sc.nextLine();
                    if(text.equals("끝")) {
                        break;
                    }
                    list.add(text);
                }
                System.out.println("[" + printlist + "으로 저장된 백종원 돼지고기 김치찌개 만들기");
                for(int i=0; i< list.size(); i++) {
                    int number = i+1;
                    System.out.println(number + " : " + list.get(i) );
                }
                break;

            case "Set":
                Set<String> set = new HashSet<String>();
                while (true) {
                    String text = sc.nextLine();
                    if(text.equals("끝")) {
                        break;
                    }
                    set.add(text);
                 }
                System.out.println("[" + printlist + "으로 저장된 백종원 돼지고기 김치찌개 만들기");
                Iterator<String> it = set.iterator();
                Iterator iter = set.iterator();
                for(int i=0; i< set.size(); i++) {
                    int number = i+1;
                    System.out.println(number + " : " + it.next());
                }
                break;

            case "Map":
                Map<Integer, String> map = new HashMap<>();
                int startnumber = 1;
                while (true) {
                    String text = sc.nextLine();
                    if(text.equals("끝")) {
                        break;
                    }
                    map.put(startnumber ++, text);
                }
                System.out.println("[" + printlist + "으로 저장된 백종원 돼지고기 김치찌개 만들기");
                for(int i=0; i< map.size(); i++) {
                    int number = i+1;
                    System.out.println(number + " : " + map.get(i+1));
                }


        }
    }
}
