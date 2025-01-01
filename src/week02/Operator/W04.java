package week02.Operator;

public class W04 {
    // 논리연산자
    // 비교 연산의 비교값으로 받을 수 있는 boolean 값을 연결하는 연산자
    // 조건을 연결 하였을때 boolean 값들을 조합하여 찹 또는 거짓 값인 boolean 값을 출력
    // &&(AND), ||(OR), !(NOT)

    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        // (1) 피 연산자 중 하나라도 true이면 true => 또는 (OR: ||)
        System.out.println("-----------------------------");
        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);

        // (2) 피 연산자가 모두 true이면 true => 그리고(AND : &&)
        System.out.println("-----------------------------");
        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag2 && flag3);

        // (3) AND
        System.out.println("AND-----------------------------");
        System.out.println((5>3) && (3<1));
        System.out.println((5>3) && (3>1));

        // (4) OR
        System.out.println("OR-----------------------------");
        System.out.println((5>3) || (3>1));
        System.out.println((5>3) || (3<1));
        System.out.println((5<3) || (3<1));

        // 논리 부정 연산자 (! : NOT)
        System.out.println("NOT-----------------------------");
        System.out.println(!flag1);
        System.out.println(!flag3);
        System.out.println(!(5==5));
        System.out.println(!(5==3));

    }
}
