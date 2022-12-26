package chapter3.abstractPractice;

public class Dog extends Animal implements Bark{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is making whoop whoop whoop");
    }

    @Override
    public void bark() {
        System.out.println(getName()+" is barking a lot");
    }
}
