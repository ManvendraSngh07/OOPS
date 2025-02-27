package com.Manvendra.staticExample;

//What happens , when putting it outside the InnerClasses
//class Test {
//
//    static String name; //Here, I add a name

import java.util.Arrays;

//// i.e. of static type which means no object is needed. I can be accessed by class
//
//    //create a constructor that take a name.
//    public Test(String name) {
//        Test.name = name; //why I have used, test.name
//        //because static variable are not depended on object and this is referencing to object.
//    }
//
//}

    // why outside classes can't be static
    public class InnerClasses {

    //depend on outer class i.e InnerClasses
    //what happens when my class Test is inside InnerClasses
    //what does it mean by making my Class Test static?
    //now, it is not depended on the object of InnerClass
    //To run Test class no object of this class no needed to be created.
    //hence, I am able to use it directly
    static class Test {

        String name; //Here, I add a name


        //create a constructor that take a name.
        public Test(String name) {
            this.name = name;
        }


        //using toString() to get the ouptut of an object
        @Override
        public String toString() {
            return name;
        }

        public static void main(String[] args) {

            //here, I am creating the obj of test class
            Test a = new Test("Manvendra");//why error is showing:
            Test b = new Test("Rahul");//cannot be referenced from static context
            //solved by declaring it as static

           // Arrays.toString(new  int[]{3,4,5});

            System.out.println(a);//com.Manvendra.staticExample.InnerClasses$Test@7b23ec81


            System.out.println(a.name); //output:rahul
            System.out.println(b.name);//output:rahul
            //why? because in both the case the static variable i.e string name is used in both the case
            //therefore..rahul is the ultimate output...question and search for answer if, not understood.
        }
    }

}


//static class A{
//
//}