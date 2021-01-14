//Kittisak Kaewbunmuang 632115008

public class Circle{
    public double x=0;
    public double y=0;
    public double radius=0;
    public double area=0;
    public double circumference=0;

    Circle (double newX,double newY,double newRadius){
        if(newRadius>0){
            x = newX;
            y = newY;
            radius = newRadius;
            area = Math.PI * radius * radius;
            circumference = Math.PI *radius * 2;
        }
    }
    Circle (double newX,double newY){
            x = newX;
            y = newY;
            radius = 1;
            area = Math.PI * radius * radius;
            circumference = Math.PI *radius * 2;
    }

    public boolean intersec(Circle cir){
        double d = Math.sqrt(Math.pow(this.x-cir.x,2)+Math.pow(this.y-cir.y,2));
        return this.radius-cir.radius<d&&d< this.radius+cir.radius;
    }
}