package baiTapAnimal;

public class Cat extends Animal implements animalAction {
    @Override
    public int run() {
        return 30;
    }

    @Override
    public String makeSound() {
        return "Meow Meow ....";
    }

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Cat() {
    }
}
