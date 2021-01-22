package week7.Lab8_3;

public class MountainBike extends Bike{
    public int gear;

    public MountainBike(double speed,int gear){
        this.speed=speed;
        this.gear=gear;
    }

    public void speedUp(){
        if(speed+gear*5<=99)
            speed+=gear*5;
        else
            System.out.println("it is too fast");
    }
}
