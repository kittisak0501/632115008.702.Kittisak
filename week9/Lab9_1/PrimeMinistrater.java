package week9.Lab9_1;
//Kittisak Kaewbunmuang 632115008
public class PrimeMinistrater extends Person{
    String workState;

    public PrimeMinistrater(String name, int bornYear, String workState){
        super(name,bornYear);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a primeMinistrater and work in "+workState+".");
    }
}
