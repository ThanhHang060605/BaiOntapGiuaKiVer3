package baiontapgk_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) throws ParseException {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("*******Choice an option********");
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Update person");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Display all students and teachers");
            System.out.println("7. Find the student with the highest GPA");
            System.out.println("8. Find a teacher by department");
            System.out.println("9. Exit");
            System.out.println("--------------Choice number----------");
            

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter full name: ");
                    String fullName = sc.nextLine();

                    System.out.print("Enter date of birth(dd/MM/yyyy): ");
                    String date = sc.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateOfBirth = sdf.parse(date);

                    System.out.print("Enter GPA: ");
                    float gpa = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("Enter major: ");
                    String major = sc.nextLine();
             
                    personList.addStudent(new Student(gpa, major, id, fullName, dateOfBirth));
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String ID = sc.nextLine();
                    System.out.print("Enter full name: ");
                    String fullName2 = sc.nextLine();

                    System.out.print("Enter date of birth(dd/MM/yyyy): ");
                    String dob = sc.nextLine();
                    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateOfBirth2 = sdf2.parse(dob);

                    System.out.print("Enter department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter teachingSubject: ");
                    String teachingSubject = sc.nextLine();

                    personList.addTeacher(new Teacher(ID, fullName2, dateOfBirth2, department, teachingSubject));
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String iD = sc.nextLine();
                    Person personToUpdate = personList.findPersonByID(iD);
                    if (personToUpdate != null) {
                        System.out.println("ID: " + iD);
                        System.out.print("Enter new full name: ");
                        String newName = sc.nextLine();
                        personToUpdate.setFullName(newName);

                        System.out.print("Date of birth(dd/MM/yyyy): ");
                        String date3 = sc.nextLine();
                        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                        Date newDate = sd.parse(date3);

                        System.out.println("Person updated suscessful ");
                        System.out.println();
                    } else {
                        System.out.println("Person not found");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Enter id to delete: ");
                    String deleteID = sc.nextLine();
                    personList.deletePerSonByID(deleteID);
                    System.out.println("Person deleted suscessfully");
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    String findID = sc.nextLine();
                    Person findPerson = personList.findPersonByID(findID);
                    if (findPerson != null) {
                        System.out.println("Person find\n ");
                        findPerson.displayInfor();
                    } else {
                        System.out.println("Person not found \n");
                    }
                
                    break;
                case 6:
                    System.out.println("Display all students and teachers");
                    System.out.println();
                    personList.displayEveryone();
                    break;
                case 7:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with the highest GPA");
                        topStudent.displayInfor();
                    } else {
                        System.out.println("No student in list");

                    }
                    break;
                case 8:
                    System.out.print("Enter depatrment: ");
                    String departmentName = sc.nextLine();
                    Teacher findTeacher = personList.findTeacherByDepartment(departmentName);
                    if (findTeacher != null) {
                        System.out.println("Teacher found in department: " + departmentName);
                        findTeacher.displayInfor();
                    } else {
                        System.out.println("No teacher found in the department!\n");
                    }
                    break;

                case 9:
                    exit = true;
                    System.out.println("The end!!!");

                default:
                    System.out.println("Invalid choice. Again please");
                    System.out.println();
                    break;

            }
     
        }
        sc.close();
    }

}
