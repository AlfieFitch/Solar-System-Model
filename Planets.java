public class Planets{

    String name;
    double distance;
    double period;

    public Planets(String name, double distance){
        this.name = name;
        this.distance = distance;
        double periodUnrounded = Math.sqrt(distance*distance*distance)*1000/1000.0;
        period = Math.round(periodUnrounded*1000)/1000.0;
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

    public boolean equals(Planets planet) {
        if(planet.getName() == this.name && planet.getDistance() == this.distance){
            return true;
        }
        return false;
    } 

}