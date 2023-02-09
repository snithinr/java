//nice.....
import java.util.Scanner;
class Test{
    public static void main(String[]args){
        Employee e1 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id,name,hra,da,basic : ");
        e1.empid = sc.nextInt();
        e1.name = sc.next();
        e1.hra = sc.nextInt();
        e1.da = sc.nextInt();
        e1.basic = sc.nextInt();
        e1.display();
    }
}