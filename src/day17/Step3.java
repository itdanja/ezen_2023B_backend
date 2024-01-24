package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {

    public static void main(String[] args) {
        // 입력 객체
        Scanner scanner = new Scanner(System.in);
        // DB연동
        Connection connection = null ; // try{} 와 while{} 에서 모두 사용하기 위해 선언만 먼저 작성
        try {
            // 1. JDBC 드라이버 로딩한다.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. db서버와 연동 후 연동객체를 반환 받는다.
            connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test5",   "root","1234" );
            System.out.println("<연동성공>");
            // 3. DB연동시 필요한 메소드중에  Class.forName , getConnection 일반예외 발생.
                // - try{}catch(예외클래스명 매개변수){}
        }catch ( Exception e ){  System.out.println(e);  }

        while(true){ // 무한루프
            System.out.println(" 고객명단 : 1.삽입 2.출력 3.수정 4.삭제");
            System.out.print("선택> ");

            try {
                int ch = scanner.nextInt(); // 만일 int타입 범위 벗어난 입력시 오류 발생[ InputMismatchException ]
                if( ch == 1 ){
                    // 1. 입력받기
                    System.out.print("저장 고객명 : "); String name = scanner.next();
                    // 2. DB에 저장한다. // SQLException 예외처리.
                    // connection.prepareStatement("insert into members values('유재석');").executeUpdate();
                    // String sql = "insert into members values('입력받은값')";
                    String sql = "insert into members values('"+name+"')";                                 System.out.println( sql );
                    connection.prepareStatement( sql ).executeUpdate();
                }
                else if( ch == 2 ){ }
                else if( ch == 3 ){
                    // 1. 입력받기    // 누구를 // 어떻게 수정할껀지 입력
                    System.out.print("수정할 고객명 : "); String oldName = scanner.next();
                    System.out.print("새로운 고객명 : "); String newName = scanner.next();
                    // 2. DB에 수정처리 한다. // String sql = "update members set name = '새로운고객명' where name = '기존고객명' ";
                    String sql = "update members set name = '"+newName+"' where name = '"+oldName+"' ";     System.out.println(sql);
                    connection.prepareStatement( sql ).executeUpdate();
                }
                else if( ch == 4 ){
                    // 1. 입력받기  // 누구를  삭제할껀지 입력
                    System.out.println("삭제할 고객명 : "); String deleteName = scanner.next();
                    // 2. db에 삭제처리한다. // String sql = "delete from members where name = '삭제할고객명' ";
                    String sql = "delete from members where name = '"+deleteName+"' ";                      System.out.println( sql );
                    connection.prepareStatement( sql ).executeUpdate();
                }

            }catch ( InputMismatchException e ){
                System.out.println("<시스템오류> 정상적인 입력값이 아닙니다.");
                scanner = new Scanner(System.in); // 기존에 입력받은 바이트를 지우기/초기화
            }catch ( SQLException e ){
                System.out.println("<시스템오류> SQL 문법 오류 입니다.");
            } // catch end

        } // while e
    } // main e
} // class e 
