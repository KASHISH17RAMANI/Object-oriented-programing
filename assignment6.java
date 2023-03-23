
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;

import java.util.ArrayList;

class user {
    public String name;
    public int dateOfBirth;
    public int userID;

    Scanner in = new Scanner(System.in);

    user() {

    }

    void setDetails() {

        System.out.println("enter user name");
        name = in.nextLine();
        System.out.println("enetr user  year of date of birth");
        dateOfBirth = in.nextInt();
        System.out.println("enetr user userID");
        userID = in.nextInt();
    }

    void showDetails(int dateOfBirth) {
        if (this.dateOfBirth == dateOfBirth) {
            System.out.println("user date of birth" + dateOfBirth);
            System.out.println("user name is " + name);

            System.out.println("user ID is" + userID);
        }

    }

}

class student extends user {
    public int rollnumber;
    public int semester;
    public int cpi;

    student() {

    }

    public int check_userid(int id) {
        if (id == userID) {
            return 1;
        }
        return 0;
    }

    public int check_rollnumber(int rollno) {
        if (rollno == rollnumber) {
            return 1;
        }
        return 0;
    }

    public int check_birthyear(int dob) {
        if (dob == dateOfBirth) {
            return 1;
        }
        return 0;
    }

    student(String name, int birthYear, int userId, int rollno, int semester, int cpi) {
        this.name = name;
        this.dateOfBirth = birthYear;
        this.userID = userId;
        this.rollnumber = rollno;
        this.semester = semester;
        this.cpi = cpi;
    }

    void setDetails() {

        super.setDetails();

        System.out.println("enter your rollnumber");
        rollnumber = in.nextInt();
        in.nextLine();
        System.out.println("enetr your semester");
        semester = in.nextInt();
        System.out.println("enetr your cpi");
        cpi = in.nextInt();

    }

    public void showDetails(int dob) {
        if (this.dateOfBirth == dob) {
            System.out.println("user name is:" + name);
            System.out.println("user id is :" + userID);
            System.out.println("roll number is " + rollnumber);
            System.out.println("semester is" + semester);
            System.out.println("cpi is" + cpi);
        }

    }

    public void showDetails1(int rollnumber) {

        if (this.rollnumber == rollnumber) {
            System.out.println("user name is:" + name);
            System.out.println("user id is :" + userID);
            System.out.println("the date of birth is " + dateOfBirth);
            System.out.println("semester is" + semester);
            System.out.println("cpi is" + cpi);
        }

    }

    public void showDetails2(int userID) {

        if (this.userID == userID) {
            System.out.println("user name is:" + name);
            System.out.println("roll no is :" + rollnumber);
            System.out.println("the date of birth is " + dateOfBirth);
            System.out.println("semester is" + semester);
            System.out.println("cpi is" + cpi);
        }

    }

}

class staff extends user {
    public int employeeID;
    public String sectionName;
    public String designation;

    public int getemployeeId() {
        return this.employeeID;
    }

    public int check_userid(int id) {
        if (id == userID) {
            return 1;
        }
        return 0;
    }

    public int check_employid(int employid) {
        if (employeeID == employid) {
            return 1;
        }
        return 0;
    }

    public int check_birthyear(int dob) {
        if (dob == dateOfBirth) {
            return 1;
        }
        return 0;
    }

    staff() {

    }

    staff(String name, int dateOfBirth, int userID, int employeeid, String section, String designation) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.userID = userID;
        this.employeeID = employeeid;
        this.sectionName = section;
        this.designation = designation;

    }

    public void setDetails() {

        super.setDetails();

        System.out.println("enter your employeeID");
        employeeID = in.nextInt();
        in.nextLine();
        System.out.println("enetr your sectionName");
        sectionName = in.nextLine();
        System.out.println("enetr your designation");
        designation = in.nextLine();
    }

    public void showDetails(int dob) {
        if (this.dateOfBirth == dob) {
            super.showDetails(dob);
            System.out.println("employeeID is " + employeeID);
            System.out.println("sectionName is " + sectionName);
            System.out.println("designation is" + designation);
        }
    }

    public void showDetails6(int employeeid) {
        if (this.employeeID == employeeid) {

            System.out.println("user date of birth" + dateOfBirth);
            System.out.println("user name is " + name);

            System.out.println("user ID is" + userID);
            System.out.println("employeeID is " + employeeID);
            System.out.println("sectionName is " + sectionName);
            System.out.println("designation is" + designation);
        }
    }

    public void showDetails5(int userid) {
        if (this.userID == userid) {
            System.out.println("user date of birth" + dateOfBirth);
            System.out.println("user name is " + name);

            System.out.println("user ID is" + userID);
            System.out.println("employeeID is " + employeeID);
            System.out.println("sectionname is " + sectionName);
            System.out.println("designation is" + designation);
        }
    }

    public void checkSections(staff s1, staff s2) {
        if (s1.sectionName == s2.sectionName) {
            System.out.println("Same section!");
        } else {
            System.out.println("Different section!");
        }

    }

}

