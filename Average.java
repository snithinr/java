public class Average{
    public static void main(String[]args){
       float avg = 0;
       for (int i=0;i<args.length ;i++){
           avg += Float.parseFloat(args[i]);
       }
       avg  /= args.length;
       System.out.println("Average = "+avg);
    }
}