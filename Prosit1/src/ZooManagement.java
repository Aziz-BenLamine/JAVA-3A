import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        //Instruction 10
        Zoo myZoo = new Zoo("Friguia", "Tunis");

        for (int i = 1; i <= 23; i++) {
            Animal a = new Animal("Family" + i, "Animal" + i, i, true);
            myZoo.addAnimal(a);
        }
        Animal b = new Animal("Lion", "Jean", 5, true);
        myZoo.addAnimal(b);

        System.out.println(myZoo.searchAnimal(b));
    }
}
