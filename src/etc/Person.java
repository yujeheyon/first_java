package etc;

public class Person 
{
    String name;
    int age;

    void introduce(String name, int age)
    {
        System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }

    public static void main(String[] args) 
    {
        Person person = new Person();
        person.introduce("철수", 20);
    }
}
