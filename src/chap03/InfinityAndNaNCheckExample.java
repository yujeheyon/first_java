package chap03;

import java.util.*;

public class InfinityAndNaNCheckExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        double y = Double.parseDouble(strY);

        double z = x / y;

        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));

        if(Double.isInfinite(z) || Double.isNaN(z))
        {
            System.out.println("값 산출 불가");
        }else
        {
            System.out.println(z + 2);
        }
    }
}
