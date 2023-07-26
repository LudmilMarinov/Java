
public class Employee extends Person{

    double daySalary;
    int workHours;
    double hourlySalary;
    double overtime;
    Employee (String name, int age, boolean isMan, double daySalary, int workHours, double hourlySalary){
        super(name, age, isMan);
        this.name=name;
        this.age=age;
        this.isMan=isMan;
        this.daySalary=daySalary;
        this.workHours=workHours;
        this.hourlySalary=hourlySalary;
    }
    public void calculateOvertime(){
        if(this.age>=18 && this.workHours>40){
                    overtime=hourlySalary*1.5;
            System.out.println("Employee has worked overtime, and payment for the extra hours is: " + this.overtime+" for every extra hour past 40.");
        }else {
            System.out.println("Person is no 18 years old, so day salary is 0");
        }


        }
   public  void showEmployeeInfo(){
       System.out.println("Employee name is: " + this.name);
       System.out.println("Employee age is: "+ this.age);
       if (this.isMan){
           System.out.println("Employee is: Male.");
       }else{
           System.out.println("Employee is: Female.");
       }
       System.out.println("Employee pay is: "+daySalary);
    }
}
