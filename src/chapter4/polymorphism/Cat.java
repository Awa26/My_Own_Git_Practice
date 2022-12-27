package chapter4.polymorphism;

public class Cat extends Animal{


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is making meow meow meow");
    }


}
