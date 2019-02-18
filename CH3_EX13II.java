//Class Employee
public class CH3_EX13II {
    private String FirstName;
    private String LastName;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    private double MonthlySalary;

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        MonthlySalary = monthlySalary;
    }

    public CH3_EX13II(){
        FirstName = null;
        LastName = null;
        MonthlySalary = 0.0;
    }
}

