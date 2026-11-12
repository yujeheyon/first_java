package chap07;

public class ComputerExample2 
{
    public static void main(String[] args) 
    {
        int r = 10;
        Calculator5 calculator = new Calculator5();
        System.out.println("원면적: " + calculator.areaCircle(r));
        System.out.println();

        Computer2 computer = new Computer2();
        System.out.println("원면적: " + computer.areaCircle(r));
    }
}
