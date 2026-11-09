package chap04;

public class IfNestedExample 
{
    public static void main(String[] args) 
    {
        int score = (int)(Math.random() * 20) + 81;
        System.out.println("점수: " + score);

        String grade;

        grade = (score >= 95) ? "A+" : (score >= 90) ? "A" : (score >= 85) ? "B+" : "B";

        // if(score >= 90)
        // {
        //     grade = (score >= 95) ? "A+" : "A";
        // }else
        // {
        //     grade = (score >= 85) ? "B+" : "B";
        // }

        System.out.println("학점: " + grade);
    }
}
