package KT;
public class KeThua {
    public static void main(String[] args) {
        Student s1 = new Student("Name",20,"QB",5.0);
        Student s2 = new Student("Name",22,"QB",10.0);
        Teacher t1 = new Teacher("Name",24,"QB",100);
        s1.display();
        s2.display();
        t1.display();
    }
}