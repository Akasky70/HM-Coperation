/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.coperation;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;

/**
 *
 * @author Akass
 */
public class Capital extends javax.swing.JPanel {
    Connection con=null;
    Double total_fund=0.0,available_fund=0.0;
    
    /**
     * Creates new form Capital
     */
    public Capital() {
        initComponents();
        con=DBconnection.makeconnection();
        
        try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM( Account ) FROM account");
            Double sum =0.0;
            while(rs.next()){
                int value=rs.getInt(1);
                sum=sum+value;
            }
            ResultSet rs1=st.executeQuery("SELECT SUM( Account ) FROM passive_account");
            Double sum1 =0.0;
            while(rs1.next()){
                int value1=rs1.getInt(1);
                sum1=sum1+value1;
            }
            double tot=sum+sum1;
            st.execute("UPDATE capital SET Monthly_collected="+tot+" WHERE Name='Capital'");
            
        }catch(Exception e){
            System.out.println("falied");

        }
         try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM capital WHERE 1=1");                          
            Double afund=0.0,fund=0.0, monthly_collection =0.0,interest_collected=0.0,fol=0.0,itbc=0.0;
                while(rs.next()){
                       monthly_collection=rs.getDouble(3);
                       interest_collected=rs.getDouble(4);
                       itbc=rs.getDouble(5);
                       fund=rs.getDouble(6);
                       fol=rs.getDouble(7);
                       afund=rs.getDouble(8);
                }
                TMC.setText(new DecimalFormat(".###").format(monthly_collection));
                IC.setText(new DecimalFormat(".###").format(interest_collected));
                ITBC.setText(new DecimalFormat(".###").format(itbc));
                FOL.setText(new DecimalFormat(".###").format(fol));
                this.total_fund=monthly_collection+interest_collected;
                TF.setText(new DecimalFormat(".###").format(total_fund));
                this.available_fund=total_fund-fol;
                FA.setText(new DecimalFormat(".###").format(available_fund));
                
                 //updating the capital table
                st.execute("UPDATE capital SET Total_fund="+total_fund+" WHERE Name='Capital'");
                st.execute("UPDATE capital SET Available_fund="+available_fund+" WHERE Name='Capital'");
              
                
                    
        }catch(Exception e){
            System.out.println("falied");
            
        }
        
        //Total Monthly collection from monthly saving table
       /* try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT SUM( Account ) FROM account");                          
            Double sum =0.0;
                while(rs.next()){
                       int value=rs.getInt(1); 
                       sum=sum+value;
                }
               TMC.setText(""+sum+"");
               this.total_monthly_collection=sum;
               st.execute("UPDATE capital SET Monthly_collected="+sum+" WHERE Name='Capital'");
              
        }catch(Exception e){
            System.out.println("falied");
            
        }*/
        
        //Interest to be collected fron loan table
       /* try{
            Statement st=con.createStatement();
            Double sum=0.0;
            ResultSet rs=st.executeQuery("SELECT SUM( Interest ) FROM loan");                          
                while(rs.next()){
                       int value=rs.getInt(1); 
                       sum=sum+value;
                }
                ITBC.setText(""+sum+"");
                st.execute("UPDATE capital SET Itbc="+sum+" WHERE Name='Capital'");
              
        }catch(Exception e){
            System.out.println("falied");
            
        }*/
        
        //fund on loan from loan table
       /* try{
            Statement st=con.createStatement();
            Double sum=0.0;
            ResultSet rs=st.executeQuery("SELECT SUM( Loan_amount ) FROM loan");                          
                while(rs.next()){
                       int value=rs.getInt(1); 
                       sum=sum+value;
                }
                this.fund_on_loan=sum;
                FOL.setText(""+sum+"");
                st.execute("UPDATE capital SET Fol="+fund_on_loan+" WHERE Name='Capital'");
              
        }catch(Exception e){
            System.out.println("falied");
            
        }*/
        
        //Interest collected from interest_collected table
      /*  try{
            Statement st=con.createStatement();
            Double sum=0.0;
            ResultSet rs=st.executeQuery("SELECT SUM( Interest ) FROM interest_collected");                          
                while(rs.next()){
                       int value=rs.getInt(1); 
                       sum=sum+value;
                }
                this.interest_collected=sum;
                IC.setText(""+sum+"");
                st.execute("UPDATE capital SET Interest_collected="+interest_collected+" WHERE Name='Capital'");
              
        }catch(Exception e){
            System.out.println("falied");
            
        }*/
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TMC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ITBC = new javax.swing.JLabel();
        FA = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FOL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1100, 730));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 710));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Total Monthly Collection");

        TMC.setBackground(new java.awt.Color(0, 0, 0));
        TMC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TMC.setForeground(new java.awt.Color(255, 255, 255));
        TMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TMC.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Interest Collected");

        IC.setBackground(new java.awt.Color(0, 0, 0));
        IC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IC.setForeground(new java.awt.Color(255, 255, 255));
        IC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IC.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Interest to be Collected");

        ITBC.setBackground(new java.awt.Color(0, 0, 0));
        ITBC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ITBC.setForeground(new java.awt.Color(255, 255, 255));
        ITBC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ITBC.setOpaque(true);

        FA.setBackground(new java.awt.Color(0, 0, 0));
        FA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FA.setForeground(new java.awt.Color(255, 255, 255));
        FA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FA.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Fund Available");

        FOL.setBackground(new java.awt.Color(0, 0, 0));
        FOL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FOL.setForeground(new java.awt.Color(255, 255, 255));
        FOL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FOL.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Fund on loan");

        TF.setBackground(new java.awt.Color(0, 0, 0));
        TF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TF.setForeground(new java.awt.Color(255, 255, 255));
        TF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TF.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Total fund");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/RS.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ITBC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TMC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FOL, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TF, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FA, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(89, 89, 89)))))
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TMC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITBC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FOL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/head.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bar1.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(223, 223, 223))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         HomeFrame.changePanel(new Capital());        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FA;
    private javax.swing.JLabel FOL;
    private javax.swing.JLabel IC;
    private javax.swing.JLabel ITBC;
    private javax.swing.JLabel TF;
    private javax.swing.JLabel TMC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
