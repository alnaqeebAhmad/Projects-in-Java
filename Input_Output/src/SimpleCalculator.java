import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {

    public static Scanner sIn = new Scanner(System.in);
    static {
        sIn.useLocale(Locale.US);
    }
    public static int nextInt(String txt){
        while (true){
            try {
                System.out.println(txt);
                return sIn.nextInt();
            } catch (Exception e) {
                sIn.next();
                System.out.println("Bitte nur eine ganze Zahl zwischen " + Integer.MIN_VALUE + " und "
                        + Integer.MAX_VALUE + " eingeben");
            }
        }
    }

    public static String nextString(String txt){
        System.out.println(txt);
        return sIn.next();
    }


    private static int ersteZ, zweiteZahl;
    private static String op;

    public static int calculator(){
        ersteZ = nextInt("Type in the 1st Number: ");
        zweiteZahl = nextInt("Type in the 2nd Number: ");
        op = nextString("Type in one of the following Operations als String: + , - , * , / , % ");

        switch (op){
            case "+": return ersteZ + zweiteZahl;
            case "-": return ersteZ - zweiteZahl;
            case "%": return ersteZ % zweiteZahl;
            case "/": if (zweiteZahl == 0) {throw new ArithmeticException("Division durch 0!"); }
                        else  { return ersteZ/zweiteZahl; }
            case "*": return ersteZ * zweiteZahl;
            default: throw new IllegalArgumentException("Ungültige Operation: " + op);

        }
    }

    public static void main(String [] args){

        System.out.println("Ergebnis: " + calculator());

    }
}


