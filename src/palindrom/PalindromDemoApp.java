package palindrom;

import java.util.ArrayList;

import static palindrom.PalindromChecker.checkPalindrom;

public class PalindromDemoApp {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> a4 = new ArrayList<>();
        a1.add(1);
        System.out.println(checkPalindrom(a1));
        a2.add(1);
        a2.add(2);
        a2.add(1);
        System.out.println(checkPalindrom(a2));
        a3.add(1);
        a3.add(2);
        a3.add(3);
        a3.add(3);
        a3.add(2);
        a3.add(1);
        System.out.println(checkPalindrom(a3));
        a4.add(1);
        a4.add(2);
        a4.add(3);
        System.out.println(checkPalindrom(a4));
    }
}
