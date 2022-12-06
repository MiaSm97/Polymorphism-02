package exercise.polymorphism;

public class Tester {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();

    }
}

    /*define a tester class where you:
        create an Animal object
        create a Lion object
        create a Cow object
        executes the animalSound() method on all the 3 objects*/
