package week04.Homework;

public class BadInputException extends Exception {

    public BadInputException(String type) {
        super("잘못된 입력입니다! " + type + "을 입력해주세요!"); // 부모 클래스를 생성
    }
}
 //OurBadException