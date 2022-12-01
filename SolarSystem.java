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

    public String getPlanetByName(String planetName){
        String planet = null;
        for(int i = 0; i < planets.size(); i++){
            if(planets.get(i).getName().equals(planetName)){
                planet = planets.get(i).getName() + "  is " + planets.get(i).getDistance() + "AU from its star, and orbits in " + planets.get(i).getPeriod() + " years\n";
            }else{
                planet = null;
            }
        }
        return planet;
    }

    public Object furthest(){
        String planet = null;
        double tempFurthestDistance = 0;
        for(int i = 0; i < planets.size(); i++){
            if(planets.get(i).getDistance() > tempFurthestDistance){
                tempFurthestDistance = planets.get(i).getDistance();
                planet = planets.get(i).getName();
            }
        }
        return planet;
    }

    public Object closest(){
        String planet = null;
        double tempClosestDistance = 0;
        for(int i = 0; i < planets.size(); i++){
            if(planets.get(i).getDistance() < tempClosestDistance || tempClosestDistance == 0){
                tempClosestDistance = planets.get(i).getDistance();
                planet = planets.get(i).getName();
            }
        }
        return planet;
    }

}
