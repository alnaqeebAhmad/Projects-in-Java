import java.util.Scanner;
public class Continents_and_cities{
  public static void main(String[] args){
    /*A program that will printout a continents and the largest city in that continent based on a the input of a value of an integer*/
    
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter integer from 1-7:");
      int continent = input.nextInt();
      
      switch(continent){
        case 1:
         System.out.println("North America: Mexico City, Mexico");
         break;

         case 2: 
         System.out.println("South America: Sao Paulo, Brazil");
         break;

         case 3:
         System.out.println("Europe: Moscow, Russia");
         break;

         case 4:
         System.out.println("Africa: Lagos, Nigeria");
         break;

         case 5:
         System.out.println("Asia: Shanghai, China");
         break;

         case 6:
         System.out.println("Australia: Sydney, Australia");
         break;

         case 7:
         System.out.println("Antarctica: McMurdo Station, US");
         break;

         default:
         throw new Error("number given outside bound");
        
      }
    }
  }
}