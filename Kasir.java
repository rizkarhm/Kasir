import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;

/*
 * KELOMPOK 5 / SI 1A
 * author : RIZKA NUR RAHMA
 */

public class Kasir extends javax.swing.JFrame {

    public static String namaBarang, harga, jumlah, subTotal, diskon, bayar, newTotal, newDiskon, newBayar;
    public static int Harga;
    public static double Diskon, Bayar, Jumlah, SubTotal, Total, NewTotal, SelectItem, NewDiskon, NewBayar;

    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

    int baris = 0;
    static Object kolom[] = {"Nama Barang", "Harga", "Jumlah", "Subtotal"};
    DefaultTableModel tabel = new DefaultTableModel(kolom, baris);
    
    public Kasir() {
        initComponents();

        //set combo box element
        model.addElement("Pilih");
        model.addElement("Buku Tulis");
        model.addElement("Ballpoint");
        model.addElement("Pensil");
        model.addElement("Penghapus");
        model.addElement("Penggaris");
        model.addElement("Pensil Warna");
        model.addElement("Tipex");
        model.addElement("Spidol");
        model.addElement("Lem Uhu");
        model.addElement("Stabilo");

        //set model untuk combo box
        comboNama.setModel(model);

        //set model untuk tabel
        tabelKasir.setModel(tabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        comboNama = new javax.swing.JComboBox<>();
        labelHarga = new javax.swing.JLabel();
        textHarga = new javax.swing.JTextField();
        labelSubtotal = new javax.swing.JLabel();
        textSubTotal = new javax.swing.JTextField();
        labelJumlah = new javax.swing.JLabel();
        textJumlah = new javax.swing.JTextField();
        buttonTambah = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKasir = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false; //Disallow the editing of any cell
            }
        };
        labelTotal = new javax.swing.JLabel();
        textTotal = new javax.swing.JTextField();
        labelDiskon = new javax.swing.JLabel();
        textDiskon = new javax.swing.JTextField();
        labelBayar = new javax.swing.JLabel();
        textBayar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("KASIR");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 0, 28)); // NOI18N
        jLabel1.setText("KASIR");

        labelNama.setText("Nama Barang");

        comboNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNamaActionPerformed(evt);
            }
        });

        labelHarga.setText("Harga");

        textHarga.setEditable(false);

        labelSubtotal.setText("Subtotal");

        textSubTotal.setEditable(false);
        textSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubTotalActionPerformed(evt);
            }
        });

        labelJumlah.setText("Jumlah");

        textJumlah.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                // ketika teks dimasukkan
                subTotal();
            }
            public void removeUpdate(DocumentEvent e) {
                String a = textJumlah.getText().toString();
                if (a != null && a.length() > 0) {
                    subTotal();
                }else {
                    textSubTotal.setText("");
                }
            }

            public void changedUpdate(DocumentEvent e) {
                subTotal();
            }

            protected void subTotal(){
                Double Harga = Double.parseDouble(textHarga.getText());
                Double Jumlah = Double.parseDouble(textJumlah.getText());
                Double SubTotal = Harga*Jumlah;
                String subTotal = Double.toString(SubTotal);
                textSubTotal.setText(subTotal);
            }

        });
        textJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textJumlahActionPerformed(evt);
            }
        });

        buttonTambah.setBackground(new java.awt.Color(50, 206, 10));
        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonReset.setBackground(new java.awt.Color(255, 102, 102));
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonHapus.setBackground(new java.awt.Color(255, 255, 102));
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        tabelKasir.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelKasir);

        labelTotal.setText("Total");

        textTotal.setEditable(false);

        labelDiskon.setText("Diskon");

        textDiskon.setEditable(false);

        labelBayar.setText("Bayar");

        textBayar.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDiskon)
                                .addComponent(labelTotal)
                                .addComponent(labelBayar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonHapus))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama)
                            .addComponent(labelHarga)
                            .addComponent(labelJumlah)
                            .addComponent(labelSubtotal))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTambah)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textHarga)
                                .addComponent(comboNama, 0, 215, Short.MAX_VALUE)
                                .addComponent(textJumlah)
                                .addComponent(textSubTotal)))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(comboNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHarga)
                    .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHapus)
                    .addComponent(buttonReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDiskon))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clear(){
        comboNama.setSelectedIndex(0);
        textJumlah.setText("");
        textSubTotal.setText("");
        textTotal.setText("");
        textDiskon.setText("");
        textBayar.setText("");
    }
    
    private double subTotal() {
        SubTotal = Harga * Jumlah;
        subTotal = Double.toString(SubTotal);
        textSubTotal.setText(subTotal);
        return SubTotal;
    }

    private double total(){
        //hitung total
        Total = 0;
        for (int i = 0; i < tabelKasir.getRowCount(); i++) {
            double amount = Double.parseDouble(tabelKasir.getValueAt(i, 3).toString());
            Total += amount;
        }
        textTotal.setText("Rp "+Total);

        //hitung diskon + bayar
        if (Total > 100000) {
            Diskon = Total * 0.05;
        } else {
            Diskon = 0;
        }
        Bayar = Total - Diskon;
        diskon = Double.toString(Diskon);
        textDiskon.setText("Rp "+diskon);
                
        bayar = Double.toString(Bayar);
        textBayar.setText("Rp "+bayar);
        return Total;
    }

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        if (tabelKasir.getSelectedRowCount() == 1){
            int result = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus item ini?", "Kasir", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                int baris = tabelKasir.getSelectedRow();

                Object selectItem = tabelKasir.getValueAt(baris, 3);
                String total = textTotal.getText();
                String diskon = textDiskon.getText();
                String bayar = textBayar.getText();

                //hitung total
                total();

                //TotalBaru
                SelectItem = Double.parseDouble(selectItem.toString());
                NewTotal = Total - SelectItem;

                //DiskonBaru + BayarBaru
                if (NewTotal > 100000) {
                    NewDiskon = NewTotal * 0.05;
                } else {
                    NewDiskon = 0;
                }
                NewBayar = NewTotal - NewDiskon;

                newTotal = Double.toString(NewTotal);
                newDiskon = Double.toString(NewDiskon);
                newBayar = Double.toString(NewBayar);

                textTotal.setText("Rp "+newTotal);
                textDiskon.setText("Rp "+newDiskon);
                textBayar.setText("Rp "+newBayar);

                tabel.removeRow(baris);
                
                if (tabelKasir.getRowCount() == 0) {
                    //jika tabel kosong
                    textTotal.setText("");
                    textDiskon.setText("");
                    textBayar.setText("");
                }             
                JOptionPane.showMessageDialog(this, "Item berhasil dihapus");
            }                     
        } else {
            if (tabelKasir.getRowCount() == 0) {
                //jika tabel kosong
                JOptionPane.showMessageDialog(this, "Maaf, tabel kosong", "Kasir", JOptionPane.ERROR_MESSAGE);
            } else if (tabelKasir.getSelectedRowCount() > 1){
                //jika selectedRow > 1
                JOptionPane.showMessageDialog(this, "Maaf, Anda hanya dapat menghapus 1 item", "Kasir", JOptionPane.ERROR_MESSAGE);
            } else if (tabelKasir.getSelectedRowCount() == 0){                
                //jika selectedRow 0
                JOptionPane.showMessageDialog(this, "Silahkan pilih 1 item yang ingin dihapus", "Kasir", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        //ambil text
        //DefaultTableModel model = (DefaultTableModel) tabelKasir.getModel();

        namaBarang = comboNama.getSelectedItem().toString();
        harga = textHarga.getText();
        jumlah = textJumlah.getText();
        subTotal = textSubTotal.getText();

        //validasi
        try {
            if (harga.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pilih nama barang terlebih dahulu", "Terjadi Kesalahan", JOptionPane.ERROR_MESSAGE);
            } else if (jumlah.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Masukkan jumlah pembelian", "Terjadi Kesalahan", JOptionPane.ERROR_MESSAGE);
            } else {
                //konversi string to integer
                //Harga = Integer.parseInt(textHarga.getText());
                //Jumlah = Integer.parseInt(textJumlah.getText());

                //hitung subtotal
                //subTotal();
                
                //sub total dihitung melalui document listener pada text field jumlah

                //tambahkan data ke tabel
                tabel.addRow(new Object[] {namaBarang, harga, jumlah, subTotal});
                tabelKasir.setModel(tabel);

                total();
                JOptionPane.showMessageDialog(this, "Item berhasil di tambahkan");
                
                //clear inputan
                comboNama.setSelectedIndex(0);
                textJumlah.setText("");
                textSubTotal.setText("");
            }
        } catch (NumberFormatException e) {
            //validasi hanya angka
            JOptionPane.showMessageDialog(this, "Jumlah harus berupa angka", "Terjadi Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void comboNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNamaActionPerformed
        String harga, barang = comboNama.getSelectedItem().toString();

        if (barang.equals("Buku Tulis")) {
            harga = "25000";
        } else if (barang.equals("Ballpoint")) {
            harga = "5000";
        } else if (barang.equals("Pensil")) {
            harga = "4000";
        } else if (barang.equals("Penghapus")) {
            harga = "3000";
        } else if (barang.equals("Penggaris")) {
            harga = "7000";
        } else if (barang.equals("Pensil Warna")) {
            harga = "45000";
        } else if (barang.equals("Tipex")) {
            harga = "10000";
        } else if (barang.equals("Spidol")) {
            harga = "8000";
        } else if (barang.equals("Lem Uhu")) {
            harga = "6000";
        } else if (barang.equals("Stabilo")) {
            harga = "15000";
        } else {
            harga = "";
        }

        textHarga.setText(harga);
    }//GEN-LAST:event_comboNamaActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        if (tabelKasir.getRowCount() == 0) {
            //jika tabel kosong
            JOptionPane.showMessageDialog(this, "Maaf, tabel kosong", "Kasir", JOptionPane.ERROR_MESSAGE);
        } else {
            int result = JOptionPane.showConfirmDialog(this,
                    "Anda yakin ingin menghapus semua data pada tabel?",
                    "Reset",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                clear();
                tabel.getDataVector().removeAllElements();
                tabel.fireTableDataChanged();
            }
        } 
    }//GEN-LAST:event_buttonResetActionPerformed

    private void textJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textJumlahActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String ObjButtons[] = {"Ya", "Tidak"};
        int result = JOptionPane.showConfirmDialog(this, 
                        "Anda yakin ingin menutup program ini?", 
                        "Kasir", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
           dispose();
           Main main = new Main();
           main.setVisible(true); 
        }
    }//GEN-LAST:event_formWindowClosing

    private void textSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSubTotalActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
                Main main = new Main();
                main.setVisible(false); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JComboBox<String> comboNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelBayar;
    private javax.swing.JLabel labelDiskon;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tabelKasir;
    private javax.swing.JTextField textBayar;
    private javax.swing.JTextField textDiskon;
    private javax.swing.JTextField textHarga;
    private javax.swing.JTextField textJumlah;
    private javax.swing.JTextField textSubTotal;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables
}
