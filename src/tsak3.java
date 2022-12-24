public class tsak3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        int a1 = 5;
        int b1 = 5;
        int c1 = 5;
        int p = perimetr(a,b,c);
        int p1 = perimetr(b1,a1,c1);
        double s = sqr(p,a,b,c);
        double s1 = sqr(p1,a1,b1,c1);
        System.out.println("P = "+ p);
        System.out.println("P1 = "+ p1);

        System.out.println("S = "+sqr(p,a,b,c));
        System.out.println("S1 = "+sqr(p1,a1,b1,c1));

        System.out.println("sum P = "  + p1 + p);
        System.out.println("sum S = "+ s + s1);
    }
    public static int perimetr(int qwert, int b, int c){
        return qwert + b + c;
    }
    public static double sqr(int p, int a, int b, int c){
        int p2 = p / 2;
        return Math.sqrt(p2 * (p2 - a) *(p2 - b) * (p2 - c));
    }
}
