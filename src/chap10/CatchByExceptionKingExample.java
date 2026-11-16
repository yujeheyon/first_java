package chap10;

public class CatchByExceptionKingExample 
{
    public void add(String datas[])
    {
        try
        {
            String data1 = datas[0];
            String data2 = datas[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("실행 매개값의 수가 부족합니다.");
        }catch(NumberFormatException e)
        {
            System.out.println("숫자로 변환할 수 없습니다.");
        }finally
        {
            System.out.println("다시 실행하세요.");
        }
    }

    public static void main(String[] args) 
    {
        CatchByExceptionKingExample ce = new CatchByExceptionKingExample();

        ce.add(new String[] {"a", "b"});
    }
}
