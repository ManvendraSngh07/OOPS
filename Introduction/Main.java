package com.Manvendra.Introduction;



public class Main {


    public static void main(String[] args) {


        // creating your own data types & store data of 5 Students
        Student[] students = new Student[5];

        Student Manvendra = new Student(14, "Manvendra Singh", 89.7);

        Student rahul = new Student(15, "Rahul Sharma", 56);

        System.out.println(rahul.roll_no);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        // Manvendra.changeName("Shoe lover");
        // Manvendra.greeting();


        Student random = new Student(Manvendra);


        System.out.println(random.name);
        System.out.println(random.marks);
        System.out.println(random.roll_no);


        Student random2 = new Student();//creating a new object
        System.out.println(random2.name);

        //two reference variable pointing to same objects
        Student one = new Student();
        Student two = one;

        one.name = "something something";

        System.out.println(two.name);
    }
}




    // create a class
// for every single student
    class Student {
        int roll_no;
        String name;
        double marks = 90;

        // creating random function
        void greeting() {
            System.out.println("Hello! my name is : " + name);
        }

        void changeName(String newName) {
            this.name = newName;
        }


        Student(Student other) {
            this.roll_no = other.roll_no;
            this.name = other.name;
            this.marks = other.marks;
        }

        // we need a way to add the values of the above
        // properties object by object

        // we need one word to access every object ->i.e.this keyword

        Student() {
            // this is how you call constructor from another constructor
            // internally : new Student (13, "default person", 100);
            this(13, "default person", 99);
        }


        //correct way of creating any object//
        //student arpit = new Student(17, "Arpit", 89.8);
        //here, this will be replaced by arpit
        //arpit.roll_no = roll_no that you are passing as a argument
        //arpit.name = name that you are passing as a argument
        //arpit.marks = marks that you are passing as a argumnet constructor function
        Student(int roll_no, String name, double marks) {
            this.roll_no = roll_no;
            this.name = name;
            this.marks = marks;
        }
    }
