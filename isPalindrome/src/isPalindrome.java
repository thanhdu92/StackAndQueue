import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> wordStack = new Stack<Character>();
        Queue<Character> wordQueue = new LinkedList<Character>();

        System.out.println("Please input a line of text: ");
        String textLine = scanner.nextLine();

        for (int i = 0; i < textLine.length(); i++) {
            wordStack.push(textLine.charAt(i));
        }

        for (int i = 0; i < textLine.length(); i++) {
            wordQueue.add(textLine.charAt(i));
        }

        while (!wordStack.empty() && wordStack.peek().equals(wordQueue.peek())) {
            wordStack.pop();
            wordQueue.remove();
        }

        if (wordStack.empty()){
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is NOT a palindrome!");
        }

    }
}
