package btkethua;

public class ketqua {
    public static void main(String[] args) {
        Student a1 = new Student("dung",111,"phong nha",3.0);
        Student a2 = new Student("tai",21,"QB",10.0);
        Teacher t1 = new Teacher("Tuan",25,"QB",100);
        a1.display();
        a2.display();
        t1.display();
    }
}