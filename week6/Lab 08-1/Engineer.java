//Kittisak Kaewbunmuang 632115008

public class Engineer  extends Person {
    String type;
    public Engineer(String name, int age,String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void call(){
        System.out.println(name+" is a "+type+" engineer.");
    }
}