import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Aircraft {

    private String tailcode; // user input
    private String fullName; // code generated
    private String shortName; // user input
    private LocalDateTime lastSeen; // user input 
    private ArrayList<Actions> actions; // code generated


    public Aircraft(String tailcode, String shortName, String fullName, LocalDateTime lastSeen, ArrayList<Actions> actions) {
        this.tailcode = tailcode;
        this.shortName = shortName;
        this.fullName = fullName;
        this.lastSeen = lastSeen;
        if(actions==null) this.actions=new ArrayList<Actions> ();
        else this.actions = actions;

    }

    public String getTailcode() {
        return tailcode;
    }
    public String getShortName(){
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastSeen(){
    // svart magi ↓
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    String formattedDateTime = lastSeen.format(formatter);
        return formattedDateTime;
    }

    public void seen() {
        lastSeen = LocalDateTime.now();
        if (actions.isEmpty()) {
            System.out.println("No actions for " + shortName);
        }      
        else{
            for (Actions action : actions){
                action.Action();
        }
        }
    }
}
