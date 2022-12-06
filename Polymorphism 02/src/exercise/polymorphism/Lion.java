package exercise.polymorphism;

public class Lion extends Animal{
    public Lion(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        //super.animalSound();
        System.out.println("Lion sound: Roarrr!");
    }
}
