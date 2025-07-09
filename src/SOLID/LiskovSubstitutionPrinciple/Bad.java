package SOLID.LiskovSubstitutionPrinciple;

/*
Interface me 3 functions and birds implementing it but penguins if extends bird class
 they dont need fly function so they have to write extra function to throw  exception which is a bad practice

If a class S extends or implements class T,
then you should be able to use S anywhere T is expected—without breaking the program’s behavior or logic.
ex: Queue<Integer> q = new LinkedList<>() here q ( LinkedList Class )
    should able to perform all operation which is there in Queue interface.

ISP: Don’t force me to implement what I don’t need.
LSP: Don’t change the behavior if you extend/override.
*/


interface Bad {
    void fly();
    void eat();
    void reproduce();
}

class birds implements Bad{

    @Override
    public void fly(){
        System.out.println("birds are flying ");
    }
    @Override
    public void eat(){
        System.out.println("Birds eats");
    }
    @Override
    public void reproduce(){
        System.out.println("obviously! :)");
    }
}
class Penguines extends birds {
    @Override
    public void fly(){    // This extra function is extra we need to remove such functions
        throw new UnsupportedOperationException("Penguins can't fly ");
    }
}
class zooo{
    public static void main(String[] args) {
        Penguines p = new Penguines();
        p.fly();
    }
}
