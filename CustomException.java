import java.util.Scanner;
import java.lang.Exception;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String ErrorMessage){
        super(ErrorMessage);
    }
}
class Person extends RegisterVoter {
    private String Name;
    private String Gender;
    public Person(String Name,String Gender){
        this.Name = Name;
        this.Gender = Gender;
    }
}
class RegisterVoter{
    private int age;
    public void setAge(int Age){
        this.age = Age;
    }
    public void Register() throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age is less than 18");
        }
        else{
            System.out.println("Age = "+ age);
        }
    }
}
class CustomException{
    public static void main(String [] args){
        String name,gender;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name , Age ,Gender : ");
        name = sc.nextLine();
        age = sc.nextInt();
        gender = sc.next();
        RegisterVoter p = new Person(name,gender);
        p.setAge(age);
        try{
            p.Register();
        }
        catch(InvalidAgeException ia){
            System.out.println("Exception : "+ia);
        }
    }
}