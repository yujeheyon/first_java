package etc.inheritance;

public class Student extends Person
{
    void study()
    {
        System.out.println("공부합니다.");
    }

    public static void main(String[] args) 
    {
        Student student = new Student();

        student.introduce();
        student.study();
    }
}
