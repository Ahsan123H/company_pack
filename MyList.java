package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {

        DLL<Integer> listOfInteger = new DLL<>();
        DLL<String> listOfString = new DLL<>();


        listOfInteger.add(123);
        listOfInteger.add(321);
        listOfInteger.add(555);
        listOfInteger.add(222);
        listOfInteger.add(567);

        listOfString.add("Mirpur");
        listOfString.add("Mirpur1");
        listOfString.add("Technical point ");
        listOfString.add("Shamoly");




      listOfInteger.removeFirstOccurrence(321);


        listOfString.print();
        listOfInteger.print();


    }
}
