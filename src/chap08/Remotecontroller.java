package chap08;

public class Remotecontroller 
{
    public static void main(String[] args) 
    {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();

        RemoteControl.changeBattery();
    }
}
