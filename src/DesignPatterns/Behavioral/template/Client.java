package DesignPatterns.Behavioral.template;
/*
Abstract ka object nahi bna sakte because of abstract functions which is not been implemented
*/
public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.hierarchy();
    }
}
