import java.util.ArrayList;

// The Solar system class creates and stores each planet that is added to the solar system object.
public class SolarSystem {

    // Variable initalisation.
    private String name;
    private  double luminosity;
    // The Array below is used to store all the planet objects.
    private ArrayList<Planets> planets = new ArrayList<Planets>();

    // The constructor used for level 3, when luminosity is passed;
    public SolarSystem(String name, double luminosity){
        this.name = name;
        this.luminosity = luminosity;
    }


    // The constructor used for level 1 and 2.
    public SolarSystem(String name){
        this.name = name;
    }


    // Method that creates a new planet object with the parameters passed to it.
    // Adds the new planet object to the solar systems Array.
    // This method is only used in level 1 and 2.
    public void addPlanet(String pName, double distance){
        Planets planet = new Planets(pName, distance);
        planets.add(planet);
    }


    // This method is similar to the method above but is used in level 3 when
    // more parameters are passed to the method and object.
    public void addPlanet(String pName, double mass, double radius, double distance){
        Planets planet = new Planets(pName, mass, radius, distance, luminosity);
        planets.add(planet);
    }


    // This method creates the string that is printed out, showing all the planets in the class;
    public String toString(){
        // The string that shows the star name:
        String finalstring = "Star " + this.name + " has planets:\n";
        
        // Loops through every planet in the Array.
        for (int i = 0; i < planets.size(); i++){
            // the below section is run if the planets gravity is not set,
            // so this is for level 1 and 2;
            if (planets.get(i).getGravity() == 0){
                finalstring = finalstring + planets.get(i).getName() 
                + "  is " + planets.get(i).getDistance() 
                + "AU from its star, and orbits in " 
                + planets.get(i).getPeriod() + " years\n";
            // The else section is ran when there is a value that is set for gravity,
            // so this is ran for level 3, changing the
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


    // The below method gets the from the object by name;
    public Planets getPlanetByName(String planetName){
        Planets sendPlanet = null;
        // Loops through the Array and checks if the name is equal to that passed by the parameter.
        for (int i = 0; i < planets.size(); i++){
            if (planets.get(i).getName().equals(planetName)){
                sendPlanet = planets.get(i);
            }
        }
        return sendPlanet;
    }


    // Gets the planet from the array which is the furthest distance from the sun.
    public Planets furthest(){
        Planets planet = null;
        double tempFurthestDistance = 0;
        for (int i = 0; i < planets.size(); i++){
            // Compares if the new planet distance is greater than the current one. 
            if (planets.get(i).getDistance() > tempFurthestDistance){
                // Sets the new planet as furthest if true.
                tempFurthestDistance = planets.get(i).getDistance();
                planet = planets.get(i);
            }
        }
        return planet;
    }


    // Gets the planet from the array which is the closest distance from the sun.
    public Planets closest(){
        Planets planet = null;
        double tempClosestDistance = 0;
        for (int i = 0; i < planets.size(); i++){
            // Compares if the new planets distance is closer than the current one;
            if ((planets.get(i).getDistance() < tempClosestDistance) || tempClosestDistance == 0){
                // Sets the new planet as the closest if true, or closest distance is equal to 0;
                tempClosestDistance = planets.get(i).getDistance();
                planet = planets.get(i);
            }
        }
        return planet;
    }



}
