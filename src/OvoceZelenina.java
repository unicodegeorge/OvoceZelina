import java.util.ArrayList;
import java.util.Scanner;

public class OvoceZelenina {
    static String[] vegs;
    static String[] fruit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isNum = false;
        int numberOfVeg = 0;
        int numberOfFruit = 0;

        System.out.println("Enter number of vegs : ");
        numberOfVeg = sc.nextInt();
        vegs = new String[numberOfVeg];

        sc.nextLine(); // Fixing scanner skipping first value

        for (int i = 0; i < numberOfVeg; i++) {
            System.out.printf("Zadejte %d. zeleninu : ", i+1);
            vegs[i] = sc.nextLine();
        }

        System.out.println("Enter number of fruits : ");
        numberOfFruit = sc.nextInt();
        fruit = new String[numberOfFruit];

        sc.nextLine(); // Fixing scanner skipping first value

        for (int i = 0; i < numberOfFruit; i++) {
            System.out.printf("Zadejte %d. ovoce : ", i+1);
            fruit[i] = sc.nextLine();
        }

        String query = "";
        while (!query.equals("END")) {
            System.out.println("Zadejte hledany vyraz : ");
            query = sc.nextLine();
            System.out.println(checkQuery(query));
        }
    }

    public static String checkQuery(String query) {
        for(String currFruit : fruit) {
            if(currFruit.equals(query)) return "Fruit";
        }
        for(String currVeg : vegs) {
            if(currVeg.equals(query)) return "Veg";
        }
        return "Unknown";
    }
}
