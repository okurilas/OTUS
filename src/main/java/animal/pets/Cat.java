package animal.pets;

import animal.AnimalAbs;

public class Cat extends AnimalAbs {

    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
