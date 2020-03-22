package ua.zp.brainacad;

public class HomeWork4 {
    public static void main(String[] args) {
        int f=1;
        for (int i = 1; i <=10; i++) {
            f*=i;
            if (f < 1000) {
                System.out.println(f);
            }
            else {
                System.out.println("Достигнут максимально возможный результат");break;
           }


        }
    }
}
