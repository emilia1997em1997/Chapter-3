import java.util.Scanner;

//EmployeeTest
public class CH3_EX13 {
    public static void main(String[] args) {

        CH3_EX13II Employee1 = new CH3_EX13II();
        CH3_EX13II Employee2 = new CH3_EX13II();

        Scanner input = new Scanner(System.in);

        String FirstName;
        String LastName;
        double MonthlySalary;

        System.out.print("Enter name Employee1: ");
        FirstName = input.nextLine();
        Employee1.setFirstName(FirstName);

        System.out.println("Enter last name Employee1: ");
        LastName = input.nextLine();
        Employee1.setLastName(LastName);

        System.out.println( "Enter monthly salary of Employee1: " );
        MonthlySalary = input.nextDouble();
        Employee1.setMonthlySalary(MonthlySalary);

        System.out.print("Enter name Employee2: ");
        FirstName = input.nextLine();
        Employee2.setFirstName(FirstName);

        System.out.println("Enter last name Employee2: ");
        LastName = input.nextLine();
        Employee2.setLastName(LastName);

        System.out.println( "Enter monthly salary of Employee2: " );
        MonthlySalary = input.nextDouble();
        Employee2.setMonthlySalary(MonthlySalary);

        System.out.println("First Employee's Full Name and yearly salary.\n");
        System.out.println( Employee1.getFirstName() + " " + Employee1.getLastName() + "  " + Employee1.getMonthlySalary() * 12 + "\n" );

        System.out.println("Second Employee's Full Name and Yearly Salary.\n");
        System.out.println( Employee2.getFirstName() + " " + Employee2.getLastName() + "  " + Employee2.getMonthlySalary() * 12 + "\n" );

        System.out.println("Displaying New Total Annual Salary After 10% Raise.\n");
        System.out.println( Employee1.getFirstName() + " " + Employee1.getLastName() + "  " + (Employee1.getMonthlySalary() * 1.10 * 12 + "\n"));
        System.out.println( Employee2.getFirstName() + " " + Employee2.getLastName() + "  " + (Employee2.getMonthlySalary() * 1.10 * 12 + "\n"));
    }
}




