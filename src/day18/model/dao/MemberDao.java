package day18.model.dao;

import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {

    // 1. 필드
        // DB 연동 관련 인터페이스 준비물
    private Connection conn ;       // 1. DB연동객체 , PreparedStatement객체 생성 반환
    private PreparedStatement ps ;  // 2. 작성된 SQL 가지고 있고, 매개변수 , SQL실행 담당.
    private ResultSet rs;           // 3. sql 실행 결과

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
            String sql = "insert into member( mid , mpw , mphone ) values( ? , ? , ? ) ";
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
    } // m end

    // 0. 아이디 검사용( 아이디 중복검사 용도 ) true/false
    public boolean idCheck( String mid ){
        try {
            // 1. SQL 작성한다.
            String sql = "select mid from member where mid = ? ";
            // 2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
                // ? 매개변수 대입
            ps.setString(1, mid); // sql문법내 첫번째 ?에 mid 변수 값 대입 ;
            // 3. SQL 실행한다.
            rs = ps.executeQuery(); // 질의/검색 (select) 결과를 rs 인터페이스 대입한다.
            // 4. SQL 결과처리
            if (rs.next()) {        // rs.next() : 검색 결과 테이블에서 다음레코드 이동. [ 다음레코드 이동후 존재하면 true , 존재하지 않으면 false ]
                return true; // 중복 있음.
            }
        }catch ( Exception e ){  System.out.println(e);   }
        // 5. 함수종료
        return false; // 중복 없음
    } // e end

    // 2. 로그인
    public boolean login( MemberDto memberDto ){
        try {
            // 1. SQL 작성한다.
            String sql = "select * from member where mid = ? and mpw = ? ";
            // 2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            // ? 매개변수 값 대입
            ps.setString(1, memberDto.getMid()); // sql 문법내 첫번째 ? 에 매개변수 값 대입
            ps.setString(2, memberDto.getMpw()); // sql 문법내 두번째 ? 에 매개변수 값 대입
            // 3. SQL 실행한다.
            rs = ps.executeQuery();
            // 4. SQL 결과처리
            // if vs while   : 만약에 SELECT의 결과물이 하나의 레코드가 존재하면 로그인 성공 아니면 실패.
            if ( rs.next() ) {  return true;   }
        }catch ( Exception e ){  System.out.println(e);   } // SQL 문제 발생.
        // 5. 함수종료
        return false;
    }

    // 0. 아이디를 이용한 회원번호 찾기
    public int findMno( String mid ){
        try {
            // 1. SQL 작성한다.
            String sql = "select mno from member where mid = ?";
            // 2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1, mid);
            // 3. SQL 실행한다.
            rs = ps.executeQuery();
            // 4. SQL 결과처리
            if (rs.next()) {
                // rs.next() : 다음 레코드 이동
                // rs.get타입( 호출할 필드번호 or 필드이름 ) : 현재 레코드의 필드 값 호출
                return rs.getInt("mno");
            }
        }catch ( Exception e ){  System.out.println(e);   }
        // 5. 함수종료
        return 0;
    }
}






















