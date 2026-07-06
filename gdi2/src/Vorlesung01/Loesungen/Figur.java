package Vorlesung01.Loesungen;

public class Figur {

    private String star;
    private int nr;

    private static String square[] = {"********",
                               "*      *",
                               "*      *",
                               "********"};
    private static String triangle[] = {"   *   ",
                                 "  ***  ",
                                " ***** ",
                               "*******"};
    private static String triangleOpp[] = {"*******",
                                     " ***** ",
                                      "  ***  ",
                                       "   *   "};
    private static String abstand = "      " ;
    private static int zeilen = 4;
    public static void figure(){
        for (int i = 0; i < zeilen; i++){
            System.out.println(square[i] + abstand + triangle[i] + abstand + triangleOpp[i] + abstand);
        }
    }









    public static void figuren10Times(){
        for (int i = 0; i < 11; i++) {
            figure();
        }
    }

    public static void main(String[] args) {

        figuren10Times();


    }
}
