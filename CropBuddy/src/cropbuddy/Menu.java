
package cropbuddy;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;



public class Menu extends javax.swing.JPanel {

   
    public Menu() {
        initComponents();
        setOpaque(false);
            }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelmoving = new javax.swing.JPanel();
        Label_1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panelmoving.setOpaque(false);
        Panelmoving.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_1.setFont(new java.awt.Font("Thunder", 0, 24)); // NOI18N
        Label_1.setForeground(new java.awt.Color(0, 0, 0));
        Label_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/icons8-organic-food-40.png"))); // NOI18N
        Label_1.setText("CropBuddy");
        Panelmoving.add(Label_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 70));

        add(Panelmoving, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        jLabel1.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/icons8-shutdown-50.png"))); // NOI18N
        jLabel1.setText("Logout");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 450, 220, -1));

        jLabel2.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/icons8-male-user-48.png"))); // NOI18N
        jLabel2.setText("Profile");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 88, 220, 60));

        jLabel3.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/icons8-laptop-metrics-50.png"))); // NOI18N
        jLabel3.setText("DashBoard");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 150, 220, -1));

        jLabel4.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/icons8-get-cash-50.png"))); // NOI18N
        jLabel4.setText("Sell Product");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 200, 230, -1));

        jLabel5.setFont(new java.awt.Font("Thunder", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/icons8-wheat-48.png"))); // NOI18N
        jLabel5.setText("Crop Management");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintChildren(Graphics grphcs){
        Graphics2D g2=(Graphics2D)grphcs;//creating object for graphics usage
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//rendering the panel
        GradientPaint g = new GradientPaint(0,0,Color.decode("#78ffd6"),TOP_ALIGNMENT,getHeight(),Color.decode("#a8ff78"));//adding gradient paint 
        g2.setPaint(g);//set gradient color
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15 );//adding circular effect to panel
        g2.fillRect(getWidth()-20, 0,getWidth(), getHeight());// for menu
        super.paintChildren(grphcs);
        }
    private int x;
    private int y;
    public void initMoving(JFrame fram) {
        Panelmoving.addMouseListener(new MouseAdapter() {     //Adding mouse code for moving panel
            @Override
            public void mousePressed(MouseEvent me){
                x = me.getX();
                y = me.getY();
            }
        });
        Panelmoving.addMouseMotionListener(new MouseMotionAdapter (){   //Adding code for dragging panel
            @Override
            public void mouseDragged(MouseEvent me){
                fram.setLocation(me.getXOnScreen()-x, me.getYOnScreen()-y); 
            }
        });
    }
       
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_1;
    private javax.swing.JPanel Panelmoving;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}