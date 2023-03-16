/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vaccinationProgram;

/**
 *
 * @author rambre
 */
public interface PrioQInterface {
    public void enqueue(int age, Object person,String conditionY);

    public int size();

    public boolean isEmpty();

    public Object dequeue();
    
    public int checkPriority(int age,String condition);

    public String printPrioQueue();
    
    
}
