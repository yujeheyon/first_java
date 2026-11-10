package chap04;

import java.util.*;

public class App 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        System.out.print("국어: ");
        String language = scanner.nextLine();

        System.out.print("수학: ");
        String math = scanner.nextLine();

        System.out.print("영어: ");
        String english = scanner.nextLine();

        while(run)
        {
            System.out.println("1. 총점 | 2. 평균 | 3. 중지");
            System.out.println("================================");

            System.out.print("선택: ");
            String num = scanner.nextLine();

            int total = Integer.parseInt(language) + Integer.parseInt(math) + Integer.parseInt(english);

            if(num.equals("1"))
            {
                System.out.println("총점: " + total);
            }else if(num.equals("2"))
            {
                double avg = total / 3;
                System.out.println("평균: " + avg);
            }else if(num.equals("3"))
            {
                run = false;
            }

        }

        System.out.println("프로그램 종료");
    }
}
