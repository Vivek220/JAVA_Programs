public class multipleinheritance {
    public static void main(String args[]) {
        result aa=new result();
        aa.getroll(102);
        aa.getmarks(30.5F,35.9F);
        aa.display();
    }
    
}
class student
{
    int roll;
    void getroll(int n)
    {
      roll=n;
    }
    void putroll()
    {
        System.out.println("Roll="+roll);
    }
}
class test extends student
{
    float marks1,marks2;
    void getmarks(float m1,float m2)
    {
        marks1=m1;
        marks2=m2;
    }
    void putmarks()
    {
        System.out.println("marks="+marks1+"\nmarks="+marks2);
    }
}
interface sport
{
    float sportsmarks=6.0F;
    public void putsport();
}
class result extends test implements sport
{
    float total;
    public void putsport()
    {
        System.out.println("sports marks="+sportsmarks);
    }
    void display()
    {
        total=marks1+marks2+sportsmarks;
        putroll();
        putmarks();
        putsport();
        System.out.println("total marks="+total);
    }
}
