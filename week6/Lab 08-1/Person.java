//Kittisak Kaewbunmuang 632115008

public class Person{
    String name;
    int age;
    String gender;
    public Person(){

    }
    public Person(String name, int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("My name is "+name+"\nI am "+age+" years old\nI am a "+gender);
    }
}