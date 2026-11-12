package etc;

public class Student1 
{
    String name;
    int score;

    void printInfo(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) 
    {
        Student1 student = new Student1();

        student.printInfo("영희", 95);
        System.out.println("학생 이름: " + student.name);
        System.out.println("학생 점수: " + student.score);
    }
}
