package etc.classStudy;

public class Calculator 
{
    int num1 = 20;
    int num2 = 10;

    int add()
    {
        int result1 = num1 + num2;
        return result1;
    }

    int subtract()
    {
        int result2 = num1 - num2;
        return result2;
    }

    public static void main(String[] args) 
    {
        Calculator cal = new Calculator();
        System.out.println("덧셈 결과: " + cal.add());
        System.out.println("뺄셈 결과: " + cal.subtract());
    }
}
