import java.util.ArrayList;
public class SolarSystem {

    String name;
    ArrayList<Planets> planets = new ArrayList<Planets>();

    public SolarSystem(String name){
        this.name = name;
    }

    public void addPlanet(String pName, double distance){
        Planets planet = new Planets(pName, distance);
        planets.add(planet);
    }

    public String toString()
    {
        String finalstring = "Star " + this.name + " has planets:\n";
        for(int i = 0; i < planets.size(); i++){
            finalstring = finalstring + planets.get(i).getName() + "  is " + planets.get(i).getDistance() + "AU from its star, and orbits in " + planets.get(i).getPeriod() + " years\n";
        }
        return(finalstring);
    }
}
