
public class SolarSystem {

    String name;
    double distance;
    double period;
    String planetName;

    public SolarSystem(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getDistance(){
        return distance;
    }

    public double getPeriod(){
        return period;
    }

    public void addPlanet(String name, double distance){
        this.planetName = name;
        double rounded = Math.round(distance*1000)/1000.0;
        double period = Math.round((Math.sqrt(distance*distance*distance)*1000/1000.0));
        this.distance = rounded;
        this.period = period;
    }

    public String toString()
    {
        String planet = "Mars";
        return("Star " + this.getName() + " has planets:" + "/n " + this.getDistance("Mars"));
    }
}
