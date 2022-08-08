import java.util.Scanner;
import java.util.Stack;

public class WStack {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String mWord = scanner.nextLine();
        String [] list = mWord.split(" ");
        mWord = "";
        for (int i = 0; i < list.length; i++) {
            wStack.push(list[i]);
        }
        for (int i = 0; i < list.length; i++) {
            mWord+=wStack.pop();

        }
        System.out.println("=========="+mWord);
    }

}
