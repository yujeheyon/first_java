package chap07;

public class ChildExample 
{
    public static void main(String[] args) 
    {
        Child child = new Child();

        Parent parent = child;

        parent.method1();

        parent.method2();

        // parent.method3();    상속과 관련없는 메소드 호출 불가
    }
}
