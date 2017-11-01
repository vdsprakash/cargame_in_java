
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class game3 extends javax.swing.JFrame {
int s=0;
    int n;
      String s1="";
        BufferedWriter bw; 
    public game3(int s) {
        initComponents();
        this.s=s;
        String s1;
        String str;
        String score="";
        l1.setText("Your Score is\t "+Integer.toString(s));
        b1.setVisible(true);
        b2.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        t.setVisible(false);

         File varTmpDir = new File("score.txt");
        try{
        if(varTmpDir.exists()){
            System.out.println("File exist");
             BufferedReader br1=new BufferedReader(new FileReader("score.txt"));
            while ((str = br1.readLine()) != null) {
              		score+=str;
            }
        String[] scr=score.split("-");
        String name=scr[0];
        int point=Integer.parseInt(scr[1]);
        System.out.println(name+","+point);
        if(point<s){
           
         b2.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        t.setVisible(true);
       
        }   
        }else{
            PrintWriter writer = new PrintWriter("score.txt", "UTF-8");
            writer.close();
          b2.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        t.setVisible(true);
        }
        }catch(Exception i){
        
        }
        
        
    }

    private game3() {
      
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        t = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GAME  OVER!!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 70, 390, 70);

        l1.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 0, 153));
        l1.setText("Your score is 360");
        getContentPane().add(l1);
        l1.setBounds(340, 170, 390, 70);

        b1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        b1.setText("Restart");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(410, 300, 140, 50);

        l2.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("High Score!!");
        getContentPane().add(l2);
        l2.setBounds(370, 390, 340, 60);

        l3.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Enter Your Name");
        getContentPane().add(l3);
        l3.setBounds(120, 480, 230, 50);

        b2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        b2.setText("Ok");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(670, 480, 80, 50);

        t.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        getContentPane().add(t);
        t.setBounds(350, 480, 300, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formula_1_accident-normal5.4.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 950, 680);

        setBounds(0, 0, 958, 712);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      game11 g11=new game11();
      g11.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       
    try {
       
        if(t.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Enter your name");
         }else{
             bw = new BufferedWriter(new FileWriter("score.txt"));
        bw.write(t.getText().toString()+"-"+s);
         bw.close();
        game11 g11=new game11();
        g11.setVisible(true);
        this.setVisible(false);
      }
    }
    catch(Exception e)
    {
       // JOptionPane.showMessageDialog(null,e);
      
    }
   
       
    }//GEN-LAST:event_b2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}
