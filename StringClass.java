public class StringClass{
    public static void main(String[]args){
        //String Class
        System.out.println("String Class");
        String s1 = new String("Object Oriented Programming through Java ");
        String s2 = new String("Lab");
        System.out.println("Compare To : "+s1.compareTo(s2));
        System.out.println("Concat : "+s1.concat(s2));
        System.out.println("Equals : "+s1.equals(s2));
        System.out.println("Index Of : "+s1.indexOf('a'));
        System.out.println("Last index Of : "+s1.lastIndexOf('a'));
        System.out.println("Length : "+s1.length());
        System.out.println("Replace : "+s1.replace('a','b'));
        String s3 = "10";
        System.out.println("Value Of : "+s3.valueOf(s3));
        String[] arr = s1.split("a",5);
        System.out.print("Split : ");
        for (String a : arr)
            System.out.println(a+" ");
        System.out.println("to Lower Case : "+ s1.toLowerCase());
        System.out.println("to Upper Case : "+ s1.toUpperCase());
        System.out.println("to String : "+ s1.toString());
        System.out.println("Sub String : "+s1.substring(8,25));

        // String builder
        System.out.println("String Builder Class");
        StringBuilder sb1 = new StringBuilder("Java Lab");
        System.out.println(sb1.toString());
        StringBuilder sb2 = new StringBuilder();
        System.out.println("Default Capacity : "+sb2.capacity());
        StringBuilder sb3 = new StringBuilder(18);
        System.out.println("User given Capacity : "+sb3.capacity());
        sb2.append("OOPS");
        System.out.println("Append : "+sb2);
        sb2.insert(2,'a');
        System.out.println("Insert : "+sb2);
        System.out.println("Length : "+sb2.length());
        System.out.println("Delete Char At : "+sb1.deleteCharAt(3));
        System.out.println("Delete : "+sb1.delete(1,3));
        System.out.println("Reverse : "+sb2.reverse());

        //String Buffer
        System.out.println("String Buffer Class");
        StringBuffer sbu1 = new StringBuffer("originally Java is coffee name");
        StringBuffer sbu2 = new StringBuffer();
        StringBuffer sbu3 = new StringBuffer(20);
        System.out.println(sbu1.toString());
        System.out.println("Default Capacity : "+sbu2.capacity());
        System.out.println("User given Capacity : "+sbu3.capacity());
        sbu1.append("OOPS");
        System.out.println("Append : "+sbu1);
        sbu2.append("jaajava");
        sbu2.insert(2,'v');
        System.out.println("Insert : "+sbu2);
        System.out.println("CharAt : "+sbu1.charAt(14) );
        sbu1.setCharAt(20,'a');
        System.out.println("setCharAt : "+sbu1);

    }
}