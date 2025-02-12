package src.models;

import java.util.List;

public class Instructor extends Person {
    private Department department;
    private int id;
    private List<Course> responsibleCourses;

    public Instructor(String name, int id, String telephoneNumber, Date dateOfBirth, Address address, Department department, List<Course> responsibleCourses) {
        super(name, dateOfBirth, telephoneNumber, address);
        this.id = id;
        this.department = department;
        this.responsibleCourses = responsibleCourses;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Course> getResponsibleCourses() {
        return responsibleCourses;
    }

    public void setResponsibleCourses(List<Course> responsibleCourses) {
        this.responsibleCourses = responsibleCourses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Instructor: " + name);
        System.out.println("Instructor ID: " + id);
        System.out.println("Department: " + department.getName());
        System.out.println("Responsible Courses: " + responsibleCourses);
    }
}