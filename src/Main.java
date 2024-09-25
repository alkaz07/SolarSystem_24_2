
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

        Planet earth = planetList.get(2);
        System.out.println(earth.getMoons());
        earth.addMoon(new Moon("Луна", 7.35e22, "серый"));
        System.out.println(earth.getMoons());

        Planet mars = planetList.get(3);
        mars.addMoon(new Moon("Фобос", 123, ""));
        mars.getMoons().add(new Moon("Деймос", 222, ""));

        planetList.sort(new Zvezdochet());
        System.out.println(planetList);

    }


}

class Astronome implements Comparator<Planet> {
    @Override
    public int compare(Planet planet1, Planet planet2) {
        return Double.compare(planet1.getMass(), planet2.getMass());
    }
}

class Zvezdochet implements Comparator<Planet> {
    @Override
    public int compare(Planet planet1, Planet planet2) {
        return planet1.name.compareTo(planet2.name);
    }
}