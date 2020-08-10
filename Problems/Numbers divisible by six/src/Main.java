import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int number;
        int sumOfDivesibleBy6 = 0;
        for (int i = 0; i < numOfElements; i++) {
            number = scanner.nextInt();
            if (number % 6 == 0) {
                sumOfDivesibleBy6 += number;
            }
        }
        if (sumOfDivesibleBy6 > 0) {
            System.out.println(sumOfDivesibleBy6);
        }
    }
}