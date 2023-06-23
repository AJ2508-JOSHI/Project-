 package JAVA;

import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.util.ElementScanner14;
import javax.print.Doc;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

class Doctor {

    String Name;
    String department;
    int phoneNumber;

    public Doctor(String name, String Department, int phone) {
        this.Name = name;
        this.department = Department;
        this.phoneNumber = phone;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return department;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {

        return Name + " " + department + " " + phoneNumber;
    }
}

class Patient {
    String Name;
    String Department;
    int phoneNum;

    public Patient(String name, String department, int phoneNum) {
        this.Name = name;
        this.Department = department;
        this.phoneNum = phoneNum;

    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    public int getPhoneNum() {
        return phoneNum;

    }

    public void setName(String name) {
        Name = name;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String toString() {
        return Name + " " + Department + " " + phoneNum;
    }
}

public class Hospital_Management_Project {
    public static void main(String[] args) {

        System.out.println("Enter the role");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        Scanner sc = new Scanner(System.in);
        int role = sc.nextInt();
        sc.nextLine();

        if (role == 1) {
            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Enter your password");
            String pass = sc.next();
            System.out.println("******************************");
            System.out.println("Welcome Dr." + name + " ");

            ArrayList doctorpass = new ArrayList();
            doctorpass.add("Abhi");
            doctorpass.add("AJ");
            doctorpass.add("AJ@2508");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");

            if (doctorpass.contains(pass)) {
                do {
                    System.out.println("1.Check Appointment");
                    System.out.println("2. Patient Details");
                    System.out.println("3. Exit");

                    int choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println(
                                "That time you have no Appointment, if any Appointmnet came we shall notiffy you sir!");
                        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

                    } else if (choice == 2) {
                        Patient p1 = new Patient("   Abhinav joshi   ", "   Neurolologyi   ", 639882241);
                        Patient p2 = new Patient("   Kartik Kaptiyal ", "   Gestroenterologist  ", 634578945);
                        Patient p3 = new Patient("   Gaurav Bhandari  ", "   Physiatrist    ", 945675689);
                        Patient p4 = new Patient("   Mukul Rauthan    ", "    Brain   ", 799665324);
                        Patient p5 = new Patient("   Ajay Baloni   ", "   Orthopedic   ", 635421442);
                        Patient p6 = new Patient("   Manish Uniyal  ", "  Physician   ", 785654789);

                        Patient[] pa = { p1, p2, p3, p4, p5, p6 };
                        System.out.println("Patient Name " + " " + "Department Name " + " " + "Phone Number");
                        System.out.println("-----------------------------------------------------------------");
                        for (int i = 0; i < pa.length; i++) {
                            System.out.println(pa[i]);
                            System.out.println(" ------------------- ----------------- --------------------");
                        }

                    } else if (choice == 3) {
                        System.out.println("Thank you for visiting Our app");
                        System.exit(choice);
                    }
                } while (true);
            } else {
                System.out.println("You are entered wrong Passoword");
            }
        } else if (role == 2) {

            System.out.println("Enter Patient name");
            String name = sc.nextLine();
            System.out.println("Enter Your password");
            String password = sc.next();
            System.out.println("Hello " + name + "  ");

            ArrayList Patientpass = new ArrayList();
            Patientpass.add("patient1");
            Patientpass.add("patient2");
            Patientpass.add("patient3");

            if (Patientpass.contains(password)) {
                do {
                    System.out.println(":::::::::::::::::::::::::::::::::::::");
                    System.out.println("1. Doctor Details ");
                    System.out.println("2. Book Appointment ");
                    System.out.println("3. exit ");

                    int choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        Doctor d1 = new Doctor("  Rohitash Sharma   ", "  Neurophysicion  ", 639854513);
                        Doctor d2 = new Doctor("   Pankaj Arora   ", "   NeuroSerjen   ", 856234785);
                        Doctor d3 = new Doctor("   Mukesh Gairola  ", "  Physicion   ", 752321456);
                        Doctor d4 = new Doctor("   Rakesh Goyal   ", "   Orthopedic   ", 632451236);
                        Doctor d5 = new Doctor("   Rajesh Hatwal  ", "    Brain   ", 789654123);
                        Doctor d6 = new Doctor("   Avnesh Joshi  ", "   Gestroenterologist   ", 532145698);

                        Doctor[] Dr = { d1, d2, d3, d4, d5, d6 };
                        System.out.println("Doctor name " + "  " + "Department Name" + "  " + "Phone No.");
                        System.out.println("----------------------------------------------------------");
                        for (int i = 0; i < Dr.length; i++) {
                            System.out.println(Dr[i]);
                            System.out.println("---------------------------------------------------");

                        }

                    } else if (choice1 == 2) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Enter in Which Department you want to appointment ---->>");

                        System.out.println("1.Neurophysicion");
                        System.out.println("2.NeuroSerjen");
                        System.out.println("3.Physicion");
                        System.out.println("4.Orthopedic");
                        System.out.println("5.Brain");
                        System.out.println("6.Gestroenterologist");

                        System.out.println("Please Choose ! ");
                        int choose = sc.nextInt();
                        switch (choose) {
                            case 1:
                                System.out.println(
                                        "Your appointment has been successful . plz go Neurophysicion department");
                                break;

                            case 2:
                                System.out.println(
                                        "Your appointment has been successful . plz go NeuroSerjen department");
                                break;

                            case 3:
                                System.out
                                        .println("Your appointment has been successful . plz go Physicion department");
                                break;

                            case 4:
                                System.out
                                        .println("Your appointment has been successful . plz g Orthopedic department");
                                break;

                            case 5:
                                System.out.println("Your appointment has been successful . plz go Brain department");
                                break;

                            case 6:
                                System.out.println(
                                        "Your appointment has been successful . plz go Gestroenterologist department");
                                break;

                            default:
                                System.out.println("You haven't enter the correct choise to appointment");

                        }

                    } else if (choice1 == 3) {
                        System.out.println("Thank you for visting our app ");
                        System.exit(choice1);
                    }

                } while (true);
            } else
                System.out.println("You are enter a wrong password");

        }
    }

}
