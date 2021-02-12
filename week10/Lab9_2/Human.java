package week10.Lab9_2;
//Kittisak Kaewbunmuang 632115008
public class Human{
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }
    public static voidmain(String[] args){
        Animal dog = new Dog();
        Human human = new Human();
        System.out.println("The first calling hit(Animal)");
        human.hit(dog);

        dog = new cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog);
    }
}