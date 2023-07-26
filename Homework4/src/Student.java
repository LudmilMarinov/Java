public class Student {
    String name;
    String subject;
    int grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    int money;

    Student() {
        this.grade = 4;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }

    Student(int age, String subject, String name) {
        this();
        this.age = age;
        this.subject = subject;
        this.name = name;
    }

    void yearUP() {
        while (yearInCollege <= 4) {
            yearInCollege++;
        }
        if (yearInCollege > 4) {
            isDegree = true;
        }
        System.out.println(isDegree);
    }

    double receiveScholarship(double min, double amount) {
        if (this.age < 30 && this.grade > min) {
     amount=this.money;

        } return this.money;
    }

    }
