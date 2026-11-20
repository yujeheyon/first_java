package connection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardWithFileUpdateExample 
{
    public static void main(String[] args) 
    {
        Connection conn = null;
        try
        {
            // JDBC Driver 등록
            Class.forName("oracle.jdbc.OracleDriver");

            // 연결하기
            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234"
            );

            // 매개변수화된 SQL 문 작성
            String sql = new StringBuilder()
                .append("UPDATE boards SET ")
                .append("btitle = ?, ")
                .append("bcontent = ?, ")
                .append("bfilename = ?, ")
                .append("bfiledata = ? ")
                .append("WHERE bno = ?")
                .toString();

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈사람");
            pstmt.setString(2, "눈으로 만든 사람");
            pstmt.setString(3, "winter_tree.jpg");
            pstmt.setBlob(4, new FileInputStream("src/img/winter_tree.jpg"));
            pstmt.setInt(5, 1);

            // SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수: " + rows);

            // PreparedStatement 닫기
            pstmt.close();

        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            if(conn != null)
            {
                try
                {
                    // 연결 끊기
                    conn.close();
                }catch(SQLException e) {}
            }
        }
    }
}