class faculty extends user

{
    public int employeeID;
    public String department;
    public String noofpub;

    public int getemployeeId() {
        return this.employeeID;
    }

    public int check_userid(int id) {
        if (id == userID) {
            return 1;
        }
        return 0;
    }

    public int check_employid(int employid) {
        if (employeeID == employid) {
            return 1;
        }
        return 0;
    }

    public int check_birthyear(int dob) {
        if (dob == dateOfBirth) {
            return 1;
        }
        return 0;
    }

    faculty() {

    }

    faculty(String name, int birthYear, int userId, int employeeID, String department, String noofpub) {
        this.name = name;
        this.dateOfBirth = birthYear;
        this.userID = userId;
        this.employeeID = employeeID;
        this.department = department;
        this.noofpub = noofpub;
    }

    public void setDetails() {

        super.setDetails();

        System.out.println("enter your employeeID");
        employeeID = in.nextInt();
        in.nextLine();
        System.out.println("enetr your department");
        department = in.nextLine();
        in.nextLine();
        System.out.println("enetr noOfpublications");
        noofpub = in.nextLine();
    }

    public void showDetails(int dob) {
        if (this.dateOfBirth == dob) {
            super.showDetails(dob);
            System.out.println("employeeID is " + employeeID);
            System.out.println("departmentName is " + department);
            System.out.println("noOfPublications is" + noofpub);
        }
    }

    public void showDetails3(int employeeid) {
        if (this.employeeID == employeeid) {
            System.out.println("user date of birth" + dateOfBirth);
            System.out.println("user name is " + name);

            System.out.println("user ID is" + userID);
            System.out.println("employeeID is " + employeeID);
            System.out.println("departmentName is " + department);
            System.out.println("noOfPublications is" + noofpub);
        }
    }

    public void showDetails4(int userid) {
        if (this.userID == userid) {
            System.out.println("user date of birth" + dateOfBirth);
            System.out.println("user name is " + name);

            System.out.println("user ID is" + userID);
            System.out.println("employeeID is " + employeeID);
            System.out.println("departmentName is " + department);
            System.out.println("noOfPublications is" + noofpub);
        }
    }

    public void checkDepartment(faculty f1, faculty f2) {
        System.out.println(f1.department);
        System.out.println(f2.department);
        if (f1.department.equals(f2.department)) {
            System.out.println("Same department!");
        } else {
            System.out.println("Different department!");
        }

    }

}

