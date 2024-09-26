
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // example1();
        example2();
    }

    private static void example2() {
        List<Planet> planetList = makeSolarSystem();
        System.out.println(planetList);
        //сортировка по числу спутников
       // planetList.sort((p1, p2) -> p1.getMoons().size()-p2.getMoons().size());
        planetList.sort(Comparator.comparingInt(p -> p.getMoons().size()));
        System.out.println(planetList);
//        сортировка по суммарной массе спутника
        planetList.sort(Comparator.comparingDouble(p->p.getTotalMoonsMass()));
        System.out.println(planetList);
    }

    public static List<Planet> makeSolarSystem(){
        List<Planet> planetList = new ArrayList<>();

        planetList.add(new Planet("Mercury", 3.302e23));
        planetList.add(new Planet("Venera", 4.8685e24));
        planetList.add(new Planet("Earth", 5.9736e24));
        planetList.add(new Planet("Mars", 6.419e23));
        planetList.add(new Planet("Jupiter", 1.8986e27));
        planetList.add(new Planet("Saturn", 5.6846e26));
        planetList.add(new Planet("Uran", 8.6832e25));
        planetList.add(new Planet("Neptune", 1.0243e26));

        Planet earth = planetList.get(2);
        earth.addMoon(new Moon("Луна", 7.35e22, "серый"));
        Planet mars = planetList.get(3);
        mars.addMoon(new Moon("Фобос", 123, ""));
        mars.getMoons().add(new Moon("Деймос", 222, ""));
        return planetList;
    }

    private static void example1() {
        List<Planet> planetList = makeSolarSystem();
        System.out.println(planetList);
        planetList.sort(new Zvezdochet());
        System.out.println(planetList);
        planetList.sort(new Astronome());
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