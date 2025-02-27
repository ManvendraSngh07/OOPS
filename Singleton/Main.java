package com.Manvendra.Singleton;

public class Main {
    public static void main(String[] args) {



    Singleton obj1 = Singleton.getInstance();//give me the instance

    Singleton obj2 = Singleton.getInstance();//give me the instance

    Singleton obj3 = Singleton.getInstance();//give me the instance.

    //all 3 reference variables are pointing to just one object


}
}