class assignment6 {
    public static void main(String[] args) {
        student[] students = new student[100];
        staff[] staffs = new staff[100];
        faculty[] faculties = new faculty[100];

        Scanner in = new Scanner(System.in);
        int k = 0, l = 0, g = 0;
        while (true) {
            System.out.println("***********************************************************************************");
            System.out.println("1.Student\n2.Faculty\n3.Staff\n4.Exit\n");
            System.out.println(("**********************************************************************************"));
            System.out.println("Enter Your Choice:");
            int choice = in.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("**************************************************************************");
                    System.out.println("1.set value by using constructor\n2.set details\n3.dispaly details\n ");
                    System.out.println("**************************************************************************");
                    int choice2 = in.nextInt();
                    switch (choice2) {
                        case 1: {
                            in.nextLine();
                            System.out.print("Enter Name : \n");
                            String name = in.nextLine();
                            System.out.print("Enter Birth-Year : \n");
                            int dateOfBirth = in.nextInt();

                            System.out.print("Enter User-Id : \n");
                            int userID = in.nextInt();

                            System.out.print("Enter Roll-No : \n");
                            int rollno = in.nextInt();
                            in.nextLine();

                            System.out.print("Enter Semester : \n");
                            int semester = in.nextInt();
                            in.nextLine();

                            System.out.print("Enter CPI : \n");
                            int cpi = in.nextInt();
                            in.nextLine();

                            int flag1 = 0;
                            int flag2 = 0;

                            for (int j = 0; j < k; j++) {
                                flag1 = students[j].check_userid(userID);
                                flag2 = students[j].check_rollnumber(rollno);
                            }
                            if (flag1 == 0 && flag2 == 0) {
                                students[k] = new student(name, dateOfBirth, userID, rollno, semester, cpi);
                                k++;

                            } else {
                                if (flag1 != 0) {
                                    System.out.println("\nWARNING!! USERID ALREADY EXISTS");
                                }

                                else if (flag2 != 0) {
                                    System.out.println("\nWARNING!! ROLL NUMBER ALREADY EXISTS");
                                }
                            }
                            break;

                        }

                        case 2: {

                            student obj = new student();
                            students[k] = obj;
                            obj.setDetails();
                            ++k;
                            break;

                        }

                        case 3: {
                            System.out.println("******************************************************************");
                            System.out.println("1.user-ID\n2.Roll-No\n3.Birth-Year \n");
                            int choice3 = in.nextInt();
                            switch (choice3) {
                                case 1: {
                                    System.out.println("\nEnter your user id");
                                    int userId = in.nextInt();
                                    for (int j = 0; j < k; j++) {
                                        students[j].showDetails2(userId);

                                    }
                                    break;
                                }

                                case 2: {
                                    System.out.println("\nEnter your roll no");
                                    int rollno = in.nextInt();
                                    for (int j = 0; j < k; j++) {
                                        students[j].showDetails1(rollno);
                                    }
                                    break;
                                }

                                case 3: {

                                    System.out.println("\nEnter your  year of date of birth");// dob
                                    int dob = in.nextInt();

                                    for (int m = 0; m < k; m++) {
                                        students[m].showDetails(dob);
                                    }

                                }

                                    break;
                            }

                        }
                    }

                    break;

                }

                case 2: {
                    System.out.println("**************************************************************************");
                    System.out.println(
                            "1.set value by using constructor\n2.set details\n3.dispaly details\n4.compare departments\n ");
                    int choice3 = in.nextInt();
                    switch (choice3) {
                        case 1: {
                            in.nextLine();
                            System.out.print("Enter Name : \n");
                            String name = in.nextLine();

                            System.out.print("Enter Birth-Year : \n");
                            int dateOfBirth = in.nextInt();

                            System.out.print("Enter User-Id : \n");
                            int userID = in.nextInt();

                            System.out.print("Enter Employee id : \n");
                            int employeeid = in.nextInt();
                            in.nextLine();

                            System.out.print("Enter department name: \n");
                            String department = in.nextLine();
                            in.nextLine();

                            System.out.print("Enter no of publications : \n");
                            String noofpub = in.nextLine();
                            in.nextLine();

                            int flag1 = 0;
                            int flag2 = 0;

                            for (int j = 0; j < g; j++) {
                                flag1 = faculties[j].check_userid(userID);
                                flag2 = faculties[j].check_employid(employeeid);
                            }
                            if (flag1 == 0 && flag2 == 0) {
                                faculties[l] = new faculty(name, dateOfBirth, userID, employeeid, department, noofpub);
                                l++;

                            } else {
                                if (flag1 != 0) {
                                    System.out.println("\nWARNING!! USERID ALREADY EXISTS");
                                }

                                else if (flag2 != 0) {
                                    System.out.println("\nWARNING!! ROLL NUMBER ALREADY EXISTS");
                                }
                            }
                            break;

                        }

                        case 2: {
                            faculty obj = new faculty();
                            faculties[l] = obj;
                            obj.setDetails();
                            ++l;
                            break;
                        }

                        case 3: {
                            System.out.println("******************************************************************");
                            System.out.println("\n1.user-ID\n2.Employee-ID\n3.Birth-Year ");
                            int choice4 = in.nextInt();
                            switch (choice4) {
                                case 1: {
                                    System.out.println("\nEnter your user id");
                                    int userId = in.nextInt();
                                    for (int j = 0; j < l; j++) {
                                        faculties[j].showDetails4(userId);
                                    }
                                    break;
                                }

                                case 2: {
                                    System.out.println("\nEnter your employee id");
                                    int employeeid = in.nextInt();
                                    for (int j = 0; j < l; j++) {
                                        faculties[j].showDetails3(employeeid);
                                    }
                                    break;
                                }

                                case 3: {
                                    System.out.println("\nEnter your date of birth");
                                    int dob = in.nextInt();
                                    for (int j = 0; j < l; j++) {
                                        faculties[j].showDetails(dob);
                                    }
                                    break;

                                }
                            }
                            break;
                        }

                        case 4: {
                            System.out.print("Enter employee id of faculty 1 : ");
                            int id1 = in.nextInt();
                            System.out.print("Enter employee id of faculty 2 : ");
                            int id2 = in.nextInt();

                            faculty f1 = null, f2 = null;

                            for (int j = 0; j < l; j++) {

                                if (id1 == faculties[j].getemployeeId()) {
                                    f1 = faculties[j];
                                }
                            }
                            for (int j = 0; j < l; j++) {

                                if (id2 == faculties[j].getemployeeId()) {
                                    f2 = faculties[j];
                                }
                            }

                            f1.checkDepartment(f1, f2);

                            break;

                        }
                    }
                    break;
                }

                case 3: {
                    System.out.println("**************************************************************************");
                    System.out.println(
                            "1.set value by using constructor\n2.set details\n3.dispaly details\n4.compare sections\n ");
                    int choice4 = in.nextInt();
                    switch (choice4) {
                        case 1: {
                            in.nextLine();
                            System.out.print("Enter Name : \n");
                            String name = in.nextLine();
                            in.nextLine();
                            System.out.print("Enter Birth-Year : \n");
                            int dateOfBirth = in.nextInt();

                            System.out.print("Enter User-Id : \n");
                            int userID = in.nextInt();

                            System.out.print("Enter Employee id : \n");
                            int employeeid = in.nextInt();
                            in.nextLine();

                            System.out.print("Enter section name: \n");
                            String section = in.nextLine();
                            in.nextLine();

                            System.out.print("Enter the designation : \n");
                            String designation = in.nextLine();
                            in.nextLine();

                            int flag1 = 0;
                            int flag2 = 0;

                            for (int j = 0; j < g; j++) {
                                flag1 = staffs[j].check_userid(userID);
                                flag2 = staffs[j].check_employid(employeeid);
                            }
                            if (flag1 == 0 && flag2 == 0) {
                                staffs[g] = new staff(name, dateOfBirth, userID, employeeid, section, designation);
                                g++;

                            } else {
                                if (flag1 != 0) {
                                    System.out.println("\nWARNING!! USERID ALREADY EXISTS");
                                }

                                else if (flag2 != 0) {
                                    System.out.println("\nWARNING!! ROLL NUMBER ALREADY EXISTS");
                                }
                            }
                            break;

                        }

                        case 2: {
                            staff obj = new staff();
                            staffs[g] = obj;
                            obj.setDetails();
                            ++g;
                            break;
                        }

                        case 3: {
                            System.out.println("******************************************************************");
                            System.out.println("\n1.user-ID\n2.Employee-ID\n3.Birth-Year ");
                            int choice5 = in.nextInt();
                            switch (choice5) {
                                case 1: {
                                    System.out.println("\nEnter your user id");
                                    int userId = in.nextInt();
                                    for (int j = 0; j < g; j++) {
                                        staffs[j].showDetails5(userId);
                                    }
                                    break;
                                }

                                case 2: {
                                    System.out.println("\nEnter your employee id");
                                    int employeeid = in.nextInt();
                                    for (int j = 0; j < l; j++) {
                                        staffs[j].showDetails6(employeeid);
                                    }
                                    break;
                                }

                                case 3: {
                                    System.out.println("Enter your date of birth");
                                    int dob = in.nextInt();
                                    for (int j = 0; j < k; j++) {
                                        staffs[j].showDetails(dob);
                                    }
                                    break;

                                }

                            }
                            break;
                        }

                        case 4: {
                            System.out.print("Enter employee id of staff 1 : ");
                            int id1 = in.nextInt();
                            System.out.print("Enter employee id of staff 2 : ");
                            int id2 = in.nextInt();

                            staff s1 = null, s2 = null;

                            for (int j = 0; j < g; j++) {

                                if (id1 == staffs[j].getemployeeId()) {
                                    s1 = staffs[j];
                                }
                            }
                            for (int j = 0; j < g; j++) {

                                if (id2 == staffs[j].getemployeeId()) {
                                    s2 = staffs[j];
                                }
                            }

                            s1.checkSections(s1, s2);

                            break;

                        }

                    }

                }
            }
        }
    }
}
