package chap06;

public class CalculatorExample1 
{
    public static void main(String[] args) 
    {
        Calculator1 myCal = new Calculator1();
        myCal.powerOn();

        int result1 = myCal.plus(5, 6);
        System.out.println("result1: " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCal.divide(x, y);
        System.out.println("result2: " + result2);

        myCal.powerOff();
    }
}
