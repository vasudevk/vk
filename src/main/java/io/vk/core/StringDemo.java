package io.vk.core;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2.intern());

        String s3 = "abc";
        StringBuffer s4 = new StringBuffer(s3);
        System.out.println(s3.equals(s4));

        String str = new String("abc");
        char[] a = {'a', 'b', 'c'};
        String str2 = new String(a);

        System.out.println(str2);
        System.out.println(str == str2);

        String dog = "The quick brown fox jumps over the lazy dog.";
        String ivory = "We promptly judged antique ivory buckles for the next prize";

        char[] chars = ivory.replaceAll(" ", "").toLowerCase().toCharArray();
        Set<Character> charSet = new HashSet<>();
        for (char ch : chars) {
            charSet.add(ch);
        }
        System.out.println(charSet);

        if (charSet.size() == 26) {
            System.out.println(ivory + "  is a pangram!");
        }

        boolean allLetters = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!dog.toLowerCase().contains(String.valueOf(ch))) {
                allLetters = false;
                break;
            }
        }
        System.out.println("Is the given string a pangram :: " + allLetters);


        System.out.println("Is the given string a pangram :: " + isPangramString(dog));
        System.out.println("Is the given string a pangram :: " + isPangramString(ivory.toLowerCase()));


        var textToFormat = "{0} Account Verification Passed with the following information:" +
                "Dealer code is:  {1}, Store ID is: {2},Caller name is: {3}. - Memo Created By: {4} - updated by {5}";

        format.accept(textToFormat);
    }


    private static boolean isPangramString(String s) {
        if (s.length() < 26)
            return false;
        else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static Consumer<String> format = f -> {
        f = MessageFormat.format(f, (Object[]) new String[]{"MANUAL", "rslDealerID", "rslStoreId", "rslDealerName",
                "applicationUserId", "applicationUserId"});
        System.out.println(f);
    };
}