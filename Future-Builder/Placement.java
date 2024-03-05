import java.util.Scanner;
public class Placement {
    float new_CGPA;
    public static String company_start;
    public static String company_end;

    public static String student_start;
    public static String student_close;


    public float New_CGPA() {
        return this.new_CGPA;
    }

    public static void OpenCompanyRegistration(String company_start, String company_end) {
        Placement.company_start = company_start;
        Placement.company_end = company_end;
    }

    public static void OpenStudentRegistration(String student_start, String student_close) {
//        if (student_start.compareTo(Placement.company_end) >= 0) {
            Placement.student_start = student_start;
            Placement.student_close = student_close;

//            if (student_start.compareTo(Placement.company_end) < 0) {
//                System.out.println("Students registration can only be opened after company registration ends");
//            }

        }

    }






