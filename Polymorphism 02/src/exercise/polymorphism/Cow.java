package exercise.polymorphism;

public class Cow extends Animal{
    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        //super.animalSound();
        System.out.println("Cow sound: Muuuu!");
    }
}
