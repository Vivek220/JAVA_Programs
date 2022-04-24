class Student{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class oopspoly1 {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="aman";
        s1.age=21;

        s1.printinfo(s1.name,s1.age);

    }
    
}
