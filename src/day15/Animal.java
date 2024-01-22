package day15;

public abstract class Animal {

    // 1. 메소드 선언
    public  void breathe(){
        System.out.println("숨을 쉽니다.");
    }

    // 2. 추상메소드 선언
        // 1. 클래스가 추상클래스 이면 선언가능
        // 2. { } 구현부를 생략한다 -> 추상 -> (자식)구현
    public abstract void sound();
}
