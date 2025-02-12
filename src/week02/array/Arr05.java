package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        //문자(char), 문자열(String)
        // Stirng = char[]

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 '소문자로 시작함', 참조형 변수는 '대문자로 시작힘'
        // -wrapper class에서 기본형 변수를 감싸줄때(boxing), int => integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함(= 주소형 변수)

        // char < String (훨씬 더!)
        // Stirng이 가지고 있는 기능이 너무 많아서!!
        // Wrapper class와도 상당히 비슷...! => 기본형 변수가 가지고 있는 기능이 제한 => 다양한 기능을 제공하는 Wrapper를 감쌈으로써,
        // 추가가능을 더함

        // Stirng 기능 활용 예시
        String str = "ABCD";

        // (1) length
        int stringLength = str.length();
        System.out.println(stringLength);

        // (2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // (3) substring (fromIdx, int toIdx)
        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        // (4) equals (String str)
        String newStr = "ABCE";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // (5) toCharArray() : String => char()
        char[] strCharArr = str.toCharArray();

        // (6) 반대로 char[] => string => char
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);

    }
}
