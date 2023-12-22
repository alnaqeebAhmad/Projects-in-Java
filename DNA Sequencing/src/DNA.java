/*Program that checks if a protein is in a strand of DNA
 * DNA is composed of a series of nucleotides abbreviated as:

A: Adenine
C: Cytosine
G: Guanine
T: Thymine
So a strand of DNA could look something like ACGAATTCCG.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.

*/



public class DNA {
  
  public static void main(String[] args) {
             
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    System.out.println(dna.length());
    int start = dna.indexOf("ATG");
    int stop = dna.lastIndexOf("TGA");
    String body = dna.substring(start+3, stop);
    System.out.println("start: " + start);
    System.out.println("Body: " + body);
    System.out.println("stop: " + stop);

    
    
    if (start != -1 && stop != -1 && body.length() % 3 == 0 ) {
      System.out.println("Conditions are satisfired");
      String protein = body;
      System.out.println("Protein: " + protein);
    } else {
      System.out.println("No Protein");
    }
    






  }
  
}