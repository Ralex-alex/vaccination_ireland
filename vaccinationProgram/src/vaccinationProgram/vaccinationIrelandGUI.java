/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vaccinationProgram;

/**
 *
 * @author Alexandru Rusu x21331013
 */
public class vaccinationIrelandGUI extends javax.swing.JFrame {
    
    private PrioQInterface Queue;
    /**
     * Creates new form Vaccination_App_GUI
     * 
     */
    public vaccinationIrelandGUI() {
        initComponents();
        Queue = new PrioQueue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameText = new javax.swing.JTextField();
        nameL = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        nameL1 = new javax.swing.JLabel();
        conditionText = new javax.swing.JTextField();
        conditionL = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        waitBtn = new javax.swing.JButton();
        dequeuebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameL.setText("Name :");

        nameL1.setText("Age :");

        conditionL.setText("Condition(Y/N) :");

        addButton.setText("Add Patient");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {           //This code is part of a vaccination program for Dublin Hospital. It creates a GUI for the program and implements a                                                                      
                addButtonActionPerformed(evt);                                      //The GUI allows users to add patient information (name, age, and condition) to the queue, check the priority/patient information in the queue, and vaccinate the patient at the top of the queue.
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 140, 239));
        jLabel1.setText("Dublin Hosptial Vaccination");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        waitBtn.setText("Check Prio/Patient");
        waitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitBtnActionPerformed(evt);
            }
        });

        dequeuebtn.setText("Vax Patient");
        dequeuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dequeuebtnActionPerformed(evt);
            }
        });

        jLabel2.setText("-------------------------------------------------------------------------------------      Patient List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(conditionL, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameL1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conditionText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(waitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dequeuebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conditionL)
                            .addComponent(conditionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(waitBtn)
                .addGap(18, 18, 18)
                .addComponent(dequeuebtn)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed       /*From here on its validation and the button pressed and their functions  */
      // TODO add your handling code here:
if(!nameText.getText().isEmpty() && !ageText.getText().isEmpty() && !conditionText.getText().isEmpty()){
  String vCondition = conditionText.getText().toUpperCase();
  String vName = nameText.getText();
  int vAge = 0;
  if (vName.matches("[a-zA-Z]+")) {
      try {
          vAge = Integer.parseInt(ageText.getText());
      } catch (NumberFormatException e) {
          jTextArea1.append("Please enter a valid age");
          return;
      }
      if (vCondition.equals("Y") || vCondition.equals("N")) {
          Patients addPatient = new Patients();
          addPatient.setprioName(vName);
          addPatient.setpatAge(vAge);
          addPatient.setpatCondition(vCondition);
          Queue.enqueue(vAge, addPatient,vCondition);
          jTextArea1.append("\n Patient has been added to list \n Name:" +vName+" and Age : "+vAge+"\n");
      } else {
          jTextArea1.append("\n Please enter a valid condition (Y/N)");
      }
  } else {
      jTextArea1.append("\n Please enter a valid name");
  }
}
else{
  jTextArea1.append("Please fill out with the correct Name, Age or Condition \n ");
}

nameText.setText("");
ageText.setText("");
conditionText.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void waitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitBtnActionPerformed
     // TODO add your handling code here:
if(!Queue.isEmpty()){
  
  jTextArea1.append("\nPatients that are waiting : \n"+Queue.printPrioQueue());
}
else{
  jTextArea1.append("\n No Patients Found. \n");
}
    }//GEN-LAST:event_waitBtnActionPerformed

    private void dequeuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dequeuebtnActionPerformed
        // TODO add your handling code here:

if(!Queue.isEmpty()){
  PrioQElement remove1 = (PrioQElement)Queue.dequeue();
  Patients person1 = (Patients)remove1.getPatient();

  jTextArea1.append("\nHighest priority patients are done. Next in line is \n "+Queue.printPrioQueue());
}
else{
 
  jTextArea1.append("The Patients list is empty.\n");
}
    }//GEN-LAST:event_dequeuebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vaccinationIrelandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vaccinationIrelandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vaccinationIrelandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vaccinationIrelandGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vaccinationIrelandGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel conditionL;
    private javax.swing.JTextField conditionText;
    private javax.swing.JButton dequeuebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameL1;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton waitBtn;
    // End of variables declaration//GEN-END:variables
}
