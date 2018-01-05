/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.coperation;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.PageSize;

import com.lowagie.text.pdf.PdfContentByte;

import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;
import static com.lowagie.text.rtf.RtfWriter.paragraph;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Akass
 */
public class Display_person extends javax.swing.JPanel {
    Connection con=null;
    String dirName = "E:\\hmc\\";
String fileName = ".pdf";
    int sid;
    /**
     * Creates new form Display_person
     */
    public Display_person(Object id) {
        initComponents();
        con=DBconnection.makeconnection();
        
        String sql2="SELECT * FROM members WHERE Aid='"+id+"'";
                try{
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(sql2);
                    
                    while(rs.next()){                                                                                                                             
                        jLabel2.setText(rs.getString(2));
                        jLabel4.setText(rs.getString(3));
                        jLabel6.setText(rs.getString(4));
                        jLabel8.setText(rs.getString(5));
                        jLabel10.setText(rs.getString(6));
                        jLabel12.setText(rs.getString(7));
                        jLabel14.setText(rs.getString(8));
                        jLabel16.setText(rs.getString(9));
                        jLabel18.setText(rs.getString(10));
                        jLabel20.setText(rs.getString(11));
                        jLabel22.setText(rs.getString(12));
                        jLabel24.setText(rs.getString(13));
                        jLabel26.setText(rs.getString(14));
                        jLabel28.setText(rs.getString(15));
                        byte[] img = rs.getBytes(16);

                        //Resize The ImageIcon
                        ImageIcon image = new ImageIcon(img);
                        Image im = image.getImage();
                        Image myImg = im.getScaledInstance(135,145,Image.SCALE_SMOOTH);
                        ImageIcon newImage = new ImageIcon(myImg);
                        jLabel29.setIcon(newImage);
                        
                        
                    }
                    ///f0r active list
                    
                    ResultSet rs2=st.executeQuery("SELECT * FROM loan WHERE Aid='"+id+"'");
                    double loan=0.0;
                    while(rs2.next()){                                                                                                                             
                        loan=rs2.getDouble(9);
                    }
                    
                    jLabel33.setText(new DecimalFormat(".###").format(loan));
                    ResultSet rs3=st.executeQuery("SELECT * FROM account WHERE Aid='"+id+"'");
                    String status = null;
                    while(rs3.next()){                                                                                                                             
//                        jLabel35.setText(rs3.getString(5));  
                        jLabel31.setText(rs3.getString(4));
                        status=(rs3.getString(6));
                        
                    }
                    jLabel37.setText(status);
                        
                    
                    
               
                      /*  System.out.println("From deactive List");
                      //  Statement st=con.createStatement();
                        ResultSet rs4=st.executeQuery("SELECT * FROM passive_account WHERE Aid='"+id+"'");
                    
                        while(rs4.next()){                                                                                                                             
                                jLabel31.setText(rs4.getString(4));
                                jLabel35.setText(rs4.getString(5));
                                jLabel37.setText(rs4.getString(6));
                        
                        }*/
                        
                       
                       
                    }catch(Exception f){
                        System.out.println("Error in sql");
                    }
                
                /*String sql3="SELECT * FROM loan WHERE Aid='"+id+"'";
                try{
                    Statement st=con.createStatement();
                    ResultSet rs1=st.executeQuery(sql3);
                    
                    while(rs1.next()){                                                                                                                             
                        jLabel33.setText(rs1.getString(9));
                        
                    }
                }
                catch(Exception e){
                    System.out.println("Query not executed");
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

        Display_person_panel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1100, 730));

        Display_person_panel.setBackground(new java.awt.Color(255, 255, 255));
        Display_person_panel.setPreferredSize(new java.awt.Dimension(901, 710));

        Title.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(153, 0, 0));
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dp.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel27.setText("GrandFather's Name");

        jLabel25.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel25.setText("Mother's Name");

        jLabel23.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel23.setText("Father's Name");

        jLabel21.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel21.setText("Email ID");

        jLabel19.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel19.setText("Home no.");

        jLabel17.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel17.setText("Mobile no.");

        jLabel15.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel15.setText("Temporary Address");

        jLabel13.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel13.setText("Permanent Address");

        jLabel9.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel9.setText("Membership type");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel7.setText("Citizenship no.");

        jLabel5.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel5.setText("Citizenship");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel3.setText("Gender");

        jLabel11.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel11.setText("Member ID");

        jLabel1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel1.setText("Name ");

        jLabel36.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel36.setText("Status");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setOpaque(true);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setOpaque(true);

        jLabel34.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel34.setText("Income Interest");

        jLabel32.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel32.setText("Loan on Due");

        jLabel30.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel30.setText("Total Savings");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setOpaque(true);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/end.png"))); // NOI18N
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/man.jpg"))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel39.setText(" Export Details");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel39MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Display_person_panelLayout = new javax.swing.GroupLayout(Display_person_panel);
        Display_person_panel.setLayout(Display_person_panelLayout);
        Display_person_panelLayout.setHorizontalGroup(
            Display_person_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Display_person_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Display_person_panelLayout.createSequentialGroup()
                .addGroup(Display_person_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Display_person_panelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38))
        );
        Display_person_panelLayout.setVerticalGroup(
            Display_person_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Display_person_panelLayout.createSequentialGroup()
                .addGroup(Display_person_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Display_person_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Display_person_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(Display_person_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Display_person_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        HomeFrame.changePanel(new Display_members());         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseEntered
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/end2.png")));         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseEntered

    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/end.png")));           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseExited

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        
        
        JFileChooser chooser = new JFileChooser();
      chooser.setCurrentDirectory(new File(dirName));
      chooser.setSelectedFile(new File(fileName));
      chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int code = chooser.showSaveDialog(jPanel1);
            if (code == JFileChooser.APPROVE_OPTION) {
               File selectedFile = chooser.getSelectedFile();
               fileName = selectedFile.getName();
               try{
                        
                    Document document = new Document(PageSize.A4.rotate(),-60, -60, 20, 72);
      
                    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(selectedFile));
                    document.open();
                    PdfContentByte cb = writer.getDirectContent();
                    
                    PdfTemplate tp = cb.createTemplate(jPanel1.getWidth(), jPanel1.getHeight());
                    Graphics2D g2 = tp.createGraphics(jPanel1.getWidth(), jPanel1.getHeight());
                    g2.scale(0.8, 1.0);
                    jPanel1.print(g2);
                    g2.dispose();
                    cb.addTemplate(tp, 5, 60);
                    document.close();
                        jLabel39.setText("Data saved");
                        jLabel39.setForeground(new java.awt.Color(153, 0, 0));
               }catch(Exception e){
                   System.out.println("err");
               }
            }
        
        
        
               // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseEntered
        jLabel39.setOpaque(true);
        jLabel39.setBackground(Color.pink);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseEntered

    private void jLabel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseExited
        jLabel39.setBackground(Color.white);
        jLabel39.setOpaque(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display_person_panel;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
