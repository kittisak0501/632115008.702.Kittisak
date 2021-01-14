//Kittisak Kaewbunmuang 632115008

public class Teacher extends Person {
    String subject;
    public Teacher(String name, int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void teach(){
        System.out.println(name+" is teaching "+subject+".");
    }
}

