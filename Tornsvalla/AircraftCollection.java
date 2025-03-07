import java.util.ArrayList;

public class AircraftCollection {

    private ArrayList<Aircraft> planes = new ArrayList<>();


    // Denna metod lägger till ny aircraft i listan
    public void addAircraft(Aircraft aircraft) {

        planes.add(aircraft);
        BackupCollection.update(aircraft, "add");
        
    }


    // Denna metod ska ta bort objektet Aircraft om specifika tailcode finns i listan
    public void removeAircraft(String tailcode) {

        if (isAircraftInList(tailcode)) {
            Aircraft a = getAircraftFromList(tailcode);
            planes.remove(a);
            BackupCollection.update(a, "remove");
        }
    }


    public ArrayList<Aircraft> getAllAircraft() {       
        return planes;
    }


    // Denna metod ska kolla om angivet tailcode finns kopplad till ett aircraft
    // Returenrar true/false
    public boolean isAircraftInList(String tailcode) {

        int i = 0;
        boolean tailcode_found = false;

        while (!tailcode_found && i < planes.size()) {
            Aircraft aircraft = planes.get(i);
            String aircraftTailcode = aircraft.getTailcode();

            if (aircraftTailcode.equals(tailcode)) {
                tailcode_found = true;
            }

            i++;
        }

        return tailcode_found;
    }


    // Denna metod ska hämta angivet Aircraft-objekt om den finns i listan
    // Returnerar aircraft-objektet eller null
    // Notera: Skulle möjligvis kunna skrivas om med en for-loop och break, (tomayto tomahto)
    public Aircraft getAircraftFromList(String tailcode) {

        if (isAircraftInList(tailcode)) {

            int i = 0;
            boolean aircraft_found = false;
            Aircraft a = null;


            while (!aircraft_found && i < planes.size()) {

                a = planes.get(i);

                if (a.getTailcode().equals(tailcode)) {
                    aircraft_found = true;
                }

                i++;
            }

            return a;

        } else {

            return null;
        }
    }
}