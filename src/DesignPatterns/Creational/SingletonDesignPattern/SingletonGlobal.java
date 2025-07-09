package DesignPatterns.Creational.SingletonDesignPattern;
/* Global variable nahi use kar sakte because vo multiple time edit ho sakta hai this is one time write and
multi time read allow karta hai.
*/
public class SingletonGlobal {
    public static volatile SingletonGlobal instance = null; // volatile:  while threading to prevent from race condition false reading
    private SingletonGlobal(){
       if( instance != null ){   //reflection kuch to hai jisse yeh access kar paega so to avoid it we check first
           throw new RuntimeException("Don't be oversmart!");
       }
    }
    public static SingletonGlobal getInstance(){  //static hona zaroori hai otherwise directly aese call nahi ho sakta SingletonGlobal obj = SingletonGlobal.getInstance(); we have to first initialise it SingletonGlobal sg = new SingletonGlobal(); // ❌ not allowed
        if(instance == null){
            synchronized (SingletonGlobal.class){  // threads me first it will sync then check koi pehle se to initialise nahi kia
                if(instance == null){
                    instance = new SingletonGlobal();
                }
            }
        }
        return instance;
    }
}
