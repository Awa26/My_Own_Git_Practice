package chapter4.polymorphism;

public class TestAnimalObject {
    public static void main(String[] args) {
        Animal animal = new Dog("Lilly", 3);// Polymorphism==> up casting
        animal.eat();
        animal.makeNoise();
         ((Dog) animal).bark();// down casting

        System.out.println(animal);


        System.out.println("=================================================================");

        animal = new Cat("Puss", 4);
        animal.eat();// up casting by using the parent type as a reference
        animal.makeNoise();

        System.out.println(animal);
    }
}
