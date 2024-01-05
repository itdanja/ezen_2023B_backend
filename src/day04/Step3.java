package day04;

import java.util.Scanner;

// p.131 무한루프 활용
public class Step3 { // class  c
    public static void main(String[] args) { // main s

        // 입력객체 생성 : import java.util.Scanner;
        Scanner scanner = new Scanner(System.in); // 입력객체
        boolean run = true; // 무한루프의 상태를 저장하고 있는 변수 [ on/off ]
        int speed = 0 ; // 현재 속도를 저장하고 있는 변수 [ 1입력하면 1증가 , 2입력하면 1감소 ]

        while( run ){ // 무한루프 시작
            // ================= 무한 반복 출력 ====================== //
            System.out.println("---------------------------------");
            System.out.println("1. 증속(speed증가) | 2. 감속(speed감소) | 3. 중지(무한루프종료) ");   // 메뉴판.!!!
            System.out.println("---------------------------------");
            System.out.print("선택 : ");
            // ================= ================ ====================== //
            // ================= 무한 반복 입력 ====================== //
            String strNum = scanner.nextLine(); // 엔터를 입력할때 까지 'console이 대기'상태로 됨.
            // ================= ================ ====================== //
            // ================= 입력값에 따른 경우의수 판단  ====================== //
            if( strNum.equals("1") ){ // 만약에 입력받은 값(문자열) 문자 1이면 [ 문자 비교시에는 equals() ]
                speed++; // 변수 값 연산
                System.out.println("speed = " + speed);// 변수 값 출력

            }else if( strNum.equals("2") ) {// 만약에 입력받은 값이 문자 2이면
                speed--;  // 변수 값 연산
                System.out.println("speed = " + speed);// 변수 값 출력

            }else if( strNum.equals("3") ){ // 만약에 입력받은 값이 문자 2이면
                // 1.  while 다시 이동[14번줄. ]해서 false 이므로 {} 나가기  -> 42번줄 이동
                run = false;
                // 2.  가장 가까운 반복문{} 나가기 -> 42번줄 이동
                //break; // 가장 가까운 반복문 탈출 키워드 ; 현재 기준에서는 가장 가까운 반복문 무한루프 이니까.
                // 3.  함수{} 나가기 -> 44번줄 이동
                //return; // 현재 함수(main함수) 종료. == 프로그램 종료( main()함수에는 코드를 읽어주는 스레드 존재.)
            } // if end
        } // while end 무한루프 끝
        // 여기
    } // main e
        // 여기
} // class e

/*
    무한루프 = 무한반복
        1.
            while( true ){ }
        2.
            boolean run = true;
            while( run ) { }
 */

