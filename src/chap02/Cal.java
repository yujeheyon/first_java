package chap02;

import java.util.Scanner;

public class Cal 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        System.out.println("=== +, -, *, / 중 하나를 고르시오. (기본값 +) ===");
        System.out.print("입력: ");
        String cal = scanner.nextLine();

        if(cal.equals("+"))
        {
            int result = x + y;
            System.out.println("x + y = " + result);
        }else if(cal.equals("-"))
        {
            int result = x - y;
            System.out.println("x - y = " + result);
        }else if(cal.equals("*"))
        {
            int result = x * y;
            System.out.println("x * y = " + result);
        }else if(cal.equals("/"))
        {
            int result = x / y;
            System.out.println("x / y = " + result);
        }else
        {
            int result = x + y;
            System.out.println("x + y = " + result);
        }
    }
}
