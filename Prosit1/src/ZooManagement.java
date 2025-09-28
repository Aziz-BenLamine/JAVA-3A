import java.util.Scanner;

// Instruction 1
public class ZooManagement {
    public static void main(String[] args) {
        // Instruction 1
        /*int nbrCages = 20;
        String zooName = "my zoo";*/

        // Instruction 2
        String zooName;
        int nbrCages;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo: ");
        zooName = sc.nextLine();
        System.out.print("Entrez le nbr cages: ");
        nbrCages = sc.nextInt();
        sc.close();

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}

