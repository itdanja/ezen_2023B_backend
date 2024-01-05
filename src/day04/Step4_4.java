package day04;

// p. 139 확인문제7

import java.util.Scanner;

public class Step4_4 { // class s
    public static void main(String[] args) { // main s

        Scanner scanner = new Scanner(System.in);

        while(true){ // w s

            System.out.println("-------------------------");
            System.out.println("1.예금 2.출금 3.잔고 4.종료");
            System.out.println("-------------------------");
            System.out.println("선택> ");

            int ch = scanner.nextInt();

            if( ch == 1 ){ System.out.println("예금액> 10000 ");  }
            if( ch == 2 ){ System.out.println("출금액> 2000 "); }
            if( ch == 3 ){ System.out.println("잔고> 8000 "); }
            if( ch == 4 ){ System.out.println("프로그램 종료"); }

        } // w s

    } // main e
} // class e

/*

    은행 프로그램 구현
        [ 요구사항 설계 ]
        1. 반복적으로 기능 사용 [ 단* 종료 기능 선택시 종료 ]
        2. 기능 : 예금 , 출금 , 잔고 , 종료
            예금 : 더하기 작업
            출금 : 빼기 작업
            잔고 : 확인 작업
            종료 : 프로그램을 끝내는 작업
        [ 구현 순서 ]
            1. 프로토타입


 */
