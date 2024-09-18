package baiontapgk_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher extends Person {

    protected String department;
    protected String teachingSubject;

    public Teacher() {
    }

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void addTeacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.teachingSubject = teachingSubject;

    }

    public void updateTeacher(String id) {
        this.id = id;
    }

    @Override
    public void displayInfor() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(dateOfBirth);
        System.out.println("ID: " + id);
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + formattedDate);
        System.out.println("Department: " + department);
        System.out.println("Teaching subject: " + teachingSubject + "\n");
    }

}
