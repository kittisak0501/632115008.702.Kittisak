//Kittisak Kaewbunmuang 632115008

public class InheritanceExample {
    public static void main(String[] args){
        Artist art = new Artist("Ball", 20,"male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        Doctor doc = new Doctor("Som",22,"female");
        doc.type = "medical";
        doc.introduce();
        doc.call();

        Engineer engi = new Engineer("Pond", 20,"male");
        engi.type = "software";
        engi.introduce();
        engi.call();

        Model mod = new Model("Mod",23,"female");
        mod.type = "casual";
        mod.introduce();
        mod.call();

        Student stu = new Student("Aae",18,"male");
        stu.level = "high school";
        stu.introduce();
        stu.level();

        Teacher tea = new Teacher("Tae",28,"male");
        tea.subject = "Math";
        tea.introduce();
        tea.teach();
    }
}
