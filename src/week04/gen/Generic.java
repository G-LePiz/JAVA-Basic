package week04.gen;

// 1. 재네릭은 클래스 또는 메서드에 사용 가능!
// <> 안에 들어가야 할 타입을 명시
public class Generic<T> { //자바 개발자의 컨벤션이라서 T를 사용함. T,U,E
    // 2. 내부 필드에 String
    private T t;

    // 3. method의 return type도 String
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4. 재네릭을 통한 클래스 사용 부분
        Generic<String> stringGeneric = new Generic<>();
        // 5.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}
