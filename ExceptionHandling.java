import java.util.Scanner;
class ExceptionHandling{
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
        }
        int c[] = new int[5];
        try{
            System.out.print("Enter Values into Array : ");
            for(int i=0;i<6;i++){
                c[i] = s.nextInt();
            }
            for(int i=0;i<5;i++){
                System.out.print(" "+c[i]+" ");
            }
        }
        catch(ArrayIndexOutOfBoundsException kk){
            System.out.println("Exception : "+kk);
        }
        String str = null;
        try{
            if(str.equals("Pavan")){
                System.out.println("String is pavan");
            }
            else{
                System.out.println("String : "+str);
            }
        }
        catch(NullPointerException kkk){
            System.out.println("Exception : "+kkk);
        }

        finally{
            System.out.println("This is finally block and it is executed even there is an Exception");
        }
    }
}