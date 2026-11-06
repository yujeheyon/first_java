package chap02;

public class LongExample 
{
    public static void main(String[] args) 
    {
        long var1 = 10;
        long var2 = 20L;
        // long var3 = 1000000000;  4byte에 8byte 정수가 들어가지 않아 컴파일 에러
        long var4 = 1000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
