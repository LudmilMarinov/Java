public class Demo {
    public static <person> void main(String[] args) {



    Object [] person = new Person[10];


        Person ivan = new Person("Ivan Ivanov", 21,true);
        Person petur=new Person("Petur Petrov", 28,true);
        Student todor=new Student("Todor Todorov",18,true,5.50);
        Student maria=new Student("Maria Mariikova", 20,false,6.00);
        Employee georgi=new Employee("Georgi Georgiev", 26,true,70,52,9);
        Employee nikolai=new Employee("Nikolai Nikolov",16,true,60,41,7.5);

        person[0]=ivan;
        person[1]=petur;
        person[2]=todor;
        person[3]=maria;
        person[4]=georgi;
        person[5]=nikolai;


        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Person){
                ((Person) person[i]).showPersonInfo();
            }
            if (person[i] instanceof Student) {
                ((Student) person[i]).showStudentInfo();
            }
            if (person[i] instanceof Employee) {
                ((Employee) person[i]).showEmployeeInfo();
            }

            }
        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Employee){
                ((Employee) person[i]).calculateOvertime();
            }

        }
        }
    }








