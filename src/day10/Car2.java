package day10;

public class Car2 {
    // 멤버
    // 1. (정적/인스턴스) 필드
    int speed; // 인스턴스 필드
    static int speed2; // 정적필드
    // 2. 생성자
    // 3. (정적/인스턴스) 메소드
    void run(){ } // 인스턴스 메소드

    static void simulate(){  // 정적 메소드
        //System.out.println( this.speed ); // 오류 : static메소드에서 인스턴스필드 호출 불가능
        System.out.println( speed2 ); // static메소드에서 정적필드 호출 가능
        // this는 해당 메소드를 실행한 객체
        // static는 객체없이 사용하는 메소드/필드 이니까. 곧 this 가 없다.
    }
    void simulate2(){   //  인스턴스  메소드
        System.out.println( this.speed ); // 인스턴스 메소드에서 인스턴스필드 호출 가능.
        System.out.println( speed2 ); // 인스턴스 메소드에서 정적필드 호출 가능.
    }
    public static void main(String[] args) { // main함수는 클래스없이 자바를 실행 하므로 정적메소드로 사용

        simulate(); // static 구역에서 static 메소드 호출 가능.
        //simulate2(); // 오류 : static 구역에서 인스턴스 메소드 호출 불가능.
            // 해결책 : 객체 만들자.
        new Car2().simulate2(); // 가능.

    }

}
