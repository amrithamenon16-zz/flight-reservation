/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airlines;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.*;

public class tabAirline extends javax.swing.JFrame {

    public tabAirline() {
        initComponents();
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.height)/2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        iata = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add new airline");

        cancelButton.setText("Cancel");
        cancelButton.setVisible(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        ok.setText("Enter");
        ok.setMaximumSize(new java.awt.Dimension(65, 23));
        ok.setMinimumSize(new java.awt.Dimension(65, 23));
        ok.setPreferredSize(new java.awt.Dimension(65, 23));
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ok, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        name.setText("Airline Name");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });

        iata.setText("IATA Code");
        iata.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                iataFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iata)
                    .addComponent(name)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iata, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try {

            messageLabel.setText("");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement s = con.createStatement();
            String Name = name.getText();
            String IATA = iata.getText();

            if (Name.equals("Airline Name") || IATA.equals("IATA Code")) {
                messageLabel.setText("All fields are mandatory!");
                con.close();
                return;
            }

            ResultSet rs = s.executeQuery("select alname,al_iata from airline");
            while (rs.next()) {
                if (rs.getString(1).equals(Name) || rs.getString(2).equals(IATA)) {
                    messageLabel.setText("Airline already exists!");
                    con.close();
                    return;
                }
            }

            s.executeUpdate("insert into airline values(airline_id.nextval,'" + Name + "','" + IATA + "')");
            iata.setText("IATA Code");
            name.setText("Airline Name");
            cancelButton.setVisible(true);
            javax.swing.JOptionPane.showMessageDialog(this, "Entered");
            con.close();

        } catch (SQLException se) {
            System.out.println(se);
             javax.swing.JOptionPane.showMessageDialog(this, "Airline name -max 40\nAirline IATA -max 2characters");
            cancelButton.setVisible(true);
        }

    }//GEN-LAST:event_okActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        iata.setText("IATA Code");
        name.setText("Airline Name");
        cancelButton.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        if (name.getText().equals("Airline Name")) {
            name.setText(null);
        }
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if (name.getText().equals("")) {
            name.setText("Airline Name");
        }
    }//GEN-LAST:event_nameFocusLost

    private void iataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iataFocusGained
        if (iata.getText().equals("IATA Code")) {
            iata.setText(null);
        }
    }//GEN-LAST:event_iataFocusGained

    private void iataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iataFocusLost
        if (iata.getText().equals("")) {
            iata.setText("IATA Code");
        }
    }//GEN-LAST:event_iataFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField iata;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField name;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
