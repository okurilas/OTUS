package animal.birds;

import animal.AnimalAbs;

public class Duck extends AnimalAbs implements IFlying {


    @Override
    public void say() {
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
