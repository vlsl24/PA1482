import java.time.LocalDateTime;
import java.util.ArrayList;

class Aircraft {

    private String tailcode;
    private String fullName;
    private String shortName;
    private LocalDateTime lastSeen;
    private ArrayList<Actions> actions;

    public Aircraft(String tailcode, String shortName) {
        this.tailcode = tailcode;
        this.shortName = shortName;
        this.fullName = generateFullName(shortName);  
        this.lastSeen = LocalDateTime.now(); 
        this.actions = ActionCollection.getPlaneActions(shortName);

        if (this.actions == null) {
            this.actions = new ArrayList<>(); 
        }
    }

    private String generateFullName(String shortName) {
        switch (shortName.toLowerCase()) {
            case "lancaster": return "Avro Lancaster";
            case "blenheim": return "Bristol Blenheim";
            case "mosquito": return "De Havilland Mosquito";
            case "hurricane": return "Hawker Hurricane";
            case "spitfire": return "Supermarine Spitfire";
            case "messershmitt": return "Messerschmitt Bf 109";
            case "focke-wulf": return "Focke-Wulf Fw 190";
            case "dornier": return "Dornier Do 17";
            case "henkel": return "Heinkel He 111";
            case "junker": return "Junkers Ju 87";
            default: return "Unknown Aircraft";
        }
    }

    public String getTailcode() {
        return tailcode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setLastSeen() {
        this.lastSeen = LocalDateTime.now();
    }

    public void info() {
        System.out.println("Aircraft: " + fullName + " (" + shortName + ") " + tailcode);
        System.out.println("Last seen: " + lastSeen);
    }

    public void doActions() {
        if (actions.isEmpty()) {
            System.out.println("No actions available for " + shortName);
            return;
        }
        for (Actions action : actions) {
            action.Action();;
        }
    }

    public void setActions() {
        this.actions = ActionCollection.getPlaneActions(shortName);
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
    }
}
