package day15;
// 부모클래스를 다형성(타입변환) 목적으로 많이 사용되서 --> 추상클래스 
public class Dog extends Animal {
    // 만일 상위클래스가 추상메소드가 있으면 필수/꼭!!
    // 부모클래스의 추상메소드를 재정의/오버라이딩 한다
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
