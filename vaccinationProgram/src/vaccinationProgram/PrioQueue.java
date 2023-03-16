/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccinationProgram;

import java.util.ArrayList;

/**
 *
 * @author rambre
 */
public class PrioQueue implements PrioQInterface {
    
     private ArrayList <PrioQElement> prioQueue;

    public PrioQueue() {
        prioQueue = new ArrayList<>();
    }
    
     @Override
    public void enqueue(int age, Object person,String conditionY){
        
        int finKey = checkPriority(age,conditionY);
        PrioQElement addElement = new PrioQElement(finKey,(Patients)person);
        int position = findInsertPosition(finKey);
        if(position == size()){
            prioQueue.add(addElement);
        }
       else{
            prioQueue.add(position, addElement);
        }
       
    }
    
    public int findInsertPosition(int prioKey){
        boolean bFound = false;
        int iPos = 0;
        PrioQElement curElement;
        while (iPos < prioQueue.size() && !bFound) {
            curElement = prioQueue.get(iPos);
            if (prioKey < curElement.getprioKey()) {
                iPos = iPos + 1;
            } else {
                bFound = true;
            }
        }
        return iPos;
    }

    @Override
    public int size() {
        return prioQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return prioQueue.isEmpty();
    }

    @Override
    public Object dequeue() {
        return prioQueue.remove(0);
    }

    @Override
    public String printPrioQueue() {
        String printObjects = new String();
        PrioQElement patients;
        for (int iCount = 0; iCount < prioQueue.size(); iCount++) {
            patients = prioQueue.get(iCount);
            printObjects = printObjects.concat(patients.printPatient() + "Priority : " + patients.getprioKey()+ "\n");
        }
        return printObjects;
    }
    
     @Override
    public int checkPriority(int ageRange, String conditionY){
        int finKey;
        
        if(ageRange>=90){
            finKey = 10;
        }
        else if(ageRange<90 && ageRange>=80){
            finKey = 9;
        }
        else if(ageRange>=70 && ageRange<80 ){
            finKey = 8;
        }
        else if(ageRange>=65 && ageRange<70 ){
            finKey = 7;
        }
        else if(ageRange>=18 && ageRange<65 && conditionY.contains("Y")){
            finKey = 6;
        }
        else if(ageRange>=55 && ageRange<65){
            finKey = 5;
        }
        else if(ageRange>=45 && ageRange<55){
            finKey = 4;
        }
        else if(ageRange>=30 && ageRange<45){
            finKey = 3;
        }
        else if(ageRange>=18 && ageRange<30){
            finKey = 2;
        }
        else{
            finKey = 1;
        }
        return finKey;
    }
    
}
