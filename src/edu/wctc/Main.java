package edu.wctc;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Main {

    public static void main(String[] args) {
        Animals genericAnimal = new Animals();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        //create a new Cats object with the name of Morris
        //setting up a new object is same structure as setting up new array!!!
        Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");

        //print out some information about Morris
        System.out.println();
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);

        //Now we're gonna be crazy and create an animal object named Tabby
        //not all animals are cats, but all cats are animals... so this works!
        Animals tabby = new Cats("Tabby", "Salmon", "Ball");

        //how to pass an object inside of java.  ---  I DON'T UNDERSTAND THIS!!!
        acceptAnimal(tabby);
    }

    //have to call it animal object because that is what it is
    public static void acceptAnimal(Animals randAnimal) {
        //Can get the methods from Animals when I put in randAnimal.
        System.out.println();
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);

        //Java knows this is an animal and when a method is called
        //polymorphism --  when ever an object is passed or a method is called for
        //a specific object, java's interpreter is smart enough to say, "okay, is this really an animal?
        //Yes it is!, However, "Is it also a subclass of the Animals?" Yes it is!!!  It is a Cats.
        randAnimal.walkAround();

        //However, the interpreter is not smart enough to locate a method or fields that
        //did not originally exist in the Animals class.  So Java can find fields that exist
        //in both the main and subclass but cant find them if they are only in subclass.
        //So, we have to cast that object to the specific class first!

        //We are taking the randAnimal and telling the interpreter that we want to create a new tempCat
        // and we want to take the randAnimal and Animal class and convert it into a class.
        Cats tempCat = (Cats) randAnimal;
        //System.out.println(tempCat.favToy);
        System.out.println(((Cats) randAnimal).favToy);

        //OR it can be referenced this way...
        //System.out.println(randAnimal.favtoy);
        //Java is automatically casting below so the tempCat wasn't actually necessary.
        System.out.println(((Cats) randAnimal).favToy);

        //If you want to check to see if an object is an instance of or has ability to access the fields
        //and methods defined inside a certain class,
        //Is randAnimal and instanceof or have access to Cats???
        //If it comes back positive,
        if (randAnimal instanceof Cats) {
            System.out.println(randAnimal.getName() + " is a Cat");
        }
        //So, we can see that randAnimal "Tabby" is an instance of Cats AND Animals!!!
        if (randAnimal instanceof Animals) {
            System.out.println(randAnimal.getName() + " is a Cat");
        }

    }
}


