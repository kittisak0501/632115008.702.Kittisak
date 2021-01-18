package week7.Lab8_2;
//Kittisak Kaewbunmuang 632115008
public class Fish extends Pet{
    public String size;
    public String water;
    public int swimSpeed;
    public Fish(String name,String species,String color,int age,String size,String water,int speed){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.size = size;
        this.water = water;
        swimSpeed = speed;
    }
    public void show(){
        System.out.println("My fish");
        this.ShowPetData();
    }
    public void IsSwimToTheSea(){
        System.out.println("My fish "+name+" can swim in the sea: "+water.equals("salt"));
    }
    public void SwimFast(){
        System.out.println(size+" is swiming "+swimSpeed+" m/s");
    }
}

