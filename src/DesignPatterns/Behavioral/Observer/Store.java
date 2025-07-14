package DesignPatterns.Behavioral.Observer;

import DesignPatterns.Behavioral.Observer.Observable.*;
import DesignPatterns.Behavioral.Observer.Observer.*;

public class Store {
    public static void main(String[] args) {
        NotificationAlert observer1 = new EmailAlert("abc@gmail.com");
        NotificationAlert observer2 = new EmailAlert("dfg@gmail.com");
        NotificationAlert observer3 = new MobileAlert("UserId - 2");

        StockObservable iphoneObservable = new IphoneObservable();
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.stockAdded(10);
    }
}
