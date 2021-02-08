package week9.Lab9_1;
//Kittisak Kaewbunmuang 632115008
public class TestOverride1{
    public static void main(String[] args){
        Person person1;
        person1 = new Person("Mark",2001);
        person1.introduce();

        Person person2;
        person2 = new Sheriff("Mateo",1988,"California");
        person2.introduce();

        Person person3;
        person3 = new Teacher("Ball",1977,"CMU");
        person3.introduce();

        Person person4;
        person4 = new PrimeMinistrater("Tu",1957,"Thailand");
        person4.introduce();

        Person person5;
        person5 = new FootballPlayer("Messi",1987,"Bacelona");
        person5.introduce();

        Person person6;
        person6 = new Streamer("Ggggspotted",1996,"Thailand");
        person6.introduce();
    }
}