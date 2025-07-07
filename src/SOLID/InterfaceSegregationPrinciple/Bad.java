package SOLID.InterfaceSegregationPrinciple;


/*
interface me extra function may be not required as robot not required eat but work does
this on long scope if 20 functions are there and we dont want all of them, only few of them rest we need so will
implement that and declare unnecessary  function as well so need to segregate interface
 */
interface Bad{
    void work();
    void eat();
}
class Humans implements Bad{
    @Override
    public void work(){
        System.out.println("I can work");
    }
    @Override
    public void eat(){
        System.out.println("I can eat");
    }
}
class Robot implements Bad{
    @Override
    public void work(){
        System.out.println("I can Work!");
    }
    @Override
    public void eat(){
        throw new UnsupportedOperationException("This is useless for a Robot as I can't eat");
    }
}

class Workers{
    public static void main(String[] args) {
        Bad h = new Humans();
        Bad r = new Robot();
        h.eat();
        r.eat();
    }

}
