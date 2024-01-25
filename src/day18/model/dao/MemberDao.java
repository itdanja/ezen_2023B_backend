package day18.model.dao;

import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {

    // 1. 필드
        // DB 연동 관련 인터페이스 준비물
    private Connection conn ; // 1. DB연동객체 , PreparedStatement객체 생성 반환
    private PreparedStatement ps ; // 2. 작성된 SQL 가지고 있고, 매개변수 , SQL실행 담당.
    private ResultSet rs;        // 3. sql 실행 결과

    // 싱글톤
    private MemberDao(){ // 생성자. : 객체 생성시 초기화 담당.
        // - 객체 생성시 db연동.
        try {
            // 1. MYSQL 회사의 JDBC관련된 (Driver)객체를 JVM에 로딩한다. 불러오기.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 연동된 결과의 (구현체)객체를 Connection인터페이스에 대입한다.
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root", "1234"
            );
            System.out.println("<DB연동 성공>");
        }catch ( Exception e ){  System.out.println("<DB연동실패>" + e); }
    }
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){  return memberDao;}

    // 1. 회원가입
    public int signup(MemberDto memberDto ){
        try {
            // 1. SQL 작성 [ 변수가 들어갈 자리에는 ? 대체한다. ]
            String sql = "insert into member( mid , mpw , mphone ) " +
                    " values( ? , ? , ? ) ";
            // 2. SQL 기재
            ps = conn.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1, memberDto.getMid());      // 기재된 SQL내 첫번째 ? 에 값 대입
            ps.setString(2, memberDto.getMpw());     // 기재된 SQL내 두번째 ? 에 값 대입
            ps.setString(3, memberDto.getMphone());  // 기재된 SQL내 세번째 ? 에 값 대입
            // 3. SQL 실행  // 4. SQL 결과
            int count = ps.executeUpdate(); // executeUpdate() 기재된 sql 실행하고 insert된 레코드 개수 반환.
            if (count == 1) {   return 0; } // 만약에 insert처리된 레코드가 1개이면 회원가입 성공
        }catch ( Exception e ){    System.out.println(e);    }

        // 5. 함수 종료
        return 1; // 실패
    }

}















