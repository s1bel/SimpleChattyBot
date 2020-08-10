import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumberOfElements = scanner.nextInt();
        int countOfElements = 1;
        int element = 1;

        while (countOfElements <= maxNumberOfElements) {
            for (int i = 1; i <= element; i++) {
                System.out.print(element);
                countOfElements++;
                if (countOfElements > maxNumberOfElements) {
                    break;
                }
                System.out.print(" ");
            }
            element++;
        }
    }
}