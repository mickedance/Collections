package org.example;
/*
*

2. Create a new hashMap of types <String,String> and populate it with elements containing an
email (String) and a name (String). Next, create a new Set and populate it with the keys from
the hashMap you created.

3. Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and
setters. Have the class implement the Comparable interface. Implement the override method
and have it compare the AGE of the superhero. Next, create a new arrayList of type
SuperHero. Sort the list by age and print out each element.

4. Create an array of type int with numbers: {1,4,4,2,6,7}. Next, create an appropriate Collection
and populate it with the content of the int array. Lastly, print out each element in the
Collection without duplicates.*/


import java.util.HashSet;
import java.util.Set;

public class Challenge {

    public static void main(String[] args) {
        ch1();
    }
    /*1. Create an empty set and populate it with the all the days of the week. Next create a second
set and populate it with ONLY the weekend days (SATURDAY and SUNDAY). Lastly, compare
the two sets and retain in the first set only those days that are the same in both sets.*/
    public static void ch1(){
        System.out.println("Challange 1 ###############");
        Set<String> weekdays = new HashSet<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        Set<String> weekendDays = new HashSet<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");
    }
}

