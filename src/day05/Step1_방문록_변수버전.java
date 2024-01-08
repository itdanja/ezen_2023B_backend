package day05; // 패키지 : 클래스가 위치한 폴더 경로

import java.util.Scanner;

public class Step1_방문록_변수버전 { // 클래스 : 모든 자바 코드는 클래스 안에서 작성
    public static void main(String[] args) { // 메인함수 : 자바 코드 실행 진입점( 스레드 포함 )

        // 3-1. 입력객체 생성
        Scanner scanner = new Scanner( System.in );
        // 4-1 초기변수. : 방문록 1개당( 내용 , 작성자 , 비밀번호  포함 ) 방문록 3개이면 변수 9개
        String 내용1 = "";    String 작성자1 = "";       int 비밀번호1 = 0;
        String 내용2 = "";    String 작성자2 = "";       int 비밀번호2 = 0;
        String 내용3 = "";    String 작성자3 = "";       int 비밀번호3 = 0;

        while(true) { // w s // 2.무한루프
            // 1. 출력
            System.out.println("========== 방문록 ==========");
            // 6 현재 변수 현황 출력
            System.out.printf("%2d \t %-5s \t %-20s \n" , 1 , 작성자1 , 내용1 );
            System.out.printf("%2d \t %-5s \t %-20s \n" , 2 , 작성자2 , 내용2 );
            System.out.printf("%2d \t %-5s \t %-20s \n" , 3 , 작성자3 , 내용3 );
            System.out.println(" 1.방문록 작성 2.방문록 삭제 3.종료 ");
            // 3-2. 입력객체 이용한 키보드로부터 입력값 호출 하고 변수에 저장
            System.out.print("선택 : ");     int ch = scanner.nextInt();
            // 5-1 사용자가 입력(선택)한 경우수 의 따른 기능 처리
            if( ch == 1 ){
                // 입력 : 위치
                System.out.print("방문록 작성 위치 : 1. 2. 3. : ");  int no = scanner.nextInt();
                // 입력 : 내용 , 작성자 , 비밀번호
                scanner.nextLine();
                System.out.print("내용 : ");      String content = scanner.nextLine();
                System.out.print("작성자 : ");    String writer = scanner.next();
                System.out.print("비밀번호 : ");  int password = scanner.nextInt();
                // // [ if중첩 ] 저장 : 위치에 따른 각 변수에 저장.
                if( no == 1  ){         내용1 = content;      작성자1 = writer;      비밀번호1 = password; }
                else if( no == 2 ){     내용2 = content;      작성자2 = writer;      비밀번호2 = password; }
                else if( no == 3 ){     내용3= content;       작성자3 = writer;      비밀번호3 = password; }
                else{   System.out.println("[경고] 알수없는 위치 입니다.");   }
            }
            else if( ch == 2 ){
                // 입력 : 삭제할 방문록의 위치 입력
                System.out.print("방문록 삭제 위치 : 1. 2. 3. : ");      int no = scanner.nextInt();
                // 입력[ 비밀번호 ]
                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();
                // [ if중첩] 초기화 : 위치와 비밀번호 일치에 따른 각 변수를 처음값으로 대입
                if( no == 1 && 비밀번호1 == password ){         내용1 = "";     작성자1 = "";      비밀번호1 = 0; }
                else if( no == 2 && 비밀번호2 == password  ){   내용2 = "";     작성자2 = "";      비밀번호2 = 0; }
                else if( no == 3 && 비밀번호3 == password  ){   내용3= "";      작성자3 = "";      비밀번호3 = 0; }
                else{ System.out.println("[경고] 알수없는 위치 또는 패스워드 가 다릅니다.");   }
            }
            else if( ch == 3 ){  break;   }
            else{    System.out.println("[경고]알수없는 입력입니다.");  } // if end
        } // w e
    } // main e
} // class e

/*
    비회원제 방문록 프로그램.[JAVA]
        1. 방문록 작성 / 삭제 / 종료 / 출력(현황) 기능 구현
            [ 초기메뉴 ]
            1. 초기메뉴가 반복적으로 실행되어야 한다.  while(true)
                - 특정 조건에 따라 종료.
            2. 초기메뉴 기능 번호에 대해 선택(입력) 받는다. scanner.nextInt();

        2. 방문록 에는 '내용' , '작성자' , '비밀번호' 를 최대 3명만 작성 가능하도록
            - 내용(문자열) , 작성자(문자열) , 비밀번호(정수)
            - 선언해야 할 변수 개수 : 9개

        3. 기능 구현
            [ ] 현재 방문록 현황 출력
                1. 초기메뉴에서 9개 변수를 형식 맞춰 모두 출력.

            [ 1번 선택시 ] 방문록 작성
                1. (1~3) 중 몇번째 방문록에 작성할껀지 선택받기.
                2. 내용 , 작성자 , 비밀번호(숫자4자리) 입력받기.
                3. 선택한 방문록 자리에 입력받은 각 데이터 대입.
            [ 2번 선택시 ] 방문록 삭제
            [ 3번 선택시 ] (반문록) 종료
                1. break 2.return 3.boolean

*/
