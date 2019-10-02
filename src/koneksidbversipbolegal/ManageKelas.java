package koneksidbversipbolegal;


import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class ManageKelas extends javax.swing.JDialog{

    /**
     * Creates new form ManageKelas
     */
    java.sql.Connection koneksi;
    String action; 
    public ManageKelas(java.awt.Frame parent, boolean modal, String act, String id_kelas) throws SQLException, ParseException {
        super(parent, modal);
        initComponents();
        koneksi = SQLiteConnection.connect();
        
        action = act;
        if (action.equals("Edit")) {
           lblRenameAble.setText("Edit Data");
           txtIDKelas.setEnabled(false);
           showData(id_kelas);
       }else{
            lblRenameAble.setText("Tambah Data");
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
        lblRenameAble = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDKelas = new javax.swing.JTextField();
        txtNamaKelas = new javax.swing.JTextField();
        txtTingkat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 196, 176));

        lblRenameAble.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel2.setText("ID Kelas");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setText("Nama Kelas");

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setText("Tingkat");

        txtIDKelas.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        txtIDKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDKelasActionPerformed(evt);
            }
        });

        txtNamaKelas.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N

        txtTingkat.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        txtTingkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTingkatActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel5.setText("1-4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 118, Short.MAX_VALUE)
                .addComponent(lblRenameAble, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNamaKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(txtTingkat))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblRenameAble, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDKelasActionPerformed

    private void txtTingkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTingkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTingkatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (action.equals("Edit")) {
            try {
                editData();
            } catch (ParseException ex) {
                Logger.getLogger(ManageKelas.class.getName()).log(Level.SEVERE, null, ex);
            }
            String edit = "Edit Data";
            lblRenameAble.setText("" + edit);
        }
        else {
            try {
                tambahData();
            } catch (ParseException ex) {
                Logger.getLogger(ManageKelas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRenameAble;
    private javax.swing.JTextField txtIDKelas;
    private javax.swing.JTextField txtNamaKelas;
    private javax.swing.JTextField txtTingkat;
    // End of variables declaration//GEN-END:variables

    public void showData(String id_kelas) throws SQLException {
        Statement stm = koneksi.createStatement();
        String query = "SELECT * FROM t_kelas WHERE id_kelas = '" + id_kelas + "'";
        ResultSet rs = stm.executeQuery(query);
            
        try{
            while(rs.next()){
                txtIDKelas.setText(rs.getString("id_kelas"));
                txtNamaKelas.setText(rs.getString("nama_kelas"));
                txtTingkat.setText(rs.getString("tingkat"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageData.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            rs.close();
        }
    }
    public void tambahData() throws ParseException{
        String id_kelas = txtIDKelas.getText();
        String nama_kelas = txtNamaKelas.getText();
        String tingkat = txtTingkat.getText();
        
        try{
            Statement stm = koneksi.createStatement();
            String query = "INSERT INTO t_kelas(id_kelas,nama_kelas,tingkat)" + "VALUES('"+id_kelas+"','"+nama_kelas+"','"+tingkat+"')";
            System.out.println(query);
            int berhasil = stm.executeUpdate(query);
            if (berhasil == 1) {
                JOptionPane.showMessageDialog(null,"Data berhasil dimasukan");
                this.setVisible(false);
                DataKelas main = new DataKelas();
                main.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Data gagal dimasukan");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Koneksi database nya");
        }
    }
    public void editData() throws ParseException{
        String id_kelas = txtIDKelas.getText();
        String nama_kelas = txtNamaKelas.getText();
        String tingkat = txtTingkat.getText();
        
        Statement stm = null;
        try{
            stm = koneksi.createStatement();
            String query = "UPDATE t_kelas SET nama_kelas = '" + nama_kelas + "', tingkat = '" + tingkat  + "'WHERE id_kelas = '" + id_kelas + "'"; 
            System.out.println(query);
            int berhasil = stm.executeUpdate(query);
            if (berhasil == 1) {
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                this.setVisible(false);
                DataKelas main = new DataKelas();
                main.setVisible(true);
                stm.close();
            }
            else {
                JOptionPane.showMessageDialog(null, "Data gagal diubah");                      
            }
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Query nya");
        }
        finally{
            try {
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(ManageKelas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        
    }
    
}
