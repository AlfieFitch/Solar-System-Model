import java.util.ArrayList;
public class SolarSystem {

    private String name;
    private  double luminosity;
    private ArrayList<Planets> planets = new ArrayList<Planets>();

    public SolarSystem(String name, double luminosity){
        this.name = name;
        this.luminosity = luminosity;
    }

    public SolarSystem(String name){
        this.name = name;
    }

    public void addPlanet(String pName, double distance){
        Planets planet = new Planets(pName, distance);
        planets.add(planet);
    }

    public void addPlanet(String pName, double mass, double radius, double distance){
        Planets planet = new Planets(pName, mass, radius, distance, luminosity);
        planets.add(planet);
    }

    public String toString(){
        String finalstring = "Star " + this.name + " has planets:\n";
        for (int i = 0; i < planets.size(); i++){
            if (planets.get(i).getGravity() == 0){
                finalstring = finalstring + planets.get(i).getName() 
                + "  is " + planets.get(i).getDistance() 
                + "AU from its star, and orbits in " 
                + planets.get(i).getPeriod() + " years\n";
            }else {
                finalstring = finalstring + planets.get(i).getName() + " has a mass of " + planets.get(i).getMass()
                + " Earths with a surface gravity of " 
                + planets.get(i).getGravity() + "g, is " 
                + planets.get(i).getDistance() 
                + "AU from its star, and orbits in " 
                + planets.get(i).getPeriod() + " years: could be habitable? " 
                + planets.get(i).getHabitable() + "\n";   
            }
        }
        return(finalstring);
    }


    public Planets getPlanetByName(String planetName){
        Planets sendPlanet = null;
        for (int i = 0; i < planets.size(); i++){
            if (planets.get(i).getName().equals(planetName)){
                sendPlanet = planets.get(i);
            }
        }
        return sendPlanet;
    }

    public Planets furthest(){
        Planets planet = null;
        double tempFurthestDistance = 0;
        for (int i = 0; i < planets.size(); i++){
            if (planets.get(i).getDistance() > tempFurthestDistance){
                tempFurthestDistance = planets.get(i).getDistance();
                planet = planets.get(i);
            }
        }
        return planet;
    }

    public Planets closest(){
        Planets planet = null;
        double tempClosestDistance = 0;
        for (int i = 0; i < planets.size(); i++){
            if ((planets.get(i).getDistance() < tempClosestDistance) || tempClosestDistance == 0){
                tempClosestDistance = planets.get(i).getDistance();
                planet = planets.get(i);
            }
        }
        return planet;
    }



}
