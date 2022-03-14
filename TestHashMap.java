package com.company;
import java.util.HashMap;
public class TestHashMap {
    public static void main(String[] args) {
        HashMap <String,Integer> products = new HashMap<String,Integer>();
        products.put("oil",2);
        products.put("green chili",1);
        products.put("potato", 3);
        products.put("oil",5);

        for(String i : products.keySet()){
            System.out.println("key " + i + " value of key  " + products.get(i));
        }
    }

}
