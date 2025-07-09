package org.example;


import java.util.Objects;

class laptop {

    String model;
//    int price;


    //    public String toString(){
//        return model + ":" + price;
//    }
}


public class Main {
    public Main() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        laptop obj = new laptop();
        obj.model = "Lenovo";
//        obj.price = 1000;

        laptop obj1 = new laptop();
        obj1.model = "Lenovo";
//        obj1.price = 1000;

//        String obj = "vighnesh";
//        String obj1 = "vighnesh";
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());


//        boolean result = obj.model.equals(obj1.model);
        boolean result1 = obj.equals(obj1);
        boolean result2 = obj == obj1;

//        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);



    }
}