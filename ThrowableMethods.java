import java.util.Scanner;
class ThrowableMethods{
    public static void main(String[]args){
        int a,b;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a,b : ");
        a = s.nextInt();
        b = s.nextInt();
        int div;
        try{
            div = a/b;
            System.out.println("a/b = "+div);
        }
        catch(ArithmeticException k){
            System.out.println("Exception : "+ k);
            System.out.println("getMessage : "+k.getMessage());
            System.out.println("getCause : "+k.getCause());
            System.out.println("toString : "+k.toString());
            k.printStackTrace();
        }
    }
}