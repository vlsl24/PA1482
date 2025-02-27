public class AircraftFactory {

    public static void createPlane(String tailcode, String shortName) {
        
        Aircraft aircraft = new Aircraft(tailcode, shortName);
        
        AircraftCollection.addAircraft(aircraft);        
    
    } 
    
}
