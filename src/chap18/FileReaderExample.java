package chap18;

import java.io.FileReader;

public class FileReaderExample 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            FileReader fr = new FileReader("C:\\java_home\\first_java\\src\\chap18\\FileReaderExample.java");
    
            int readCharNo;
            char cbuf[] = new char[100];
            while((readCharNo = fr.read(cbuf)) != -1)
            {
                String data = new String(cbuf, 0, readCharNo);
                System.out.print(data);
            }
            fr.close();;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
