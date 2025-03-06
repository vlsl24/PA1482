
public class Tornsvalla  {
    public static void main(String[] args) {
        seen("ABCD", "Mosquito");
        seen("DEFG", "Junker");
        AircraftCollection.getAllTailcodes();   // Kollar vilka flyg som sparats i listan
    }

    public static void seen(String tailcode) {
        System.out.println("Please specify type of plane observed");
    }

    public static void seen(String tailcode, String type) {
        AircraftFactory.createPlane(tailcode, type);
    }

    public static void aircraftInfo(String tailcode) {
        AircraftCollection.getAircraftInfo(tailcode);
    }
}