import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class game11 extends javax.swing.JFrame {
    public game11() {
        initComponents();
        String str;
        String score="";
        int n;
          File varTmpDir = new File("score.txt");
       
        if(varTmpDir.exists()){
        try{
       
         BufferedReader br1=new BufferedReader(new FileReader("score.txt"));
            while ((str = br1.readLine()) != null) {
              		score+=str;
            }
        br1.close();
        String[] scr=score.split("-");
        String name=scr[0];
        int point=Integer.parseInt(scr[1]);
        l1.setText(name+"-"+point);
        }
        catch(Exception e)
        {
              Logger.getLogger(game11.class.getName()).log(Level.SEVERE, null, e);
        }}else{
        
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 270, 140, 50);

        l1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24));
        l1.setForeground(new java.awt.Color(0, 51, 204));
        l1.setText("No high score yet");
        getContentPane().add(l1);
        l1.setBounds(430, 430, 290, 50);

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 36));
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("F1 Racing");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 120, 390, 90);

        l2.setFont(new java.awt.Font("Viner Hand ITC", 1, 24));
        l2.setForeground(new java.awt.Color(0, 0, 255));
        l2.setText("High Score");
        getContentPane().add(l2);
        l2.setBounds(430, 360, 190, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formula_1_car-wallpaper-1366x768.jpg")));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 680);

        setBounds(0, 0, 958, 714);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        game2 g2=new game2();
        g2.setVisible(true);
        this.setVisible(false); 
    }
  public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game11().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
}
