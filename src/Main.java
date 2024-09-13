import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner qw = new Scanner (System.in);
        int day = qw.nextInt();
        String dayName = switch (day) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "неверный день";
        };
        System.out.println(dayName);
        double f = 0.875646416464682435336655656;
        System.out.println(f);
        char c = 'g';
        System.out.println(c);
    }
}