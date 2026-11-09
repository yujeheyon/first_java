package chap04;

public class SwitchExpressionsExample 
{
    public static void main(String[] args) 
    {
        // 람다식
        char grade = 'B';

        switch(grade)
        {
            case 'A', 'a' ->
            {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' ->
            {
                System.out.println("일반 회원입니다.");
            }
            default ->
            {
                System.out.println("손님입니다.");
            }
        }

        // 출력 줄이 한 줄이면 이렇게 줄일 수는 있으나 추천하지 않음
        switch(grade)
        {
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}
