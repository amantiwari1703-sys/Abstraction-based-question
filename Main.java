public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();



    }
}

abstract class Person{
    Person(){
        System.out.print("constructor of person");
    }
    abstract void display();

}
class Student extends Person{
    void display(){
        System.out.print("Student details");
    }
}


