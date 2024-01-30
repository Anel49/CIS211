/**
 * the abstract class Aerobic implements the interface Fitness. Aerobic creates two abstract
 * methods and one normal method its children must implement
 */
abstract class Aerobic implements Fitness{
    abstract public Muscle[] muscleTargeted();
    abstract public double calorieLoss(Intensity intensity, double weight, int duration);
    /**
     * Fitness' description method overrode with a custom description for Aerobic
     */
    @Override public String description(){
        return "Aerobic means \"with oxygen.\"";
    }
}