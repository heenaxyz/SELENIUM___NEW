package org.example.Advancejava;

public class Constructorexample {

    public static void main(String[] args) {
        Animal animal = new Animal("Tim", 1);
        //animal.display();

        Animal animal2 = new Animal("William", 2);
        // animal2.display();

        Animal animal3 = new Animal();

        System.out.println(animal2 == animal);
    }
}

class Animal{

    String name;
    int id;

    void display(){
        System.out.println("The name is: "+name);
        System.out.println("The id is: "+id);
    }
    Animal(String hgh, int id){
        name = hgh;
        this.id = id;
    }

    Animal(){
        System.out.println("This is empty constructor");
    }
}
