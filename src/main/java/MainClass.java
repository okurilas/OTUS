import animal.*;
import animal.birds.Duck;
import animal.pets.Cat;
import animal.pets.Dog;
import data.Commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        ArrayList <AnimalAbs> animals = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String choose;

        while (true){
            System.out.println("Выберите команду add/list/exit");
            choose = scan.next().trim().toUpperCase(Locale.ROOT);

            Commands[] commands = Commands.values();
            String finalChoose = choose;
            boolean isCommandPresent = Arrays.stream(commands).anyMatch(command -> command.name().equals(finalChoose));

            if(!isCommandPresent) {
                System.out.println(String.format("Команда %s недопустима", choose));
                continue;
            }

            Commands command = Commands.valueOf(choose);

            switch (command){
                case ADD:

                    AnimalAbs animal=null;

                    System.out.println("Какое животное вы хотите? Cat, Dog, Duck?");
                    String animalType = scan.next().trim().toLowerCase(Locale.ROOT);

                    while (!((animalType.equals("cat"))|(animalType.equals("dog"))|(animalType.equals("duck")))) {
                            System.out.println(String.format("Такого животного %s не существует", animalType));
                            System.out.println("Какое животное вы хотите? Cat, Dog, Duck?");
                            animalType = scan.next().trim().toLowerCase(Locale.ROOT);

                        }

                    switch(animalType) {
                            case "cat": {
                                animal=new Cat();
                                generateAnimal(animal,scan);
                                animals.add(animal);
                                break;
                            }
                            case "dog": {
                                animal=new Dog();
                                generateAnimal(animal,scan);
                                animals.add(animal);
                                break;
                            }
                            case "duck": {
                                animal=new Duck();
                                generateAnimal(animal,scan);
                                animals.add(animal);
                                Duck duck = new Duck();
                                duck.fly();
                                break;
                            }
                        }
                    animal.say();
                    break;

                case LIST:
                    System.out.println("list");
                    for(int i = 0; i<animals.size(); i++) {
                        System.out.print(animals.get(i));
                        System.out.println();
                    }
                    break;

                case EXIT:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;

            }
        }

    }
    private static void generateAnimal (AnimalAbs animal, Scanner scanner){
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
