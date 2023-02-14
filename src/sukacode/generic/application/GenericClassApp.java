package sukacode.generic.application;

import sukacode.generic.Mydata;

public class GenericClassApp {
    public static void main(String[] args) {
        Mydata<String> stringMydata = new Mydata<String>("data");
        Mydata<Integer> integerMydata = new Mydata<Integer>(50);

        String stringValue = stringMydata.getData();
        Integer integerValue = integerMydata.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
