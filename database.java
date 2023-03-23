import java.util.*;
import java.util.regex.*;

class person {

    String fname;
    String lname;
    String pan;
    String pincode;
    String email;
    String dob;

    person() {

    }

    void setDetails(String fname, String lname, String pan, String pincode, String email, String dob) {
        this.fname = fname;
        this.lname = lname;
        this.pan = pan;
        this.pincode = pincode;
        this.email = email;
        this.dob = dob;
    }

    void showDetails(String dob) {
        if (this.dob == dob) {
            System.out.println("FIRST NAME OF THE USER IS:" + fname);
            System.out.println("LAST  NAME OF THE USER IS:" + lname);
            System.out.println("PAN  OF THE USER IS:" + pan);
            System.out.println("PINCODE OF THE USER IS:" + pincode);
            System.out.println("EMAIL OF THE USER IS:" + email);
            System.out.println("DOB OF THE USER IS:" + dob);

        }
    }

    public boolean isValidfName(String fname) {
        String regex = "^[A-Z]{1}[a-z]*";
        Pattern p = Pattern.compile(regex);
        if (fname == null) {
            return false;
        }
        Matcher m = p.matcher(fname);
        return m.matches();
    }

    public boolean isValidlName(String lname) {
        String regex = "^[A-Z]{1}[a-z]*";
        Pattern p = Pattern.compile(regex);
        if (fname == null) {
            return false;
        }
        Matcher m = p.matcher(lname);
        return m.matches();
    }

    public boolean isValidPinCode(String pincode) {
        String regex = "^[1-9]{1}[0-9]{5}";
        Pattern p = Pattern.compile(regex);
        if (pincode == null) {
            return false;
        }
        Matcher m = p.matcher(pincode);
        return m.matches();
    }

    public boolean isValidDOB(String dateOfBirth) {
        String regex = "^[0-1][0-9]/[0-3][0-9]/[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        if (dateOfBirth == null) {
            return false;
        }
        Matcher m = p.matcher(dateOfBirth);
        return m.matches();
    }

    public boolean isValidPAN(String pan) {
        String regex = "^[A-Z0-9]*$";
        Pattern p = Pattern.compile(regex);
        if (pan == null) {
            return false;
        }
        Matcher m = p.matcher(pan);
        return m.matches();
    }

    public boolean isValidMail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern p = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }

}

class student extends person {
    int rollno;
    double cpi;
    int semester;

    student() {

    }

    void setDetails(String fname, String lname, String pan, String pincode, String email, String dob, int rollno,
            double cpi, int semester) {
        super.setDetails(fname, lname, pan, pincode, email, dob);
        this.rollno = rollno;
        this.cpi = cpi;
        this.semester = semester;
    }

    void showDetails(String dob) {
        if (this.dob.equals(dob)) {
            super.showDetails(dob);
            System.out.println("THE ROLL NUMBER OF THE STUDENT IS :" + rollno);
            System.out.println("THE CPI  OF THE STUDENT IS :" + cpi);
            System.out.println("THE SEMESTER OF THE STUDENT IS :" + semester);

        }
    }

    void showDetails1(int rollno) {
        if (this.rollno == rollno) {
            System.out.println("FIRST NAME OF THE USER IS:" + fname);
            System.out.println("LAST  NAME OF THE USER IS:" + lname);
            System.out.println("PAN  OF THE USER IS:" + pan);
            System.out.println("PINCODE OF THE USER IS:" + pincode);
            System.out.println("EMAIL OF THE USER IS:" + email);
            System.out.println("DOB OF THE USER IS:" + dob);
            System.out.println("THE ROLL NUMBER OF THE STUDENT IS :" + rollno);
            System.out.println("THE CPI  OF THE STUDENT IS :" + cpi);
            System.out.println("THE SEMESTER OF THE STUDENT IS :" + semester);

        }

    }
}

class faculty extends person {
    int employeeid;
    int nop;
    String department;

    faculty() {

    };

    public void setDetails(String fname, String lname, String pan, String pincode, String email, String dob,
            int employeeid,
            int nop, String department) {
        super.setDetails(fname, lname, pan, pincode, email, dob);
        this.employeeid = employeeid;
        this.nop = nop;
        this.department = department;
    }

    void showDetails(String dob) {
        if (this.dob.equals(dob)) {
            super.showDetails(dob);
            System.out.println("THE EMPLOYEEID  OF THE FACULTY IS :" + employeeid);
            System.out.println("NUMBER OF PUBLICATIONS  OF THE FACULTY IS :" + nop);
            System.out.println("THE DEPARTMENT  OF THE FACULTY IS :" + department);

        }
    }

