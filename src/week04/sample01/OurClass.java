package week04.sample01;

public class OurClass {
    private final boolean just = true;

    // 작업하는 클래스
    // throws : 던지다!!(= 예외를 던지다 / 발생시키다)
    public void thisisMethodIsDangerous() throws OurBadException{
        // custom logic~
        if (just) {
            throw new OurBadException();
        }




    }
}
