package baiTapAnimal;

public class Mouse extends Animal implements animalAction{
    @Override
    public int run() {
        return 15;
    }

    @Override
    public String makeSound() {
        return "Hello Kitty";
    }

    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

}
