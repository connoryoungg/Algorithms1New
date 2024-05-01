import java.util.Scanner;

public class NotFibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the NotFibonacci sequence: ");
        int numTerms = scanner.nextInt();

        generateNotFibonacciSequence(numTerms);

        System.out.println("Enter a number to find its position in the current fibonacci sequence");
        int numPos = scanner.nextInt();
        findPositionInNotFibonacciSequence(numPos);

    }

    public static void generateNotFibonacciSequence(int numTerms) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("NotFibonacci Sequence:");
        System.out.print(firstTerm + ", " + secondTerm);

        for (int i = 2; i < numTerms; i++) {
            int nextTerm = (3 * firstTerm) + (2 * secondTerm);
            System.out.print(", " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }

    public static int findPositionInNotFibonacciSequence(int number) {
        int firstTerm = 0;
        int secondTerm = 1;
        int position = 2;

        for (int i = 2; i < number; i++) {
            int nextTerm = (3 * firstTerm) + (2 * secondTerm);

            if (nextTerm == number) {
                System.out.println("Number was found at position " + (position + 1));
                return position + 1;
            } else if (nextTerm > number) {
                System.out.println("That number is not a part of this fibonacci sequence, the closest lower index is " + (position));
                return position; // Return the position of the closest lower number
            }

            firstTerm = secondTerm;
            secondTerm = nextTerm;
            position++;
        }
        return 0;
    }
}
