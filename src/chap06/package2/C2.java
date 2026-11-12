package chap06.package2;

import chap06.package1.A2;

public class C2 
{
    public C2()
    {
        A2 a = new A2();
        a.field1 = 1;
        // a.field2 = 1;    접근 제한이 default라 같은 패키지 내에서만 사용 가능
        // a.field3 = 1;    접근 제한이 private라 동일한 클래스 내에서만 사용 가능

        a.method1();
        // a.method2();     접근 제한이 default라 같은 패키지 내에서만 사용 가능
        // a.method3();     접근 제한이 private라 동일한 클래스 내에서만 사용 가능
    }
}
