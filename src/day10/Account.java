package day10;

public class Account { // 객체 설계 클래스
    // 클래스멤버
    // 1. 필드 : 정적 vs 인스턴스
    String 계좌번호 ; // 객체마다 계좌번호가 필요하니까.
    String 계좌주 ;
    int 입금액 ;

    // 2. 생성자
        // 1. 기본생성자
    Account(){}
        // 2. 모든 필드를 받는 생성자
    Account( String 계좌번호 , String 계좌주 , int 입금액 ){
        this.계좌번호 = 계좌번호;
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }
    // 3. 메소드

}
