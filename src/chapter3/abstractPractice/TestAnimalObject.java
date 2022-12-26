package chapter3.abstractPractice;

public class TestAnimalObject {
    public static void main(String[] args) {
        Cat myCat = new Cat("Lilly", 1);

        myCat.eat();
        myCat.makeNoise();
        System.out.println(myCat);
        System.out.println("=================================================================");

        Dog myDog = new Dog("Zulu", 2);

        myDog.makeNoise();
        myDog.eat();
        myDog.bark();
        System.out.println(myDog);

    }
}
