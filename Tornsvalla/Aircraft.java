import java.util.ArrayList;

class Aircraft {

    private String tailcode;
    private String fullName;
    private String shortName;
    private String lastSeen;
    private ArrayList<Actions> actions; 

    public Aircraft(String tailcode, String shortName) {
        this.tailcode = tailcode;
        this.fullName = "fullName EJ SKAPAD";   // Ej klar
        this.shortName = shortName;
        this.lastSeen = "DATETIME EJ SKAPAD";   // Ej klar
        this.actions = ActionCollection.getPlaneActions(shortName);
    }

    public String getTailcode(){
        return tailcode;
    }
    // Skulle kunna ändras senare
    public void info() {
        System.out.println(fullName + " " + tailcode);
        System.out.println("Last seen:" + lastSeen);
    }


}
