public class OOPs
{
    public static void main(String[] args) {
        // Creating a Pen object
        Pen myPen = new Pen();
        myPen.setColor("Blue");
        myPen.setTip(5);
        
        // Creating a Student object
        Student student1 = new Student();
        student1.setName("Alice");
        student1.setAge(20);
        student1.setPercentage(85, 90, 80);
        
        // Printing student details
        student1.printDetails();
        
        // Printing pen details
        System.out.println("Pen Color: " + myPen.color);
        System.out.println("Pen Tip: " + myPen.tip);
    }
}
class Pen
{
    String color;
    int tip;
    void setColor(String newColor)
    {
        color = newColor;
    }
    void setTip(int newTip)
    {
        tip = newTip;
    }
}
class Student
{
    String name;
    int age;
    float percentage;
    void setName(String newName)
    {
        name = newName;
    }
    void setAge(int newAge)
    {
        age = newAge;
    }
    void setPercentage(int p, int c, int m)
    {
        percentage = ((float)(p + c + m) / 3)*100;
    }
    void printDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
    }
}