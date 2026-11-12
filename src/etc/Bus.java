package etc;

public class Bus extends Vehicle
{
    @Override 
    void run()
    {
        System.out.println("버스가 달립니다.");
    }

    public static void main(String[] args) 
    {
        Bus bus = new Bus();

        bus.run();
    }
}
