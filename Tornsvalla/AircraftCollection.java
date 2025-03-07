import java.util.ArrayList;

public class AircraftCollection {

    private static ArrayList<Aircraft> planes = new ArrayList<>();


    // Denna metod lägger till ny aircraft i listan om tailcode inte redan finns med
    // Nu i efterhand: egentligen borde tailcode-kontrollen läggas i annan klass än här
    public static void addAircraft(Aircraft aircraft) {

        if (isAircraftInList(aircraft.getTailcode()) == true) {
            planes.add(aircraft);
            BackupCollection.update(aircraft, "add");
        }
    }


    // Denna metod ska ta bort objektet Aircraft om specifika tailcode finns i listan
    public void removeAircraft(String tailcode) {

        if (isAircraftInList(tailcode) == true) {
            Aircraft a = getAircraftFromList(tailcode);
            planes.remove(a);
            BackupCollection.update(a, "remove");
        }
    }


    // Denna metod ska hämta alla befintliga tailcodes sparade i Aircraft-listan
    // Notera: Denna metod har ändrats så att den inte ansvarar föra att skriva ut tailcodes utan sparar i lista
    // men det innebär att den som kallar på metoden måste känna till ArrayList och kan hantera den i efterhand
    public static ArrayList<String> getAllTailcodes() {

        ArrayList<String> tailcode_list = new ArrayList<>();
        for (Aircraft a : planes) {
            // System.out.println(a.getTailcode());
            String tailcode = a.getTailcode();
            tailcode_list.add(tailcode);
        }
        return tailcode_list;
    }
    

    // Denna metod ska utföra metoden info() på flygplanet med angiven tailcode
    public static void getAircraftInfo(String tailcode) {

        Aircraft a = getAircraftFromList(tailcode);

        if (getAircraftFromList(tailcode) != null) {
            a.info();
        }
    }


    // Denna metod ska kolla om angivet tailcode finns kopplad till ett aircraft
    // Returenrar true/false
    private static boolean isAircraftInList(String tailcode) {

        int i = 0;
        boolean tailcode_found = false;

        while (tailcode_found == false && i < planes.size()) {
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
    private static Aircraft getAircraftFromList(String tailcode) { 

        if (isAircraftInList(tailcode) == true) {

            int i = 0;
            boolean aircraft_found = false;
            Aircraft a = null;


            while (aircraft_found == false && i < planes.size()) {

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