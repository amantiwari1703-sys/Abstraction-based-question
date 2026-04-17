public class Main {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.eat();
    }
}
abstract class Animal{
    abstract void eat();
}
class Cat extends Animal{
    void eat(){
        System.out.println("cat eats milk");
    }
}