//Kittisak Kaewbunmuang 632115008

public class NerfGun{
    public int bullet;
    private static int gunID = 0;

    NerfGun(){
        bullet = 0;
        gunID++;
    }
    NerfGun(int newBullet){
        bullet = newBullet;
        gunID++;
    }

    public void fire(){
        if(bullet>0){
            bullet--;
            System.out.println("BANG!!!");
        }else{
            System.out.println("There is no ammuition");
        }
    }
    public void reload(int addBullet){
        if(bullet+addBullet<=15)
            bullet += addBullet;
        else
            System.out.println("Error!! the ammunition is overload");
    }
    public void displayNumOfAmmunition(){
        System.out.println(bullet+" bullet left");
    }
    public void displayGunID(){
        System.out.println("The ID of this gun is "+gunID);
    }

}