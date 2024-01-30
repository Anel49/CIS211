public interface Fitness{
    /**
     * @return muscleTargeted() returns the targetted Muscle of the exercise
     * @return calorieLoss() returns the amount of calories the exercise burned
     * @return description() returns a short description or the name of the exercise
     */
    public Muscle[] muscleTargeted();
    public double calorieLoss(Intensity intensity, double weight, int duration);
    public String description();
}