public class WeeklyExercise{
    /**
     * declares global variables
     */
    Fitness[] exerciseList;
    int days = 7;
    double weeklyCalorieTarget = 3500;
    Profile profile;
    /**
     * constructor sets global variables to params <exerciseList
     * and profile
     * @param exerciseList Fitness array set to obj's exerciseList
     * @param profile Profile set to obj's profile
     */
    public WeeklyExercise(Fitness[] exerciseList, Profile profile){
        this.exerciseList = exerciseList;
        this.profile = profile;
    }
    /**
     * constructor sets global variables to params exerciseList, days,
     * weeklyCalorieTarget, and profile
     * @param exerciseList Fitness array set to obj's exerciseList
     * @param days num of days to work out per week
     * @param weeklyCalorieTarget calorie target to lose each week
     * @param profile Profile set to obj's profile
     */
    public WeeklyExercise(Fitness[] exerciseList, int days, double weeklyCalorieTarget, Profile profile){
        this.exerciseList = exerciseList;
        this.days = days;
        this.weeklyCalorieTarget = weeklyCalorieTarget;
        this.profile = profile;
    }
    /**
     * creates an empty array of one more index than the obj's exerciseList
     * iterates through tempList, assigning tempList[i] to exerciseList[i]
     * uses exerciseList's length as the final spot in tempList and assigns
     * that index to ex
     * last line overwrites exerciseList with tempList
     * @param ex Fitness variable to be added to exerciseList
     */
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
     * sets obj's days to param days
     * @param days num of workout days per week
     */
    public void setDays(int days){
        this.days = days;
    }
    /**
     * sets obj's weeklyCalorieTarget to param target
     * @param target weekly calorie target
     */
    public void setWeeklyCalorieTarget(double target){
        weeklyCalorieTarget = target;
    }
    /**
     * sets obj's profile to param profile
     * @param profile user profile that contains age,
     * height, weight, and gender
     */
    public void setProfile(Profile profile){
        this.profile = profile;
    }
    /**
     * 
     * @return current obj's exerciseList
     */
    public Fitness[] getExerciseList(){
        return exerciseList;
    }
    /**
     * 
     * @return length of the obj's exerciseList
     */
    public int getSize(){
        return exerciseList.length;
    }
    /**
     * 
     * @return current obj's days
     */
    public int getDays(){
        return days;
    }
    /**
     * 
     * @return current obj's profile
     */
    public Profile getProfile(){
        return profile;
    }
    /**
     * 
     * @return current obj's weeklyCalorieTarget
     */
    public double getWeeklyCalorieTarget(){
        return weeklyCalorieTarget;
    }
    /**
     * was supposed to return a DailyExercise array
     */
    //TODO 
    public DailyExercise[] getWeeklyExercises(){
        return new DailyExercise[] {};
    }
    /**
     * was supposed to return a DailyExercise array
     */
    //TODO 
    public DailyExercise[] getWeeklyExercises(Intensity intensity){
        return new DailyExercise[] {};
    }
    /**
     * was supposed to return a String informing the user about the necessary
     * exercise needed to achieve their goal weight
     */
    //TODO 
    public String targetedCalorieLoss(double targetWeight, int withInDays){
        if (targetWeight > profile.weight){
            return "Only works to lose weight.";
        }
        //TODO 
        else{
            return "You need to lose ";
        }
    }
}