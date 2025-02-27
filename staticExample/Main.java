package com.Manvendra.staticExample;


//Here, we are not using import because they belong to same folder.
//where in case of greeting they were from different folder.So, we used
//import static path.Message.message;



public class Main {

    public static void main(String[] args) {

//
//        //creating object manvendra using the properties of the Humanclass
//
//        Human Manvendra = new Human(22, "Manvendra Singh", false, 10000);
//        Human Rahul = new Human(24, "Rahul yadav", true, 1000);
//
//
//        System.out.println(Manvendra.population); //output:1
//        System.out.println((Rahul.population)); //output : 1
//        //here, we have 2 human but the output is 1 . So, it is false

       Main funn = new Main();//creating a object funn and calling the fun2
       funn.fun2();


    }

    //this is not dependent on objects
    //It is static
    //this does not belong to any instance(object)
    static void func(){
      //  greeting(); //you cant use it because it requires an instance
        //but the function you are using it in does not depend on instances.


        //you cannot access non-static stuff without referencing their instances in
        // a static context

        //hence, here I am referencing it.
        Main obj = new Main();
        obj.greeting();
    }


    //take another example
    //we know that object for fun2 will be created
    //it will be created, when you call fun2 in main()
    void fun2(){
        greeting();
    }



    //we know that something which is not static, belongs to an object
    //this belong to some instance(object)
    void greeting(){
      //  func(); here, you can access static function from a non-static one
        System.out.println("Hello World.");
    }
}
