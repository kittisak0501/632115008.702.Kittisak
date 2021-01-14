//Kittisak Kaewbunmuang 632115008

public class Student extends Person {
    String level;
    public Student(String name, int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void level(){
        System.out.println(name+" is an "+level+" student.");
    }
}

