package dbProject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class BookingForm extends javax.swing.JFrame {

    /**
     * Creates new form BookingForm
     */
    public BookingForm() {
        initComponents();
        Price.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBooking = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BackHome = new javax.swing.JButton();
        FirstName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        TripType = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        numberOfPeople = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        phoneNum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Cruise Booking");
        setBackground(new java.awt.Color(255, 255, 255));

        addBooking.setBackground(new java.awt.Color(212, 235, 252));
        addBooking.setFont(new java.awt.Font("Cooper Black", 0, 35)); // NOI18N
        addBooking.setForeground(new java.awt.Color(24, 80, 141));
        addBooking.setText("Add Booking ");
        addBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 73, 144));
        jLabel1.setText("Book Your Dream Cruise !");

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 27, 27));
        jLabel2.setText("*First Name");
        jLabel2.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(141, 17, 17));
        jLabel3.setText("*Phone Number");
        jLabel3.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(160, 27, 27));
        jLabel4.setText("*Choose a trip type ");
        jLabel4.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(141, 17, 17));
        jLabel5.setText("* Date of the Trip ");
        jLabel5.setVerifyInputWhenFocusTarget(false);

        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(160, 27, 27));
        jLabel6.setText("*Number of People");
        jLabel6.setVerifyInputWhenFocusTarget(false);

        jLabel7.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(141, 17, 17));
        jLabel7.setText("Price (SAR): ");
        jLabel7.setVerifyInputWhenFocusTarget(false);

        BackHome.setBackground(new java.awt.Color(212, 235, 252));
        BackHome.setFont(new java.awt.Font("Cooper Black", 0, 35)); // NOI18N
        BackHome.setForeground(new java.awt.Color(15, 69, 148));
        BackHome.setText("Back ");
        BackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHomeActionPerformed(evt);
            }
        });

        FirstName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FirstName.setVerifyInputWhenFocusTarget(false);
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        LastName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LastName.setVerifyInputWhenFocusTarget(false);
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        TripType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TripType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolphin Watching-(3h) 3pm - 6pm", "Red Sea Boat Tour - 1 day", "Jeddah Coastal Adventure - 2 days", "Luxury Red Sea Tour- 5 days", "Saudi Premium Cruise - 10 days" }));
        TripType.setVerifyInputWhenFocusTarget(false);
        TripType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TripTypeActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        Price.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        numberOfPeople.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numberOfPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfPeopleActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alsar\\OneDrive\\Desktop\\my homeworks\\Blue and Red Illustrative Cruise Ship Logo (1).png")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(160, 27, 27));
        jLabel14.setText("*Last Name  ");

        jLabel16.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(160, 27, 27));
        jLabel16.setText("Email Address");

        jLabel17.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(160, 27, 27));
        jLabel17.setText("Address");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Calculated automatically based on your choices");

        day.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        month.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("/");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("/");

        jLabel10.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(15, 69, 148));
        jLabel10.setText("DD");

        jLabel11.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(15, 69, 148));
        jLabel11.setText("MM");

        jLabel12.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(15, 69, 148));
        jLabel12.setText("YY");

        phoneNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(62, 62, 62)
                        .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(FirstName)
                            .addComponent(phoneNum)
                            .addComponent(address))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TripType, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberOfPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8))
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9))
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                .addComponent(Price)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(473, 473, 473))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(addBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(BackHome, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberOfPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TripType, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel5)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackHome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookingActionPerformed
        String firstName = FirstName.getText();
    String lastName = LastName.getText();
    String phone = phoneNum.getText();
    String emailAddress = email.getText();
    String addressText = address.getText();
    String tripType = (String) TripType.getSelectedItem();
    int NumberOfPeople = 0;
    int Day = 0;
    int Month = 0;
    int Year = 0;
    //  تحويل المدخلات الرقمية والتأكد من أنها أرقام صحيحة
    try {
        NumberOfPeople = Integer.parseInt(numberOfPeople.getText());
        Day = Integer.parseInt(day.getText());
        Month = Integer.parseInt(month.getText());
        Year = Integer.parseInt(year.getText());
        //ضمان إدخال عدد اشخاص منطقي
        if (NumberOfPeople <= 0) {
            throw new IllegalArgumentException("The number of people cannot be less than one");
        }      
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for all numeric fields.");
        return;
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
        return;
    }
    // عدم السماح بترك الحقول الإلزامية فارغة
    if (firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
        return;
    }
    // التحقق من صحة رقم الهاتف
    if (!phone.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "Phone number must be 10 digits.");
        return;
    }
    // التحقق من صحة التاريخ
    if (Year <= 2024 || Year > LocalDate.now().getYear() || Month < 1 || Month > 12 || Day < 1 || Day > 31) {
        JOptionPane.showMessageDialog(this, "Please enter a valid date.");
        return;
    }
    try {
        LocalDate tripDate = LocalDate.of(Year, Month, Day);
        java.sql.Date sqlDate = java.sql.Date.valueOf(tripDate);
        // إدخال بيانات العميل في جدول العملاء
        String insertCustomer = "INSERT INTO Customer (customerFname, customerLname, phone, email, address) "
                + "VALUES ('" + firstName + "', '" + lastName + "', '" + phone + "', '" + emailAddress + "', '" + addressText + "')";
        DBConnection.executeUpdate(insertCustomer);
        // استخدام رقم الهاتف للحصول على رقم العميل
        String getID = "SELECT customerID FROM Customer WHERE phone = '" + phone + "'";
        ResultSet result = DBConnection.executeQuery(getID);
        int customerID = 0;
        if (result.next()) {
            customerID = result.getInt("customerID");
        }
        if (customerID == 0) {
            JOptionPane.showMessageDialog(this, "Sorry, we couldn't find the customer.");
            return;
        }
        // إدخال بيانات الحجز في جدول الحجز
        double price = Double.parseDouble(Price.getText().replace(" SAR", ""));
        String insertBooking = "INSERT INTO Booking (customerID, tripType, tripDate, passengersNum, price) VALUES ("
                + customerID + ", '" + tripType + "', '" + sqlDate + "', " + NumberOfPeople + ", " + price + ")";
        DBConnection.executeUpdate(insertBooking);
        JOptionPane.showMessageDialog(this, "Booking added successfully!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_addBookingActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        String trip = (String) TripType.getSelectedItem();
        double price = 0;
        switch (trip) {
            case "Dolphin Watching-(3h) 3pm - 6pm":
                price = 250;
                break;
            case "Red Sea Boat Tour - 1 day":
                price = 500;
                break;
            case "Jeddah Coastal Adventure - 2 days":
                price = 1000;
                break;
            case "Luxury Red Sea Tour- 5 days":
                price = 2500;
                break;
            case "Saudi Premium Cruise - 10 days":
                price = 5000;
                break;
        }
        if (!numberOfPeople.getText().equals("")) {
            price *= Integer.parseInt(numberOfPeople.getText());
        }
        Price.setText(price + " SAR");
        Price.setEditable(false);
    }//GEN-LAST:event_PriceActionPerformed

    private void TripTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TripTypeActionPerformed
        PriceActionPerformed(evt);
    }//GEN-LAST:event_TripTypeActionPerformed

    private void numberOfPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfPeopleActionPerformed
    }//GEN-LAST:event_numberOfPeopleActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void BackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHomeActionPerformed
        this.setVisible(false);
        new HomeForm().setVisible(true);
    }//GEN-LAST:event_BackHomeActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void phoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumActionPerformed

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
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackHome;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField Price;
    private javax.swing.JComboBox<String> TripType;
    private javax.swing.JButton addBooking;
    private javax.swing.JTextField address;
    private javax.swing.JTextField day;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField month;
    private javax.swing.JTextField numberOfPeople;
    private javax.swing.JTextField phoneNum;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
