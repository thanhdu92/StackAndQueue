import java.util.Scanner;
import java.util.Stack;

public class convertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> toBinaryStack = new Stack<Integer>();

        System.out.println("Enter decimal number: ");
        int decimalNumber = scanner.nextInt();

        while (decimalNumber != 0) {
            int binaryElement = decimalNumber % 2;
            toBinaryStack.push(binaryElement);
            decimalNumber /= 2;
        }

        System.out.println("The binary number corresponding to input decimal number is: ");
        while (!toBinaryStack.empty()){
            System.out.print(toBinaryStack.pop()+" ");
        }
    }
}
