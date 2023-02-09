//method overloading


class Sum{
    int l,b;
    int s;
    int Sum(int a,int b){
        return (a+b);
    }
    int Sum(int a,int b,int c){
        return (a+b+c);
    }
}

class SumTestDrive{
    public static void main(String[]args){
    Sum s = new Sum();
    int ss;
    System.out.println("Sum = "+s.Sum(10,20));
    System.out.println("Sum = "+s.Sum(10,20,30));
}
}