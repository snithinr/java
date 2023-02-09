public class IntializationBlock{
    static int var;
    {
        System.out.println("Instance Variable");
        var  = 7;
    }
    static{
        System.out.println("Static Intialization");
        var = 5;
    }
    public static void main(String[]args){
        new IntializationBlock();
    }
}