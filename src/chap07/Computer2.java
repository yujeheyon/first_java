package chap07;

public class Computer2 extends Calculator5
{
    @Override
    double areaCircle(double r)
    {
        System.out.println("Computer 객체의 areaCirle() 실행");
        return Math.PI * r * r;
    }
}
