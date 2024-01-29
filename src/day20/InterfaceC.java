package day20;

// 인터페이스는 상속을 다중으로 가능하다.
public interface InterfaceC
        extends InterfaceA , InterfaceB {
    // 추상메소드
    void methodC();
}
