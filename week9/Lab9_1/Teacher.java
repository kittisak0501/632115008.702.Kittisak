package week9.Lab9_1;
//Kittisak Kaewbunmuang 632115008
public class Teacher extends Person{
    String workSchool;

    public Teacher(String name, int bornYear, String workSchool){
        super(name,bornYear);
        this.workSchool = workSchool;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and teach the students in "+workSchool+".");
    }
}