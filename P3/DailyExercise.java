public class DailyExercise extends Profile{
    /**
     * declares global variables
     */
    Fitness[] exerciseList;
    int duration;
    double calorieTarget;
    Profile profile;
    /**
     * constructor sets global variables to params <exerciseList
     * and profile> and <duration and calorieTarget to 60 and 500>
     * @param exerciseList Fitness array set to obj's exerciseList
     * @param profile Profile set to obj's profile
     */
    public DailyExercise(Fitness[] exerciseList, Profile profile){
        this.exerciseList = exerciseList;
        duration = 60;
        calorieTarget = 500;
        this.profile = profile;
    }
    /**
     * constructor sets all global variables to respectful params
     * @param exerciseList Fitness array set to obj's exerciseList
     * @param duration duration of workout in minutes
     * @param calorieTarget calories desired to burn
     * @param profile Profile set to obj's profile
     */
    public DailyExercise(Fitness[] exerciseList, int duration, double calorieTarget, Profile profile){
        this.exerciseList = exerciseList;
        this.duration = duration;
        this.calorieTarget = calorieTarget;
        this.profile = profile;
    }
    /**
     * 
     * @returns length of the obj's exerciseList
     */
    public int getSize(){
        return exerciseList.length;
    }
    /**
     * method that attempted to add the variable ex to the current exerciseList
     * @param ex Fitness variable to be removed from exerciseList
     */
    //TODO 
    public void addExercise(Fitness ex){
        Fitness[] tempList = new Fitness[exerciseList.length + 1];
        for (int i = 0; i < exerciseList.length; i++){
            tempList[i] = exerciseList[i];
         }
         tempList[exerciseList.length] = ex;
         exerciseList = tempList;
    }
    /**
     * creates an empty array of one less index than the obj's exerciseList
     * iterates through tempList, checking if exerciseList[i] == ex
     * if it equals, makes tempList[i] == exerciseList[i + 1], thus skipping
     * ex's value
     * if it does not equal, checks if ex does not equal tempList[i]
     * if true, sets tempList[i] to exerciseList[i + 1]
     * last line overwrites exerciseList with tempList
     * 
     * I realize now that some of the code written in this method may be obsolete,
     * but my brain is fried after my calc test, so as long as it works, I'm good
     * 
     * @param ex Fitness variable to be removed from exerciseList
     */
    public void removeExercise(Fitness ex){   
        Fitness[] tempList = new Fitness[exerciseList.length - 1];
        for (int i = 0; i < tempList.length; i++){
            if (ex == exerciseList[i]){
                tempList[i] = exerciseList[i + 1];
            }          
            else if (ex != tempList[i]){
                tempList[i] = exerciseList[i + 1];
            }
        }
        exerciseList = tempList;
    }
    /**
     * sets obj's exerciseList to param list
     * @param list Fitness array
     */
    public void setExerciseList(Fitness[] list){
        exerciseList = list;
    }
    /**
     * sets obj's duration to param duration
     * @param duration workout duration in minutes
     */
    public void setDuration(int duration){
        this.duration = duration;
    }
    /**
     * sets obj's calorieTarget to param target
     * @param target daily calorie target
     */
    public void setCalorieTarget(double target){
        calorieTarget = target;
    }
    /**
     * sets obj's profile to param profile
     * @param profile profile being set to the current obj's profile variable
     */
    public void setProfile(Profile profile){
        this.profile = profile;
    }
    /**
     * 
     * @returns current obj's exerciseList
     */
    public Fitness[] getExerciseList(){
        return exerciseList;
    }
    /**
     * 
     * @returns current obj's duration
     */
    public int getDuration(){
        return duration;
    }
    /**
     * 
     * @returns current obj's calorieTarget
     */
    public double getCalorieTarget(){
        return calorieTarget;
    }
    /**
     * 
     * @returns current obj's profile
     */
    public Profile getProfile(){
        return profile;
    }
    /**
     * method that (hardly) attempted to return a Fitness array with
     * exercises that worked out the param targetMuscle
     * 
     * @param targetMuscle muscle(s) being targetted by the user
     * @returns Fitness array that contains all the exercises that work out the targetMuscle
     */
    //TODO 
    public Fitness[] getExercises(Muscle[] targetMuscle){
        
        return new Fitness[] {};
        
        /*for (int i = 0; i < exerciseList.length; i++){
            if (exerciseList[i] == targetMuscle){
                
            }
        }*/
    }
}