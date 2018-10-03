package com.company;

public class CourseTest {
    public static void main(String[] args) {

//        Course course = new Course("javer");
//        String andy = "andy";
//        course.addStudent(andy);
//        System.out.println(course.getName());
//        System.out.println(course.getStudents());
//        System.out.println(course.getStudentsCount());

//        Course course = new Course("javer");
//        displayCourse(course);
//        String andy = "andy";
//        course.addStudent(andy);
//        displayCourse(course);
//        String booby = "booby";
//        course.addStudent(booby);
//        displayCourse(course);
//        String samy = "samy";
//        course.addStudent(samy);
//        displayCourse(course);

        Course course = new Course("javer");
        displayCourse(course);
        String andy = "andy";
        course.addStudent(andy);
        displayCourse(course);
        String booby = "booby";
        course.addStudent(booby);
        displayCourse(course);
        course.removeStudent(andy);
        displayCourse(course);
        String samy = "samy";
        course.removeStudent(andy);
        displayCourse(course);
    }

    public static void displayCourse(Course course) {
        System.out.println("Course \"" + course.getName()
                + "\" has " + course.getStudentsCount()
                + " student(s): {");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getStudentsCount(); i++) {
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }
}
