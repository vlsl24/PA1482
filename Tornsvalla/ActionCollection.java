import java.util.ArrayList;

class ActionCollection {

private static Actions[] ActionList={new LogFlightCode(),new TrackRoute(),new NotifyFighterCommand()};


/*
För att anropa getpnaneActions så måste du skicka med en String med flygplanets ShortName

anropet till getPlaneActions måste sitta i en try catch så att om den ger tillbaka "null"
som händer bara när flygplan finns inte i Switch listan 

getPlaneActions kommer returnera en Arraylist<Actions> så när den
Anropas då måste variabeln som tar emot värdet vara en ArrayList<Actions> 
Annars kommer du få errors.
    
                OBS!!!
Om ArrayList<Actions> kan vara tom, det betyder att flygplanet har inga actions

*/
public static ArrayList<Actions> getPlaneActions(String ShortName){
 ArrayList<Actions> actions=new ArrayList<Actions>();

switch (ShortName.toLowerCase()) {
    case "lancaster":
        
        break;
    case "blenheim":
    
        break;
    case"mosquito":
        actions.add(ActionList[0]);
        break;
    default:
    System.out.println("No action found for " + ShortName);
    return null;
        
}


    return actions;
}

 

}