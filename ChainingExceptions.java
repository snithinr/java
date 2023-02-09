class Test1{
    public void method1() throws ArithmeticException{
        int div = 10/0;
        System.out.println("Method1");
    }
}
class Test2{
    Test1 t1 = new Test1();
    public void method2() throws ArithmeticException{
        t1.method1();
        System.out.println("Method2");
    }
}
class Test3{
    Test2 t2 = new Test2();
    public void method3() throws ArithmeticException{
        t2.method2();
        System.out.println("Method3");
    }
}
public class ChainingExceptions{
    public static void main(String[]args){
        Test3 t3 = new Test3();
        try{
            t3.method3();
        }
        catch(ArithmeticException ae){
            System.out.println("Exception : "+ae.toString());
        }
    }
}