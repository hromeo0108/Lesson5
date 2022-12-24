public class task1 {
    public static void main(String[] args) {
    int a = 1;
    table(a);

    }
    public static void table(int a) {
        if (a <= 10) {
            System.out.printf("*");
            a++;
            table(a);
        }
    }
}