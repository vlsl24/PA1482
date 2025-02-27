import java.util.ArrayList;

public class AircraftCollection {
    private static ArrayList<Aircraft> planes = new ArrayList<>();

    public static void addAircraft(Aircraft aircraft) {
        planes.add(aircraft);
    }

    public static void getAllTailcodes() {
        for (Aircraft a : planes) {
            System.out.println(a.getTailcode());
        }
    }
    
    public static void getAircraftInfo(String tailcode) {
        // Här ska man hitta flygplan i lista
        // och utföra aircraft.info()
        // to be continued...
    }
    
}