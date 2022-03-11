import animal.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        ArrayList <Animal> animals = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        String choose;



        boolean isNotExit = true;
        while (isNotExit){
            System.out.println("Выберите команду add/list/exit");
            choose = scan.next().trim().toUpperCase(Locale.ROOT);
            Commands command = Commands.valueOf(choose);
            switch (command){
                case ADD:


                    Animal animal=null;
                    while (animal ==null){
                        System.out.println("Какое животное вы хотите? Cat, Dog, Duck?");
                        String animalType = scan.next().trim().toLowerCase(Locale.ROOT);
                    if (animalType.equals("cat")) {
                        animal=new Cat();
                        generateAnimal(animal,scan);
                    } else if (animalType.equals("dog")) {
                        animal=new Dog();
                        generateAnimal(animal,scan);
                    } else if (animalType.equals("duck")){
                        animal=new Duck();
                        generateAnimal(animal,scan);
                    } else {System.out.println("ОШИБКА! Можно выбрать только или Cat или Dog или Duck");}
                        animals.add(animal);
                    }


                    animal.say();
                    break;
                case LIST:
                    System.out.println("list");
                    System.out.println(animals);
                    break;
                case EXIT:
                    isNotExit = false;
                    break;
                default:
                    System.out.println("Вы ввели неверную команду");
            }
        }
        System.out.println("Goodbye");
    }
    private static void generateAnimal (Animal animal,Scanner scanner){
        System.out.println("Введите имя");
        animal.setName(scanner.next());
        System.out.println("Введите цвет");
        animal.setColor(scanner.next());
        while (animal.getAge()==0)
        {System.out.println("Введите возраст");
            animal.setAge(scanner.nextInt());}
        System.out.println("Введите вес");
        animal.setWeight(scanner.nextInt());

    }
}
