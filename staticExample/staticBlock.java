package com.Manvendra.staticExample;

//this is a demo to show initialization of static variables
public class staticBlock {
    static int a =10;
    static int b;

//will only run once, when the first obj is create i.e when the class is loaded for the first time.
    static{
        System.out.println("I am a static Block.");
        b = a * 5;
    }


    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " +staticBlock.b);

        staticBlock.b +=3;

        System.out.println(staticBlock.a + " " +staticBlock.b);


        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
    }


}
