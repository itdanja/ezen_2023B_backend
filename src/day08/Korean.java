package day08;

public class Korean {

    // 클래스멤버
    // 1. 필드
        // - 객체들간의 동일한 값이면 필드 선언시 초기화
    String nation = "대한민국";
    String name ;
    String ssn ;
    // 2. 생성자
        // - 객체들간의 다른 값을 가져야 할때
        // - 오버로딩 : 매개변수의 타입 , 개수 , 순서에 따라 여러개 선언 가능
        // 1. 생성자명 작성한다. 단 클래스명도 동일
        // 2. ( ) 안에 매개(타입)변수를 정의한다.
        // 3 { } 안에 생성자호출시 처리할 명령어/로직 작성
    Korean( ){} // 기본생성자.
    Korean( String name ,  String ssn ){ // 매개변수 명과 현재 객체내 필드명과 중복 발생할수 있다.
        // 그래서 매개변수 이름 과 현재 객체내 필드명과 다르면 this 쓸 필요가 없다.
        // 단 : 관례적으로 동일하게 사용해야 한다. -> 문제 : 외부로 들어온 매개변수와 원래 객체내 있던 필드명과 충돌
        // 구분 : this 현재 객체 호출. : 현재(생성자/메소드) 실행하고 있는 객체
        this.name = name;
        this.ssn = ssn;
    }
    // 3. 메소드

    // 객체의 주소값 대신 객체의 필드정보 출력시 사용되는 함수/메소드
    // 오른쪽 클릭 -> 생성 -> toString()
    @Override
    public String toString() {
        return "Korean{" +
                "nation='" + nation + '\'' +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
