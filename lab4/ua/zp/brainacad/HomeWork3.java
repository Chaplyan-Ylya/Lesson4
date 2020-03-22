package ua.zp.brainacad;

public class HomeWork3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            switch (i) {
                case 1:
                    System.out.print("Понедельник");
                    break;
                case 2:
                    System.out.print("Вторник");
                    break;
                case 3:
                    System.out.print("Среда");
                    break;
                case 4:
                    System.out.print("Четверг");
                    break;
                case 5:
                    System.out.print("Пятница");
                    break;
                case 6:
                    System.out.print("Суббота");
                    break;
                case 7:
                    System.out.print("Воскресенье");
                    break;
            }
            if (i <= 5) {
                System.out.println("-"+"это рабочий день");
            } else {
                System.out.println("-"+"это выходной");
            }
        }

    }
}