// The planets class creates each specfic planet depending on the parameters.

public class Planets{

    //Variable Initialisation:

    private String name;
    private double distance;
    private double period;
    private double gravity = 0;
    private double mass;
    private double luminosityFactor;
    // used in the rouding formula as the bound;
    private static final double ROUNDING_VARIABLE = 1000.0;
    private static final double DISTANCE_MIN = 0.75;
    private static final double DISTANCE_MAX = 2.0;
    private static final double MASS_MIN = 0.6;
    private static final double MASS_MAX = 7.0;

    
    // Constructor used for levels 1 and 2 where other parameters are not used;
    public Planets(String name, double distance){
        this.name = name;
        this.distance = distance;
        double periodUnrounded = Math.sqrt(distance*distance*distance)*ROUNDING_VARIABLE/ROUNDING_VARIABLE;
        period = Math.round(periodUnrounded*ROUNDING_VARIABLE)/ROUNDING_VARIABLE;
    }


    // Constructor used for level 3 where additional parameters are used.
    public Planets(String name, double mass, double radius, double distance, double starLuminosity){
        this.name = name;
        this.mass = mass;
        this.distance = distance;
        this.gravity = Math.round((mass/(radius*radius))*ROUNDING_VARIABLE)/ROUNDING_VARIABLE;
        this.luminosityFactor = Math.sqrt(starLuminosity);
        double periodUnrounded = Math.sqrt(distance*distance*distance)*ROUNDING_VARIABLE/ROUNDING_VARIABLE;
        period = Math.round(periodUnrounded*ROUNDING_VARIABLE)/ROUNDING_VARIABLE;
    }

    // Methods below return the private variable to allow the data to be retrieved.

    public String getName(){
        return name;
    }

    public double getDistance(){
        return distance;
    }

    public double getMass(){
        return mass;
    }

    public double getPeriod(){
        return period;
    }

    public double getGravity(){
        return gravity;
    }


    // Calculates if the planet is habitable, returning yes if it is and no if not.
    public String getHabitable(){
        if (((DISTANCE_MIN * luminosityFactor) <= distance
        && distance <= (DISTANCE_MAX * luminosityFactor)) && ((MASS_MIN <= mass) && (mass <= MASS_MAX))){
            return "yes";
        }
        return "no";
    }

    // Checks to see if the planet in the passed parameter is equal to the current planet,
    // depending on the name and distance of the planets.
    public boolean equals(Planets planet) {
        if (planet.getName() == this.name && planet.getDistance() == this.distance){
            return true;
        }
        return false;
    } 

}
