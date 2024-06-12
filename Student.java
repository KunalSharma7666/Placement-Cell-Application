public class Student {
    String name;
    int rollNo;
    float CGPA;
    String Branch;
    float CTC = 0;
    boolean Placed = false;
    String Status = "Not Applied";
    String Status1 = "Unoffered";

    public void RegisterForPlacementDrive(String name, int rollNo, float CGPA, String Branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.CGPA = CGPA;
        this.Branch = Branch;
    }

    public String Name() {
        return this.name;
    }

    public int RollNo() {
        return this.rollNo;
    }

    public float cgpa() {
        return this.CGPA;
    }

    public String branch() {
        return this.Branch;
    }

    public void Info() {
        System.out.println(Name());
        System.out.println(RollNo());
        System.out.println(cgpa());
        System.out.println(branch());
    }

    public String RegisterForCompany(Company company) {
        if (!this.Placed) {
            if (this.CGPA >= company.CompanyCGPA()) {
                this.Status = "Applied";
                return "Applied";
            }
        }
        if (this.Placed && this.CGPA >= company.CompanyCGPA() && company.companyCTC() >= 3 * this.CTC) {
            this.Status = "Applied";
            return "Applied";
        }

        return "Not Applied";
    }


    public void getAvailableCompany(Company company) {
        if ((!this.Placed && this.CGPA >= company.CompanyCGPA()) || (this.Placed && this.CGPA >= company.CompanyCGPA() && company.companyCTC() >= 3 * this.CTC)  ){
            System.out.println("CompanyName:" + company.Name());
            System.out.println("Company role offering:" + company.Role());
            System.out.println("Company Package: " + company.companyCTC());
            System.out.println("Company CGPA criteria:" + company.CompanyCGPA());
        }
        else{
            System.out.println("Unavailable");
        }
    }

    public void getCurrentStatus(Company company){
        if(Reject()){
            this.Status1 = "Blocked";
        }
        int i = 0;
        while(i<company.Selected_Childrens.size()) {
            if (company.Selected_Childrens.get(i).name.equals(this.name)) {
                this.Status1 = "Offered";
                i += 1;
            }

        }
    }

    public float UpdateCGPA(float New_CGPA){
        return this.CGPA = New_CGPA;

    }

    public boolean Accept(Company company ){;
        this.CTC=company.companyCTC();
        this.Placed = true;
        return true;
    }

    public boolean Reject(){
        return true;
    }




}






