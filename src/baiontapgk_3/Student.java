package baiontapgk_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person{
    protected float gpa;
    protected String major;

    public Student() {
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfor() {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        String formattedDate1 = sdf1.format(dateOfBirth);
        System.out.println("ID: " + id);
        System.out.println("Full name: " + fullName);
        System.out.println("Date Of birth: " + formattedDate1);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major + "\n");
        
    }
    
    
    public void addStudent(float gpa, String major, String id, String fullName, Date dateOfBirth){
        this.gpa = gpa;
        this.major = major;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.fullName = fullName;
            
    }
    public void updateStudent (String id){
        this.id = id;
                
    }
}
