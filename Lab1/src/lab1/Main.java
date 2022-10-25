/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab1;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        rdGioiTinh();
    }

    ButtonGroup buttonGroup;

    void rdGioiTinh() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rd_nam);
        buttonGroup.add(rd_nu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tengv = new javax.swing.JLabel();
        lbl_sdt = new javax.swing.JLabel();
        lbl_gioitinh = new javax.swing.JLabel();
        lbl_namsinh = new javax.swing.JLabel();
        lbl_skill = new javax.swing.JLabel();
        txt_tengv = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        rd_nam = new javax.swing.JRadioButton();
        rd_nu = new javax.swing.JRadioButton();
        cb_namsinh = new javax.swing.JComboBox<>();
        lbl_tensv = new javax.swing.JLabel();
        chk_bongda = new javax.swing.JCheckBox();
        chk_caulong = new javax.swing.JCheckBox();
        chk_boiloi = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_giaovien = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_tengv.setText("Ten GV");

        lbl_sdt.setText("SDT");

        lbl_gioitinh.setText("Gioi Tinh");

        lbl_namsinh.setText("Nam Sinh");

        lbl_skill.setText("Skill");

        txt_tengv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tengvActionPerformed(evt);
            }
        });

        rd_nam.setText("nam");
        rd_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_namActionPerformed(evt);
            }
        });

        rd_nu.setText("nu");
        rd_nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_nuActionPerformed(evt);
            }
        });

        cb_namsinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", " " }));
        cb_namsinh.setSelectedIndex(5);

        lbl_tensv.setText("Đào Quốc Khánh");

        chk_bongda.setText("bong da");
        chk_bongda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_bongdaActionPerformed(evt);
            }
        });

        chk_caulong.setText("cau long");

        chk_boiloi.setText("boi loi");

        tb_giaovien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Nguyen Van A", "0111111111", "nam", "1990"},
                {"2", "Tran Van B", "0222222222", "nam", "1992"},
                {"3", "Chu Thi C", "0333333333", "nu", "1993"},
                {"", null, null, null, null}
            },
            new String [] {
                "STT", "Ho Ten", "SDT", "Gioi Tinh", "Nam Sinh"
            }
        ));
        tb_giaovien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_giaovienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_giaovien);

        btn_them.setText("Them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        jButton1.setText("Sửa");

        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Load Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_tensv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_tengv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_gioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_namsinh, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                            .addComponent(lbl_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chk_bongda, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chk_caulong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chk_boiloi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_tengv)
                                        .addComponent(txt_sdt, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rd_nam)
                                        .addGap(18, 18, 18)
                                        .addComponent(rd_nu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cb_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton2)
                                    .addComponent(btn_them)
                                    .addComponent(jButton1))))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_tensv)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tengv)
                    .addComponent(txt_tengv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sdt)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gioitinh)
                    .addComponent(rd_nam)
                    .addComponent(rd_nu)
                    .addComponent(jButton2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_namsinh)
                    .addComponent(cb_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_skill)
                    .addComponent(chk_bongda)
                    .addComponent(chk_caulong)
                    .addComponent(chk_boiloi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk_bongdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_bongdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_bongdaActionPerformed

    private void rd_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_nuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_nuActionPerformed

    private void rd_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_namActionPerformed

    private void txt_tengvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tengvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tengvActionPerformed

    private void tb_giaovienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_giaovienMouseClicked
        // TODO add your handling code here:
        int row = tb_giaovien.getSelectedRow();
        txt_tengv.setText((String) tb_giaovien.getValueAt(row, 1));
        txt_sdt.setText((String) tb_giaovien.getValueAt(row, 2));
        cb_namsinh.setSelectedItem(tb_giaovien.getValueAt(row, 4));
        String gioiTinh = tb_giaovien.getValueAt(row, 3).toString();
        if (gioiTinh.equals("nam")){
            rd_nam.setSelected(true);
        } else {
            rd_nu.setSelected(true);
        }
    }//GEN-LAST:event_tb_giaovienMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        String str = txt_tengv.getText();
        String str1 = txt_sdt.getText();
        if ("".equals(str) || "".equals(str1)) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
        } else {
            JOptionPane.showMessageDialog(this, "Them thanh cong");
        }

    }//GEN-LAST:event_btn_themActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txt_tengv.setText("");
        txt_sdt.setText("");
        chk_boiloi.setSelected(false);
        chk_bongda.setSelected(false);
        chk_caulong.setSelected(false);
        buttonGroup.clearSelection();
        cb_namsinh.setSelectedIndex(5);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_them;
    private javax.swing.JComboBox<String> cb_namsinh;
    private javax.swing.JCheckBox chk_boiloi;
    private javax.swing.JCheckBox chk_bongda;
    private javax.swing.JCheckBox chk_caulong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_gioitinh;
    private javax.swing.JLabel lbl_namsinh;
    private javax.swing.JLabel lbl_sdt;
    private javax.swing.JLabel lbl_skill;
    private javax.swing.JLabel lbl_tengv;
    private javax.swing.JLabel lbl_tensv;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private javax.swing.JTable tb_giaovien;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tengv;
    // End of variables declaration//GEN-END:variables
}
