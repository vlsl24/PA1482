public class AircraftFactory {

    public static Aircraft  createPlane(String tailcode, String shortName) {
        
        Aircraft aircraft = new Aircraft(tailcode, shortName);
        
        AircraftCollection.addAircraft(aircraft);  
        
        return aircraft;
    
    } 

    
    
}