package chap02;

public class CastingExample 
{
    public static void main(String[] args) 
    {
        // parse로 값을 변형할 뿐 기존의 값 형태가 완전히 변하는 건 아님
        int  var1 = 10;             
        byte var2 = (byte) var1;    // var1은 여전히 int
        System.out.println(var2);

        long var3 = 300;
        int  var4 = (int) var3;
        System.out.println(var4);

        int  var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int    var8 = (int) var7;
        System.out.println(var8);

    }
}
