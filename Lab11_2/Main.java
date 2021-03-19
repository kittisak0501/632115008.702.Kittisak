package Lab11_2;
//Kittisak Kaewbunmuang 632115008
public class Main {
    public static void main(String[] args){
        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.20);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);

        System.out.println("Name");
        System.out.println(std01.name.equals(std02.name));
        System.out.println(std01.name.equals(std03.name));
        System.out.println(std02.name.equals(std04.name));
        System.out.println(std01.name.equals(std04.name));

        //age(int) cannot use .equals so I will use == instead
        System.out.println("age");
        System.out.println(std01.age==std02.age);
        System.out.println(std03.age==std04.age);
        System.out.println(std01.age==std03.age);

        //gpa(double) cannot use .equals so I will use == instead
        System.out.println("gpa");
        System.out.println(std01.gpa==std03.gpa);
        System.out.println(std02.gpa==std04.gpa);
        System.out.println(std02.gpa==std03.gpa);
    }
}
