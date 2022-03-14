package animal;

public abstract class AnimalAbs {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;
    protected String godLet;

    public String calculate (int age){

        if (age == 1) {
            godLet="год";
        }
        else if (age>1 && age<5) {
            godLet="года";
        }
        else if (age>4 && age<21) {
            godLet="лет";
        }
        else {
            System.out.println("Не бывает таких старых животных");
        }

        return godLet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<21){
            this.age = age;
        } else {
        System.out.println("Возраст животного должен быть больше 0 и меньше 20");}

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю ");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public static void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        calculate(age);
        return "Привет! " +
                "Меня зовут " + name +
                ", мне " + age + " " + godLet+
                ", я вешу " + weight + " кг" +
                ", мой цвет " + color;
    }
}
