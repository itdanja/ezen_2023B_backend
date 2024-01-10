package day07;

public class Step1 { // class c
    public static void main(String[] args) { // main s

        // p.202

        // p.210
        // 클래스를 이용한 객체 생성
        // 1. 인스턴스화 키워드 new
            // 1.힙영역에 설계도에 따른 메모리 할당
            // 2.할단된 메모리의 주소 리턴.
        // new

        // 2. 인스턴스화 할 생성자/클래스명()
        // new Student();

        // 3. 변수 생성한다( 생성된 객체의 주소 를 담기 위해  )
            // 1. 타입( 담을 객체 주소의 클래스와 동일 )  2. 변수명( 첫글자 소문자 카멜 )
        //Student student ;

        // 4. 객체 주소를 변수에 담기
        Student s1 = new Student();
        System.out.println(" s1 변수가 Student 객체를 참조합니다." + s1 );

        Student s2 = new Student();
        System.out.println(" s2 변수가 Student 객체를 참조합니다." + s2 );


    } // main e
} // class e

