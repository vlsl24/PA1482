import java.util.ArrayList;

public class Tornsvalla  {
    private AircraftCollection collection = new AircraftCollection();
    
    public void seenAircraft(String tailcode, String shortName){
        if (!collection.isAircraftInList(tailcode)) {
            collection.addAircraft(AircraftFactory.createAircraft(tailcode, shortName));
            collection.getAircraftFromList(tailcode).seen();
            
        }
        else{
            (collection.getAircraftFromList(tailcode)).seen();  
        }

    }    

    public void getAircraftInfo(String tailcode) {
      Aircraft a =collection.getAircraftFromList(tailcode);

    System.out.println("tailcode:"+ a.getTailcode()+ " Full Name:"+a.getFullName()+" Last Seen:" +a.getLastSeen());
    }
    
     public void removeAircraft(String tailcode){
        collection.removeAircraft(tailcode);
     }   


     public void getAllAircraftInfo(){
       ArrayList <Aircraft> AircraftList = collection.getAllAircraft();
       for (Aircraft a : AircraftList){
            System.out.println("tailcode: "+ a.getTailcode()+" Short Name: "+ a.getShortName()+ " Full Name: "+a.getFullName()+" Last Seen: " +a.getLastSeen());
       }
     }


}