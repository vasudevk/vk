package io.vk.core;

import io.vk.objects.Clubs;

public class StaticDemo implements StaticInterface {

    int faWinners = 19;

    public static void main(String[] args) {

        Clubs arsenal = new Clubs();
        arsenal.captain = "Auba";
        arsenal.city = "London";
        arsenal.name = "Arsenal";

        Clubs manUtd = new Clubs();
        manUtd.captain = "Rashford";
        manUtd.name = "Manchester United";
        manUtd.city = " Manchester";

        Clubs.fans = 73000;
        // arsenal.name = slogans();
        // Clubs.fans = faWinners;
        /* Since faWinners & slogans are non-static members, they cannot be referenced from main() which is a static method */

        // Non-static variables/methods can only be can be accessed through an instance.
        arsenal.name = arsenal.slogans();
        arsenal.display();
        manUtd.display();

        StaticDemo staticDemo = new StaticDemo();
        staticDemo.slogans();

        if (StaticInterface.overrideStaticMethodFromInterface()) {
            System.out.println("Calling static method of an interface using Class name");
        }
    }

    private String slogans() {
        System.out.println("Accessed static field from a non-static context. But not vice-versa. This method is accessed " +
                "through the instance of this class");
        return "Arsenal Forever!";
    }

    @Override
    public void regularMethod() {
        System.out.println("Overriding non-static method");
    }
}