
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
example4();
    }


    private static void example4() {
        List<Planet> planetList = new ArrayList<>();

        planetList.add(new Planet("Mercury", 3.3));
        planetList.add(new Planet("Venera", 0.02));
        planetList.add(new Planet("Earth", 0.03));
        planetList.add(new Planet("Mars", 0.04));
        planetList.add(new Planet("Jupiter", 0.05));
        planetList.add(new Planet("Saturn", 0.06));
        planetList.add(new Planet("Uran", 0.07));
        planetList.add(new Planet("Neptune", 0.08));

        System.out.println(planetList);

    }

}