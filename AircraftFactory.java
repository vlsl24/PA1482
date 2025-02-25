//import java.util.ArrayList;

public class AircraftFactory {

    public static void createPlane(String fullName, String shortName){
         
        //ArrayList<Aircraft> planes = new ArrayList<>();

        
        Aircraft aircraft = new Aircraft(fullName, shortName);
        Aircraft coolAircraft = new Aircraft(fullName, shortName);
        
        //System.out.println(aircraft.getFullName());
        //System.out.println(planes);
        
        AircraftCollection.addAircraft(aircraft);
        AircraftCollection.addAircraft(coolAircraft);

        AircraftCollection.getAllAicraftNames();
        
    
    } 
    
    
}
