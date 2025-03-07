import java.time.LocalDateTime;
import java.util.ArrayList;

public class AircraftFactory {
    
private static String generateFullName(String shortName) {
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

    public static Aircraft createAircraft(String tailcode, String shortName) {

        String fullName = generateFullName(shortName);
        LocalDateTime lastSeen = LocalDateTime.now();
        ArrayList<Actions> actions = ActionCollection.getPlaneActions(shortName);
        Aircraft aircraft = new Aircraft(tailcode, shortName, fullName, lastSeen,actions);

        return aircraft;
    } 
   
}