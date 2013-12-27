/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlines;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;


public class Ticket extends javax.swing.JFrame {

    
    public Ticket(String ticketno,String transid,String flightno,String from,String fromtime,
               String to,String totime,String bookdate,String cost,String seatno,String name) {
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2));
        
        TicketNoDisplayLabel.setText(ticketno);
        TransactionIdDisplayLabel.setText(transid);
        FlightNoDisplayLabel.setText(flightno);
        FromDisplayLabel.setText(from);
        DepartureDateDisplayLabel.setText(fromtime.substring(0,10));
        DepartureTimeDisplayLabel.setText(fromtime.substring(11,16) +"  hrs");
        ToDisplayLabel.setText(to);
        ArrivalDateDisplayLabel.setText(totime.substring(0,10));
        ArrivalTimeDisplayLabel.setText(totime.substring(11,16)+ "  hrs");
        BookingDateDisplayLabel.setText(bookdate.substring(0, 10));
        CostDisplayLabel.setText(cost);
        SeatNoDisplayLabel.setText(seatno);
        PassengerNameDisplayLabel.setText(name);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TicketNoLabel = new javax.swing.JLabel();
        TicketNoDisplayLabel = new javax.swing.JLabel();
        TransactionIdLabel = new javax.swing.JLabel();
        TransactionIdDisplayLabel = new javax.swing.JLabel();
        PassengerNameLabel = new javax.swing.JLabel();
        PassengerNameDisplayLabel = new javax.swing.JLabel();
        TicketDetailsLabel = new javax.swing.JLabel();
        TicketSeparator = new javax.swing.JSeparator();
        FlightNoLabel = new javax.swing.JLabel();
        FlightNoDisplayLabel = new javax.swing.JLabel();
        FromLabel = new javax.swing.JLabel();
        FromDisplayLabel = new javax.swing.JLabel();
        DepartureDateLabel = new javax.swing.JLabel();
        DepartureDateDisplayLabel = new javax.swing.JLabel();
        ToLabel = new javax.swing.JLabel();
        ToDisplayLabel = new javax.swing.JLabel();
        ArrivalDateLabel = new javax.swing.JLabel();
        ArrivalDateDisplayLabel = new javax.swing.JLabel();
        BookingDateLabel = new javax.swing.JLabel();
        BookingDateDisplayLabel = new javax.swing.JLabel();
        SeatNoLabel = new javax.swing.JLabel();
        SeatNoDisplayLabel = new javax.swing.JLabel();
        CostLabel = new javax.swing.JLabel();
        CostDisplayLabel = new javax.swing.JLabel();
        DepartureTimeLabel = new javax.swing.JLabel();
        ArrivalTimeLabel = new javax.swing.JLabel();
        DepartureTimeDisplayLabel = new javax.swing.JLabel();
        ArrivalTimeDisplayLabel = new javax.swing.JLabel();
        BackgroundImgTicket = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ticket");
        setMaximumSize(new java.awt.Dimension(590, 400));
        setMinimumSize(new java.awt.Dimension(590, 400));
        getContentPane().setLayout(null);

        TicketNoLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TicketNoLabel.setText("Ticket No");
        getContentPane().add(TicketNoLabel);
        TicketNoLabel.setBounds(28, 62, 112, 23);

        TicketNoDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TicketNoDisplayLabel.setText("5555");
        getContentPane().add(TicketNoDisplayLabel);
        TicketNoDisplayLabel.setBounds(170, 62, 128, 23);

        TransactionIdLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TransactionIdLabel.setText("Transaction Id");
        getContentPane().add(TransactionIdLabel);
        TransactionIdLabel.setBounds(316, 62, 100, 23);

        TransactionIdDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TransactionIdDisplayLabel.setText("12345");
        getContentPane().add(TransactionIdDisplayLabel);
        TransactionIdDisplayLabel.setBounds(422, 62, 140, 23);

        PassengerNameLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PassengerNameLabel.setText("Passenger Name");
        getContentPane().add(PassengerNameLabel);
        PassengerNameLabel.setBounds(28, 95, 112, 23);

        PassengerNameDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        PassengerNameDisplayLabel.setText("Amritha Menon");
        getContentPane().add(PassengerNameDisplayLabel);
        PassengerNameDisplayLabel.setBounds(170, 95, 392, 23);

        TicketDetailsLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        TicketDetailsLabel.setText("Ticket Details");
        getContentPane().add(TicketDetailsLabel);
        TicketDetailsLabel.setBounds(27, 0, 200, 60);
        getContentPane().add(TicketSeparator);
        TicketSeparator.setBounds(0, 60, 590, 2);

        FlightNoLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        FlightNoLabel.setText("Flight No");
        getContentPane().add(FlightNoLabel);
        FlightNoLabel.setBounds(28, 128, 112, 23);

        FlightNoDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        FlightNoDisplayLabel.setText("A123");
        getContentPane().add(FlightNoDisplayLabel);
        FlightNoDisplayLabel.setBounds(170, 128, 392, 23);

        FromLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        FromLabel.setText("From");
        getContentPane().add(FromLabel);
        FromLabel.setBounds(28, 161, 112, 23);

        FromDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(FromDisplayLabel);
        FromDisplayLabel.setBounds(170, 161, 392, 23);

        DepartureDateLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DepartureDateLabel.setText("On");
        getContentPane().add(DepartureDateLabel);
        DepartureDateLabel.setBounds(28, 194, 112, 23);

        DepartureDateDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(DepartureDateDisplayLabel);
        DepartureDateDisplayLabel.setBounds(170, 194, 100, 23);

        ToLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ToLabel.setText("To");
        getContentPane().add(ToLabel);
        ToLabel.setBounds(28, 227, 112, 23);

        ToDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(ToDisplayLabel);
        ToDisplayLabel.setBounds(170, 227, 392, 23);

        ArrivalDateLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ArrivalDateLabel.setText("On");
        getContentPane().add(ArrivalDateLabel);
        ArrivalDateLabel.setBounds(28, 260, 112, 23);

        ArrivalDateDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(ArrivalDateDisplayLabel);
        ArrivalDateDisplayLabel.setBounds(170, 260, 100, 23);

        BookingDateLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BookingDateLabel.setText("Booking Date");
        getContentPane().add(BookingDateLabel);
        BookingDateLabel.setBounds(28, 293, 112, 23);

        BookingDateDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(BookingDateDisplayLabel);
        BookingDateDisplayLabel.setBounds(170, 293, 128, 23);

        SeatNoLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SeatNoLabel.setText("Seat No");
        getContentPane().add(SeatNoLabel);
        SeatNoLabel.setBounds(28, 326, 112, 23);

        SeatNoDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(SeatNoDisplayLabel);
        SeatNoDisplayLabel.setBounds(170, 326, 128, 23);

        CostLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CostLabel.setText("Cost");
        getContentPane().add(CostLabel);
        CostLabel.setBounds(28, 359, 112, 23);

        CostDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(CostDisplayLabel);
        CostDisplayLabel.setBounds(170, 359, 128, 23);

        DepartureTimeLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DepartureTimeLabel.setText("At");
        getContentPane().add(DepartureTimeLabel);
        DepartureTimeLabel.setBounds(316, 194, 25, 23);

        ArrivalTimeLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ArrivalTimeLabel.setText("At");
        getContentPane().add(ArrivalTimeLabel);
        ArrivalTimeLabel.setBounds(316, 260, 25, 23);

        DepartureTimeDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(DepartureTimeDisplayLabel);
        DepartureTimeDisplayLabel.setBounds(359, 194, 203, 23);

        ArrivalTimeDisplayLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(ArrivalTimeDisplayLabel);
        ArrivalTimeDisplayLabel.setBounds(359, 260, 203, 23);

        BackgroundImgTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlines/plainbg.jpg"))); // NOI18N
        BackgroundImgTicket.setText("jLabel1");
        getContentPane().add(BackgroundImgTicket);
        BackgroundImgTicket.setBounds(0, 0, 610, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 /*  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   */
        //</editor-fold>

        /* Create and display the form */
    
  /*      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });   */
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArrivalDateDisplayLabel;
    private javax.swing.JLabel ArrivalDateLabel;
    private javax.swing.JLabel ArrivalTimeDisplayLabel;
    private javax.swing.JLabel ArrivalTimeLabel;
    private javax.swing.JLabel BackgroundImgTicket;
    private javax.swing.JLabel BookingDateDisplayLabel;
    private javax.swing.JLabel BookingDateLabel;
    private javax.swing.JLabel CostDisplayLabel;
    private javax.swing.JLabel CostLabel;
    private javax.swing.JLabel DepartureDateDisplayLabel;
    private javax.swing.JLabel DepartureDateLabel;
    private javax.swing.JLabel DepartureTimeDisplayLabel;
    private javax.swing.JLabel DepartureTimeLabel;
    private javax.swing.JLabel FlightNoDisplayLabel;
    private javax.swing.JLabel FlightNoLabel;
    private javax.swing.JLabel FromDisplayLabel;
    private javax.swing.JLabel FromLabel;
    private javax.swing.JLabel PassengerNameDisplayLabel;
    private javax.swing.JLabel PassengerNameLabel;
    private javax.swing.JLabel SeatNoDisplayLabel;
    private javax.swing.JLabel SeatNoLabel;
    private javax.swing.JLabel TicketDetailsLabel;
    private javax.swing.JLabel TicketNoDisplayLabel;
    private javax.swing.JLabel TicketNoLabel;
    private javax.swing.JSeparator TicketSeparator;
    private javax.swing.JLabel ToDisplayLabel;
    private javax.swing.JLabel ToLabel;
    private javax.swing.JLabel TransactionIdDisplayLabel;
    private javax.swing.JLabel TransactionIdLabel;
    // End of variables declaration//GEN-END:variables
}
