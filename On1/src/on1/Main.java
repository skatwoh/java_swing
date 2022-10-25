/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package on1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private DefaultComboBoxModel defaultComboBoxModel;
    private DefaultTableModel defaultTableModel;
    List<SinhVien> listSinhVien = new ArrayList<>();

    public Main() {
        initComponents();
        addItemComboBox();
        addItemColumns();

//        txt_tensv.setText(String.valueOf(listSinhVien.get(0).getTenSV()));
//        txt_diem.setText(String.valueOf(listSinhVien.get(0).getDiem()));
//        cb_trangthai.setSelectedItem(listSinhVien.get(0).getTrangThai());
        addRow();
    }

    public List<SinhVien> getList() {
        return listSinhVien;
    }

    public void addItemComboBox() {
        ArrayList<String> listItem = new ArrayList<>();
        listItem.add("Đang học");
        listItem.add("Nghỉ học");

        defaultComboBoxModel = (DefaultComboBoxModel) cb_trangthai.getModel();
        for (String item : listItem) {
            defaultComboBoxModel.addElement(item);
        }

        cb_trangthai.setSelectedIndex(0);
    }

    public void addItemColumns() {
        ArrayList<String> listItems = new ArrayList<>();
        listItems.add("Tên");
        listItems.add("Điểm");
        listItems.add("Trạng thái");

        defaultTableModel = (DefaultTableModel) tb_sinhvien.getModel();
        defaultTableModel.setColumnCount(0);
        for (String listItem : listItems) {
            defaultTableModel.addColumn(listItem);
        }
    }

    public void addRow() {
        List<SinhVien> list = getList();
        defaultTableModel = (DefaultTableModel) tb_sinhvien.getModel();
        defaultTableModel.setRowCount(0);
        for (SinhVien sinhVien : list) {
            defaultTableModel.addRow(
                    new Object[]{
                        sinhVien.getTenSV(),
                        sinhVien.getDiem(),
                        sinhVien.getTrangThai()
                    }
            );
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

        lbl_tensv = new javax.swing.JLabel();
        txt_tensv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_diem = new javax.swing.JTextField();
        lbl_trangthai = new javax.swing.JLabel();
        cb_trangthai = new javax.swing.JComboBox<>();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_sinhvien = new javax.swing.JTable();
        btn_loaddata = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_tensv.setText("Ten sinh vien");

        jLabel1.setText("Diem");

        lbl_trangthai.setText("Trang thai");

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        tb_sinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tb_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_sinhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_sinhvien);

        btn_loaddata.setText("Load data");
        btn_loaddata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loaddataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tensv, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_tensv, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(txt_diem))
                            .addComponent(cb_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_thoat)
                            .addComponent(btn_them)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_xoa)
                                .addGap(51, 51, 51)
                                .addComponent(btn_loaddata)))))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tensv)
                    .addComponent(txt_tensv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_diem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa)
                    .addComponent(btn_loaddata))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_trangthai)
                    .addComponent(cb_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_thoat))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_sinhvienMouseClicked
        // TODO add your handling code here:
        int row = tb_sinhvien.getSelectedRow();
        txt_tensv.setText(tb_sinhvien.getValueAt(row, 0).toString());
        txt_diem.setText(tb_sinhvien.getValueAt(row, 1).toString());
        cb_trangthai.setSelectedItem(tb_sinhvien.getValueAt(row, 2));
    }//GEN-LAST:event_tb_sinhvienMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int remove = tb_sinhvien.getSelectedRow();
        if (remove == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 ô để xóa");
        } else {
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?", "Xóa", JOptionPane.YES_NO_CANCEL_OPTION);
            if (opt == 0) {
                int row = tb_sinhvien.getSelectedRow();
                listSinhVien.remove(row);
                addRow();
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        int ext = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Yes", JOptionPane.YES_NO_OPTION);
        if (ext == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        String str = txt_tensv.getText();
        String str1 = txt_diem.getText();
        if (str.equals("") || str1.equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
        } else {
            List<SinhVien> list = getList();
            SinhVien sinhVien = new SinhVien();
            String tenSV = txt_tensv.getText();
//            int diem = Integer.parseInt((String) txt_diem.getText());
            try {
                int diem = Integer.parseInt(txt_diem.getText());
                if (diem < 0 || diem > 10) {
                    JOptionPane.showMessageDialog(this, "Nhập sai điểm");
                } else {
                    Object trangThai = cb_trangthai.getSelectedItem();

                    sinhVien.setTenSV(tenSV);
                    sinhVien.setTrangThai((String) trangThai);
                    sinhVien.setDiem(diem);

                    list.add(sinhVien);
//                    addRow();

                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "nhập số");
            }
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_loaddataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loaddataActionPerformed
        // TODO add your handling code here:
        addRow();
    }//GEN-LAST:event_btn_loaddataActionPerformed

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
    private javax.swing.JButton btn_loaddata;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_trangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_tensv;
    private javax.swing.JLabel lbl_trangthai;
    private javax.swing.JTable tb_sinhvien;
    private javax.swing.JTextField txt_diem;
    private javax.swing.JTextField txt_tensv;
    // End of variables declaration//GEN-END:variables
}
