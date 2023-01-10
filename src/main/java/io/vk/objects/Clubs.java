package io.vk.objects;

public class Clubs {

    // If a variable is marked static, it's value remains same for that class across any instance/object
    // Static members are always referenced using <ClassName>.<member> i.e.,
    public static int fans;
    public String city;
    public String name;
    public String captain;

    public void display() {
        System.out.println(name + " is the best supported EPL football club in" + city +
                " led by " + captain + " in front of " + fans);
    }

    public String slogans() {
        int fans = Clubs.fans;
        System.out.println("Accessed static field from a non-static context. But not vice-versa");
        return "Arsenal Forever!";
    }

    public static double staticMethod() {
        /* super & this cannot be used in a static context - uncomment below & check */
        // String city = this.city;
        // int hashCode = super.hashCode();

        /* non-static members cannot be reference from a static context */
        // String s = city;
        // slogans();

        /* In order to access non-static members instance is needed */
        String s = new Clubs().captain;

        return 10d;
    }
}