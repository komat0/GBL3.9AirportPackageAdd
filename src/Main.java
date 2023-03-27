import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {

        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts());
        System.out.println((long) airport.getAllAircrafts().size());
        System.out.println(airport.getAllAircrafts().stream().count());
        System.out.println(airport.getAllAircrafts().size());
    }
}