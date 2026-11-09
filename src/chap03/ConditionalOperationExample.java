package chap03;

public class ConditionalOperationExample 
{
    public static void main(String[] args) 
    {
        int score = 70;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");

        if(score > 90)
        {
            grade = 'A';
            System.out.println(score + "점은 " + grade + "등급입니다.");
        }else if (score > 80) 
        {
            grade = 'B';
            System.out.println(score + "점은 " + grade + "등급입니다.");
        }else
        {
            grade = 'C';
            System.out.println(score + "점은 " + grade + "등급입니다.");
        }
    }
}
