package animal.pets;

import animal.AnimalAbs;

public class Dog extends AnimalAbs {

    @Override
    public void say() {
        System.out.println("Гав");
    }
}
