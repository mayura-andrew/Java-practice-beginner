class Employee {
    private String name;
    private int age;
    private boolean married;

    private double salary;
    private String department;

// Constructor 
    Employee(String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }

// methods  / getters and setters

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean isMarried(){
        return married;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double newSalary){
        salary = newSalary;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String newDepartment){
        department = newDepartment;
    }

    public void doWork(String workToPerform){
        System.out.println("I am doing : " + workToPerform);
    }
}



class Company {
    public static void main(String[] args){
        //Employee emp1 = new Employee("Nipun", 35, true);
        TemporaryEmployee emp2 = new TemporaryEmployee("Shani", 25, false, "2012-12-31");
    
        PermanentEmployee emp1 = new PermanentEmployee("Nipun", 35, true, 20, 10);
        // interacting with new Employee emp1
        System.out.println(emp1.getName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.isMarried());

        //emp1.doWork("Software Engineer");
        System.out.println(emp1.getAnnualLeaves());
        emp1.setSalary(75000.00);
        emp1.setYearlyBonus(50000.00);
        System.out.println("Rs. "+ emp1.getYearlyBonus());
        System.out.println(emp1.getSalary());


        //interacting with new Employee emp2
        System.out.println(emp2.getName());
        System.out.println(emp2.getAge());
        System.out.println(emp2.isMarried());

      //  emp2.doWork("QA Engineer");
        emp2.setSalary(25000.00);
        System.out.println(emp2.getSalary());
    }
}



class PermanentEmployee extends Employee{
    private double yearlyBonus;
    private int annualLeaves;
    private int sickLeaves;

    PermanentEmployee(String name, int age, boolean married, int annualLeaves,int sickLeave){
        super(name, age, married);
        this.annualLeaves = annualLeaves;
        this.sickLeaves = sickLeaves;
    }

    public double getYearlyBonus(){
        return yearlyBonus;
    }

    public void setYearlyBonus(double allocatedYearBonus){
        yearlyBonus = allocatedYearBonus;
    }

    public int getAnnualLeaves(){
        return annualLeaves;
    }

    public int getSickLeaves(){
        return annualLeaves;
    }
    //public void setSickLeaves(int allocatedSickLeaveDays){
      //  return annualLeaves + allocatedSickLeaveDays;
   // }
    //overrding the supper class method-polymorphism
    public double getSalary(){
        return super.getSalary()-(super.getSalary()*0.10);
    }
}

class TemporaryEmployee extends Employee {
    private String endOfAppointment;

    TemporaryEmployee(String name, int age, boolean married, String dateEndOfAppointment){
        super(name, age, married);
        endOfAppointment = dateEndOfAppointment;
    }

    public String getEndOfAppointment(){
        return endOfAppointment;
    }

    public void setEndOfAppointment(String dateEndOfAppointment){
        endOfAppointment = dateEndOfAppointment;
    }
    
    //overring the super class method-polymorphism
    public double getSalary(){
        return super.getSalary()+1000.00;
    }
}
