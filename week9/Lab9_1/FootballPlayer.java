package week9.Lab9_1;
//Kittisak Kaewbunmuang 632115008
public class FootballPlayer extends Person{
    String workFootballClib;

    public FootballPlayer(String name, int bornYear, String workFootballClib){
        super(name,bornYear);
        this.workFootballClib = workFootballClib;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a footballPlayer in "+workFootballClib+"football club.");
    }
}