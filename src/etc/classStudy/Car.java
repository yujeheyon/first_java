package etc.classStudy;

public class Car 
{
    String brand = "현대";
    String model = "소나타";
    int speed = 0;

    void accelerate()
    {
        for(int i = 0; i <= 30; i += 10)
        {
            speed = i;
        }
    }

    void brake()
    {
        for(int i = 30; i >= 0; i -= 10)
        {
            speed = i;
            if(speed == 10)
            {
                break;
            }
        }
    }

    void showInfo()
    {
        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("현재 속도: " + speed);
    }

    public static void main(String[] args) 
    {
        Car car = new Car();
        car.showInfo();
        car.accelerate();
        car.showInfo();
        car.brake();
        car.showInfo();
    }
}
