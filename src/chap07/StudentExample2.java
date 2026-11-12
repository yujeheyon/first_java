package chap07;

public class StudentExample2 
{
    public static void main(String[] args) 
    {
        Student2 student = new Student2("홍길동", "123456-1234567", 1);
        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
