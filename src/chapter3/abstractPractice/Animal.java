package chapter3.abstractPractice;

public abstract class Animal {// parent class and cannot be instantiated since it is abstract

    private String name;
    private int age;

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()|| name.isEmpty()|| name== null){
            System.err.println("Invalid name, please check again!!!"+ name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age: "+ age);
        }
        this.age = age;
    }

    public void eat() {
        System.out.println(getName()+ " is eating");
    }

    public abstract void makeNoise();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