    void showDetails2(int employeeid) {
        if (this.employeeid == employeeid) {
            System.out.println("FIRST NAME OF THE USER IS:" + fname);
            System.out.println("LAST  NAME OF THE USER IS:" + lname);
            System.out.println("PAN  OF THE USER IS:" + pan);
            System.out.println("PINCODE OF THE USER IS:" + pincode);
            System.out.println("EMAIL OF THE USER IS:" + email);
            System.out.println("DOB OF THE USER IS:" + dob);
            System.out.println("THE EMPLOYEE ID  OF THE FACULTY IS :" + employeeid);
            System.out.println("THE DEPARTMENT OF THE FACULTY IS:" + department);
            System.out.println("THE NUMBER OF PUBLICATIONS OF THE FACULTY :" + nop);

        }

    }
}

class staff extends person {
    int staffid;
    String designation;
    String department;

    staff() {

    }

    void setDetails(String fname, String lname, String pan, String pincode, String email, String dob,
            int staffid, String designation, String department) {
        super.setDetails(fname, lname, pan, pincode, email, dob);
        this.staffid = staffid;
        this.designation = designation;
        this.department = department;
    }

    void showDetails(String dob) {
        if (this.dob.equals(dob)) {
            super.showDetails(dob);
            System.out.println("THE STAFFID  OF THE STAFF IS :" + staffid);
            System.out.println("DESIGNATION  OF THE STAFF IS :" + designation);
            System.out.println("THE DEPARTMENT  OF THE STAFF IS :" + department);

        }
    }

    void showDetails3(int staffid) {
        if (this.staffid == staffid) {
            System.out.println("FIRST NAME OF THE USER IS:" + fname);
            System.out.println("LAST  NAME OF THE USER IS:" + lname);
            System.out.println("PAN  OF THE USER IS:" + pan);
            System.out.println("PINCODE OF THE USER IS:" + pincode);
            System.out.println("EMAIL OF THE USER IS:" + email);
            System.out.println("DOB OF THE USER IS:" + dob);
            System.out.println("THE STAFF ID  OF THE STUDENT IS :" + staffid);
            System.out.println("THE DESIGNATION  OF THE STUDENT IS :" + designation);
            System.out.println("THE DEPARTMENT OF THE STUDENT IS :" + department);

        }

    }
}

public class database {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<person> userlist = new ArrayList<>();

        while (true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("\t\t1 - Faculty");
            System.out.println("\t\t2 - Student");
            System.out.println("\t\t3 - Staff");
            System.out.println("\t\t4 - Exit");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Enter Your Choice : ");
            int choice = in.nextInt();

            if (choice == 1) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("\t\t1 - setDetails()");
                System.out.println("\t\t2 - showDetails()");
                System.out.println("\t\t4 - backToHome()");
                System.out.println("--------------------------------------------------------------");

                int choice1 = in.nextInt();
                if (choice1 == 1) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Enter the firstname of the faculty");
                    String fname = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the Lastname of the faculty");
                    String lname = in.nextLine();
                    // in.nextLine();
                    System.out.println("Enter the PAN of the faculty");
                    String pan = in.nextLine();
                    // in.nextLine();
                    System.out.println("Enter the pincode of the faculty");
                    String pincode = in.nextLine();
                    // in.nextLine();
                    System.out.println("Enter the email of the faculty");
                    String email = in.nextLine();
                    // in.nextLine();
                    System.out.println("Enter the dob of the faculty");
                    String dob = in.nextLine();
                    // in.nextLine();
                    System.out.println("Enter the department of the faculty");
                    String department = in.nextLine();
                    // in.nextLine();
                    System.out.println("Enter the number of publications of the faculty");
                    int nop = in.nextInt();
                    System.out.println("Enter the employeeid of the faculty");
                    int employeeid = in.nextInt();
                    // in.nextLine();
                    System.out.println("--------------------------------------------------------------");
                    faculty fac = new faculty();
                    fac.setDetails(fname, lname, pan, pincode, email, dob, employeeid, nop, department);
                    userlist.add(fac);
                    // String fname, String lname, String pan, String pincode, String email, String
                    // dob,
                    // int employeeid,
                    // int nop, String department
                }

                if (choice1 == 2) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("\t\t1 - DOB");
                    System.out.println("\t\t2 - EMPLOYEEID");
                    System.out.println("--------------------------------------------------------------");

