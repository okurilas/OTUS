package animal;

public class Duck extends Animal implements Flying {


    @Override
    public void say() {
        super.say();
        System.out.println("Кря");
    }

    public static void main(String[] args) {
        Flying.fly();
    }
}
