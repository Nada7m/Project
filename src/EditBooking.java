import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditBooking extends javax.swing.JFrame {
    private int currentBookingID = -1;
    private int displayedCustomerID = -1;
    private static final double PRICE_DOLPHIN = 250;
    private static final double PRICE_RED_SEA_1DAY = 500;
    private static final double PRICE_JEDDAH_2DAYS = 1000;
    private static final double PRICE_LUXURY_5DAYS = 2500;
    private static final double PRICE_PREMIUM_10DAYS = 5000;
    
    public EditBooking() {
        initComponents();
        Price.setEditable(false);
        ComboBoxType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculateAndDisplayPrice();
            }
        });
        TextPeople.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculateAndDisplayPrice();
            }
        });
        TextBookingID.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loadBookingDetails();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        People = new javax.swing.JLabel();
        Prise = new javax.swing.JLabel();
        ButtonCancel = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        TextCustomerID = new javax.swing.JTextField();
        BookingID = new javax.swing.JLabel();
        TextBookingID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextPeople = new javax.swing.JTextField();
        TripDate1 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Choose = new javax.swing.JLabel();
        ComboBoxType = new javax.swing.JComboBox<>();
        CustomerID = new javax.swing.JLabel();
        d = new javax.swing.JTextField();
        m = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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

        TextCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCustomerIDActionPerformed(evt);
            }
        });

        BookingID.setBackground(new java.awt.Color(140, 215, 252));
        BookingID.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        BookingID.setForeground(new java.awt.Color(160, 27, 27));
        BookingID.setText("Booking ID");

        TextBookingID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextBookingID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextBookingIDActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/الشعار معدل.png"))); // NOI18N

        TextPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPeopleActionPerformed(evt);
            }
        });

        TripDate1.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        TripDate1.setForeground(new java.awt.Color(160, 27, 27));
        TripDate1.setText("Trip Date ");

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

        CustomerID.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        CustomerID.setForeground(new java.awt.Color(160, 27, 27));
        CustomerID.setText("Customer ID");

        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 27, 27));
        jLabel2.setText("day");

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(160, 27, 27));
        jLabel3.setText("month");

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(160, 27, 27));
        jLabel4.setText("year");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Choose, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(People, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Prise, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TripDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextBookingID)
                                        .addComponent(TextCustomerID)
                                        .addComponent(ComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextPeople)
                                        .addComponent(Price))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel3)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel4))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Choose, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(People, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TripDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Prise, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void TextPeopleActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void TextBookingIDActionPerformed(java.awt.event.ActionEvent evt) {                                              
   loadBookingDetails();
    }                                             

    private void TextCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              
    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {                                           
    this.setVisible(false);
    }                                          
    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {                                           
   if (currentBookingID == -1) {
            JOptionPane.showMessageDialog(this, "Please load a booking first before attempting to update.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String tripType = (String) ComboBoxType.getSelectedItem();
        int numberOfPeopleValue;
        LocalDate tripDate;
                try {
            numberOfPeopleValue = Integer.parseInt(TextPeople.getText().trim());
            if (numberOfPeopleValue <= 0) {
                throw new NumberFormatException("Number of people must be greater than zero");
            }
            int Day = Integer.parseInt(d.getText().trim());
            int Month = Integer.parseInt(m.getText().trim());
            int Year = Integer.parseInt(y.getText().trim());
            tripDate = LocalDate.of(Year, Month, Day);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Number of people, Day, Month, or Year are invalid (must be positive numbers)", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date entered Please check Day, Month, and Year values", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double price = calculateAndDisplayPrice();

        try {
            updateBooking(currentBookingID, tripType, Date.valueOf(tripDate), numberOfPeopleValue, price);
            JOptionPane.showMessageDialog(this, "Booking (ID: " + currentBookingID + ") updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            loadBookingDetails();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error during update: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }                                
    }                                          
    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                             
      if (currentBookingID == -1) {
            JOptionPane.showMessageDialog(this, "No booking is currently loaded to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete this booking (ID: " + currentBookingID + ")? This action cannot be undone",
                "Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            Connection conn = null;
            PreparedStatement pst = null;
            try {
                conn = DBConnection.connect(); 
                if (conn == null) {
                    JOptionPane.showMessageDialog(this, "Failed to connect to the database for deletion", "Database Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String deleteBookingSQL = "DELETE FROM Booking WHERE bookingID = ?";
                pst = conn.prepareStatement(deleteBookingSQL);
                pst.setInt(1, currentBookingID);
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Booking (ID: " + currentBookingID + ") deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearBookingFields(true); 
                } else {
                    JOptionPane.showMessageDialog(this, "Could not find the booking to delete", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error during deletion: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } finally {
                try { if (pst != null) pst.close(); } catch (SQLException e) { e.printStackTrace(); }
                try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); } 
            }
        }
    }                                            
    private void dActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    private void mActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
    }                                 
    private void loadBookingDetails() {clearBookingFields(false); 
        try {
            currentBookingID = Integer.parseInt(TextBookingID.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Booking ID (number).", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet bookingResult = null;
        try {
            conn = DBConnection.connect();
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Failed to connect to the database.", "Database Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String sql = "SELECT customerID, tripType, tripDate, passengersNum, price FROM Booking WHERE bookingID = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, currentBookingID);
            bookingResult = pst.executeQuery();
            if (bookingResult.next()) {
                displayedCustomerID = bookingResult.getInt("customerID");
                TextCustomerID.setText(String.valueOf(displayedCustomerID));
                String tripType = bookingResult.getString("tripType");
                ComboBoxType.setSelectedItem(tripType);
                Date tripDate = bookingResult.getDate("tripDate");
                LocalDate date = tripDate.toLocalDate();
                d.setText(String.valueOf(date.getDayOfMonth()));
                m.setText(String.valueOf(date.getMonthValue()));
                y.setText(String.valueOf(date.getYear()));
                TextPeople.setText(String.valueOf(bookingResult.getInt("passengersNum")));
                calculateAndDisplayPrice(); 
                JOptionPane.showMessageDialog(this, "Booking details loaded successfully. You can now modify the fields.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                currentBookingID = -1;
                displayedCustomerID = -1;
                clearBookingFields(true);
                JOptionPane.showMessageDialog(this, "No booking found with ID: " + TextBookingID.getText(), "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error during search: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            try { if (bookingResult != null) bookingResult.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (pst != null) pst.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); } // إغلاق الاتصال
        }}
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
    private void clearBookingFields(boolean clearBookingID) {
      if (clearBookingID) {
            TextBookingID.setText("");
            currentBookingID = -1;
        }
        displayedCustomerID = -1;
        TextCustomerID.setText("");
        ComboBoxType.setSelectedIndex(0);
        TextPeople.setText("");
        d.setText("");
        m.setText("");
        y.setText("");
        Price.setText("");
    }
    private void updateBooking(int id, String tripType, Date tripDate, int passengersNum, double price) throws SQLException {
    Connection conn = null;
    PreparedStatement pst = null;
    try {
        conn = DBConnection.connect();
        if (conn == null) {
            throw new SQLException("Failed to establish database connection");
        }
        String updateSQL = "UPDATE Booking SET tripType = ?, tripDate = ?, passengersNum = ?, price = ? WHERE bookingID = ?";
        pst = conn.prepareStatement(updateSQL);
        pst.setString(1, tripType);
        pst.setDate(2, tripDate);
        pst.setInt(3, passengersNum);
        pst.setDouble(4, price);
        pst.setInt(5, id); 
        pst.executeUpdate();
    } finally {
        try { if (pst != null) pst.close(); } catch (SQLException e) { e.printStackTrace(); }
        try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
}
    
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
            java.util.logging.Logger.getLogger(EditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel BookingID;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JLabel Choose;
    private javax.swing.JComboBox<String> ComboBoxType;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel People;
    private javax.swing.JTextField Price;
    private javax.swing.JLabel Prise;
    private javax.swing.JTextField TextBookingID;
    private javax.swing.JTextField TextCustomerID;
    private javax.swing.JTextField TextPeople;
    private javax.swing.JLabel TripDate1;
    private javax.swing.JTextField d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField m;
    private javax.swing.JTextField y;
    // End of variables declaration                   

}
