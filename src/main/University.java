package src.main;

import src.models.*;
class University {
    public static void main(String[] args) {
        System.out.println("University Management System Initialized");
        
        Address address = new Address("Cairo", "Cairo Governorate", "Egypt");
        Date birthDate = new Date(10, 5, 1985);
        Date enrolledYear = new Date(1, 9, 2023);
        Department csDepartment = new Department("Information Technology", 202);
        Course javaCourse = new Course("Software Engineering", "IT202");
        List<Course> courses = new ArrayList<>();
        courses.add(javaCourse);
        
        Student student = new Student("Ahmed Mohamed", 56789, "010-9876-5432", birthDate, address, enrolledYear, csDepartment, enrolledYear, courses);
        Instructor instructor = new Instructor("Dr. Ayman Hassan", 2001, "010-1234-5678", birthDate, address, csDepartment, courses);
        
        student.displayInfo();
        instructor.displayInfo();
    }
}