class Marks{
    static int a =60; //Static variable
    static {//Static Block
        System.out.print("your Marks are : ");
    }
    static void change(){//Static Method
    a = 70;
    }
    void display(){
        System.out.print(" "+a);
    }
}

public class StaticInitialization{
    public static void main(String[]args){
        Marks m1 = new Marks();
        Marks.change();
        m1.display();
    }
}