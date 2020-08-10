import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String resultString = inputString.substring(num1, ++num2);
        System.out.println(resultString);
    }
}