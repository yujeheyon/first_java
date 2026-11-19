package chap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            String originalFileName = "C:\\java_home\\first_java\\src\\img\\diego_torres-bridge-2767545_1280.jpg";
            String targetFileName = "C:\\Temp\\diego_torres-bridge-2767545_1280.jpg";
    
            FileInputStream fis = new FileInputStream(originalFileName);
            FileOutputStream fos = new FileOutputStream(targetFileName);
    
            int readByteNo;
            byte readBytes[] = new byte[100];
            while((readByteNo = fis.read(readBytes)) != -1)
            {
                fos.write(readBytes, 0, readByteNo);
            }
    
            fos.flush();
            fos.close();
            fis.close();
    
            System.out.println("복사가 잘 되었습니다.");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
