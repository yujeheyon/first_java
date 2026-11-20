package programing;

import java.sql.*;

public class BookManager
{
    Connection conn = null;
    PreparedStatement pstmt;

    // 파일에서 데이터 로드
    public void loadFromFile()
    {
        try
        {
            // JDBC Driver 등록
            Class.forName("oracle.jdbc.OracleDriver");

            // 연결하기
            conn = DriverManager.getConnection
                (
                    "jdbc:oracle:thin:@//localhost:1521/XE",
                    "system",
                    "1234"
                );

            System.out.println("연결 성공");
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }


    // 프로그램 종료
    public void exitFile()
    {
        if(conn != null)
        {
            try
            {
                // 연결 끊기
                conn.close();
                System.out.println("연결 끊기");
            }catch(SQLException e) {}
        }
    }
    
    // 데이터 추가
    public void addItem(String id, String title, String author)
    { 
        String sql = "" +
            "INSERT INTO books(id, title, author)" + 
            "VALUES (?, ?, ?)";

        try
        {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, id);
            pstmt.setString(2, title);
            pstmt.setString(3, author);

            pstmt.executeUpdate();
            System.out.println("ID: " + id + ", 제목: " + title + ", 저자: " + author);
            System.out.println("성공적으로 등록되었습니다.");
            
        }catch(SQLException e) {}
        
    }

    // 전체 목록 출력
    public void displayAll()
    {
        String sql = "" + 
            "SELECT id, title, author " + 
            "FROM books";

        try
        {
            pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            boolean run = true;

            while(run)
            {
                if(rs.next())
                {
                    Book book = new Book();
                    book.setId(rs.getString("id"));
                    book.setTitle(rs.getString("title"));
                    book.setAuthor(rs.getString("author"));
                    System.out.println(book);
    
                }else
                {
                    rs.close();
                    System.out.println("등록된 도서가 없습니다.");
                    run = false;
                }
            }    
            
        }catch(SQLException e) {}
    }
}
