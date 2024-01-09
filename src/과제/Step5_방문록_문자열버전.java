package 과제;

import java.util.Scanner;

public class Step5_방문록_문자열버전 { // class s
    public static void main(String[] args) { // main s

        // * 입력객체
        Scanner scanner = new Scanner(System.in);
        // 5 저장할 (배열)변수 선언
        String[] 방문록배열 = {};
        
        // 1. 무한루프
        while (true){ // w start
            // 2. 출력
            System.out.println("========== 방문록 ==========");

            // 7. for문 이용한 배열내 모든 항목/요소 호출 : 0부터 2까지 1씩증가.나머지는 코드가 반복되네.
            for( int index = 0 ; index < 방문록배열.length ; index++ ){
                if( 방문록배열[index] != null ) {
                    String[] 방문록 = 방문록배열[index].split(",");
                    System.out.printf("%2d \t %-5s \t %-20s \n", index + 1, 방문록[1], 방문록[0]);
                }
            } // for end

            System.out.println(" 1.방문록 작성 2.방문록 삭제 3.종료 ");
            // 3. 입력
            System.out.print(" 선택> "); int ch = scanner.nextInt();
            // 4. 입력에 따른 경우의수 판단
            if( ch == 1 ){
                scanner.nextLine();
                System.out.print("내용 : ");    String content = scanner.nextLine();
                System.out.print("작성자 : ");   String writer = scanner.next();
                System.out.print("비밀번호 : ");  int password = scanner.nextInt();
                // 6-3 배열에 각각 대입하기.
                String[] 임시방문록배열 = new String[ 방문록배열.length+1 ];
                for( int i = 0 ; i < 방문록배열.length ; i++ ){
                    임시방문록배열[i] = 방문록배열[i];
                };
                임시방문록배열[ 방문록배열.length ] = content+","+writer+","+password;
                방문록배열 = 임시방문록배열;
            }

            else if( ch == 2 ){
                // 8-1 입력 : 삭제할 방문록의 위치(인덱스) 입력
                System.out.print("방문록 삭제 위치 : 1. 2. 3. : ");
                int no = scanner.nextInt();
                // 8-2 입력 : 유효성검사를 위한 비밀번호 입력받기
                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();
                // 8-3 초기화
                System.out.println( 방문록배열[ no-1 ].split(",")[2] );
                // 만약에 입력한 인덱스가 존재하고. 해당 방문록의 패스워드 와 방금 입력한 패스워드와 같으면.
                if( (no >= 0 || no <= 방문록배열.length)
                        && Integer.parseInt(방문록배열[ no-1 ].split(",")[2] ) == password  ){
                    // 배열의 항목/요소의 자리/길이 삭제할수 없으므로 초기값으로 대입.
                    방문록배열[no-1] = null;




                }else{
                    System.out.println("[경고] 알수없는 위치 또는 패스워드 가 다릅니다.");
                }
            }

            else if( ch == 3 ){ break; }
            else {   System.out.println("[경고] 알수없는 입력입니다.");  }
        }// w end
    } // main e
} // class e

