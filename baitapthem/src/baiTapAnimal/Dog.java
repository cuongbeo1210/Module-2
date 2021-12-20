package baiTapAnimal;

public class Dog extends Animal implements animalAction {
    @Override
    public int run() {
        return 40;
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog() {
    }

    @Override
    public String makeSound() {
        return "Go go go ....";
    }


}
