import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String burgTest = "burg";
        String inputString = scanner.nextLine();
        System.out.println(inputString.endsWith(burgTest));
    }
}