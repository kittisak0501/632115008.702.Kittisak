public class Intersec{
    public static void main(String[] args){
        Circle cir1 = new Circle(0,0,2);
        Circle cir2 = new Circle(1,2,3);
        Circle cir3 = new Circle(3,5);
        Circle cir4 = new Circle(-1,-10,-1);

        System.out.println("Area of cir1 = "+cir1.area);
        System.out.println("Circumferrence of cir1 = "+cir1.circumference);
        System.out.println("Area of cir2 = "+cir2.area);
        System.out.println("Circumferrence of cir2 = "+cir2.circumference);
        System.out.println("Area of cir3 = "+cir3.area);
        System.out.println("Circumferrence of cir3 = "+cir3.circumference);
        System.out.println("Area of cir4 = "+cir4.area);
        System.out.println("Circumferrence of cir4 = "+cir4.circumference);
        
        System.out.println("Is circle 1 intersec circle 2: "+cir1.intersec(cir2));
        System.out.println("Is circle 1 intersec circle 3: "+cir1.intersec(cir3));
        
    }
}
