package week7.Lab8_3;

public class Bike {
    public double speed=0;
    public static int numOfBike=0;
    public Bike(){

    }
    public Bike(double speed){
        this.speed = speed;
        numOfBike++;
    }

    public void speedUp(){
        if(speed+5<=99)
            speed+=5;
        else
            System.out.println("it is too fast");
    }
    public void breaks(){
        if(speed-5>0)
            speed-=5;
        else
            System.out.println("the bike is not moving");
    }
    public void showSpeed(){
        System.out.println("the speed of bike "+numOfBike+" = "+speed);
    }
}
