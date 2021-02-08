package week9.Lab9_1;
//Kittisak Kaewbunmuang 632115008
public class Sheriff extends Person{
    String workState;

    public Sheriff(String name, int bornYear, String workState){
        super(name,bornYear);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a sheriff in "+workState+".");
    }
}
