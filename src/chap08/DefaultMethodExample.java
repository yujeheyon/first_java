package chap08;

public class DefaultMethodExample 
{
    public static void main(String[] args) 
    {
        Myinterface mi1 = new MyclassA();
        mi1.method1();
        mi1.method2();

        Myinterface mi2 = new MyclassB();
        mi2.method1();
        mi2.method2();
    }
}
