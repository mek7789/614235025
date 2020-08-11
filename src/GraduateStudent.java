
public class GraduateStudent extends Student {

    String studyLevel;
    String thesisAdviser;

    void studyLevel() {
        System.out.println("GraduateStudent studyLevel");
    }

    void thesisAdviser() {
        System.out.println("GraduateStudent thesisAdviser");
    }

    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.studyLevel();
        gs.thesisAdviser();
        gs.enrollment();
        gs.dropCourse();
        gs.payment();
        gs.addCourse();

    }

}
