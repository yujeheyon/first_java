package chap10;

public class Add
{
    public void add(String datas[] )
    {
        try
        {
            String data =  datas[4];

        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("실행 매개값의 수가 부족합니다.");
            return;
        }

        try
        {
            int value1 = Integer.parseInt(datas[0]);
            int value2 = Integer.parseInt(datas[1]);
            int result = value1 + value2;
            System.out.println(datas[0] + " + " + datas[1] + " = " + result);
        }catch(NumberFormatException e)
        {
            System.out.println("숫자로 변환할 수 없습니다.");
        }finally
        {
            System.out.println("다시 실행하세요.");
        }
    }
}
