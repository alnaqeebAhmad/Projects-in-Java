import java.util.Locale;
import java.util.Scanner;

public class Squared {

    private static Scanner sIn = new Scanner(System.in);
    static {
        sIn.useLocale(Locale.US);
    }

    private static int ersteZahl, zweiteZahl;
    private static String op;
    private static boolean squared;

    public static void isSquared() {
        boolean isQuadrat = true;
        while (isQuadrat) {
            ersteZahl = util.ReadUtil.nextInt("Erste Zahl eingeben: ");
            zweiteZahl = util.ReadUtil.nextInt("Zweite Zahl eingeben: ");

        if (ersteZahl == Math.pow(zweiteZahl, 2)) {
            System.out.println(ersteZahl +" ist Quadrat der Zahl " + zweiteZahl);
        } else if (zweiteZahl == Math.pow(ersteZahl, 2)) {
            System.out.println(zweiteZahl +" ist Quadrat der Zahl " + ersteZahl);
        } else {
            isQuadrat = false;
            System.out.println(" Beide Zahlen sind kein Quadrat ");
        }
    }
    }
    public static void main(String[] args){
    isSquared();
    }
}
