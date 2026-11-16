package chap10;

public class MultiCatchExample 
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
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e)
        {
            System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
        }catch(Exception e)
        {
            System.out.println("알 수 없는 예외 발생");
        }finally
        {
            System.out.println("다시 실행하세요.");
        }
    }

    public static void main(String[] args) 
    {
        MultiCatchExample m = new MultiCatchExample();

        m.add(new String[] {"a"});
    }
}
