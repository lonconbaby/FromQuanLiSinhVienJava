
import Form_Login.Const;
import Hiberneat.Public.Lop;
import Hiberneat.SinhVien.SinhVien;
import Hiberneat.User.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import org.hibernate.query.Query;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author admin
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        Loat();
        ImageIcon icon = new ImageIcon("src/main/java/img/icons8_registration_30px_1.png");
        btn.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jcombotimlop = new javax.swing.JComboBox<>();
        btn = new javax.swing.JButton();
        btntim = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 210, 810, 365);

        jcombotimlop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "19CT113", "20TK" }));
        getContentPane().add(jcombotimlop);
        jcombotimlop.setBounds(200, 90, 130, 30);

        btn.setText("jButton1");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn);
        btn.setBounds(390, 90, 73, 23);

        btntim.setText("jButton1");
        btntim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimActionPerformed(evt);
            }
        });
        getContentPane().add(btntim);
        btntim.setBounds(400, 130, 73, 23);

        txttim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttimFocusGained(evt);
            }
        });
        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimKeyPressed(evt);
            }
        });
        getContentPane().add(txttim);
        txttim.setBounds(210, 140, 120, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        Loat();
    }//GEN-LAST:event_btnActionPerformed

    private void btntimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimActionPerformed
        Query query = Const.session.createQuery("SELECT c.MaSV,c.hoten,c.Gioitinh,c.NgaySinh,c.SoDienThoai,c.Diachi From SinhVien c join Lop l on c.MaLop = l.Malop where l.Makhoa = "+"'" + txttim.getText() +"'" );
//        List<Object[]> listResult = query.getResultList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
//        Query<Object[]> query = Const.session.createQuery(q);
        List<Object[]> listResult = query.getResultList();
        for (Object[] item : listResult) {
            model.addRow(item);

        }

    }//GEN-LAST:event_btntimActionPerformed

    private void txttimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimFocusGained
       
    }//GEN-LAST:event_txttimFocusGained

    private void txttimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyPressed
        if(txttim.getText().isEmpty())
       {
        Loat();
       }
    }//GEN-LAST:event_txttimKeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    public void Loat() {

//join Lop l on c.MaLop = l.Malop where l.TenLop = 19CT
//        Query query = Const.session.createQuery("SELECT c.MaSV,l.Makhoa From SinhVien c join Lop l on c.MaLop = l.Malop where l.TenLop ='19CT'");
        Query query = Const.session.createQuery("SELECT c.MaSV,c.hoten,c.Gioitinh,c.NgaySinh,c.SoDienThoai,c.Diachi From SinhVien c join Lop l on c.MaLop = l.Malop");
//        List<Object[]> listResult = query.getResultList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
//        Query<Object[]> query = Const.session.createQuery(q);
        List<Object[]> listResult = query.getResultList();
        for (Object[] item : listResult) {
            model.addRow(item);

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btntim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcombotimlop;
    private javax.swing.JTable table;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
}
