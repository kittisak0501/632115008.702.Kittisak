package Lab11_2;
//Kittisak Kaewbunmuang 632115008
public class Student{
    public String name;
    public int age;
    public double gpa;
    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    //I try to override the methods but it cannot work
    public boolean equals(int age){
        return this.age==age;
    }
    public boolean equals(double gpa){
        return this.gpa==gpa;
    }
}