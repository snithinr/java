import java.util.Scanner;
class MultipleCatch{
    public static void main(String[]args){
        int a,b;
        Scanner s =new Scanner(System.in);
        int div;
        int c[] = new int[5];
        String str,l;
        int q;
        System.out.print("Choices : \n1.Arithmetic\n2.NullPointer\n3.NumberFormat\n4.ArrayIndexOutofBounds\n");
        System.out.print("Enter your choice : ");
        q = s.nextInt();
        try{
            switch(q){
            case 1: //Arithmetic
            System.out.print("Enter a,b : ");
            a = s.nextInt();
            b = s.nextInt();
            div = a/b;
            System.out.println("a/b = "+div);
            break;
            case 2: //NullPointer
            str = null;
            if(str.equals("Pavan")){
                System.out.println("String is pavan");
            }
            else{
                System.out.println("String : "+str);
            }
            break;
            case 3 : //NumberFormat
            l = s.next();
            int z  =  Integer.parseInt(l);
            System.out.println(z);
            break;
            case 4 : //ArrayIndexOutofBounds
            System.out.print("Enter Values into Array : ");
            for(int i=0;i<6;i++){
                c[i] = s.nextInt();
            }
            for(int i=0;i<5;i++){
                System.out.print(" "+c[i]+" ");
            }
            break;
            default : 
                    break;
            }
        }
        catch(ArithmeticException k1){
            System.out.println("Exception : "+ k1.toString());
        }
        catch(NullPointerException k2){
            System.out.println("Exception : "+k2.toString());
        }
        catch(NumberFormatException k3){
            System.out.println("Exception : "+k3.toString());
        }
        catch(ArrayIndexOutOfBoundsException k4){
            System.out.println("Exception : "+k4.toString());
        }
        finally{
            System.out.println("This is finally block and it is executed even there is an Exception");
        }
    }
}