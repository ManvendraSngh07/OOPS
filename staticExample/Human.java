package com.Manvendra.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;   //to understand about static we are using it?
    //why using static before long


    public Human(int age, String name, boolean married, int salary) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.salary = salary;
        //this.population += 1;
        Human.population +=1;
    }
}
