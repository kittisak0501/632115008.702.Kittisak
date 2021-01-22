package week7.Lab8_3;

public class MainBike {
    public static void main(String[] args){
        Bike bic1 = new Bike(34);
        bic1.showSpeed();
        bic1.speedUp();
        bic1.showSpeed();
        bic1.breaks();
        bic1.showSpeed();

        Bike bic2 = new Bike(3);
        bic2.breaks();
        bic2.showSpeed();

        Bike bic3 = new Bike(98);
        bic3.speedUp();
        bic3.showSpeed();

        MountainBike bic4 = new MountainBike(50,3);
        bic4.speedUp();
        bic4.showSpeed();
        bic4.breaks();
        bic4.showSpeed();
    }
}
