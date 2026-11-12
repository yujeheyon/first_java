package etc;

public class Person1 
{
    String name;
    int age;

    void introduce(String name, int age)
    {
        System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }

    public static void main(String[] args) 
    {
        Person1 person = new Person1();
        person.introduce("철수", 20);
    }
}
