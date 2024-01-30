/**
 * the abstract class Anaerobic implements the interface Fitness. Anaerobic creates two abstract
 * methods and one normal method its children must implement
 */
abstract class Anaerobic implements Fitness{
    abstract public Muscle[] muscleTargeted();
    abstract public double calorieLoss(Intensity intensity, double weight, int duration);
    /**
     * Fitness' description method overrode with a custom description for Anaerobic
     */
    @Override public String description(){
        return "Anaerobic means \"without oxygen.\"";
    }
}