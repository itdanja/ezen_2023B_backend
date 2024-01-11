package day08;

import java.util.Scanner;

public class Step4 { // cs
    public static void main(String[] args) { // ms

        Scanner scanner = new Scanner(System.in);
        // 1. Phone객체 100개를 저장할수 있는 Phone배열 선언
            // 등록전 : null  X 100
        Phone[] phoneBook = new Phone[100];

        while (true ) { // w s

            for( int i = 0 ; i<phoneBook.length ; i++ ){
                if( phoneBook[i] != null ){
                    System.out.printf( "%3d \t %5s \t %12s \n" ,
                            (i+1) , phoneBook[i].name , phoneBook[i].number );
                }
            }

            System.out.print("1.등록 2.삭제 선택 > ");
            int ch = scanner.nextInt();
            if (ch == 1) {
                // 1. 입력받기
                System.out.print("이름 : ");     String name = scanner.next();
                System.out.print("전화번호 : ");  String number = scanner.next();
                // 2. 객체 생성 한다.
                    // 1. 기본생성자 사용시
                //Phone newPhone = new Phone();
                //newPhone.name = name;
                //newPhone.number = number;
                    // 2. 정의생성자 사용시
                Phone newPhone = new Phone( name , number );

                // 3. phoneBook배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for( int i = 0 ; i<phoneBook.length ; i++ ){
                    if( phoneBook[i] == null ){
                        phoneBook[i] = newPhone;
                        break; // !!! : 빈공간을 찾아서 대입은 1번만! 대입했으면 반복종료.
                    }
                }
            }
            if (ch == 2) {
                System.out.print("삭제할 순번 : ");
                int dNo = scanner.nextInt();
                phoneBook[dNo-1] = null;
                for( int i = dNo-1 ; i<phoneBook.length ; i++ ){
                    // 만약에 i가 마지막 인덱스이면 +1를 할수 없다.
                    if( i+1 == phoneBook.length ) break;
                    phoneBook[i] = phoneBook[i+1];// 한칸씩 당기기.
                }
            }
        } // w e
    } // me
}// ce
/*

    메모리 구성
        이름 과 전화번호 를 여러개 저장.
        - 예] '유재석' '010-3333-3333'  '강호동' '010-4444-4444'

        1. 변수 : 여러개 변수를 만들어서 여러명 관리 [ 만일 100명 힘들어 ]
            String 이름1 = "유재석"          String 전화번호1 = "010-3333-3333"
            String 이름2 = "강호동"          String 전화번호2 = "010-4444-4444"

        2. 배열 : 동일한 타입의 자료형을 순서(인덱스)대로 나열
            // 1.
            String[] 이름들 = {"유재석","강호동"}
            String[] 전화번호들 = {"010-3333-3333","010-4444-4444"}
                vs
            // 2.
            String[] 전화번호부 = { "유재석","010-3333-3333","강호동","010-4444-4444" }

        3. 문자열 : 모든 데이터를 문자형식으로 해서 하나의 문자열 저장
            // - 구분자 :
            String 전화번호부 = "유재석,010-3333-3333\n강호동,010-4444-4444";

        4. 객체 : 클래스[미리 틀 잡기]/설계 기반으로 생성된 메모리
            - 필드를 이용한 데이터를 구분
            - 생성자를 이용한 초기화 할수 있다.
            - 메소드를 이용한 행위/이벤트 할수있다.

            // 1. 틀 만들기 [ 클래스 만들기 ]
            class Phone{  // ?: 전화번호 1개 설계해서 -> new 여러번 -> 전화번호 여러개 -> 배열 저장
                멤버 : 필드(객체의 데이터를 저장하는공간) , 생성자 , 메소드
            }

            // 2. 틀 기준으로 메모리 생성 [ 객체 만들기 ]
            new Phone();

*/













