package week7.Lab8_2;
//Kittisak Kaewbunmuang 632115008
public class Dog extends Pet{
    public String size;
    public String hair;
    public Dog(String name,String species,String color,int age,String size,String hair){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.size = size;
        this.hair = hair;
    }
    public void Show(){
        System.out.println("My dog");
        this.ShowPetData();
    }
    public void Run(){
        System.out.println("My dog "+name+" is run to the jungle");
    }
    public void Bark(){
        System.out.println(size+" bark box box!!");
    }
    public void IsShortHair(){
        System.out.println("Short hair: "+hair.equals("short"));
    }
}
