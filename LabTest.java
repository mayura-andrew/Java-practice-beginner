import java.util.Scanner; //import Scanner Library

public class LabTest{
    public static void main(String[] args){
        
        //getting user input using Scanner
        
        Scanner userInput = new Scanner(System.in);
        
        //declaring variables
        
        int empID,
        String empName;
        int empSalary;
        int empHomeKM;
        int finalSal;
        int percentage = 78;
        int totalDictancefromOffice = 72;
        
        System.out.println('Enter Employee ID- ');
        empID = userInput.nextLine();
        
        System.out.prinln('Enter Employee Name- ');
        empName = userInput.nextLine();
        
        System.out.println('Enter Employee Salary- ');
        empSalary = userInput.nextLine();
        
        System.out.println('Enter Employee distance (Home to Office) - ');
        empHomeKM = userInput.nextLine();
        
        if (empHomeKM > totalDistancefromOffice){
            finalSal = empSalary + (empSalary * percentage);
        } else {
            finalSal = empSalary;
        }
        
        System.out.println("---Employee Final Salary --- ");
        System.out.println(empID + empName + "=" + finalSal);
        System.out.println("Thank You!");
        
        userInput.close();
        
    }
    
    
}
