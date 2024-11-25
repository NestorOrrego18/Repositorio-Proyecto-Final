package model;
/*Name:Nestor Felipe Orrego Ulloa 
Date:23/11/2024
Proyect: proyecto final 
*/

public class User extends Info {
    private String medicalRecord;

    Info info= new Info();
    UserData userData= new UserData();

    public User(){   
    }

    public User(int id, String name, String email, String phone, String medicalRecord) {
        super(id, name, email, phone);
        this.medicalRecord = medicalRecord;
    }


    public String getMedicalRecord() {
     
   return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
}
    