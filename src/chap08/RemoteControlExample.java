package chap08;

public class RemoteControlExample 
{
    public static void main(String[] args) 
    {
        RemoteControl rc = new RemoteControl()
        {
            public void turnOn() 
            {
                System.out.println("익명 구현 객체 turnOn()");
            }
            public void turnOff() 
            {
                System.out.println("익명 구현 객체 turnOff()");
            }
            public void setVolume(int volume) 
            {
                System.out.println("현재 볼륨: " + volume);
            }
        };

        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);
    }
}
