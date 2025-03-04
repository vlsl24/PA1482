import java.util.ArrayList;

public class AircraftCollection {

    private static ArrayList<Aircraft> planes = new ArrayList<>();

    public static void addAircraft(Aircraft aircraft) {

        planes.add(aircraft);
    }


    public static void removeAircraft(String tailcode) {

        if (isAircraftInList(tailcode) == true) {
            Aircraft a = getAircraftFromList(tailcode);
            planes.remove(a);
        }
    }


    public static void getAllTailcodes() {

        for (Aircraft a : planes) {
            System.out.println(a.getTailcode());
        }
    }
    

    public static void getAircraftInfo(String tailcode) {

        Aircraft a = getAircraftFromList(tailcode);

        if (getAircraftFromList(tailcode) != null) {
            a.info();
        }
    }


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