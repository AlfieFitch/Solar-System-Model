

/*This is the automatic test class for CS-110 coursework 2 Level 1
 */
public class AutoTestLevel1 {

    //Level 1 Test Strings - this is the expected output
    static final String TARGET_OUTPUT_SUN = "Star Our System has planets:\n"
            + "Mercury  is 0.39AU from its star, and orbits in 0.244 years\n"
            + "Venus  is 0.72AU from its star, and orbits in 0.611 years\n"
            + "Earth  is 1.0AU from its star, and orbits in 1.0 years\n"
            + "Mars  is 1.52AU from its star, and orbits in 1.874 years\n"
            + "Jupiter  is 5.2AU from its star, and orbits in 11.858 years\n"
            + "Saturn  is 9.58AU from its star, and orbits in 29.652 years\n"
            + "Uranus  is 19.2AU from its star, and orbits in 84.13 years\n"
            + "Neptune  is 30.05AU from its star, and orbits in 164.728 years\n";

    static final String TARGET_OUTPUT_TRAPPIST1 = "Star Trappist 1 has planets:\n"
            + "Trappist1b  is 0.01AU from its star, and orbits in 0.001 years\n"
            + "Trappist1c  is 0.02AU from its star, and orbits in 0.003 years\n"
            + "Trappist1d  is 0.02AU from its star, and orbits in 0.003 years\n"
            + "Trappist1e  is 0.03AU from its star, and orbits in 0.005 years\n"
            + "Trappist1f  is 0.04AU from its star, and orbits in 0.008 years\n"
            + "Trappist1g  is 0.05AU from its star, and orbits in 0.011 years\n"
            + "Trappist1h  is 0.06AU from its star, and orbits in 0.015 years\n";

    public static void main(String[] args) {

        //Create our solar system
        SolarSystem ourSystem = new SolarSystem("Our System");
        //SolarSystem trappist1 = new SolarSystem("Trappist 1", 0.00128);

        //Create the Trappist1 system - a much dimmer star with closer planets
        SolarSystem trappist1 = new SolarSystem("Trappist 1");

        //Add planets in our solar system 
        ourSystem.addPlanet("Mercury", 0.39);
        ourSystem.addPlanet("Venus", 0.72);
        ourSystem.addPlanet("Earth", 1.0);
        ourSystem.addPlanet("Mars", 1.52);
        ourSystem.addPlanet("Jupiter", 5.20);
        ourSystem.addPlanet("Saturn", 9.58);
        ourSystem.addPlanet("Uranus", 19.20);
        ourSystem.addPlanet("Neptune", 30.05);

        //Add planets in Trappist 1 system
        trappist1.addPlanet("Trappist1b", 0.01);
        trappist1.addPlanet("Trappist1c", 0.02);
        trappist1.addPlanet("Trappist1d", 0.02);
        trappist1.addPlanet("Trappist1e", 0.03);
        trappist1.addPlanet("Trappist1f", 0.04);
        trappist1.addPlanet("Trappist1g", 0.05);
        trappist1.addPlanet("Trappist1h", 0.06);

        //Check the output for our solar system
        if (ourSystem.toString().equals(TARGET_OUTPUT_SUN)) {
            System.out.println("Solar System Level 1: Pass!");
        } else {
            System.out.println("Solar System Level 1: FAILED\n*****");
            System.out.println("Expected output:");
            System.out.println(TARGET_OUTPUT_SUN);
            System.out.println("\nActual output:");
            System.out.println(ourSystem.toString());
        }

        //Check the output for trappist1
        if (trappist1.toString().equals(TARGET_OUTPUT_TRAPPIST1)) {
            System.out.println("Trappist1 Level 1: Pass!");
        } else {
            System.out.println("Trappist1 Level 1: FAILED\n*****");
            System.out.println("Expected output:");
            System.out.println(TARGET_OUTPUT_TRAPPIST1);
            System.out.println("\nActual output:");
            System.out.println(trappist1.toString());
        }

    }
}
