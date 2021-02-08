package week9.Lab9_1;

public class Student {
    private String firstName="Hello";
    private String lastName="World";

    public String toString(){
        return "My first name "+firstName+" last name "+lastName;
    }
    public static void main(String[] args){
        Student p =new Student();
        System.out.println(p.toString());
    }
}
