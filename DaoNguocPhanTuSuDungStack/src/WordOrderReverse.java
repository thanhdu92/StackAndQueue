import java.util.Scanner;
import java.util.Stack;

public class WordOrderReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wordStack = new Stack<String>();

        System.out.println("Please input a line of text: ");
        String textLine = scanner.nextLine();

        String[] wordArray = textLine.split(" ");

        for (String word :
                wordArray) {
            wordStack.push(word);
        }

        System.out.println("Here is the words in reverse order: ");

        while (!wordStack.empty()){
            System.out.print(wordStack.pop()+" ");
        }
    }
}
