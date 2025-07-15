package DesignPatterns.Structural.facade;

/*
Notice the use of static here other wise we cant use class under classes directly need to refer BootingClasses.PowerSupply
and after using static we can directly access PowerSupply.powerSupply
 */
public class BootingClasses {

    static class PowerSupply {
        void powerSupply() {
            System.out.println("Supplying power!");
        }
    }

    static class StartFans {
        void startFan() {
            System.out.println("Fan started!");
        }
    }

    static class CPU {
        void cpu() {
            System.out.println("Waking-up all processes!");
        }
    }

    static class Memory {
        void memory() {
            System.out.println("Memory activated!");
        }
    }
}
