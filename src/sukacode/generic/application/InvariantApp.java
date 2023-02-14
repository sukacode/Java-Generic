package sukacode.generic.application;

import sukacode.generic.Mydata;

public class InvariantApp {
    public static void main(String[] args) {
        Mydata<String> stringMyData = new Mydata<>("alf");

        Mydata<Object> objectMydata = new Mydata<>(1000);
        Mydata<Integer> integerMydata = new Mydata<>(10);
    }

    public static void doIt(String[] args) {
    // do nothing
    }
}
