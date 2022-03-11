package animal;

public class Dog extends Animal {

    @Override
    public void say() {
        super.say();
        System.out.println("Гав");
    }
}
