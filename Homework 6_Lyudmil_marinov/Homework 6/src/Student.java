import javax.swing.text.html.parser.TagElement;

public class Student extends Person{
    double score;

    Student(String name, int age, boolean isMan, double score){
       super(name,age,isMan);
              this.name=name;
        this.age= age;
        this.isMan=isMan;
        this.score=score;
    }

    public void showStudentInfo(){
        System.out.println("Student name is: "+this.name);
        System.out.println("Student age is: "+this.age);
        if (this.isMan){
            System.out.println("Student is male.");
        }else{
            System.out.println("Student is female.");
        }
        System.out.println("Student score is: "+this.score);
    }
}
