package week7.Lab8_2;
//Kittisak Kaewbunmuang 632115008
public class Pet {
    public String name;
    public String species;
    public String color;
    public int age;
    public Pet(){

    }
    public Pet(String name,String species,String color,int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void ShowPetData(){
        System.out.println("Name: "+name+" Species: "+species+" Color: "+color+" Age: "+age);
    }
}
