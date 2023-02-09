class S{
        static{
            System.out.println("Name : Pavan Manish");
        }
        int roll = 12;
        static String college = "CVR COLLEGE OF ENGINEERING";
        static void change(){
           college = "CVRCE"; 
        }
        S(int r){
            roll = r;
        }
        void display(){
            System.out.println("Roll : "+roll);
            System.out.println("College : "+college);
        }
    
}
public class Static{
    public static void main(String[]args){
        S o1 = new S(21);
        o1.display();
    }
}