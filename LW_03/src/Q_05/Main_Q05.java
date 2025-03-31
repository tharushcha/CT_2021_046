package Q_05;

public class Main_Q05 {
    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer("Dr.Kesavan", "Object Oriented Programming");

        Course course = new Course("Object Oriented Programming", "CTEC 22043", lecturer);

        Student student = new Student("Tharushika W.P.C", "BICT", course.getCourseName());

        System.out.println("Course Details: ");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());

        System.out.println("\n");

        System.out.println("Student Details: ");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree: " + student.getDegreeName());
        System.out.println("Following Course: " + student.getCourseFollowing());
    }
}

