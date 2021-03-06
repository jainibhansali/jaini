/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinancialAdvisorRole;

import Business.Customer.Customer;
import Business.Customer.CustomerAccount;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.Create_Loan_Mortgage_Soc_WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jaini
 */
public class ProcessMortgageRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessMortgageRequestJPanel
     */
    JPanel userProcessContainer;
    Create_Loan_Mortgage_Soc_WorkRequest request;
    Enterprise enterprise;
    public ProcessMortgageRequestJPanel(JPanel userProcessContainer,Create_Loan_Mortgage_Soc_WorkRequest request,Enterprise enterprise) {
        initComponents();
        this.enterprise=enterprise;
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        
                    txtprincipalAmount.setText(String.valueOf(request.getPrincipalMorgageAmount()));
                   
                    
                   
                    
                   // System.out.println("MortgageType11"+request.getMortgageType());
                    txtmonthlyPayment.setText(String.valueOf(request.getMonthlyMortgagePayment()));
                    txtassetType.setText(String.valueOf(request.getAssetType()));
                    txtTerm.setText(String.valueOf(request.getTermTime()));
                    txtfinalAmount.setText((String.valueOf(request.getAmountInterestCharged())));
                    txtassetValue.setText((String.valueOf(request.getAssetValue())));
                    txtdownPayment.setText((String.valueOf(request.getDownPayment())));
                    txtinterestRate.setText((String.valueOf(request.getInterest())));
                    txtmessage.setText(request.getMessage());
                    jCheckBox1home.setText(request.getIsHome());
                    //System.out.println("Home1"+request.getIsHome());
                   jCheckBox2car.setText(request.getIsCar());
                    //System.out.println(request.getIsCar());
                    
        
        if(request.getMortgageType().equalsIgnoreCase("Home"))
        {   System.out.println("Part2"+request.getIsHome());
            jCheckBox1home.setSelected(true);
            
        }
        else if(request.getMortgageType().equalsIgnoreCase("Car"))
        {   System.out.println("Part2"+request.getIsCar());
            jCheckBox2car.setSelected(true);
        }
        
            else
            {
                 JOptionPane.showMessageDialog(null, "No Value");
            }
                    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtprincipalAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtinterestRate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdownPayment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtassetType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtassetValue = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmonthlyPayment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTerm = new javax.swing.JTextField();
        txtfinalAmount = new javax.swing.JTextField();
        btnprocess = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtmessage = new javax.swing.JTextField();
        jCheckBox1home = new javax.swing.JCheckBox();
        jCheckBox2car = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Principal Mortagage Amount");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 126, -1, -1));

        txtprincipalAmount.setEditable(false);
        txtprincipalAmount.setEnabled(false);
        add(txtprincipalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 126, 80, -1));

        jLabel2.setText("Interest Rate");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 186, -1, -1));

        txtinterestRate.setEditable(false);
        txtinterestRate.setEnabled(false);
        add(txtinterestRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 186, 75, -1));

        jLabel3.setText("DownPayment");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 246, -1, -1));

        txtdownPayment.setEditable(false);
        txtdownPayment.setEnabled(false);
        add(txtdownPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 246, 75, -1));

        jLabel4.setText("Asset Type");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 276, -1, -1));

        txtassetType.setEditable(false);
        txtassetType.setEnabled(false);
        add(txtassetType, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 276, 75, -1));

        jLabel5.setText("Asset Value");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 306, -1, -1));

        txtassetValue.setEditable(false);
        txtassetValue.setEnabled(false);
        add(txtassetValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 306, 75, -1));

        jLabel6.setText("MonthlyPayment");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 366, -1, -1));

        txtmonthlyPayment.setEditable(false);
        txtmonthlyPayment.setEnabled(false);
        add(txtmonthlyPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 366, 75, -1));

        jLabel7.setText("Final Amount");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 336, -1, -1));

        jLabel9.setText("Term");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 216, -1, -1));

        txtTerm.setEditable(false);
        txtTerm.setEnabled(false);
        add(txtTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 216, 75, -1));

        txtfinalAmount.setEditable(false);
        txtfinalAmount.setEnabled(false);
        add(txtfinalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 336, 75, -1));

        btnprocess.setText("Process");
        btnprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocessActionPerformed(evt);
            }
        });
        add(btnprocess, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 458, -1, -1));

        jLabel8.setText("Mortgage Request");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 61, -1, -1));

        jLabel10.setText("Mortgage Type");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 156, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 46, -1, -1));

        jLabel11.setText("Message");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 396, -1, -1));

        txtmessage.setEditable(false);
        txtmessage.setEnabled(false);
        add(txtmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 396, 80, -1));

        jCheckBox1home.setText("Home");
        add(jCheckBox1home, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 152, 69, -1));

        jCheckBox2car.setText("Car");
        add(jCheckBox2car, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 58, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocessActionPerformed
        // TODO add your handling code here:
        String message = "Mortgage Request";
        double asset=request.getAssetValue();
        double finalAmount=request.getAmountInterestCharged();
        System.out.println("MortgageType"+request.getMortgageType());
        double savings;
        Double newSavings;
        for(Customer c: enterprise.getCustomerDirectory().getCustomerList() )
        {   System.out.println("Part1");
            System.out.println("requestid"+request.getId());
            System.out.println("customerid"+c.getId());
            for(CustomerAccount ca:c.getCustomerAccountDirectory().getCustomerAccountList())
            {   System.out.println("Part2");
                if(request.getId()==c.getId())
                { System.out.println("Part3");
                   
                   savings=ca.getSavingsMoney();
                    System.out.println("Savings"+savings);
                   if(request.getMortgageType().equalsIgnoreCase("Car")||request.getMortgageType().equalsIgnoreCase("Home"))
                           {    System.out.println("Part4");
                               c.getCustomerMortgageDirectory().createCustomerMortgage(c);
                               newSavings=savings+request.getAmountInterestCharged();
                               ca.setSavingsMoney(newSavings);
                               request.setMessage(txtmessage.getText());
                               request.setStatus("Completed"); 
                               
                               
                           }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "Cannot process mortgage");
                   }
                   
                }
            }
         
       
        }
        
    }//GEN-LAST:event_btnprocessActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnprocess;
    private javax.swing.JCheckBox jCheckBox1home;
    private javax.swing.JCheckBox jCheckBox2car;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtTerm;
    private javax.swing.JTextField txtassetType;
    private javax.swing.JTextField txtassetValue;
    private javax.swing.JTextField txtdownPayment;
    private javax.swing.JTextField txtfinalAmount;
    private javax.swing.JTextField txtinterestRate;
    private javax.swing.JTextField txtmessage;
    private javax.swing.JTextField txtmonthlyPayment;
    private javax.swing.JTextField txtprincipalAmount;
    // End of variables declaration//GEN-END:variables
}
