package week9.Lab9_1;
//Kittisak Kaewbunmuang 632115008
public class Person{
    String name;
    int bornYear;

    public Person(String name, int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }
    public void introduce(){
        System.out.print("My name is "+name+",");
        System.out.println("I was born in "+bornYear+".");
    }
    
}