package DesignPatterns.Behavioral.Observer.Observable;

import DesignPatterns.Behavioral.Observer.Observer.NotificationAlert;

import java.util.*;

public class IphoneObservable implements StockObservable{

    List<NotificationAlert> subscribers = new ArrayList<>();
    private int stockCount = 0;
    @Override
    public void add(NotificationAlert newSubscriber) {
          subscribers.add(newSubscriber);
    }

    @Override
    public void remove(NotificationAlert oldSubscriber) {
      subscribers.remove(oldSubscriber);
    }

    @Override
    public void sendNotification() {
        for( NotificationAlert subscriber : subscribers ){
            subscriber.update();
        }
    }

    @Override
    public void stockAdded(int count) {
        if( stockCount == 0){
            sendNotification();
        }
        stockCount += count;
    }
}
