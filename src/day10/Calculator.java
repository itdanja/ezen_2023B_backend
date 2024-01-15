package day10;

public class Calculator {

    // 클래스 멤버
        // 1. ( 인스턴스 / 정적static )필드
    double pi2 = 3.14159;       // 인스턴스(객체) 필드
    static double pi = 3.14159; // 정적 필드

        // 2. 생성자

        // 3. ( 인스턴스 / 정적static )메소드
    int plus2 ( int x , int y ){ // 인스턴스 메소드
        return x + y;
    }
    static int plus( int x , int y ){ // 정적 메소드
        return x + y ;
    } // m end
    static int minus( int x , int y ){ // 정적 메소드
        return x - y ;
    } // m end

}
