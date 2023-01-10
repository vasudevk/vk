package io.vk.core;

/**
 * https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/
 * https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/
 */
public class SingletonDemo {

    private String movie;
    private int rating;

    static SingletonDemo singletonInstance;

    // private constructor to prevent outside access
    private SingletonDemo() {
    }

    // public static method to get the instance - NOT THREAD SAFE
    public static SingletonDemo getInstance() {
        if (null == singletonInstance)
            singletonInstance = new SingletonDemo();
        return singletonInstance;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo.getInstance());

        SingletonDemo demo1 = SingletonDemo.getInstance();
        demo1.setMovie("Avatar");
        demo1.setRating(9);

        SingletonDemo demo2 = SingletonDemo.getInstance();
        demo2.setMovie("Dunkirk");
        demo2.setRating(10);

        System.out.println(demo1);
        System.out.println(demo1.getMovie() + " - " + demo1.getRating());
        System.out.println(demo2);
        System.out.println(demo2.getMovie() + " - " + demo2.getRating());

    }
}