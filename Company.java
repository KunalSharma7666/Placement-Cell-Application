import java.util.ArrayList;

public class Company {

    String name;
    String role;
    float CTC;
    float CGPA;
    String Registration_Time;

    ArrayList<Student> Selected_Childrens= new ArrayList<Student>();

    public void RegisterTOInstituteDrive( String name , String role , float CTC , float CGPA ){
        this.name = name;
        this.role = role;
        this.CTC = CTC;
        this. CGPA = CGPA;
    }

    public String Name() {
        return this.name;}

    public String Role() {
        return this.role;
    }

    public float companyCTC() {
        return this.CTC;
    }
    public float CompanyCGPA() {
        return this.CGPA;}

    public void Info(){

        System.out.println(this.name);
        System.out.println(this.role);
        System.out.println(this.CTC);
        System.out.println(this.CGPA);
    }


    public void selected(Student student) {

       Selected_Childrens.add(student);
    }

    public String  update_role(String new_role){
        return this.role = new_role;
    }

    public float update_CTC(float new_CTC){
        return this.CTC = new_CTC;
    }

    public float update_CGPA(float new_CGPA){
        return this.CGPA = new_CGPA;
    }

}
