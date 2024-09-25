
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
example4();
    }


    private static void example4() {
        List<Planet> planetList = new ArrayList<>();

        planetList.add(new Planet("Mercury", 3.302e23));
        planetList.add(new Planet("Venera", 4.8685e24));
        planetList.add(new Planet("Earth", 5.9736e24));
        planetList.add(new Planet("Mars", 6.419e23));
        planetList.add(new Planet("Jupiter", 1.8986e27));
        planetList.add(new Planet("Saturn", 5.6846e26));
        planetList.add(new Planet("Uran", 8.6832e25));
        planetList.add(new Planet("Neptune", 1.0243e26));

        System.out.println(planetList);

    }
    class Astronomer implements Comparator<Planet> {
        @Override
        public int compare(Planet planet1, Planet t2) {
            return Double.compare(planet1.mass(), planet2.mass());
        }
    }

}