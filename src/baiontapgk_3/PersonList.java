package baiontapgk_3;

import java.util.ArrayList;

public class PersonList {
    
    public ArrayList<Person> personList;
    
    public PersonList() {
        this.personList = new ArrayList<>();
    }
    
    public PersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Student addStudent(Student student) {
        personList.add(student);
        return student;
    }
    
    public Teacher addTeacher(Teacher teacher) {
        personList.add(teacher);
        return teacher;
    }
    
    public void updatePerson(String id, Person updatePerson) {
        for (Person person : personList) {
            if (personList.get(0).getId().equals(id)) {
                personList.set(0, updatePerson);
                break;
            }
            
        }
    }
    
    public void deletePerSonByID(String id) {
        personList.removeIf(person -> person.getId().equals(id));
    }
    
    public Person findPersonByID(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
    
    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfor();
        }
    }
    
    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
            
        }
        return topStudent;
    }
    
    public Teacher findTeacherByDepartment(String department) {
        Teacher findTeacher = null;
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                    
                }
            }
            
        }
        return null;
    }
    
}
