package src.models;

import java.util.List;

public class Student extends Person {
    private int studentId;
    private Date enrolledYear;
    private Department department;
    private Date semesterEnrolled;
    private List<Course> registeredCourses;

    public Student(String name, int studentId, String telephoneNumber, Date dateOfBirth, Address address, Date enrolledYear, Department department, Date semesterEnrolled, List<Course> registeredCourses) {
        super(name, dateOfBirth, telephoneNumber, address);
        this.studentId = studentId;
        this.enrolledYear = enrolledYear;
        this.department = department;
        this.semesterEnrolled = semesterEnrolled;
        this.registeredCourses = registeredCourses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Date getEnrolledYear() {
        return enrolledYear;
    }

    public void setEnrolledYear(Date enrolledYear) {
        this.enrolledYear = enrolledYear;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getSemesterEnrolled() {
        return semesterEnrolled;
    }

    public void setSemesterEnrolled(Date semesterEnrolled) {
        this.semesterEnrolled = semesterEnrolled;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Enrolled Year: " + enrolledYear);
        System.out.println("Department: " + department.getName());
        System.out.println("Semester Enrolled: " + semesterEnrolled);
        System.out.println("Registered Courses: " + registeredCourses);
    }
}