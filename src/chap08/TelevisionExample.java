package chap08;

public class TelevisionExample
{
    public static void main(String[] args) 
    {
        RemoteControl rc;
        rc = new Television();
        
        rc.turnOn();
        rc.turnOff();
        System.out.println("===================");

        rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
    }
}
