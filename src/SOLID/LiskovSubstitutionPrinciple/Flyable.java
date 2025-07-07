package SOLID.LiskovSubstitutionPrinciple;

interface  Flyable {
    void fly();   //implicitly public and abstract
}

class bird {
    public void eat() {
        System.out.println("Bird is eating");
    }
}
class FlyingBird extends bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("Birds can fly!");
    }
}
class Penguins extends bird {
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
class zoo{
    public static void main(String[] args) {
    Penguins   p = new Penguins();
    FlyingBird f = new FlyingBird();
    p.eat();
    f.fly();
    }
}