                    int choice2 = in.nextInt();
                    if (choice2 == 1) {
                        System.out.println("ENTER THE YOUR DOB");
                        String dob = in.nextLine();

                        for (person user : userlist) {
                            if (user instanceof faculty) {
                                ((faculty) user).showDetails(dob);
                                ;
                            }
                        }

                    }

                    else if (choice2 == 2) {
                        System.out.println("ENTER THE YOUR EMPLOYEEID");
                        int employeeid = in.nextInt();

                        for (person user : userlist) {
                            if (user instanceof faculty) {
                                ((faculty) user).showDetails2(employeeid);
                            }
                        }
                    }
                }

                if (choice1 == 4) {
                    break;
                }
            }

            else if (choice == 2) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("\t\t1 - setDetails()");
                System.out.println("\t\t2 - showDetails()");
                System.out.println("\t\t4 - backToHome()");
                System.out.println("--------------------------------------------------------------");

                int choice3 = in.nextInt();
                if (choice3 == 1) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Enter the firstname of the student");
                    String fname = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the Lastname of the student");
                    String lname = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the PAN of the student");
                    String pan = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the pincode of the student");
                    String pincode = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the email of the student");
                    String email = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the dob of the student");
                    String dob = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the rollnumber of the student");
                    int rollno = in.nextInt();

                    System.out.println("Enter the semester of the student");
                    int semester = in.nextInt();

                    System.out.println("Enter the cpi of the student");
                    double cpi = in.nextInt();

                    System.out.println("--------------------------------------------------------------");

                    student stu = new student();
                    stu.setDetails(fname, lname, pan, pincode, email, dob, rollno, cpi, semester);
                    userlist.add(stu);
                }

                if (choice3 == 2) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("\t\t1 - DOB");
                    System.out.println("\t\t2 - ROLLNUMBER");
                    System.out.println("--------------------------------------------------------------");

                    int choice4 = in.nextInt();
                    if (choice4 == 1) {
                        System.out.println("ENTER THE YOUR DOB");
                        String dob = in.nextLine();

                        for (person user : userlist) {
                            if (user instanceof student) {
                                ((student) user).showDetails(dob);
                                ;
                            }
                        }

                    }

                    else if (choice4 == 2) {
                        System.out.println("ENTER THE YOUR ROLL NUMBER");
                        int rollno = in.nextInt();

                        for (person user : userlist) {
                            if (user instanceof student) {
                                ((student) user).showDetails1(rollno);
                            }
                        }
                    }
                }

                if (choice3 == 4) {
                    break;
                }

            }
            if (choice == 3) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("\t\t1 - setDetails()");
                System.out.println("\t\t2 - showDetails()");
                System.out.println("\t\t4 - backToHome()");
                System.out.println("--------------------------------------------------------------");

                int choice5 = in.nextInt();
                if (choice5 == 1) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Enter the firstname of the staff");
                    String fname = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the Lastname of the staff");
                    String lname = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the PAN of the staff");
                    String pan = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the pincode of the staff");
                    String pincode = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the email of the staff");
                    String email = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the dob of the staff");
                    String dob = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the staffid of the staff");
                    int staffid = in.nextInt();

                    System.out.println("Enter the designaton of the staff");
                    String designation = in.nextLine();

                    System.out.println("Enter the department of the staff");
                    String department = in.nextLine();

                    System.out.println("--------------------------------------------------------------");

                    staff sta = new staff();
                    sta.setDetails(fname, lname, pan, pincode, email, dob, staffid, designation,
                            department);
                    userlist.add(sta);
                }

                if (choice5 == 2) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("\t\t1 - DOB");
                    System.out.println("\t\t2 - STAFFID");
                    System.out.println("--------------------------------------------------------------");

                    int choice6 = in.nextInt();
                    if (choice6 == 1) {
                        System.out.println("ENTER THE YOUR DOB");
                        String dob = in.nextLine();

                        for (person user : userlist) {
                            if (user instanceof staff) {
                                ((staff) user).showDetails(dob);
                            }
                        }

                    }

                    else if (choice6 == 2) {
                        System.out.println("ENTER THE YOUR STAFFID");
                        int staffid = in.nextInt();

                        for (person user : userlist) {
                            if (user instanceof staff) {
                                ((staff) user).showDetails3(staffid);
                            }
                        }
                    }
                }

                if (choice5 == 4) {
                    break;
                }

            }

            if (choice == 4) {
                break;
            }
        }
    }

}
