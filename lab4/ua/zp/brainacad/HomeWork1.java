package ua.zp.brainacad;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println(true && false || true && !false);
        System.out.println(false || false || !true && false);
        System.out.println(!false && (false || true && true));
        System.out.println( 4 > 8 && !(7 == 0));
        System.out.println(!(true && false || false && true) && !(true && 4 <= 5));
    }
}
