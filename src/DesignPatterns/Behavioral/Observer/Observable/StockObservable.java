package DesignPatterns.Behavioral.Observer.Observable;

import DesignPatterns.Behavioral.Observer.Observer.NotificationAlert;

public interface StockObservable {
    void add(NotificationAlert notificationAlert);
    void remove(NotificationAlert oldSubscriber);
    void sendNotification();
    void stockAdded(int count);
}
