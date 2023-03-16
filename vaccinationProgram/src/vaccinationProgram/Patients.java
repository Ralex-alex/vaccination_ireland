/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccinationProgram;

/**
 *
 * @author Alexandru Rusu x21331013
 */
public class Patients {
    
    private int patAge;
    private String patName;
    private String patCondition;

    public Patients(int patAge, String patName, String patCondition) {
        this.patAge = patAge;
        this.patName = patName;
        this.patCondition = patCondition;
    }

    public Patients() {
    
    }

    public int getpatAge() {
        return patAge;
    }

    public void setpatAge(int patAge) {
        this.patAge = patAge;
    }

    public String getpatName() {
        return patName;
    }

    public void setprioName(String patName) {
        this.patName = patName;
    }

    public String getpatCondition() {
        return patCondition;
    }

    public void setpatCondition(String patCondition) {
        this.patCondition = patCondition;
    }
    
    
    
}
