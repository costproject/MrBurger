/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Sandun Siwantha
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;


public class Admin extends javax.swing.JFrame {

    Connection con;
    
    public Admin() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        String url="jdbc:mysql://localhost/mrburger";
        String user="root";
        String pass="";
        try{
            con = DriverManager.getConnection(url,user,pass);
        }catch(Exception ex){
            System.out.println("Error : " + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        stockManagement1 = new javax.swing.JLabel();
        cust_id = new javax.swing.JTextField();
        order1 = new javax.swing.JLabel();
        tab3 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBur = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblApp = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblBev = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        FLname = new javax.swing.JTextField();
        MobNumber = new javax.swing.JTextField();
        LUser = new javax.swing.JLabel();
        boderReg = new javax.swing.JLabel();
        LUser1 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        LUser2 = new javax.swing.JLabel();
        btnOK = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stockManagement = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelOrd = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jPanelCust = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stockManagement1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stockManagement1.setForeground(new java.awt.Color(246, 166, 0));
        stockManagement1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockManagement1.setText("STOCK");
        stockManagement1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 166, 0), 2));
        stockManagement1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockManagement1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockManagement1MouseClicked(evt);
            }
        });
        jPanel1.add(stockManagement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 133, 43));

        cust_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cust_id.setForeground(new java.awt.Color(246, 166, 0));
        jPanel1.add(cust_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, -1));

        order1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        order1.setForeground(new java.awt.Color(246, 166, 0));
        order1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        order1.setText("PLACE ORDER");
        order1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 166, 0), 2, true));
        order1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        order1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order1MouseClicked(evt);
            }
        });
        jPanel1.add(order1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 133, 43));

        tab3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tab3.setForeground(new java.awt.Color(246, 166, 0));
        tab3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUST_ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(246, 166, 0))); // NOI18N
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });
        jPanel1.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 120));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(246, 166, 0));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("LOGOUT");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 166, 0), 2));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 18, 133, 43));

        jTabbedPane1.setForeground(new java.awt.Color(246, 166, 0));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item_Id", "Item_Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblDes);
        if (tblDes.getColumnModel().getColumnCount() > 0) {
            tblDes.getColumnModel().getColumn(0).setResizable(false);
            tblDes.getColumnModel().getColumn(1).setResizable(false);
            tblDes.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanelMenu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 450, 120));

        tblBur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item_Id", "Item_Name", "Quantity"
            }
        ));
        tblBur.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblBurAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(tblBur);
        if (tblBur.getColumnModel().getColumnCount() > 0) {
            tblBur.getColumnModel().getColumn(0).setResizable(false);
            tblBur.getColumnModel().getColumn(1).setResizable(false);
            tblBur.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanelMenu.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 450, 120));

        tblApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item_Id", "Item_Name", "Quantity"
            }
        ));
        jScrollPane5.setViewportView(tblApp);
        if (tblApp.getColumnModel().getColumnCount() > 0) {
            tblApp.getColumnModel().getColumn(0).setResizable(false);
            tblApp.getColumnModel().getColumn(1).setResizable(false);
            tblApp.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanelMenu.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 450, 120));

        tblBev.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item_Id", "Item_Name", "Quantity"
            }
        ));
        jScrollPane6.setViewportView(tblBev);
        if (tblBev.getColumnModel().getColumnCount() > 0) {
            tblBev.getColumnModel().getColumn(0).setResizable(false);
            tblBev.getColumnModel().getColumn(1).setResizable(false);
            tblBev.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanelMenu.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 450, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Deserts");
        jPanelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        FLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FLnameActionPerformed(evt);
            }
        });
        jPanelMenu.add(FLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 160, -1));
        jPanelMenu.add(MobNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 160, -1));

        LUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LUser.setText("Mobile Number :");
        jPanelMenu.add(LUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        boderReg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boderReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boderReg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MEMBERSHIP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanelMenu.add(boderReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 320, 210));

        LUser1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LUser1.setText("First & Last Name :");
        jPanelMenu.add(LUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));
        jPanelMenu.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 160, -1));

        LUser2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LUser2.setText("Email :");
        jPanelMenu.add(LUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        btnOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOK.setText("OK");
        btnOK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnOKAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });
        jPanelMenu.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 133, 43));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Today's Special", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 480, 640));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Burgers");
        jPanelMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Appetizers");
        jPanelMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Beverages");
        jPanelMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        stockManagement.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stockManagement.setForeground(new java.awt.Color(246, 166, 0));
        stockManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockManagement.setText("FOOD MENU");
        stockManagement.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(246, 166, 0), 2, true));
        stockManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockManagementMouseClicked(evt);
            }
        });
        jPanelMenu.add(stockManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 180, 160));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wallpaperBlack3.jpg"))); // NOI18N
        jPanelMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 180, 160));

        jTabbedPane1.addTab("MENU & CUSTOMER REGISTRATION", jPanelMenu);

        jPanelOrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOrdMouseClicked(evt);
            }
        });

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order_Id", "Cust_Id", "Date", "Time", "Sub_Total", "Discount", "Grand_Total"
            }
        ));
        jScrollPane2.setViewportView(tblOrders);

        javax.swing.GroupLayout jPanelOrdLayout = new javax.swing.GroupLayout(jPanelOrd);
        jPanelOrd.setLayout(jPanelOrdLayout);
        jPanelOrdLayout.setHorizontalGroup(
            jPanelOrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelOrdLayout.setVerticalGroup(
            jPanelOrdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ORDERS", jPanelOrd);

        jPanelCust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCustMouseClicked(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cust_Id", "Cust_Name", "Email", "Mobile_No"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCustomer);

        javax.swing.GroupLayout jPanelCustLayout = new javax.swing.GroupLayout(jPanelCust);
        jPanelCust.setLayout(jPanelCustLayout);
        jPanelCustLayout.setHorizontalGroup(
            jPanelCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelCustLayout.setVerticalGroup(
            jPanelCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CUSTOMERS", jPanelCust);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 18, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(246, 166, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wallpaperBlack3.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        resetColor(logout);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        setColor(logout);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
    
// TODO add your handling code here:
        Welcome lg = new Welcome();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void stockManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockManagementMouseClicked
        // TODO add your handling code here:
        Menu mn = new Menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stockManagementMouseClicked

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        // TODO add your handling code here:
        Oders od = new Oders();
        od.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOKMouseClicked

    private void order1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order1MouseClicked
       String msg=cust_id.getText();
        new Oders(msg).setVisible(true);
        setVisible(false);
     
// TODO add your handling code here:
        /*Oders od = new Oders();
        od.setVisible(true);**/
        this.dispose();
    }//GEN-LAST:event_order1MouseClicked

    private void stockManagement1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockManagement1MouseClicked

        StockManagement stm = new StockManagement();
        stm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stockManagement1MouseClicked

    private void tblBurAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblBurAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBurAncestorAdded

    private void FLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FLnameActionPerformed

    private void btnOKAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnOKAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKAncestorAdded

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab3MouseClicked

    private void jPanelOrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdMouseClicked
        
        
    }//GEN-LAST:event_jPanelOrdMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        String sql1="SELECT * FROM orders";
        try{
            PreparedStatement pst = con.prepareStatement(sql1);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tblOrders.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
            }
            
            
        }catch(Exception ex){
            System.out.println("Error : " +ex.getMessage());
        }
        
        String sql2="SELECT * FROM customer";
        try{
            PreparedStatement pst = con.prepareStatement(sql2);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tblCustomer.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
            
            
        }catch(Exception ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPanelCustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCustMouseClicked
        
    }//GEN-LAST:event_jPanelCustMouseClicked

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
       
    }//GEN-LAST:event_tblCustomerMouseClicked

    public void setColor(JLabel p){
        p.setBackground(new Color(205,200,35));
    }
    public void resetColor(JLabel p1){
        p1.setBackground(new Color(0,0,225));
    }
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FLname;
    private javax.swing.JLabel LUser;
    private javax.swing.JLabel LUser1;
    private javax.swing.JLabel LUser2;
    private javax.swing.JTextField MobNumber;
    private javax.swing.JLabel boderReg;
    private javax.swing.JLabel btnOK;
    private javax.swing.JTextField cust_id;
    private javax.swing.JTextField email1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCust;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelOrd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel order1;
    private javax.swing.JLabel stockManagement;
    private javax.swing.JLabel stockManagement1;
    private javax.swing.JLabel tab3;
    private javax.swing.JTable tblApp;
    private javax.swing.JTable tblBev;
    private javax.swing.JTable tblBur;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblDes;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
