public class Planet {
    String name;
    double mass;

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
}