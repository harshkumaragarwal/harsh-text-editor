import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int n1 = reader.nextInt();
      int n2= reader.nextInt();
int ans = n1+n2;
        // println() prints the following line to the output screen
        System.out.println("You entered: " +ans);
    }
}