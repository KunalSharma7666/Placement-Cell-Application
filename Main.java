import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        ArrayList<Student> Register_p = new ArrayList<Student>();
        ArrayList<Student> childrens = new ArrayList<Student>();
        ArrayList<Company> com = new ArrayList<Company>();
        ArrayList<Company> R_company = new ArrayList<Company>();

        Company C = new Company();
        Scanner in = new Scanner(System.in);
        String ch = in.nextLine();

        if (Objects.equals(ch, "Enter FutureBuilder")) {
            while (true) {
                System.out.println();
                System.out.println("Welcome to FutureBuilder");
                System.out.println("1. Enter the Application");
                System.out.println("2. Exit the Application");
                int a = in.nextInt();
                    if (a == 1) {
                        while (true) {
                            System.out.println();
                            System.out.println("Choose the mode you want to enter in: ");
                            System.out.println("1. Enter as student mode");
                            System.out.println("2. Enter as company mode");
                            System.out.println("3. Enter as Placement cell mode");
                            System.out.println("4. Return to main application");
                            System.out.println();

                            int b = in.nextInt();
                            if (b == 1) {
                                while(true){
                                System.out.println();
                                System.out.println("Choose the student query to perform ");
                                System.out.println("1. Enter as a Student");
                                System.out.println("2. Add Student");
                                System.out.println("3. Back");
                                System.out.println();
                                int c = in.nextInt();
                                if(c == 1){
                                    String name = in.next();
                                    int rollNo = in.nextInt();
                                    while(true){
                                        System.out.println("Welcome "+name);
                                        System.out.println("1.Register for placement Drive");
                                        System.out.println("2. Register for Company");
                                        System.out.println("3. Get all available companies");
                                        System.out.println("4. Get Current Status");
                                        System.out.println("5. Update CGPA");
                                        System.out.println("6. Accept offer");
                                        System.out.println("7. Reject offer");
                                        System.out.println("8. Back");
                                        System.out.println();
                                        int j = in.nextInt();
                                        if(j==1){
                                            System.out.println("registration start time and end time format dd/mm/yyyy hh:mm");
                                            String waste = in.nextLine();
                                            String Student_R = in.nextLine();
                                            if(Student_R.compareTo(Placement.student_start)>=0 && Student_R.compareTo(Placement.student_close)<=0) {
                                                for (Student children : childrens) {
                                                    if (children.name.equals(name)) {
                                                        Register_p.add(children);
                                                    }
                                                }
                                                System.out.println(name + " registered for the placement drive at IIITD!!!!!!!!!!!");
                                                System.out.println("Your details are: ");
                                                for (Student children : childrens) {
                                                    if (children.name.equals(name)) {
                                                        children.Info();
                                                    }
                                                }
                                                System.out.println();
                                            }
                                            else{
                                                System.out.println("Registration time out of bounds");
                                            }
                                        }
                                        if(j==2){

                                            int i = 0;
                                            while(i<com.size()){
                                                System.out.println(i+1 + " " +com.get(i).name);
                                                i+=1;
                                            }
                                            for (int m = 0;m< childrens.size();m++) {
                                                if (childrens.get(m).name.equals(name)) {
                                                    childrens.get(m).RegisterForCompany(C);
                                                    if (childrens.get(m).RegisterForCompany(C).equals("Applied")) {
                                                        System.out.println("Successfully Registered for " + com.get(0).role + " role at " + com.get(0).name);
                                                        C.selected(childrens.get(m));
                                                    }
                                                }
                                            }
                                        }
                                        if(j==3){
                                            for(int i = 0;i< childrens.size();i++){
                                                if(childrens.get(i).name.equals(name)){
                                                    childrens.get(i).getAvailableCompany(C);
                                                }
                                            }
                                            System.out.println();
                                        }
                                        if(j==4){
                                            for(int i = 0;i< childrens.size();i++){
                                                if(childrens.get(i).name.equals(name)){
                                                    childrens.get(i).getCurrentStatus(com.get(0));
                                                    if(childrens.get(i).Status1.equals("Offered")){
                                                        System.out.println("You have been offered by "+ C.name+" !!! please accept the offer");
                                                    }
                                                }
                                            }
                                        }
                                        if(j==5){
                                            float update = in.nextFloat();
                                            for(int i = 0;i< childrens.size();i++){
                                                if(childrens.get(i).name.equals(name)){
                                                    childrens.get(i).UpdateCGPA(update);
                                                }
                                            }



                                        }
                                        if(j==6){
                                            for(int i = 0;i< childrens.size();i++){
                                                if(childrens.get(i).name.equals(name)){
                                                    childrens.get(i).Accept(com.get(0));
                                                    System.out.println("Congratulations "+childrens.get(i).name+"!!!! You have accepted the offer by "+C.name+"!!");
                                                }
                                            }
                                        }
                                        if(j==7){
                                            for(int i = 0;i< childrens.size();i++){
                                                if(childrens.get(i).name.equals(name)){
                                                    childrens.get(i).Reject();
                                                }
                                            }
                                        }
                                        if(j==8){
                                            break;
                                        }
                                    }
                                }
                                if(c==2){
                                    System.out.println("Enter the number of students to add");
                                    int d = in.nextInt();
                                    int i = 0;
                                    while(i<d){
                                        Student S = new Student();
                                        String name = in.next();
                                        int rollNo = in.nextInt();
                                        float CGPA = in.nextFloat();
                                        String Branch = in.next();
                                        S.RegisterForPlacementDrive(name,rollNo,CGPA,Branch);
                                        childrens.add(S);
                                        i+=1;
                                    }
                                }
                                if(c==3){
                                    break;
                                }
                                }
                            }
                            if (b == 2) {
                                while(true){
                                System.out.println();
                                System.out.println("Choose the Company query to perform");
                                System.out.println("1. Add company and details");
                                System.out.println("2. Choose Company");
                                System.out.println("3. Get available companies");
                                System.out.println("4. back");
                                System.out.println();
                                int e = in.nextInt();
                                if(e==1){
                                    int f = in.nextInt();
                                    int i = 0;
                                    while(i<f){
                                        System.out.println();
                                        String name = in.next();
                                        String role = in.next();
                                        float CTC = in.nextFloat();
                                        float CGPA = in.nextFloat();
                                        C.RegisterTOInstituteDrive(name,role,CTC,CGPA);
                                        com.add(C);
                                        i+=1;
                                    }
                                }
                                if(e==2){
                                    for(int i=0;i< com.size();i++){
                                        System.out.println();
                                        System.out.println((i+1) + " " + com.get(i).name);
                                        System.out.println();
                                    }
                                    int g = in.nextInt();
                                    System.out.println("Welcome " + com.get(g-1).name);
                                    while(true){
                                        System.out.println("1. Update Role");
                                        System.out.println("2. Update Package");
                                        System.out.println("3. Update CGPA criteria");
                                        System.out.println("4. Register to Institute Drive");
                                        System.out.println("5. Back");
                                        int h = in.nextInt();
                                        if(h==1){
                                            String role = in.next();
                                            C.update_role(role);
                                            com.get(g-1).role = role;
                                        }
                                        if(h==2){
                                            int CTC = in.nextInt();
                                            C.update_CTC(CTC);
                                            com.get(g-1).CTC = CTC;
                                        }
                                        if(h==3){
                                            float CGPA = in.nextFloat();
                                            C.update_CGPA(CGPA);
                                            com.get(g-1).CGPA = CGPA;
                                        }
                                        if(h==4){
                                            System.out.println("registration start time and end time format dd/mm/yyyy hh:mm");
                                            String waste = in.nextLine();
                                            String company_R = in.nextLine();

                                            if(company_R.compareTo(Placement.company_start)>=0 && company_R.compareTo(Placement.company_end)<=0){
                                                System.out.println("Registered!!!");
                                                R_company.add(C);
                                                C.Registration_Time = company_R;
                                            }
                                            else{
                                                System.out.println("Registered time out of bounds");
                                            }
                                        }
                                        if(h==5){
                                            break;
                                        }

                                    }

                                }
                                if(e==3){
                                    int i=0;
                                    while(i< com.size()){
                                        System.out.println((i+1) + " " + com.get(i).name);
                                        i = i+1;}
                                }
                                if(e==4){
                                    break;
                                }
                                }
                            }
                            if (b == 3) {
                                while(true) {
                                    System.out.println();
                                    System.out.println("Welcome to IIITD Placement Cell");
                                    System.out.println("1. Open Student Registration");
                                    System.out.println("2. Open Company Registration");
                                    System.out.println("3. Get number of student registrations");
                                    System.out.println("4. Get number of company registrations");
                                    System.out.println("5. Get Number of offered/unoffered/Blocked Students");
                                    System.out.println("6. Get Student Details");
                                    System.out.println("7. Get company details");
                                    System.out.println("8. Get Average Package");
                                    System.out.println("9. Get Comapny Process Results");
                                    System.out.println("10. Back");
                                    System.out.println();
                                    int k = in.nextInt();
                                    if (k == 1) {
                                        System.out.println("registration start time and end time format dd/mm/yyyy hh:mm");
                                        String student_start = in.nextLine();
                                        String w=in.nextLine(); //taking input for garbage input
                                        String student_close = in.nextLine();
                                        Placement.OpenStudentRegistration(student_start,student_close);
                                    }
                                    if (k == 2) {
                                        System.out.println("registration start time and end time format dd/mm/yyyy hh:mm");
                                        String company_start = in.nextLine();
                                        String w=in.nextLine(); // taking input for garbage input
                                        String company_close = in.nextLine();
                                        Placement.OpenCompanyRegistration(company_start,company_close);
                                    }
                                    if (k == 3) {
                                        System.out.println(Register_p.size());
                                    }
                                    if (k == 4) {
                                        System.out.println(R_company.size());
                                    }
                                    if (k == 5) {
                                        System.out.println("Number of offered students " + C.Selected_Childrens.size());
                                        int s = 0;
                                        int t = 0;
                                        int j = 0;
                                        while (j < childrens.size()) {
                                            if (childrens.get(s).Status1.equals("Unoffered")) {
                                                s += 1;
                                            }
                                            if (childrens.get(s).Status1.equals("Blocked")) {
                                                t += 1;
                                            }
                                            j+=1;
                                        }
                                        System.out.println("Number of Unoffered students " + s);
                                        System.out.println("Number of Blocked students " + t);
                                    }
                                    if (k == 6) {
                                        for (int i = 0; i < childrens.size(); i++) {
                                            childrens.get(i).Info();
                                        }
                                    }
                                    if (k == 7) {

                                        for(int i =0;i< com.size();i++){
                                            com.get(i).Info();
                                        }

                                    }
                                    if (k == 8) {
                                        float p = 0;
                                        int q = 0;
                                        while(q<childrens.size()){
                                            p+=childrens.get(q).CTC;
                                            q+=1;
                                        }
                                        float r = p/ C.Selected_Childrens.size();
                                        System.out.println("Average Package: " + r);
                                    }
                                    if (k == 9) {
                                        System.out.println(C.name);
                                        int z = 0;
                                        while(z<C.Selected_Childrens.size()){
                                            System.out.println(C.Selected_Childrens.get(z).name);
                                            System.out.println(C.Selected_Childrens.get(z).rollNo);
                                            System.out.println(C.Selected_Childrens.get(z).CGPA);
                                            System.out.println(C.Selected_Childrens.get(z).Branch);
                                            z+=1;
                                        }

                                    }
                                    if (k == 10) {
                                        break;
                                    }
                                }
                            }
                            if (b == 4) {
                                break;
                            }

                        }
                    }

                    if (a == 2) {
                        String ch1 = in.next();
                        if (Objects.equals(ch1, "Exit")) {
                            System.out.println();
                            System.out.println("Thanks for using FutureBuilder!!!!!!");
                                break;
                            }
                        }


            }
        }

        }

    }