package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Step2 {
    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test4", "root", "1234");
            System.out.println("<연동성공>");

            String sql = "insert into member( mno , mid ) values( 3 , 'asd' )";
            conn.prepareStatement( sql ).executeUpdate();

        }catch (Exception e ){
            System.out.println("<연동실패>" + e);
        }
    }
}
