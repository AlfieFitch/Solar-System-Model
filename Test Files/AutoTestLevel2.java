

/*This is the automatic test class for CS-110 coursework 2. The output of the student's program
 * under test should match the string TARGET_OUTPUT_SUN and TARGET_OUTPUT_TRAPPIST1
 */
public class AutoTestLevel2 {

    public static void main(String[] args) {

        //Create our solar system
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

        /*Create the Level 2 tests - booleans check the various conditions:
        1. Is the closest planet to our Sun Mercury?
        2. Is the furthest planet from our Sun Neptune?
        3. & 4. - similarly for Trappist 1 are they 1b and 1h?
        */
        boolean solarSystemClosestCorrect
                = ourSystem.closest().equals(fakeSystem.getPlanetByName("Mercury"));
        boolean solarSystemFurthestCorrect
                = ourSystem.furthest().equals(fakeSystem.getPlanetByName("Neptune"));

        boolean trappist1ClosestCorrect
                = trappist1.closest().equals(fakeSystem.getPlanetByName("Trappist1b"));
        boolean trappist1FurthestCorrect
                = trappist1.furthest().equals(fakeSystem.getPlanetByName("Trappist1h"));

        //Check the output for our solar system
        if (solarSystemClosestCorrect && solarSystemFurthestCorrect) {
            System.out.println("Solar System Level 2: Pass!");
        } else {
            System.out.println("Solar System Level 2: FAILED");
            System.out.println("Actual Closest: Mercury");
            System.out.println("You said: " + ourSystem.closest().getName());
            System.out.println("Actual Closest: Neptune");
            System.out.println("You said: " + ourSystem.furthest().getName());
        }


        //Check the output for trappist1
        if (trappist1ClosestCorrect && trappist1FurthestCorrect) {
            System.out.println("Trappist1 Level 2: Pass!");
        } else {
            System.out.println("Trappist1 Level 2: FAILED");
            System.out.println("Actual Closest: Trappist1b");
            System.out.println("You said: " + trappist1.closest().getName());
            System.out.println("Actual Closest: Trappist1h");
            System.out.println("You said: " + trappist1.furthest().getName());
        }
    }
}
