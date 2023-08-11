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
        Employee emp1 = new Employee("Nipun", 35, true);
        Employee emp2 = new Employee("Shani", 25, false);

        // interacting with new Employee emp1
        System.out.println(emp1.getName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.isMarried());

        emp1.doWork("Software Engineer");


        //interacting with new Employee emp2
        System.out.println(emp2.getName());
        System.out.println(emp2.getAge());
        System.out.println(emp2.isMarried());

        emp2.doWork("QA Engineer");
    }
}
