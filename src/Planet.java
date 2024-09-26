import java.util.ArrayList;
import java.util.List;

public class Planet {
    String name;
    private double mass;
    private List<Moon> moons = new ArrayList<>();

    public Planet(String Name, double mass) {
        this.name = Name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }

    public double getMass() {
        return mass;
    }

    public void addMoon(Moon m){
        this.moons.add(m);
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public double getTotalMoonsMass(){
        double s =0;
        for (Moon m: moons)
            s+= m.mass;
        return s;
    }
}