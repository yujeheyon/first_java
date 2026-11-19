package test;

import java.io.*;
import java.util.*;

public class BookApp 
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("C:\\java_home\\first_java\\src\\test\\books.txt");
        FileWriter fw = new FileWriter(file, true);
        FileReader fr = new FileReader("C:\\java_home\\first_java\\src\\test\\books.txt");

        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while(run)
        {
            System.out.println("=== LIBRARY SYSTEM ===");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 저장 및 종료");
            System.out.print("메뉴 선택 >> ");
            String num = scanner.nextLine();

            if(num.equals("1"))
            {
                System.out.println("등록할 도서를 입력해주세요.");
                System.out.print("도서 식별 번호: ");
                String id = scanner.nextLine();

                System.out.print("도서 제목: ");
                String title = scanner.nextLine();

                System.out.print("저자명: ");
                String author = scanner.nextLine();

                String books[] = {id, title, author};
                for(int i = 0; i < books.length; i++)
                {
                    fw.write(books[i] + ", ");
                }
                fw.write("\r\n");
                fw.flush();
                System.out.println("id: " + id);
                System.out.println("제목: " + title);
                System.out.println("저자: " + author);
                System.out.println("결과: 성공적으로 등록되었습니다.");
            }else if(num.equals("2"))
            {
                int readCharNo;
                char cbuf[] = new char[100];
                System.out.println("번호 | 도서명 | 저자");
                System.out.println("==========================");
                while((readCharNo = fr.read(cbuf)) != -1)
                {
                    String data = new String(cbuf, 0, readCharNo);
                    String datas[] = data.split(",");
                    for(String name : datas)
                    {
                        System.out.print(name);
                    }
                }
                fr.close();
                
            }else if(num.equals("3") || num.equals("q"))
            {
                fw.close();
                run = false;

            }else
            {
                System.out.println();
                System.out.println("다시 입력해주세요.");
                System.out.println("===================");
            }
        }
    }
}
