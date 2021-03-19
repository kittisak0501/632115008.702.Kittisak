package Lab12;

public class Regtangle extends Shape {
    private double width;
    private double length;
    public Regtangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
}
