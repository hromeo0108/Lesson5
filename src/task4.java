public class task4 {
    public static void main(String[] args) {
        table(1);
        System.out.println();
        table(1);
        System.out.println();
        table(1);
        System.out.println();
        table(1);
        System.out.println();

    }
    public static void table(int b){
        if(b <= 10){
            int c = b++;
            System.out.printf("%d ", c);
            table(b);
        }
    }
}
