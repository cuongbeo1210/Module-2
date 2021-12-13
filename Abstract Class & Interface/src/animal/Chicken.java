package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken : Go go go !";
    }

    @Override
    public String howToEat() {
        return "I want Rice !!!!";
    }
}
