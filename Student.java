public class Student {
    String name;
    String program;
    int semester;
    Course[] courses; 

   
    public Student(String name, String program, int semester, Course[] courses) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
    }

  
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course course : courses) {
            System.out.println("- " + course.courseName);
        }
    }

    public void displayLowMarksCourses() {
        System.out.println("\nCourses with marks less than 40:");
        for (Course course : courses) {
            if (course.marks < 40) {
                System.out.println(course.courseName + " : " + course.marks + " Marks");
            }
        }
    }
}