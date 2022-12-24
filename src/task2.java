import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число:");
        int b = sc.nextInt();
        table(b);

    }
    public static void table(int a) {
        if (a > 0) {
            System.out.printf("*");
            a--;
            table(a);
        }
    }
}