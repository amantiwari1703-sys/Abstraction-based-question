public class Main {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.run();
    }
}

abstract class vehicle{
    void start(){
        System.out.println("vehicle starts");
    }
    abstract void run();


    }

class car extends vehicle{
    void run(){
        System.out.println("car runs");

    }

}



