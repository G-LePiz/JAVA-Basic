import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. 입력 받음
        Scanner sc = new Scanner(System.in);
        //2. 내가 원하는 요리 제목
        String food_name = sc.nextLine();
        //3. 별점
        float food_star = sc.nextFloat();
        sc.nextLine();
        float food_star2 = 20 * (int)food_star;
        //4. 좋아하는 레시피 한문장씩
        String food_comment1 = sc.nextLine();
        String food_comment2 = sc.nextLine();
        String food_comment3 = sc.nextLine();
        String food_comment4 = sc.nextLine();
        String food_comment5 = sc.nextLine();
        String food_comment6 = sc.nextLine();
        String food_comment7 = sc.nextLine();
        String food_comment8 = sc.nextLine();
        String food_comment9 = sc.nextLine();
        String food_comment10 = sc.nextLine();
        //5.출력
        System.out.println("[" + food_name + "]");
        System.out.println("별점: " + (int)food_star + "(" + food_star2 + "%)");
        System.out.println("1." + food_comment1);
        System.out.println("2." + food_comment2);
        System.out.println("3." + food_comment3);
        System.out.println("4." + food_comment4);
        System.out.println("5." + food_comment5);
        System.out.println("6." + food_comment6);
        System.out.println("7." + food_comment7);
        System.out.println("8." + food_comment8);
        System.out.println("9." + food_comment9);
        System.out.println("10." + food_comment10);



    }

}