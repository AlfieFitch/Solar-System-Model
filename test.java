
public class test {
    public static void main(String[] args) {
        SolarSystem ourSystem = new SolarSystem("Our System");
        //SolarSystem trappist1 = new SolarSystem("Trappist 1", 0.00128);

        //Create the Trappist1 system - a much dimmer star with closer planets
        SolarSystem trappist1 = new SolarSystem("Trappist 1");

        //Add planets in our solar system - note deliberately out of order
        ourSystem.addPlanet("Earth", 1.0);
        ourSystem.addPlanet("Mars", 1.52);
        ourSystem.addPlanet("Neptune", 30.05);
        ourSystem.addPlanet("Jupiter", 5.20);
        ourSystem.addPlanet("Venus", 0.72);
        ourSystem.addPlanet("Saturn", 9.58);
        ourSystem.addPlanet("Mercury", 0.39);
        ourSystem.addPlanet("Uranus", 19.20);

        //Add planets in Trappist 1 system
        trappist1.addPlanet("Trappist1d", 0.02);
        trappist1.addPlanet("Trappist1e", 0.03);
        trappist1.addPlanet("Trappist1f", 0.04);
        trappist1.addPlanet("Trappist1g", 0.05);
        trappist1.addPlanet("Trappist1h", 0.06);
        trappist1.addPlanet("Trappist1b", 0.01);
        trappist1.addPlanet("Trappist1c", 0.02);

        /*Used to make sure that the equals method works properly...
        If we don't do this, then just checking equality using == works and
        it really shouldn't...
        */
        SolarSystem fakeSystem = new SolarSystem("Fake System");
        fakeSystem.addPlanet("Mercury", 0.39);
        fakeSystem.addPlanet("Neptune", 30.05);
        fakeSystem.addPlanet("Trappist1b", 0.01);
        fakeSystem.addPlanet("Trappist1h", 0.06);


        System.out.println(trappist1.furthest());
        System.out.println(fakeSystem.getPlanetByName("Trappist1h"));
        System.out.println(trappist1.furthest().equals(fakeSystem.getPlanetByName("Trappist1h")));

        System.out.println("here" + fakeSystem.getPlanetByName("Mercury"));
    }

}
