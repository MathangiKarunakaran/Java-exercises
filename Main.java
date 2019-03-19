package com.pluralsight.getorganized;

import javafx.beans.property.SimpleObjectProperty;

import javax.xml.soap.SOAPPart;

//Overloading main method
public class Main {
    public static void main(String[] args) {
        System.out.println("JVM's main method");

        String[] array = {"Foo","Boo","Baz"};
        Main obj1 = new Main();
        obj1.main(array, 10);
    }

    public static void main(String[] args,int x){
        System.out.println("Explicitly we need to call this main method.");
        System.out.println("Passed integer is " + x);

    }
}
