package week7.Lab8_2;
//Kittisak Kaewbunmuang 632115008
public class Bird extends Pet{
    public String country;
    public String fly;
    public Bird(String name,String species,String color,int age,String country,String fly){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.country = country;
        this.fly = fly;
    }
    public void show(){
        System.out.println("My bird");
        this.ShowPetData();
    }
    public void Speak(){
        System.out.println("My bird "+name+" is speaking "+country);
    }
    public void IsCanFly(){
        System.out.println("My bird "+name+" can fly: "+fly);
    }
}
