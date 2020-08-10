import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int previousNumber = 0;
        int currentNumber;
        String previousOrder = "same";
        String currentOrder = previousOrder;
        boolean order = true;

        while (scanner.hasNext()) {
            currentNumber = scanner.nextInt();

            if (currentNumber == 0) {
                break;
            }

            if (currentNumber > previousNumber && previousNumber != 0) {
                currentOrder = "asc";
            } else if (currentNumber < previousNumber) {
                currentOrder = "desc";
            } else if (currentNumber == previousNumber) {
                currentOrder = previousOrder;
            }

            if ((previousOrder.equals(currentOrder) || previousOrder.equals("same")) && !previousOrder.equals("none")) {
                order = true;
                previousOrder = currentOrder;
            } else {
                order = false;
                previousOrder = "none";
            }

            previousNumber = currentNumber;
        }

        System.out.println(order);
    }
}