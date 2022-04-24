class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student() {//non-parameterized constructor
        System.out.println("constructor called");
    }    
}
public class oops1 {
    public static void main(String args[]){
        Student s1=new Student(); //student() is constructor
        s1.name="vivek";
        s1.age=21;
        
        s1.printinfo();

    }
    
}
