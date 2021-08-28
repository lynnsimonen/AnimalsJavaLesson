package edu.wctc;

//subclass of Animals or "copy of the Animals class"
//this class extends Animals which means we want to copy all of the methods and fields from Animals class.
//Extending all things from a class is called Inheritance.
//Because the Cats class is going to inherit all of the Animals class methods and fields.
public class Cats extends Animals{
    //new fields inside class name cats
    //cats has access to favToy method but Animals does not
    public String favToy = "Yarn";
    //new method & play around with this new field just created
    public void playWith(){
        System.out.println("Yeah + favToy");
    }
    //override the walkAround method from the Animals class
    //There is no "final" in the method name in Animals class so we can make an override
    //this method needs to be defined the same way as in Animals
    public void walkAround(){
        System.out.println(this.getName() + " stalks around");
    }

    //returns a string
    public String getToy(){
        return this.favToy;
    }

    // generic constructor method... doesn't really do anything
    public Cats() {

    }

    //more elaborate constructor
    //Nice to call the Animal constructor that already processes name and favFood
    //we can by calling the "super" class file (see below)
    public Cats(String name, String favFood, String favToy) {
        //pass the super constructor the fields and let it figure out what to do
        super (name, favFood);
        //favToy doesn't exist in the Animals class, so we need to write it out
        this.favToy = favToy;

    }
}
