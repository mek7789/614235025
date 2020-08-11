public class Student {

    String studentId;
    String studentName;
    String faculty;
    String major;

    void enrollment() {

        System.out.println("student enrollment");
    }

    void payment() {

        System.out.println("student pament");
    }

    void addCourse() {

        System.out.println("student addCourse");
    }

    void dropCourse() {

        System.out.println("student dropCourse");
    }
public static void main (String[] args){
    System.out.println("Hello World");
    Student jatuporn = new Student();
    System.out.println("Object ="+jatuporn);
    jatuporn.enrollment();
    jatuporn.dropCourse();
    jatuporn.payment();
    
}
}//end class
