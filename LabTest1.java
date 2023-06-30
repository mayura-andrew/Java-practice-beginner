import java.util.Scanner; 
public class LabTest1{
    public static void main(String[] args){
        
        
        Scanner userInput = new Scanner(System.in);
        
        
        int empID;
        String empName;
        int empSalary;
        int empHomeKM;
        int finalSal;
        
        System.out.println("Enter Employee ID= ");
        empID = userInput.nextInt();

        System.out.println("Enter Employee Name= ");
        userInput.nextLine();
        empName = userInput.nextLine();

        System.out.println("Enter Employee Salary= ");
        empSalary = userInput.nextInt();

        System.out.println("Enter Employee distance= ");
        empHomeKM = userInput.nextInt();
        userInput.nextLine();
        
        if (empHomeKM > 72){
            finalSal = empSalary + ((empSalary * 78) / 100);
        } else {
            finalSal = empSalary;
        }
        
        System.out.println("Employee ID- " + empID);
        System.out.println("Employee Name " + empName);
        System.out.println("Employee Final Salary " + finalSal);
        
        userInput.close();
        
    }
    
    
}