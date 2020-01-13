import java.util.Scanner;
import java.util.Stack;

public class checkParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> wordStack = new Stack<Character>();

        System.out.println("Please input a line of text: ");
        String textLine = scanner.nextLine();

        for (int i = 0; i < textLine.length(); i++) {
            if (textLine.charAt(i)=='(') {
                wordStack.push(textLine.charAt(i));
            }else if (!wordStack.empty()&&
                    (textLine.charAt(i)==')'&&
                    wordStack.peek()=='(')) {
                wordStack.pop();
            }else if (wordStack.empty()&&textLine.charAt(i)==')'){
                wordStack.push(textLine.charAt(i));
            }
        }

        if (wordStack.empty()){
            System.out.println("Parentheses OK!");
        } else {
            System.out.println("Parentheses Error!");
        }
    }
}
