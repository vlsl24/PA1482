
import java.util.Scanner; 
public  class UI {
    
    private  Tornsvalla tornsvalla = new Tornsvalla();

   public String options() {
    tornsvalla.seenAircraft("xyz123","stuka");
    tornsvalla.seenAircraft("fddfs","lancaster");
    Scanner myObj = new Scanner(System.in);
    while(true) {
        System.out.println("1. getAllAircraftInfo:");
        System.out.println("2. getAircraftFromList:");
        System.out.println("3. addAircraft");
        System.out.println("4. removeAircraft");
      
        String choice = myObj.nextLine(); 
        int choiceToNumber = 0;
        
        try {
            choiceToNumber = Integer.valueOf(choice);
        }
            catch (NumberFormatException e) {
                System.out.println("Invalid integer input");
           
        }
       
        
        
        switch (choiceToNumber) {
            case 0: 
             break;
            
            case 1: tornsvalla.getAllAircraftInfo();
                break; 
            case 2: tornsvalla.getAircraftInfo(getTailcode(myObj)); 
            break; 
         
            case 3: seenAircraft(myObj); 
             
            break;   
            
            case 4: tornsvalla.removeAircraft(getTailcode(myObj));  
            break;  
        
        default:
        System.out.println("Choose another number");
        }
   }

}

private String getTailcode(Scanner myObj){

try {
    System.out.println("write tailcode:");
    String tailcode = myObj.nextLine();
    return tailcode;
   
 } catch(Exception e) {
    System.out.println("something went wrong");
}
return "";
}


private void seenAircraft(Scanner myObj){

    try {
        System.out.println("write tailcode:");
        String tailcode = myObj.nextLine();
        System.out.println("write shortname:");
        String shortname = myObj.nextLine();
        tornsvalla.seenAircraft(tailcode,shortname);
     } catch(Exception e) {
        System.out.println("something went wrong");
    }
    }
}
