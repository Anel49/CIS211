public class Plyometrics extends Anaerobic{
    /**
     * @return the muscles Plyometrics exercises affect
     */
    @Override public Muscle[] muscleTargeted(){
        return new Muscle[] {Muscle.Abs, Muscle.Legs, Muscle.Glutes};
    }
    /**
     * overrides calorieLoss using weight, duration, and the intensity values associated with Plyometrics 
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
                intensityDouble = 7.4;
                break;
            case MEDIUM:
                intensityDouble = 4.8;
                break;
            case LOW:
                intensityDouble = 2.5;
                break;
            default:
                intensityDouble = 0.0;
                break;
        }        
        return (intensityDouble * duration / 60) * weight;
    }
    /**
     * Fitness' description method overrode with a custom description for Plyometrics
     */
    @Override public String description(){
        return "Plyometrics";
    }
}
