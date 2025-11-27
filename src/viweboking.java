
package vieww;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class viweboking extends javax.swing.JFrame {

  
    public viweboking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Rewiew = new javax.swing.JTextField();
        viewBokking = new javax.swing.JButton();
        main = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Booking");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vieww/الشعار معدل.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 73, 144));
        jLabel2.setText("Please enter your phone number");

        Rewiew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RewiewActionPerformed(evt);
            }
        });

        viewBokking.setBackground(new java.awt.Color(204, 255, 255));
        viewBokking.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        viewBokking.setForeground(new java.awt.Color(14, 73, 144));
        viewBokking.setText("View Booking");
        viewBokking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBokkingActionPerformed(evt);
            }
        });

        main.setBackground(new java.awt.Color(204, 255, 255));
        main.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        main.setForeground(new java.awt.Color(14, 73, 144));
        main.setText("Back");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(viewBokking)
                        .addGap(188, 188, 188)
                        .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(Rewiew, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {main, viewBokking});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rewiew, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBokking)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {main, viewBokking});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RewiewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RewiewActionPerformed
       
    }//GEN-LAST:event_RewiewActionPerformed

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
       this.setVisible (false);
new HomeForm().setVisible(true) ;
    }//GEN-LAST:event_mainActionPerformed

    private void viewBokkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBokkingActionPerformed
         try {
        Connection conn = DBConnection.connect(); 

        String sql = "SELECT customerFname, customerLname, phone, " +
                     "tripType, tripDate, passengersNum, price " +
                     "FROM Customer " +
                     "INNER JOIN Booking b ON Customer.customerID = b.customerID " +
                     "WHERE phone = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, Rewiew.getText().trim());

        ResultSet bookingData = pst.executeQuery();

        if (bookingData.next()) {

            String TripInformation =
                "First Name: " + bookingData.getString("customerFname") + "\n" +
                "Last Name: " + bookingData.getString("customerLname") + "\n" +
                "Phone: " + bookingData.getString("phone") + "\n\n" +
                "Booking Details:\n" +
                "Trip Type: " + bookingData.getString("tripType") + "\n" +
                "Trip Date: " + bookingData.getString("tripDate") + "\n" +
                "Passengers: " + bookingData.getString("passengersNum") + "\n" +
                "Price: " + bookingData.getString("price");

            JOptionPane.showMessageDialog(this, TripInformation,
                "Trip Review", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this,
                "Dear Customer,\n" +
                "We would like to inform you that there are currently no bookings under your number.\n" +
                "Please check the phone number and try again.",
                "No Booking Found",
                JOptionPane.INFORMATION_MESSAGE);
        }

        conn.close(); 

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "ERROR: " + ex.getMessage());
    }
    }//GEN-LAST:event_viewBokkingActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viweboking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Rewiew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton main;
    private javax.swing.JButton viewBokking;
    // End of variables declaration//GEN-END:variables
}
