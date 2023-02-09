class ExceptionDemo{
    String s;
    void TestException()throws NullPointerException{
        s = null;
        System.out.println(s.length());
    }
}
class ExceptionTester{
    public static void main(String[]args){
        ExceptionDemo e = new ExceptionDemo();
        try{
            e.TestException();
        }
        catch(NullPointerException np){
            System.out.println("Exception : "+np.toString());
        }
    }
}