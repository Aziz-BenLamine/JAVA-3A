public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    private static final int NBR_CAGES = 25;
    int animalCount = 0;

    Zoo(){}
    //Instruction 6
    Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    //Instruction 8
    void displayZoo() {
        System.out.println("Nom: " + this.name);
        System.out.println("Ville: " + this.city);
        System.out.println("NB cages: " + NBR_CAGES);
    }

    //Instruction 9
    @Override
    public String toString() {
        return this.name + " " + this.city + " " + NBR_CAGES;
    }

    //Instruction 12
    boolean addAnimal(Animal animal) {

        if (searchAnimal(animal) != -1) {
            return false;
        }

        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false;
    }

    void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    //Instruction 11
    int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    //Instruction 13
    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    //Instruction 15
    boolean isZooFull(){
        return animalCount >= NBR_CAGES;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            return null;
        }
    }

}
