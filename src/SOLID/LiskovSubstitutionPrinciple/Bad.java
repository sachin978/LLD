package SOLID.LiskovSubstitutionPrinciple;

//interface me 3 functions and birds implementing it but penguins if extends bird class
// they dont need fly function so they have to write extra function to throw  exception which is a bad practice



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
