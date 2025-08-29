//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 10;
        int a = 0, b = 1;

        System.out.println("Fibonacci series (" + n + " term):");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
