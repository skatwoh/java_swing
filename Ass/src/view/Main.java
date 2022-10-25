/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entity.NhanVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame implements Runnable {

    private int index = -1;
    private DefaultTableModel dtm;
    List<NhanVien> listNhanVien = new ArrayList<>();
    private static final String P_EMAIL = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

    public Main() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
        addItemColumns();
        addRow();
        lbl_dem.setText(layThongTin());
        setLocationRelativeTo(null);

    }

    private void addItemColumns() {
        ArrayList<String> listItem = new ArrayList<>();
        listItem.add("MÃ");
        listItem.add("HỌ VÀ TÊN");
        listItem.add("TUỔI");
        listItem.add("EMAIL");
        listItem.add("LƯƠNG");

        dtm = (DefaultTableModel) tb_nhanvien.getModel();
        dtm.setColumnCount(0);
        for (String item : listItem) {
            dtm.addColumn(item);
        }
    }

    public String layThongTin() {
        return "Record: " + (index + 1) + "of" + listNhanVien.size();
    }

    public void addRow() {
        dtm = (DefaultTableModel) tb_nhanvien.getModel();
        dtm.setRowCount(0);
        for (NhanVien x : listNhanVien) {
            dtm.addRow(
                    new Object[]{
                        x.getMaNV(),
                        x.getHoTen(),
                        x.getTuoi(),
                        x.getEmail(),
                        x.getLuong()
                    }
            );
        }
    }

    public NhanVien timTheoMa(String maNV) {
        for (NhanVien nv : listNhanVien) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                return nv;
            }
        }
        return null;
    }

    public void findNhanVien(int index) {
        txt_manv.setText(listNhanVien.get(index).getMaNV());
        txt_tennv.setText(listNhanVien.get(index).getHoTen());
        txt_email.setText(listNhanVien.get(index).getEmail());
        txt_tuoi.setText(String.valueOf(listNhanVien.get(index).getTuoi()));
        txt_luong.setText(String.valueOf(listNhanVien.get(index).getLuong()));
    }

    public void findNhanVien(NhanVien nv) {
        txt_manv.setText(nv.getMaNV());
        txt_tennv.setText(nv.getHoTen());
        txt_email.setText(nv.getEmail());
        txt_tuoi.setText(String.valueOf(nv.getTuoi()));
        txt_luong.setText(String.valueOf(nv.getLuong()));
    }

    public void updateTB() {
        tb_nhanvien.setRowSelectionInterval(index, index);
        findNhanVien(index);
        lbl_dem.setText(layThongTin());
    }

    public NhanVien readForm() {
        return new NhanVien(txt_manv.getText(), txt_tennv.getText(), Integer.valueOf(txt_tuoi.getText()), txt_email.getText(), Double.parseDouble(txt_luong.getText()));
    }

    public boolean validateForm() {
        if (txt_manv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã nhân viên");
            return false;
        } else {
            for (NhanVien nhanVien : listNhanVien) {
                if (nhanVien.getMaNV().equalsIgnoreCase(txt_manv.getText())) {
                    JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại");
                    return false;
                }
            }
        }
        if (txt_tennv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã họ tên");
            return false;

        }
        if (txt_tuoi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tuổi");
            return false;
        }
        try {
            int tuoi = Integer.parseInt(txt_tuoi.getText());
            if (tuoi < 16 || tuoi > 55) {
                JOptionPane.showMessageDialog(this, "Tuổi phải từ 16 đến 55");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tuổi phải là số");
            return false;
        }

        if (txt_email.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập email");
            return false;
        }
        Matcher matcher = Pattern.compile(P_EMAIL).matcher(txt_email.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Email sai định dạng");
            return false;
        }
        if (txt_luong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập lương");
            return false;
        }
        try {
            double luong = Double.parseDouble(txt_luong.getText());
            if (luong < 5000000) {
                JOptionPane.showMessageDialog(this, "Lương phải lớn hơn 5000000");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lương phải là số", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    public ArrayList<NhanVien> readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("listnv.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        NhanVien nv = new NhanVien();
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        while (fis.available() > 0) {
            nv = (NhanVien) ois.readObject();
            listNhanVien.add(nv);
        }
        System.out.println(listNhanVien.size());

        ois.close();
        fis.close();

        return listNhanVien;
    }

    public void saveFile() throws FileNotFoundException, IOException {
        File file = new File("listnv.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (NhanVien nhanVien : listNhanVien) {
            oos.writeObject(nhanVien);
        }

        oos.close();
        fos.close();
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
        lbl_manv = new javax.swing.JLabel();
        lbl_tennv = new javax.swing.JLabel();
        lbl_tuoi = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_luong = new javax.swing.JLabel();
        txt_manv = new javax.swing.JTextField();
        txt_tennv = new javax.swing.JTextField();
        txt_tuoi = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_luong = new javax.swing.JTextField();
        lbl_time = new javax.swing.JLabel();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_find = new javax.swing.JButton();
        btn_open = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_nhanvien = new javax.swing.JTable();
        btn_first = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        lbl_dem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        lbl_manv.setText("MÃ NHÂN VIÊN");

        lbl_tennv.setText("HỌ VÀ TÊN");

        lbl_tuoi.setText("TUỔI");

        lbl_email.setText("EMAIL");

        lbl_luong.setText("LƯƠNG");

        lbl_time.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 0, 51));

        btn_new.setText("New");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_find.setText("Find");
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        btn_open.setText("Open");
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        tb_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_nhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_nhanvien);

        btn_first.setText("|<");
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });

        btn_prev.setText("<<");
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });

        btn_next.setText(">>");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_last.setText(">|");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });

        lbl_dem.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_tennv)
                            .addComponent(lbl_manv)
                            .addComponent(lbl_tuoi)
                            .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_luong))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_luong, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_exit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_tennv)
                                            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                            .addComponent(txt_tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_save, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_new, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_find, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_open, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(lbl_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_manv, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 152, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btn_new)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_save))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_manv)
                            .addComponent(txt_manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tennv)
                            .addComponent(txt_tennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tuoi)
                            .addComponent(txt_tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_email)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_luong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_find)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_open)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_exit)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_first)
                    .addComponent(btn_last)
                    .addComponent(btn_prev)
                    .addComponent(btn_next)
                    .addComponent(lbl_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        int ext = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Yes", JOptionPane.YES_NO_OPTION);
        if (ext == 0) {
            try {
                saveFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        txt_manv.setText("");
        txt_tennv.setText("");
        txt_tuoi.setText("");
        txt_email.setText("");
        txt_luong.setText("");
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
        if (txt_manv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập mã để tìm nv");
        } else {
            findNhanVien(timTheoMa(txt_manv.getText()));
        }
    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            if (index == -1) {
                listNhanVien.add(readForm());
                addRow();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        // TODO add your handling code here:
        if (!listNhanVien.isEmpty()) {
            index = 0;
            updateTB();
        }
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        // TODO add your handling code here:
        if (!listNhanVien.isEmpty()) {
            if (index == 0) {
                if (!listNhanVien.isEmpty()) {
                    index = listNhanVien.size() - 1;
                    updateTB();
                }
            } else {
                index--;
            }
            updateTB();
        }
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        if (!listNhanVien.isEmpty()) {
            if (index == listNhanVien.size() - 1) {
                if (!listNhanVien.isEmpty()) {
                    index = 0;
                    updateTB();
                }
            } else {
                index++;
            }
            updateTB();
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        // TODO add your handling code here:
        if (!listNhanVien.isEmpty()) {
            index = listNhanVien.size() - 1;
            updateTB();
        }
    }//GEN-LAST:event_btn_lastActionPerformed

    private void btn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openActionPerformed
        try {
            ArrayList<NhanVien> listNhanVien = readFile();
            dtm = (DefaultTableModel) tb_nhanvien.getModel();
            dtm.setRowCount(0);
            for (NhanVien x : listNhanVien) {
                dtm.addRow(
                        new Object[]{
                            x.getMaNV(),
                            x.getHoTen(),
                            x.getTuoi(),
                            x.getEmail(),
                            x.getLuong()
                        }
                );

            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_openActionPerformed

    private void tb_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_nhanvienMouseClicked
        // TODO add your handling code here:
        int row = tb_nhanvien.getSelectedRow();
        txt_manv.setText(tb_nhanvien.getValueAt(row, 0).toString());
        txt_tennv.setText(tb_nhanvien.getValueAt(row, 1).toString());
        txt_tuoi.setText(tb_nhanvien.getValueAt(row, 2).toString());
        txt_email.setText(tb_nhanvien.getValueAt(row, 3).toString());
        txt_luong.setText(tb_nhanvien.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tb_nhanvienMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Ban co muon xoa", "xoa", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            int row = tb_nhanvien.getSelectedRow();
            listNhanVien.remove(row);
            addRow();
            try {
                saveFile();

            } catch (IOException ex) {
                Logger.getLogger(Main.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(this, "Xóa thành công.");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_open;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_dem;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_luong;
    private javax.swing.JLabel lbl_manv;
    private javax.swing.JLabel lbl_tennv;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_tuoi;
    private javax.swing.JTable tb_nhanvien;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_luong;
    private javax.swing.JTextField txt_manv;
    private javax.swing.JTextField txt_tennv;
    private javax.swing.JTextField txt_tuoi;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);
            int secord = cal.get(Calendar.SECOND);

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm aa");
            Date dat = cal.getTime();
            String time = sdf.format(dat);

            lbl_time.setText(time);
        }
    }

}
