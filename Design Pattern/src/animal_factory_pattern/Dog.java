package animal_factory_pattern;

public class Dog extends Animal{
    @Override
    public String makeSound() {
        return "Woof";
    }
}