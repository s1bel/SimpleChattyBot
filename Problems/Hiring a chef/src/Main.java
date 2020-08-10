import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            scanner.nextLine();
        }
        String cuisinePreference = scanner.nextLine();
        System.out.println("The form for " + firstName + " is completed. " +
                "We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");
    }
}