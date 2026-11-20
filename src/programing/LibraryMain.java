package programing;

import java.util.Scanner;

public class LibraryMain 
{
    public static void main(String[] args) 
    {
        BookManager bm = new BookManager();
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        String bid;
        String btitle; 
        String bauthor;

        bm.loadFromFile();

        while(run)
        {
            System.out.println("=== Library ===");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 저장 및 종료");
            System.out.print("메뉴 선택 >> ");
            String num = scanner.nextLine();
            System.out.println();

            if(num.equals("1")) 
            {
                System.out.print("ID: ");
                bid = scanner.nextLine();

                System.out.print("제목: ");
                btitle = scanner.nextLine();

                System.out.print("저자: ");
                bauthor = scanner.nextLine();

                System.out.println();
                bm.addItem(bid, btitle, bauthor);
            }else if(num.equals("2"))
            {   
                bm.displayAll();
            }else if(num.equals("3") || num.equals("q"))
            {
                bm.exitFile();    
                run = false;
            }else
            {
                System.out.println("다시 입력하세요.");
            }
        }
    }
}
