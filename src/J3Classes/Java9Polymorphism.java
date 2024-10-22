package J3Classes;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class Java9Polymorphism {
    // Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
    // Like we specified in the Interface1 and Interface2 interfaces, we can have a class that implements both interfaces.
    // This is called multiple inheritance.
    // We can also have a class that implements an interface and extends a class.
    // This is called hybrid inheritance.
    // In Java, we can achieve polymorphism by using method overloading and method overriding.
    // If we have many classes that are in the same hierarchy, and we have a method that is declared in the parent class, and we override it in the child class, then we have achieved polymorphism.

    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
