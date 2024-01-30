import InfoPackage;

public class FacultyInfo{
    String Name;
    int ID;
    double Salary;

    /**
     * this constructor assigns the this Name, ID, and Salary from the parameters
     * @param Name faculty name
     * @param ID faculty ID
     * @param Salary faculty salary
     */
    public FacultyInfo (String[] args){
        this.Name = args[3];
        this.ID = args[4];
        this.Salary = args[5];
    }

    /**
     * 
     * @returns a string with the faculty's name, ID, and salary
     */
    public String fdisplay (){
        return ("Faculty Name: " + Name + ", ID: " + ID + ", Salary: " + Salary);
    }
}