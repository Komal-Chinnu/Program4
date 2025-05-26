public class Main {
    public static void main(String[] args) {
        
        Course c1 = new Course("OS", 65);
        Course c2 = new Course("DBMS", 75);
        Course c3 = new Course("Java", 32);
        Course c4 = new Course("Computer Networking", 85);

      
        Course[] courses = {c1, c2, c3, c4};

        
        Student student = new Student("Komal", "BCA", 3, courses);

      
        student.displayStudentInfo();

        student.displayLowMarksCourses();
    }
}