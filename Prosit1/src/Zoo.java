public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    Zoo(){}
    //Instruction 6
    Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    //Instruction 8
    void displayZoo() {
        System.out.println("Nom: " + this.name);
        System.out.println("Ville: " + this.city);
        System.out.println("NB cages: " + this.nbrCages);
    }

    //Instruction 9
    @Override
    public String toString() {
        return this.name + " " + this.city + " " + this.nbrCages;
    }

}
