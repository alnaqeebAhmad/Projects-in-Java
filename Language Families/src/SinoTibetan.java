public class SinoTibetan extends Language{

    public SinoTibetan(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        super(name, numSpeakers, "Asia", "subject-object-verb");
        if (name == "Chinese") {
            wordOrder = "subject-verb-object";
            this.wordOrder = wordOrder;
            
        }
        
    }
    
}
