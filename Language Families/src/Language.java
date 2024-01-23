public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name,int numSpeakers,String regionsSpoken,String wordOrder){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }
    public void getInfo(){
        System.out.println(name +" is spoken by " + numSpeakers + " people mainly in " + regionsSpoken +".\n The language follows the word order:" + wordOrder + ".");
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) throws Exception {
        Language spanish = new Language("spanish", 100001, "spain,south-america", "s-v-o");
        spanish.getInfo();
        Language Mayan = new Mayan("Mayan", 10000, "spain,south-america", "s-v-o");
        Mayan.getInfo();
        Language Mandrine = new SinoTibetan("Chinese", 1000000, "China", "KA");
        Language Burmese = new SinoTibetan("Burmese", 10000, "Burma", "KA");
        Mandrine.getInfo();
        Burmese.getInfo();
        

  
    }
}
