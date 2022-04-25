package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Excercises {

    public static void main(String[] args) {
        ex12();
    }

    public static void ex1() {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println("EX1 #######################");

        System.out.println(weekdays);
    }

    public static void ex2() {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        Iterator itr = weekdays.iterator();
        System.out.println("EX2 #######################");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void ex3() {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println("EX3 #######################");

        weekdays.add(3, "Thursday");

        System.out.println(weekdays);
    }

    public static void ex4() {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        List<String> sublist = weekdays.subList(0, 3);
        System.out.println("EX4 #######################");
        System.out.println(sublist);
    }

    public static void ex5() {
        Set<String> weekdays = new HashSet<>();

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println("Ex5 #############");
        for (String day : weekdays) {
            System.out.println("day: " + day);
        }
    }

    public static void ex6() {
        Set<String> weekdays = new HashSet<>();

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println("Ex6 #############");
        List<String> array = new ArrayList<>();


        for (String day : weekdays) {
            array.add(day);
        }
        System.out.println("From arraylist:");
        for (String day : array)
            System.out.println(day);

    }

    public static void ex7() {
        System.out.println("EX7 ######################");

    }

    public static void ex8(){

    }

    public static void ex9(){
        System.out.println("EX9 ################");
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Volvo");
        cars.put(2, "Audi");
        cars.put(3, "VW");
        cars.put(4, "BMW");
        cars.put(5, "Opel");


        System.out.println(cars);
    }

    public static void ex10(){
        System.out.println("EX10 ############");

        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Volvo");
        cars.put(2, "Audi");
        cars.put(3, "VW");
        cars.put(4, "BMW");
        cars.put(5, "Opel");
        System.out.println(cars.keySet());
    }

    public static void ex11(){
        System.out.println("EX11 ############");

        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Volvo");
        cars.put(2, "Audi");
        cars.put(3, "VW");
        cars.put(4, "BMW");
        cars.put(5, "Opel");
        System.out.println(cars.values());
    }
    public static void ex12(){
        System.out.println("EX12 ############");
        Map<Integer, Car> cars = new HashMap<>();
        cars.put(1, new Car("Citroen", "c4"));
        cars.put(2, new Car("Citroen", "c5"));
        cars.put(30, new Car("Opel", "Astra"));
        cars.put(4, new Car("Renault", "Megane"));

        Object[] keys = cars.keySet().toArray();
        for(Object key: keys){
            Car c = cars.get(key);
            System.out.println(c.getBrand());
        }
    }
}


