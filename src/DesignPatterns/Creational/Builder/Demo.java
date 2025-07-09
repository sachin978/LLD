package DesignPatterns.Creational.Builder;

public class Demo {
    public static void main(String[] args) {
//        UrlBuilder.Builder builder = new UrlBuilder.Builder();
//        builder.protocol("https").hostname("sachin.com").port("8080");
        UrlBuilder urlBuilder = new UrlBuilder.Builder()
                                .protocol("https")
                                .hostname("sachin.com")
                                .port("8080")
                                .build();
        System.out.println(urlBuilder.hostname);
    }

}
