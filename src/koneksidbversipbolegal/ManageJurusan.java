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
public class ManageJurusan extends javax.swing.JDialog {

    /**
     * Creates new form ManageJurusan
     */
    java.sql.Connection koneksi;
    String action; 
    public ManageJurusan(java.awt.Frame parent, boolean modal, String act, String id_jurusan) throws SQLException, ParseException {
        super(parent, modal);
        initComponents();
        koneksi = SQLiteConnection.connect();
        
        action = act;
        if (action.equals("Edit")) {
           lblRenameAble.setText("Edit Data");
           txtIDJurusan.setEnabled(false);
           showData(id_jurusan);
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
        txtIDJurusan = new javax.swing.JTextField();
        txtNamaJurusan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 196, 176));

        lblRenameAble.setBackground(java.awt.Color.white);
        lblRenameAble.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lblRenameAble.setToolTipText("");

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel2.setText("ID Jurusan");
        jLabel2.setToolTipText("");

        txtIDJurusan.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        txtIDJurusan.setToolTipText("");

        txtNamaJurusan.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        txtNamaJurusan.setToolTipText("");

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setText("Nama Jurusan");
        jLabel3.setToolTipText("");

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButton1.setText("Simpan");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIDJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNamaJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 121, Short.MAX_VALUE)
                .addComponent(lblRenameAble, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRenameAble, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(115, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (action.equals("Edit")) {
            editData();
            String edit = "Edit Data";
            lblRenameAble.setText("" + edit);
        }
        else {
            tambahData();
        }
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
            java.util.logging.Logger.getLogger(ManageJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageJurusan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRenameAble;
    private javax.swing.JTextField txtIDJurusan;
    private javax.swing.JTextField txtNamaJurusan;
    // End of variables declaration//GEN-END:variables

    private void showData(String id_jurusan) throws SQLException {
        Statement stm = koneksi.createStatement();
        String query = "SELECT * FROM t_jurusan WHERE id_jurusan= '" + id_jurusan + "'";
        ResultSet rs = stm.executeQuery(query);
            
        try{
            while(rs.next()){
                txtIDJurusan.setText(rs.getString("id_jurusan"));
                txtNamaJurusan.setText(rs.getString("nama_jurusan"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageData.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            rs.close();
        }
        
    }

    private void editData() {
        String id_jurusan = txtIDJurusan.getText();
        String nama_jurusan = txtNamaJurusan.getText();
        
        Statement stm = null;
        try{
            stm = koneksi.createStatement();
            String query = "UPDATE t_jurusan SET nama_jurusan= '" + nama_jurusan + "'WHERE id_jurusan = '" + id_jurusan + "'"; 
            System.out.println(query);
            int berhasil = stm.executeUpdate(query);
            if (berhasil == 1) {
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                this.setVisible(false);
                DataJurusan main = new DataJurusan();
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

    private void tambahData() {
        String id_jurusan = txtIDJurusan.getText();
        String nama_jurusan = txtNamaJurusan.getText();
        
        try{
            Statement stm = koneksi.createStatement();
            String query = "INSERT INTO t_jurusan(id_jurusan,nama_jurusan)" + "VALUES('"+id_jurusan+"','"+nama_jurusan+"')";
            System.out.println(query);
            int berhasil = stm.executeUpdate(query);
            if (berhasil == 1) {
                JOptionPane.showMessageDialog(null,"Data berhasil dimasukan");
                this.setVisible(false);
                DataJurusan main = new DataJurusan();
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
}
