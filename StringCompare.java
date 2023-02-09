//program to create a string object and string literal and compare them and test whether it returns true or false

public class StringCompare{
  public static void main(String[]args){
      String s1 = "Pavan Manish";
      String s2 = new String("Pavan Manish");
      String s3 = "Pavan Manish";
      String s4 = new String("Pavan Manish");
      System.out.println("Comparing Strings with '==' : " + (s1==s2));
      System.out.println("Comparing same Stringliterals with '==' : "+(s1==s3));
      System.out.println("Comparing two same Strings objects with '==' : "+(s2==s4));
      System.out.println("Comparing Strings with '.equals' : " + s1.equals(s2));
      System.out.println("Comparing same Stringliterals with '.equals' : "+ s1.equals(s3));
      System.out.println("Comparing two same Strings objects with '.equals' : "+s2.equals(s4));
  }
}