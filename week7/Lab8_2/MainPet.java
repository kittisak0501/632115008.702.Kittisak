package week7.Lab8_2;
//Kittisak Kaewbunmuang 632115008
public class MainPet {
    public static void main(String[] args){
        Dog dog = new Dog("Dum","Bang Kaew","black",5,"big","short");
        dog.Show();
        dog.Run();;
        dog.Bark();
        dog.IsShortHair();

        Fish fish = new Fish("Hoy","Salmon","black",4,"small","salt",2);
        fish.show();
        fish.IsSwimToTheSea();
        fish.SwimFast();

        Bird bird = new Bird("Kaew","Flaminggo","green",3,"small","No");
        bird.show();;
        bird.Speak();
        bird.IsCanFly();
    }
}
