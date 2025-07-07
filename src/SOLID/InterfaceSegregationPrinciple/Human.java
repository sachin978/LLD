package SOLID.InterfaceSegregationPrinciple;

// One class can have only one public class

interface Work {
    void work();
}

interface Eat {
    void eat();
}

class Human implements Work, Eat {
    public void work() {
        System.out.println("I am working");
    }

    public void eat() {
        System.out.println("I am eating");
    }
}
class Robots implements Work{
    public void work(){
        System.out.println("I can work!");
    }
}

class Worker {
    public static void main(String[] args) {
        Work w = new Robots();
        Eat h = new Human();
        w.work();
        h.eat();
    }
}