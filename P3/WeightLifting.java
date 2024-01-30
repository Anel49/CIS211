public class WeightLifting extends Anaerobic{
    /**
     * @return the muscles WeightLifting exercises affect
     */
    @Override public Muscle[] muscleTargeted(){
        return new Muscle[] {Muscle.Shoulders, Muscle.Legs, Muscle.Arms, Muscle.Triceps};
    }
    /**
     * overrides calorieLoss using weight, duration, and the intensity values associated with WeightLifting 
     * exercises
     * @param intensity intensity of the workout
     * @param weight weight of the user
     * @param duration duration of the workout in minutes
     * @return the calorie loss of the exercise
     */
    @Override public double calorieLoss(Intensity intensity, double weight, int duration){
        double intensityDouble;
        switch (intensity){
            case HIGH:
                intensityDouble = 6.0;
                break;
            case MEDIUM:
                intensityDouble = 5.0;
                break;
            case LOW:
                intensityDouble = 3.5;
                break;
            default:
                intensityDouble = 0.0;
                break;
        }        
        return (intensityDouble * duration / 60) * weight;
    }
    /**
     * Fitness' description method overrode with a custom description for WeightLifting
     */
    @Override public String description(){
        return "WeightLifting";
    }
}
