package Lab12;

public class Main {
    public static void main(String[] args){
        Shape cir = new Circle(1.2);
        Shape tri = new Triangle(2,3.5);
        Shape reg = new Regtangle(3,4);

        System.out.println("Area of 1st Shape(circle) "+cir.getArea());
        System.out.println("Area of 2nd Shape(triangle) "+tri.getArea());
        System.out.println("Area of 3rd Shape(regtangle) "+reg.getArea());
    }
}
