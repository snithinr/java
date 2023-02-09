import java.util.Scanner;
interface Salary{
    String CalcSal();
}
interface Taxes{
    String CalcTax();
}
class FullTimeEmployee implements Salary,Taxes{
    private int id,hra,da,basic;
    private String Name;
    public FullTimeEmployee(int id,String Name,int hra,int da,int basic){
        this.id = id;
        this.hra = hra;
        this.basic = basic;
        this.da = da;
        this.Name = Name;
    }
    public String CalcSal(){
        return ("Salary : "+ (hra+da+basic));
    }
    public String CalcTax(){
        return ("Tax : "+ (30*(hra+da+basic)/100));
    }
    public String toString(){
        return ("Full Time Employee :\nid : "+id+"\nName : "+Name+"\n"+CalcSal()+"\n"+CalcTax());
    }
}
class PartTimeEmployee implements Salary,Taxes{
    private int id,rph,noh;
    private String Name;
    public PartTimeEmployee(int id,String Name,int rph,int noh){
        this.id = id;
        this.Name = Name;
        this.rph = rph;
        this.noh = noh;
    }
    public String CalcSal(){
        return ("Salary : "+ (rph*noh));
    }
    public String CalcTax(){
        return ("Tax : 0");
    }
    public String toString(){
        return ("Part Time Employee :\nid : "+id+"\nName : "+Name+"\n"+CalcSal()+"\n"+CalcTax());
    }
}
class InterfaceTester{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Full Time Emp\n2.Part Time Emp\n3.Exit\nEnter Your Choice : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1 : System.out.println("Enter Employee Id,Name,Hra,DA,Basic : ");
                     int id = sc.nextInt();
                     String Name  = sc.next();
                     int hra = sc.nextInt();
                     int da = sc.nextInt();
                     int basic = sc.nextInt();
                     FullTimeEmployee e1 = new FullTimeEmployee(id,Name,hra,da,basic);
                     System.out.println(e1.toString());
                     break;
            case 2 : System.out.println("Enter Employee Id,Name,rph,noh : ");
                     id = sc.nextInt();
                     Name  = sc.next();
                     int rph = sc.nextInt();
                     int noh = sc.nextInt();
                     PartTimeEmployee e2 = new PartTimeEmployee(id,Name,rph,noh);
                     System.out.println(e2.toString());
                     break;
            default : break;
        }
    }
}