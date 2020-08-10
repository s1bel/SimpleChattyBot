import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        while (scanner.hasNext()) {
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            String answer = (value % 2 == 0) ? "even" : "odd";
            System.out.println(answer);
        }
    }
}