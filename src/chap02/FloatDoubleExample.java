package chap02;

public class FloatDoubleExample
{
    public static void main(String[] args)
    {
        double var1 = 3.14;
        // float var2 = 3.14;   // 형식을 지정하지 않아 컴파일 오류
        float var3 = 3.14F;

        // 정밀도 테스트
        double var4 = 0.1234567890123456789;    // 15자리까지 지원
        float  var5 = 0.1234567890123456789F;   // 7자리까지 지원

        System.out.println("var1: " + var1);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
    }    
}
