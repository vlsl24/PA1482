import java.util.ArrayList;

public class BackupCollection {

    // Låtsas att <String> är av abstrakta klassen Backup, och att den innehåller ConcreteBackups 
    private static ArrayList<String> myBackups = new ArrayList<>();

    public static void update(Aircraft aircraft, String event) {
        switch (event.toLowerCase()) {
            case "add": add(aircraft); break;
            case "remove": remove(aircraft); break;
            case "update": update(aircraft); break;
            default: break;
        }
    }

    // Här ska metoden egentligen gå igenom alla sina Backup
    // och göra metoden add() på dessa platser
    private static void add(Aircraft aircraft) {
        for (String observer : myBackups) {
            // gör add() för alla
        }
    }

    private static void remove(Aircraft aircraft) {
        // Liknande som i add()
    }

    private static void update(Aircraft aircraft) {
        // Liknande som i add()
    }
}
