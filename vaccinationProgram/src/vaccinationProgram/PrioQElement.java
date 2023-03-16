/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccinationProgram;

/**
 *
 * @author rambre
 */
public class PrioQElement {
    
    private int prioKey;
    private Patients patient;

    public PrioQElement(int prioKey, Patients patient) {
        this.prioKey = prioKey;
        this.patient = patient;
    }

    //Getter
    public int getprioKey() {
        return prioKey;
    }

    //Setter
    public void setprioKey(int prioKey) {
        this.prioKey = prioKey;
    }

    // Getter
    public Patients getPatient() {
        return patient;
    }

    // Setter
    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    //
    public String printPatient(){
          String sMessage ; 
          sMessage = "Name = " + patient.getpatName()+ " * Age = " + patient.getpatAge();
          return sMessage;
    }
}
