public class Person {
    String name;
    int age;
    boolean isMan;


    Person (String name, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }



    public void showPersonInfo() {
        System.out.println("Person name is: " + this.name);
        System.out.println("Person age is: " + this.age);
       if (this.isMan){
           System.out.println("Person is: Male.");
       }else{
           System.out.println("Person is: Female.");
       }

    }
}
