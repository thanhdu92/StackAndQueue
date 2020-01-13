import java.util.Scanner;
import java.util.Stack;

public class NumberArrayReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> numberStack=new Stack<Integer>();


        System.out.println("How many numbers do you want to input? ");
        int inputNumber= scanner.nextInt();

        int[] numberArray = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            System.out.print("Input number: ");
           numberArray[i] =scanner.nextInt();
        }

        System.out.println("\nHere is the numbers in initial order: ");
        for (int i = 0; i < inputNumber; i++){
            System.out.print(numberArray[i]+" ");
        }

        for (int number :
                numberArray) {
            numberStack.push(number);
        }

        System.out.println("\nHere is the numbers in reverse order: ");

        while (!numberStack.empty()){
            System.out.print(numberStack.pop()+" ");
        }

    }
}
