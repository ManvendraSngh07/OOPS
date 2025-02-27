package com.Manvendra.Singleton;

public class Singleton {


    //private int num = 0;
    //private constructor basically, means it is valid only inside this class.
   private Singleton(){

    }


    //goal is to create only one instance.
    private static Singleton instance;


   public static Singleton getInstance(){
       //check whether 1 obj only is created or not
       if(instance == null){
           instance = new Singleton();
       }

       return instance;
   }
}
