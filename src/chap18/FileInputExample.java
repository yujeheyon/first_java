package chap18;

import java.io.FileInputStream;

public class FileInputExample 
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream fis = new FileInputStream("C:\\java_home\\first_java\\src\\chap18\\FileInputExample.java");
            int data;
            while((data = fis.read()) != -1)
            {
                System.out.write(data);
            }
            fis.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
