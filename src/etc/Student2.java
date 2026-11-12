package etc;

public class Student2 extends Person2
{
    void study()
    {
        System.out.println("공부합니다.");
    }

    public static void main(String[] args) 
    {
        Student2 student = new Student2();

        student.introduce();
        student.study();
    }
}
