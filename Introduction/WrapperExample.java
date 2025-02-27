package com.Manvendra.Introduction;

public class WrapperExample {
        public static void main(String[] args) {
            // int a =10;
            // int b =20;

            //what is Integer class
            //why are we using it?
            // Integer num =45;

            Integer a =10;
            Integer b =20;

            swap(a,b);

            //its will not swap it.
            //why they are primitives -> primitives are passed by value i.e value is passed
            System.out.println(a + "  " + b);

            // final int bonus =2;
            // bonus =3;


            //creating object of the A data type
            final A manvendra = new A("Manvendra Singh");
            manvendra.name = "other name";


            // //when a non primitive is finalm you cannot reassign it.
            // manvendra = new A("new object");

            //how to see , when you object is being destroyed from memory?
            A obj;

            for(int i=0; i<1000000000; i++){
                obj = new A("Random name");
            }
        }

//why it needs to be static

        static void swap(Integer a, Integer b){
            Integer temp = a;
            a = b;
            b = temp;
        }




    }


    class A{
        final int num = 10;
        String name;

        //constructor
        public A(String name) {
            this.name = name;
        }



        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }


