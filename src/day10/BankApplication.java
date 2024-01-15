package day10;

import java.util.Scanner;

public class BankApplication { // 실행클래스
    // 클래스멤버
    // 1. 필드
    // 여러개의 account 객체를 저장하는 배열
    static Account[] accounts = new Account[100];
    // main() 함수 아닌 main() 밖에 정적필드로 선언하는 이유 : 여럿 함수에서 사용할려고.
    static Scanner scanner = new Scanner(System.in);
    // 2. 생성자
    // 3. 메소드
    static void 계좌생성(){  // 2. 계좌생성
        System.out.println("BankApplication.계좌생성");
        // 1. 입력받기  // * Account객체 만들어서 배열에 저장 목적.
        System.out.print("계좌번호 : "); String 계좌번호 = scanner.next();
        System.out.print("계좌주 : "); String 계좌주 = scanner.next();
        System.out.print("초기입금액 : "); int 초기입금액 = scanner.nextInt();
        // 2. 객체 생성
            // 1. 풀생성자 사용했을떄
        Account account = new Account( 계좌번호 , 계좌주 , 초기입금액 );
            // 2. 빈생성자 사용했을때 [ 권장하지 않음 -> 생성자 또는 메소드를 통한 필드 사용 ]
        //Account account = new Account();
        //account.계좌번호 = 계좌번호 ;
        //account.계좌주 = 계좌주;
        //account.입금액 = 초기입금액;
        // 3. 객체를 배열에 넣는다.
            // 정적메소드에서는 인스턴스필드를 호출할수 없다.
                // 1. 인스턴스필드를 static 한다.
                // 2. 객체생성한다???? [ x ]
        for( int i = 0 ; i < accounts.length ; i++ ){
            if( accounts[i] == null ){ // 만약에 비어 있으면 객체 저장
                accounts[i] = account;
                break;
            }
        }
    } // f end

    static void 계좌목록(){  // 3. 계좌목록
        System.out.println("BankApplication.계좌목록");
        // * 배열내 반복문을 이용한 모든 계좌객체 를 호출
        for( int i = 0 ; i < accounts.length ; i++ ){
            Account account = accounts[i];
            if( account == null ) break;
            System.out.printf(" %10s \t %5s \t %10d \n"  , account.계좌번호 , account.계좌주 , account.입금액);
        }
    } // f end
    static void 예금() {  // 4. 예금
        System.out.println("BankApplication.예금");
        // * 입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은 계좌객체 에서 예금에 더한다.
        // 1. 입력받는다.
        System.out.print("예금] 계좌번호 : ");    String 계좌번호 = scanner.next();
        System.out.print("예금] 예금액 : ");     int 예금액 = scanner.nextInt();
        // 2. 계좌목록/배열 에서 입력한 계좌찾는다.
        for( int i = 0 ; i < accounts.length ; i++ ){
            Account account = accounts[i];
            if( account == null ) break;
            // 만약에 동일한 계좌번호의 객체가 있으면 해당 객체내 입금액를 더한다.
            if( account.계좌번호.equals( 계좌번호 ) ){   account.입금액 += 예금액; break;   }
        }
    } // f end
    static void 출금() {  // 5. 출금
        System.out.println("BankApplication.출금");
        // * 입력받은 계좌번호가 계좌목록에 존재하면 입력한 출금액을 찾은 계좌객체 에서 예금에 뺀다.
        System.out.print("예금] 계좌번호 : ");    String 계좌번호 = scanner.next();
        System.out.print("예금] 예금액 : ");     int 출금액 = scanner.nextInt();
        // 2. 계좌목록/배열 에서 입력한 계좌찾는다.
        for( int i = 0 ; i < accounts.length ; i++ ){
            Account account = accounts[i];
            if( account == null ) break;
            // 만약에 동일한 계좌번호의 객체가 있으면 해당 객체내 입금액를 더한다.
            if( account.계좌번호.equals( 계좌번호 ) ){   account.입금액 -= 출금액; break;   }
        }
    } // f end 

    public static void main(String[] args) {  // 1. 실행 시작점.
        while(true){
            System.out.println("------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.print("선택> ");
            int ch = scanner.nextInt();

            if( ch == 1 ){ 계좌생성(); }
            else if( ch == 2 ){ 계좌목록(); }
            else if( ch == 3 ){ 예금(); }
            else if( ch == 4 ){ 출금(); }
            else if( ch == 5 ){   System.out.println("프로그램 종료"); break; }

        } // w end
    } // m end
} // class end 
