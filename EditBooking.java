import java.sql.*;
import java.time.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class EditBooking extends javax.swing.JFrame {
    // عرفنا متغيرات
     // اسعار الرحلة
    private static final double PRICE_DOLPHIN = 250;
    private static final double PRICE_RED_SEA_1DAY = 500;
    private static final double PRICE_JEDDAH_2DAYS = 1000;
    private static final double PRICE_LUXURY_5DAYS = 2500;
    private static final double PRICE_PREMIUM_10DAYS = 5000;
    
    public EditBooking() {
        initComponents();// عناصر الواجهة
        Price.setEditable(false);// خانة السعر المستخدم مايقدر يكتب فيها
        ComboBoxType.addActionListener(new ActionListener() {//مستمع الحدث للقائمة المنسدلة 
            public void actionPerformed(ActionEvent evt) {
                calculateAndDisplayPrice(); //إذا المستخدم اختار نوع الرحلة من القائمة ينفذ هذي الدالة 
            }
        });
        TextPeople.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculateAndDisplayPrice();
            }
        });}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        People = new javax.swing.JLabel();
        Prise = new javax.swing.JLabel();
        ButtonCancel = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        BookingID = new javax.swing.JLabel();
        TextBookingID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextPeople = new javax.swing.JTextField();
        TripDate1 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Choose = new javax.swing.JLabel();
        ComboBoxType = new javax.swing.JComboBox<>();
        d = new javax.swing.JTextField();
        m = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Booking");
        setName("Edit Booking"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName("Edit Booking"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 73, 144));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Booking");

        People.setBackground(new java.awt.Color(140, 215, 252));
        People.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        People.setForeground(new java.awt.Color(160, 27, 27));
        People.setText("Number of People");

        Prise.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        Prise.setForeground(new java.awt.Color(160, 27, 27));
        Prise.setText("Prise (SAR):");

        ButtonCancel.setBackground(new java.awt.Color(212, 235, 252));
        ButtonCancel.setFont(new java.awt.Font("Cooper Black", 0, 35)); // NOI18N
        ButtonCancel.setForeground(new java.awt.Color(24, 80, 141));
        ButtonCancel.setText("Cancel");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        ButtonSave.setBackground(new java.awt.Color(212, 235, 252));
        ButtonSave.setFont(new java.awt.Font("Cooper Black", 0, 35)); // NOI18N
        ButtonSave.setForeground(new java.awt.Color(24, 80, 141));
        ButtonSave.setText("Save");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        ButtonBack.setBackground(new java.awt.Color(212, 235, 252));
        ButtonBack.setFont(new java.awt.Font("Cooper Black", 0, 35)); // NOI18N
        ButtonBack.setForeground(new java.awt.Color(24, 80, 141));
        ButtonBack.setText("Back ");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        BookingID.setBackground(new java.awt.Color(140, 215, 252));
        BookingID.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        BookingID.setForeground(new java.awt.Color(160, 27, 27));
        BookingID.setText("Booking ID");

        TextBookingID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextBookingID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextBookingID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextBookingIDActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/الشعار معدل.png"))); // NOI18N

        TextPeople.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPeopleActionPerformed(evt);
            }
        });

        TripDate1.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        TripDate1.setForeground(new java.awt.Color(160, 27, 27));
        TripDate1.setText("Trip Date ");

        Price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        Choose.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        Choose.setForeground(new java.awt.Color(160, 27, 27));
        Choose.setText("Choose a Trip Type ");

        ComboBoxType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolphin Watching - (3h) 3pm - 6pm ", "Red Sea Boat Tour - 1 day (Fishing, Swimming)", "Jeddah Coastal Adventure - 2 days(Seafood dining, Beach activities)", "Luxury Red Sea Tour- 5 days (Private suite, Gourmet dining, Luxury excursions)", "Saudi Premium Cruise - 10 days (All-inclusive, Luxury suites, Cultural tours, Water activities, Fine dining)" }));
        ComboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTypeActionPerformed(evt);
            }
        });

        d.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        m.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        y.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 73, 144));
        jLabel2.setText("DD");

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(14, 73, 144));
        jLabel3.setText("MM");

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(14, 73, 144));
        jLabel4.setText("YY");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("/");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("/");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Calculated automatically based on your choices");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(776, 776, 776)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(421, 421, 421)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel3)
                                            .addGap(86, 86, 86)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(21, 21, 21))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(TripDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Prise, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(People, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Choose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(46, 46, 46)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(633, 633, 633)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(602, 602, 602))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(TextBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Choose, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextPeople, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(People, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Prise, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TripDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(251, 251, 251))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTypeActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void TextPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPeopleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPeopleActionPerformed

    private void TextBookingIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextBookingIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBookingIDActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
    this.setVisible(false);// هنا ترجع لنافذة الرئيسية
    }//GEN-LAST:event_ButtonBackActionPerformed
    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        int bookingIdToUpdate;// متغير يخزن رقم الحجز اللي راح نعدله
        try {
            String idText = TextBookingID.getText().trim();
            if (idText.isEmpty()) {
                 JOptionPane.showMessageDialog(this, "Enter your reservation number", "Error", JOptionPane.ERROR_MESSAGE);
                 return;
            }
            bookingIdToUpdate = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a number for the number of people", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int newPassengersNum;
        try {
            newPassengersNum = Integer.parseInt(TextPeople.getText().trim());
            if (newPassengersNum <= 0) {
                JOptionPane.showMessageDialog(this, "The number of people must be above zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " The number of people must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        LocalDate newTripDate;
        try {
            int Day = Integer.parseInt(d.getText().trim());
            int Month = Integer.parseInt(m.getText().trim());
            int Year = Integer.parseInt(y.getText().trim());
            newTripDate = LocalDate.of(Year, Month, Day);
            if (newTripDate.isBefore(LocalDate.now())) {
                JOptionPane.showMessageDialog(this, "A date from the past cannot be reserved", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a date", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (java.time.DateTimeException e) { 
            JOptionPane.showMessageDialog(this, "Error in writing the date", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String newTripType = (String) ComboBoxType.getSelectedItem();
        double newPrice = calculateAndDisplayPrice(); 
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean isChanged = false;
        try {
            conn = DBConnection.connect(); 
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String sql = "SELECT tripType, passengersNum, tripDate FROM Booking WHERE bookingID = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, bookingIdToUpdate);
            rs = pst.executeQuery();

            if (rs.next()) {
                String oldTripType = rs.getString("tripType");
                int oldPassengersNum = rs.getInt("passengersNum");
                LocalDate oldTripDate = rs.getDate("tripDate").toLocalDate(); 
                if (!newTripType.equals(oldTripType) ||
                    newPassengersNum != oldPassengersNum ||
                    !newTripDate.equals(oldTripDate)) {
                    isChanged = true;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Reservation number" + bookingIdToUpdate+" " + "Not present in the system", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error reading old data" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        } 
        if (!isChanged) {
            JOptionPane.showMessageDialog(this, "Your reservation has been updated", "alert", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            updateBooking(bookingIdToUpdate, newTripType, Date.valueOf(newTripDate), newPassengersNum, newPrice);
            JOptionPane.showMessageDialog(this, "The reservation number has been updated " + bookingIdToUpdate + " success", "success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error during update" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }                                                                                                    
    }//GEN-LAST:event_ButtonSaveActionPerformed
    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
          System.exit(0); // إذا المستخدم ضغط الزر يتقفل البرنامج
    }//GEN-LAST:event_ButtonCancelActionPerformed
    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:// دالة اليوم
    }//GEN-LAST:event_dActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:// دالة الشهر
    }//GEN-LAST:event_mActionPerformed
       private double calculateAndDisplayPrice() {
        String trip = (String) ComboBoxType.getSelectedItem();
        double basePrice = 0;
        if (trip != null) {
            if (trip.contains("Dolphin Watching")) {
                basePrice = PRICE_DOLPHIN;
            } else if (trip.contains("Red Sea Boat Tour - 1 day")) {
                basePrice = PRICE_RED_SEA_1DAY;
            } else if (trip.contains("Jeddah Coastal Adventure - 2 days")) {
                basePrice = PRICE_JEDDAH_2DAYS;
            } else if (trip.contains("Luxury Red Sea Tour- 5 days")) {
                basePrice = PRICE_LUXURY_5DAYS;
            } else if (trip.contains("Saudi Premium Cruise - 10 days")) {
                basePrice = PRICE_PREMIUM_10DAYS;
            }
        }
        try {
            if (!TextPeople.getText().trim().isEmpty()) {
                int count = Integer.parseInt(TextPeople.getText().trim());
                if (count > 0) {
                    basePrice *= count;
                }
            }
        } catch (NumberFormatException e) {
                }
        Price.setText(String.format("%.2f SAR", basePrice));
        return basePrice;
    }
   private void updateBooking(int id, String tripType, Date tripDate, int passengersNum, double price) throws SQLException {
    String updateSQL = "UPDATE Booking SET tripType = ?, tripDate = ?, passengersNum = ?, price = ? WHERE bookingID = ?";
try (Connection conn = DBConnection.connect();
         PreparedStatement pst = conn.prepareStatement(updateSQL)) { 
         if (conn == null) {
            throw new SQLException("Failed to establish database connection");
        }
        pst.setString(1, tripType);
        pst.setDate(2, tripDate);
        pst.setInt(3, passengersNum);
        pst.setDouble(4, price);
        pst.setInt(5, id); 
        pst.executeUpdate();
        } 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBooking().setVisible(true);
            }
        });}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookingID;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JLabel Choose;
    private javax.swing.JComboBox<String> ComboBoxType;
    private javax.swing.JLabel People;
    private javax.swing.JTextField Price;
    private javax.swing.JLabel Prise;
    private javax.swing.JTextField TextBookingID;
    private javax.swing.JTextField TextPeople;
    private javax.swing.JLabel TripDate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField m;
    private javax.swing.JTextField y;
    // End of variables declaration//GEN-END:variables
}
