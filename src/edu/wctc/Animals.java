package edu.wctc;

//Created a new class called the Animals, a superclass because we expect to make subclasses
//Subclasses are copies of the super class and change them in some way.
public class Animals {
    private String name = "Animal";  //private field with a default value of "Animal"
    public String favFood = "Food";    //default value "Food"

    //A private field means that the only thing with access to this information is the Animals class.
    //A public field can be accessed by the whole world.
    //A protected method (rather than private or public) to allow subclasses access to this method.
    // Final method cannot be changed by any subclasses.  It's name cannot be used for another method.
    //"final" blocks a subclass from reusing the method name.
    protected final void changeName(String newName) {
        //this is a reference to the object created using the animals class.
        this.name = newName;
    }
    //Class - blueprint for creating objects.

    //getName method returns a String
    protected final String getName () {
        return this.name;
    }

    //eatStuff method (void) so doesn't return anything but does print out "Yum + favFood"
    public void eatStuff() {
        System.out.println("Yum" + favFood);
    }

    //walkAround method doesn't receive any attributes
    //method that will overwrite with "this.name"
    public void walkAround () {
        System.out.println(this.name + "walks around");
    }

    //generic constructor for the Animals class
    public Animals(){
    }

    //more complicated constructor
    public Animals(String name, String favFood){
        this.changeName(name);
        this.favFood = favFood;
    }

}
