import java.util.jar.Attributes.Name;

class Mayan extends Language {

    public Mayan(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        super(name, numSpeakers, "Central America", "verb-object-subject");
        
    }
    
    @Override
    public void getInfo() {
        
        super.getInfo();
        System.out.println("Fun fact: " +name+ " is an ergative language.");
    }
}
