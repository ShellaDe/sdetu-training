/*

Create a Student Database with the following attributes:
 New Student constructor that takes name and SSN in the arguments
 Automatically create an email ID based on the name
 Set a private static ID
 Generate a user ID that is combination of Static ID, random 4-digit number between 1000
and 9000, and last 4 of SSN
 Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
 Use encapsulation to set variables (phone, city, state)
 */
package Assignments;

/**
 *
 * @author shell
 */
public class StudentDatabase {
    public static void main(String[] args) {
      //Create a student
      Student stu1 = new Student("Bruno", "12082012");
      Student stu2 = new Student("Katsu", "12082013");
      Student stu3 = new Student("Ekho","12082014");
      
      stu1.enroll("Math 151");
      stu1.enroll("English205");
      stu1.enroll("History211");
      
      //stu1.showCourse();
      //stu1.checkbalance();
      stu1.pay(600);
      //stu1.checkbalance();
        System.out.println(stu1.toString());
        
        } 
    }
class Student{
    //properties
    private static int iD = 0;
    private String userId;
    private String name;
    private String ssn;
    private String email;
    private String course = "";
    private final int costOfCourse = 800;
    private int balance=0;
    
    
    //constructor
    public Student(String name, String ssn){
        iD++;
        this.name = name;
        this.ssn = ssn;
        setUserId();
        setEmail();
        
    }
    
    private void setEmail() {
        email = name.toLowerCase() + "." + iD + "@udemyuniversity.com";
        System.out.println("your email: " + email);
    }
    private void setUserId(){
        int max = 90;
        int min = 10;
        int randNum = (int)(Math.random()  * (max -min));
        randNum = randNum + min;
        userId = iD + ""+ randNum + ssn.substring(5);
        System.out.println("Your user ID: " + userId);
    }
    //METHODS
    public void enroll(String course) {
        this.course = this.course + "\n" + course;
        balance = balance + costOfCourse;
    }
    public void pay(int amount){
        System.out.println("Payment: $"+ amount);
        balance = balance - amount;
        
        
    }
    public void checkbalance(){
        System.out.println("Balance: $" + balance);
        
    }
    public void showCourse(){
        System.out.println("Courses: "+ course);
        
    }
    public String toShow(){
        return "[NAME: "+ name + "]\n[Courses: " + course + "]\nBALANCE:" + balance + "]";
        
    }
}

