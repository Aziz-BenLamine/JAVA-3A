import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        // Instruction 5
        /*
        Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;


        Zoo myZoo = new Zoo();
        myZoo.name = "Safari Park";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 10;
        myZoo.animals[0] = lion;
        */
        // Instruction 7
        Zoo myZoo = new Zoo("MyZoo", "Tunis", 10);
        Animal animal1 = new Animal("Felidae", "Lion", 5, true);
        Animal animal2 = new Animal("Canidae", "Wolf", 3, true);
        Animal animal3 = new Animal("Ursidae", "Bear", 7, true);
        myZoo.animals[0] = animal1;
        myZoo.animals[1] = animal2;
        myZoo.animals[2] = animal3;

        // Instruction 8
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(animal2.toString());
    }
}
