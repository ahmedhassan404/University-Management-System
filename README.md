# University Management System

This is a simple University Management System implemented in Java. The system allows managing students, instructors, departments, courses, and classrooms.

## Features

- **Student Management**: Add and display student information.
- **Instructor Management**: Add and display instructor information.
- **Department Management**: Manage departments within the university.
- **Course Management**: Manage courses offered by the university.
- **Classroom Management**: Manage classrooms and their capacities.

## Classes

- **Person**: Abstract class representing a person with basic information like name, date of birth, address, and telephone number.
- **Student**: Extends `Person` and represents a student with additional information like student ID, enrolled year, department, and registered courses.
- **Instructor**: Extends `Person` and represents an instructor with additional information like instructor ID, department, and responsible courses.
- **Department**: Represents a department within the university.
- **Course**: Represents a course offered by the university.
- **Classroom**: Represents a classroom with information like ID, location, and capacity.
- **Address**: Represents an address with city, state, and country.
- **Date**: Represents a date with day, month, and year.

## Usage

1. Clone the repository.
2. Compile the Java files.
3. Run the `University` class to initialize the system.

## Example

```java
public class University {
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
