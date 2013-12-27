/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airlines;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.*;
import java.util.Calendar;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2));

        try {

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery("select apname,iatacode,city from airport order by apname");
            while (rs.next()) {
                fromCombo.addItem(rs.getString(1) + " (" + rs.getString(2) + "), " + rs.getString(3));
                toCombo.addItem(rs.getString(1) + " (" + rs.getString(2) + "), " + rs.getString(3));
            }

            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabPane = new javax.swing.JTabbedPane();
        findTab = new javax.swing.JPanel();
        onewayRadio = new javax.swing.JRadioButton();
        twowayRadio = new javax.swing.JRadioButton();
        toCombo = new javax.swing.JComboBox();
        fromCombo = new javax.swing.JComboBox();
        FindButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        FromDateLabel = new javax.swing.JLabel();
        ToDateLabel = new javax.swing.JLabel();
        FromDateChooser = new com.toedter.calendar.JDateChooser();
        ToDateChooser = new com.toedter.calendar.JDateChooser();
        statusTab = new javax.swing.JPanel();
        FlightNoLabelTextFieldPanel = new javax.swing.JPanel();
        FlightNoLabel = new javax.swing.JLabel();
        FlightNoTextField = new javax.swing.JTextField();
        StatusBackGroundPanel = new javax.swing.JPanel();
        StatusPanel = new javax.swing.JPanel();
        StatusScrollPane = new javax.swing.JScrollPane();
        StatusTextArea = new javax.swing.JTextArea();
        ClearCheckButtonPanel = new javax.swing.JPanel();
        CheckButton = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        SwitchPanel = new javax.swing.JPanel();
        LoginOuterPannel = new javax.swing.JPanel();
        LoginNewUserButtonPanel = new javax.swing.JPanel();
        NewUserButton = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        LoginPanelBackGroundPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        username_password = new javax.swing.JPanel();
        UserNameLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        successMessagePanel = new javax.swing.JPanel();
        successMessageLabel = new javax.swing.JLabel();
        newuserpanel = new javax.swing.JPanel();
        NewUserNameLabel = new javax.swing.JLabel();
        NewEmailLabel = new javax.swing.JLabel();
        NewPasswordLabel = new javax.swing.JLabel();
        NewConfirmPasswordLabel = new javax.swing.JLabel();
        NewUserNameTextField = new javax.swing.JTextField();
        NewEmaidTextField = new javax.swing.JTextField();
        NewPasswordField = new javax.swing.JPasswordField();
        NewConfirmPasswordField = new javax.swing.JPasswordField();
        NewSubmitButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        LoggedInPanel = new javax.swing.JPanel();
        HelloNameLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        TicketHistoryButton = new javax.swing.JButton();
        ViewTicketButton = new javax.swing.JButton();
        CancelTicketButton = new javax.swing.JButton();
        BookTicketButton = new javax.swing.JButton();
        AdminLoggedInPanel = new javax.swing.JPanel();
        HelloNameLabel1 = new javax.swing.JLabel();
        LogoutButton1 = new javax.swing.JButton();
        AddAirline = new javax.swing.JButton();
        AddAirport = new javax.swing.JButton();
        AddFlight = new javax.swing.JButton();
        ChangeFlightStatus = new javax.swing.JButton();
        BottomBackGroundPanel = new javax.swing.JPanel();
        BottomPanel = new javax.swing.JPanel();
        FlightTablePanel = new javax.swing.JPanel();
        TableScrollPane = new javax.swing.JScrollPane();
        FlightTable = new javax.swing.JTable();
        ViewHistoryTablePanel = new javax.swing.JPanel();
        TableScrollPane1 = new javax.swing.JScrollPane();
        ViewHistoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BackgroundImg = new javax.swing.JLabel();

        onewayRadio.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Reservation");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1100, 550));
        getContentPane().setLayout(null);

        findTab.setDoubleBuffered(false);
        findTab.setOpaque(false);

        buttonGroup1.add(onewayRadio);
        onewayRadio.setText("One Way");
        onewayRadio.setOpaque(false);
        onewayRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onewayRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(twowayRadio);
        twowayRadio.setText("Two Way");
        twowayRadio.setOpaque(false);
        twowayRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twowayRadioActionPerformed(evt);
            }
        });

        toCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "To", "-----------------------" }));
        toCombo.setOpaque(false);

        fromCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "From", "-----------------------" }));
        fromCombo.setOpaque(false);

        FindButton.setText("Find");
        FindButton.setOpaque(false);
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.setOpaque(false);
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        FromDateLabel.setText("From date");

        ToDateLabel.setVisible(false);
        ToDateLabel.setText("To date");

        FromDateChooser.setOpaque(false);

        ToDateChooser.setOpaque(false);

        javax.swing.GroupLayout findTabLayout = new javax.swing.GroupLayout(findTab);
        findTab.setLayout(findTabLayout);
        findTabLayout.setHorizontalGroup(
            findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(findTabLayout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(findTabLayout.createSequentialGroup()
                        .addGroup(findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(findTabLayout.createSequentialGroup()
                                .addComponent(onewayRadio)
                                .addGap(145, 145, 145)
                                .addComponent(twowayRadio))
                            .addGroup(findTabLayout.createSequentialGroup()
                                .addComponent(FromDateLabel)
                                .addGap(278, 278, 278)
                                .addComponent(ToDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(findTabLayout.createSequentialGroup()
                        .addComponent(FromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(ToDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(findTabLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fromCombo, 0, 485, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        findTabLayout.setVerticalGroup(
            findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onewayRadio)
                    .addComponent(twowayRadio))
                .addGap(60, 60, 60)
                .addGroup(findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(findTabLayout.createSequentialGroup()
                        .addComponent(toCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FromDateLabel)
                            .addComponent(ToDateLabel))
                        .addGap(1, 1, 1)
                        .addComponent(FromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ToDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(findTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(findTabLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(fromCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(177, Short.MAX_VALUE)))
        );

        ToDateChooser.setVisible(false);

        tabPane.addTab("Find Your Flight", findTab);

        statusTab.setOpaque(false);

        FlightNoLabelTextFieldPanel.setOpaque(false);

        FlightNoLabel.setText("Flight No");

        FlightNoTextField.setOpaque(false);

        javax.swing.GroupLayout FlightNoLabelTextFieldPanelLayout = new javax.swing.GroupLayout(FlightNoLabelTextFieldPanel);
        FlightNoLabelTextFieldPanel.setLayout(FlightNoLabelTextFieldPanelLayout);
        FlightNoLabelTextFieldPanelLayout.setHorizontalGroup(
            FlightNoLabelTextFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlightNoLabelTextFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FlightNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(FlightNoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );
        FlightNoLabelTextFieldPanelLayout.setVerticalGroup(
            FlightNoLabelTextFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlightNoLabelTextFieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FlightNoLabelTextFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FlightNoLabel)
                    .addComponent(FlightNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        StatusBackGroundPanel.setOpaque(false);

        StatusPanel.setVisible(false);
        StatusPanel.setOpaque(false);

        StatusScrollPane.setOpaque(false);

        StatusTextArea.setEditable(false);
        StatusTextArea.setColumns(20);
        StatusTextArea.setRows(5);
        StatusTextArea.setOpaque(false);
        StatusScrollPane.setViewportView(StatusTextArea);

        javax.swing.GroupLayout StatusPanelLayout = new javax.swing.GroupLayout(StatusPanel);
        StatusPanel.setLayout(StatusPanelLayout);
        StatusPanelLayout.setHorizontalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StatusScrollPane)
                .addContainerGap())
        );
        StatusPanelLayout.setVerticalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout StatusBackGroundPanelLayout = new javax.swing.GroupLayout(StatusBackGroundPanel);
        StatusBackGroundPanel.setLayout(StatusBackGroundPanelLayout);
        StatusBackGroundPanelLayout.setHorizontalGroup(
            StatusBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StatusBackGroundPanelLayout.setVerticalGroup(
            StatusBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusBackGroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ClearCheckButtonPanel.setOpaque(false);

        CheckButton.setText("Check");
        CheckButton.setOpaque(false);
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.setOpaque(false);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClearCheckButtonPanelLayout = new javax.swing.GroupLayout(ClearCheckButtonPanel);
        ClearCheckButtonPanel.setLayout(ClearCheckButtonPanelLayout);
        ClearCheckButtonPanelLayout.setHorizontalGroup(
            ClearCheckButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClearCheckButtonPanelLayout.createSequentialGroup()
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ClearCheckButtonPanelLayout.setVerticalGroup(
            ClearCheckButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CheckButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout statusTabLayout = new javax.swing.GroupLayout(statusTab);
        statusTab.setLayout(statusTabLayout);
        statusTabLayout.setHorizontalGroup(
            statusTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatusBackGroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(statusTabLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(statusTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClearCheckButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FlightNoLabelTextFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        statusTabLayout.setVerticalGroup(
            statusTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusTabLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(FlightNoLabelTextFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ClearCheckButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(StatusBackGroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tabPane.addTab("Check Flight Status", statusTab);

        getContentPane().add(tabPane);
        tabPane.setBounds(90, 20, 510, 290);

        SwitchPanel.setOpaque(false);
        SwitchPanel.setLayout(new java.awt.CardLayout());

        LoginOuterPannel.setOpaque(false);
        LoginOuterPannel.setPreferredSize(new java.awt.Dimension(373, 342));

        LoginNewUserButtonPanel.setOpaque(false);

        NewUserButton.setText("New User");
        NewUserButton.setMaximumSize(new java.awt.Dimension(79, 45));
        NewUserButton.setMinimumSize(new java.awt.Dimension(79, 45));
        NewUserButton.setOpaque(false);
        NewUserButton.setPreferredSize(new java.awt.Dimension(79, 40));
        NewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserButtonActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.setMaximumSize(new java.awt.Dimension(57, 40));
        Login.setMinimumSize(new java.awt.Dimension(57, 40));
        Login.setOpaque(false);
        Login.setPreferredSize(new java.awt.Dimension(57, 40));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginNewUserButtonPanelLayout = new javax.swing.GroupLayout(LoginNewUserButtonPanel);
        LoginNewUserButtonPanel.setLayout(LoginNewUserButtonPanelLayout);
        LoginNewUserButtonPanelLayout.setHorizontalGroup(
            LoginNewUserButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginNewUserButtonPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(NewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginNewUserButtonPanelLayout.setVerticalGroup(
            LoginNewUserButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(NewUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LoginPanelBackGroundPanel.setOpaque(false);
        LoginPanelBackGroundPanel.setPreferredSize(new java.awt.Dimension(373, 265));

        LoginPanel.setVisible(false);
        LoginPanel.setOpaque(false);
        LoginPanel.setLayout(new java.awt.CardLayout());

        username_password.setOpaque(false);
        username_password.setPreferredSize(new java.awt.Dimension(373, 275));

        UserNameLabel.setText("Username");
        UserNameLabel.setMaximumSize(new java.awt.Dimension(86, 14));
        UserNameLabel.setMinimumSize(new java.awt.Dimension(86, 14));
        UserNameLabel.setPreferredSize(new java.awt.Dimension(86, 14));

        UsernameTextField.setOpaque(false);

        PasswordField.setText("jPasswordField1");
        PasswordField.setOpaque(false);
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });

        PasswordLabel.setText("Password");
        PasswordLabel.setMaximumSize(new java.awt.Dimension(86, 14));
        PasswordLabel.setMinimumSize(new java.awt.Dimension(86, 14));
        PasswordLabel.setPreferredSize(new java.awt.Dimension(86, 14));

        SubmitButton.setText("Submit");
        SubmitButton.setOpaque(false);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        successMessagePanel.setOpaque(false);
        successMessagePanel.setPreferredSize(new java.awt.Dimension(171, 30));

        successMessageLabel.setText("Registration successful! Login here.");

        javax.swing.GroupLayout successMessagePanelLayout = new javax.swing.GroupLayout(successMessagePanel);
        successMessagePanel.setLayout(successMessagePanelLayout);
        successMessagePanelLayout.setHorizontalGroup(
            successMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successMessagePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(successMessageLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        successMessagePanelLayout.setVerticalGroup(
            successMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successMessagePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(successMessageLabel)
                .addGap(0, 0, 0))
        );

        successMessageLabel.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout username_passwordLayout = new javax.swing.GroupLayout(username_password);
        username_password.setLayout(username_passwordLayout);
        username_passwordLayout.setHorizontalGroup(
            username_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(username_passwordLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(username_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(username_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, username_passwordLayout.createSequentialGroup()
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(successMessagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );
        username_passwordLayout.setVerticalGroup(
            username_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, username_passwordLayout.createSequentialGroup()
                .addComponent(successMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(username_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(username_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        LoginPanel.add(username_password, "card1");

        newuserpanel.setOpaque(false);

        NewUserNameLabel.setText("Username");

        NewEmailLabel.setText("Email ID");

        NewPasswordLabel.setText("Password");

        NewConfirmPasswordLabel.setText("Confirm password");

        NewUserNameTextField.setOpaque(false);

        NewEmaidTextField.setOpaque(false);

        NewPasswordField.setOpaque(false);

        NewConfirmPasswordField.setOpaque(false);

        NewSubmitButton.setText("Submit");
        NewSubmitButton.setOpaque(false);
        NewSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newuserpanelLayout = new javax.swing.GroupLayout(newuserpanel);
        newuserpanel.setLayout(newuserpanelLayout);
        newuserpanelLayout.setHorizontalGroup(
            newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newuserpanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newuserpanelLayout.createSequentialGroup()
                        .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NewConfirmPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(116, 116, 116))
                    .addGroup(newuserpanelLayout.createSequentialGroup()
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(newuserpanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(NewSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NewEmaidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewUserNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        newuserpanelLayout.setVerticalGroup(
            newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newuserpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewUserNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewEmaidTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewConfirmPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewConfirmPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(newuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newuserpanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(newuserpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        LoginPanel.add(newuserpanel, "card2");
        newuserpanel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout LoginPanelBackGroundPanelLayout = new javax.swing.GroupLayout(LoginPanelBackGroundPanel);
        LoginPanelBackGroundPanel.setLayout(LoginPanelBackGroundPanelLayout);
        LoginPanelBackGroundPanelLayout.setHorizontalGroup(
            LoginPanelBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelBackGroundPanelLayout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        LoginPanelBackGroundPanelLayout.setVerticalGroup(
            LoginPanelBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelBackGroundPanelLayout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginOuterPannelLayout = new javax.swing.GroupLayout(LoginOuterPannel);
        LoginOuterPannel.setLayout(LoginOuterPannelLayout);
        LoginOuterPannelLayout.setHorizontalGroup(
            LoginOuterPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginOuterPannelLayout.createSequentialGroup()
                .addGroup(LoginOuterPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoginPanelBackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginNewUserButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginOuterPannelLayout.setVerticalGroup(
            LoginOuterPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginOuterPannelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(LoginNewUserButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LoginPanelBackGroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SwitchPanel.add(LoginOuterPannel, "card1");

        LoggedInPanel.setOpaque(false);

        LogoutButton.setText("Logout");
        LogoutButton.setOpaque(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        TicketHistoryButton.setText("Ticket History");
        TicketHistoryButton.setOpaque(false);
        TicketHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketHistoryButtonActionPerformed(evt);
            }
        });

        ViewTicketButton.setText("View Ticket");
        ViewTicketButton.setEnabled(false);
        ViewTicketButton.setOpaque(false);
        ViewTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTicketButtonActionPerformed(evt);
            }
        });

        CancelTicketButton.setText("Cancel Ticket");
        CancelTicketButton.setEnabled(false);
        CancelTicketButton.setOpaque(false);
        CancelTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelTicketButtonActionPerformed(evt);
            }
        });

        BookTicketButton.setText("Book Ticket");
        BookTicketButton.setEnabled(false);
        BookTicketButton.setOpaque(false);
        BookTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookTicketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoggedInPanelLayout = new javax.swing.GroupLayout(LoggedInPanel);
        LoggedInPanel.setLayout(LoggedInPanelLayout);
        LoggedInPanelLayout.setHorizontalGroup(
            LoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoggedInPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(LoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoggedInPanelLayout.createSequentialGroup()
                        .addComponent(HelloNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(LoggedInPanelLayout.createSequentialGroup()
                        .addGroup(LoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BookTicketButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TicketHistoryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(ViewTicketButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CancelTicketButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        LoggedInPanelLayout.setVerticalGroup(
            LoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoggedInPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(LoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(HelloNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(TicketHistoryButton)
                .addGap(27, 27, 27)
                .addComponent(ViewTicketButton)
                .addGap(27, 27, 27)
                .addComponent(CancelTicketButton)
                .addGap(27, 27, 27)
                .addComponent(BookTicketButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        SwitchPanel.add(LoggedInPanel, "card2");

        AdminLoggedInPanel.setOpaque(false);

        LogoutButton1.setText("Logout");
        LogoutButton1.setOpaque(false);
        LogoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButton1ActionPerformed(evt);
            }
        });

        AddAirline.setText("Add Airline");
        AddAirline.setOpaque(false);
        AddAirline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAirlineActionPerformed(evt);
            }
        });

        AddAirport.setText("Add Airport");
        AddAirport.setOpaque(false);
        AddAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAirportActionPerformed(evt);
            }
        });

        AddFlight.setText("Add Flight");
        AddFlight.setOpaque(false);
        AddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFlightActionPerformed(evt);
            }
        });

        ChangeFlightStatus.setText("Change Flight Status");
        ChangeFlightStatus.setOpaque(false);
        ChangeFlightStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeFlightStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminLoggedInPanelLayout = new javax.swing.GroupLayout(AdminLoggedInPanel);
        AdminLoggedInPanel.setLayout(AdminLoggedInPanelLayout);
        AdminLoggedInPanelLayout.setHorizontalGroup(
            AdminLoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLoggedInPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(AdminLoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLoggedInPanelLayout.createSequentialGroup()
                        .addComponent(HelloNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(LogoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(AdminLoggedInPanelLayout.createSequentialGroup()
                        .addGroup(AdminLoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ChangeFlightStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddAirline, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(AddAirport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddFlight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        AdminLoggedInPanelLayout.setVerticalGroup(
            AdminLoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLoggedInPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(AdminLoggedInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogoutButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(HelloNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(AddAirline)
                .addGap(27, 27, 27)
                .addComponent(AddAirport)
                .addGap(27, 27, 27)
                .addComponent(AddFlight)
                .addGap(27, 27, 27)
                .addComponent(ChangeFlightStatus)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        SwitchPanel.add(AdminLoggedInPanel, "card3");

        getContentPane().add(SwitchPanel);
        SwitchPanel.setBounds(640, 20, 383, 320);

        BottomBackGroundPanel.setOpaque(false);

        BottomPanel.setVisible(false);
        BottomPanel.setOpaque(false);
        BottomPanel.setPreferredSize(new java.awt.Dimension(800, 150));
        BottomPanel.setLayout(new java.awt.CardLayout());

        FlightTablePanel.setOpaque(false);
        FlightTablePanel.setPreferredSize(new java.awt.Dimension(800, 150));

        TableScrollPane.setOpaque(false);
        TableScrollPane.setPreferredSize(new java.awt.Dimension(757, 150));

        FlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight No", "From ", "To", "Departure Time (hrs)", "Arrival Time (hrs)", "Via", "Economy Seats", "Business Seats", "Economy Price", "Business Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FlightTable.setOpaque(false);
        FlightTable.setPreferredSize(new java.awt.Dimension(757, 150));
        FlightTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FlightTable.getTableHeader().setReorderingAllowed(false);
        TableScrollPane.setViewportView(FlightTable);
        FlightTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        FlightTable.getColumnModel().getColumn(0).setPreferredWidth(60);
        FlightTable.getColumnModel().getColumn(1).setResizable(false);
        FlightTable.getColumnModel().getColumn(1).setPreferredWidth(40);
        FlightTable.getColumnModel().getColumn(2).setResizable(false);
        FlightTable.getColumnModel().getColumn(2).setPreferredWidth(40);
        FlightTable.getColumnModel().getColumn(3).setResizable(false);
        FlightTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        FlightTable.getColumnModel().getColumn(4).setResizable(false);
        FlightTable.getColumnModel().getColumn(4).setPreferredWidth(120);
        FlightTable.getColumnModel().getColumn(5).setResizable(false);
        FlightTable.getColumnModel().getColumn(5).setPreferredWidth(90);
        FlightTable.getColumnModel().getColumn(6).setResizable(false);
        FlightTable.getColumnModel().getColumn(6).setPreferredWidth(90);
        FlightTable.getColumnModel().getColumn(7).setResizable(false);
        FlightTable.getColumnModel().getColumn(7).setPreferredWidth(92);
        FlightTable.getColumnModel().getColumn(8).setResizable(false);
        FlightTable.getColumnModel().getColumn(8).setPreferredWidth(85);
        FlightTable.getColumnModel().getColumn(9).setResizable(false);
        FlightTable.getColumnModel().getColumn(9).setPreferredWidth(87);

        javax.swing.GroupLayout FlightTablePanelLayout = new javax.swing.GroupLayout(FlightTablePanel);
        FlightTablePanel.setLayout(FlightTablePanelLayout);
        FlightTablePanelLayout.setHorizontalGroup(
            FlightTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
        );
        FlightTablePanelLayout.setVerticalGroup(
            FlightTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FlightTablePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(TableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BottomPanel.add(FlightTablePanel, "card1");

        FlightTablePanel.setVisible(false);
        ViewHistoryTablePanel.setOpaque(false);
        ViewHistoryTablePanel.setPreferredSize(new java.awt.Dimension(800, 150));

        TableScrollPane1.setOpaque(false);
        TableScrollPane1.setPreferredSize(new java.awt.Dimension(757, 150));

        ViewHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ticket No", "Flight No", "From", "To", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ViewHistoryTable.setOpaque(false);
        ViewHistoryTable.setPreferredSize(new java.awt.Dimension(757, 150));
        ViewHistoryTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ViewHistoryTable.getTableHeader().setReorderingAllowed(false);
        TableScrollPane1.setViewportView(ViewHistoryTable);
        ViewHistoryTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout ViewHistoryTablePanelLayout = new javax.swing.GroupLayout(ViewHistoryTablePanel);
        ViewHistoryTablePanel.setLayout(ViewHistoryTablePanelLayout);
        ViewHistoryTablePanelLayout.setHorizontalGroup(
            ViewHistoryTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewHistoryTablePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(TableScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE))
        );
        ViewHistoryTablePanelLayout.setVerticalGroup(
            ViewHistoryTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TableScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BottomPanel.add(ViewHistoryTablePanel, "card2");

        javax.swing.GroupLayout BottomBackGroundPanelLayout = new javax.swing.GroupLayout(BottomBackGroundPanel);
        BottomBackGroundPanel.setLayout(BottomBackGroundPanelLayout);
        BottomBackGroundPanelLayout.setHorizontalGroup(
            BottomBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomBackGroundPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(BottomBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        BottomBackGroundPanelLayout.setVerticalGroup(
            BottomBackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BottomBackGroundPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(BottomBackGroundPanel);
        BottomBackGroundPanel.setBounds(90, 340, 905, 156);

        BackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlines/startBG.jpg"))); // NOI18N
        getContentPane().add(BackgroundImg);
        BackgroundImg.setBounds(0, 0, 1110, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onewayRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onewayRadioActionPerformed
        if (onewayRadio.isSelected()) {
            ToDateChooser.setVisible(false);
            ToDateLabel.setVisible(false);
        }
    }//GEN-LAST:event_onewayRadioActionPerformed

    private void twowayRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twowayRadioActionPerformed
        if (twowayRadio.isSelected()) {
            ToDateChooser.setVisible(true);
            ToDateLabel.setVisible(true);
        }
    }//GEN-LAST:event_twowayRadioActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        UsernameTextField.setText("");
        PasswordField.setText("**********");
        successMessageLabel.setText("");
        LoginPanel.setVisible(true);
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) (LoginPanel.getLayout());
        cardLayout.show(LoginPanel, "card1");

    }//GEN-LAST:event_LoginActionPerformed

    private void NewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserButtonActionPerformed

        messageLabel.setText(null);
        NewUserNameTextField.setText("");
        NewEmaidTextField.setText("");
        NewPasswordField.setText(null);
        NewConfirmPasswordField.setText(null);
        LoginPanel.setVisible(true);
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) (LoginPanel.getLayout());
        cardLayout.show(LoginPanel, "card2");
    }//GEN-LAST:event_NewUserButtonActionPerformed

    private void NewSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmitButtonActionPerformed

        try {
            messageLabel.setText(null);
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select username from airline_user");
            String username = NewUserNameTextField.getText();
            String email = NewEmaidTextField.getText();
            String password = NewPasswordField.getText();
            if (username.equals("") || email.equals("") || password.equals("") || NewConfirmPasswordField.getText().equals("")) {
                messageLabel.setText("All fields are mandatory!");
                con.close();
                return;
            }

            if (!password.equals(NewConfirmPasswordField.getText())) {
                messageLabel.setText("Passwords does not match!");
                con.close();
                return;
            }

            while (rs.next()) {
                if (rs.getString(1).equals(username)) {
                    messageLabel.setText("Invalid username!");
                    con.close();
                    return;
                }
            }
            s.executeUpdate("insert into airline_user values(user_seq.Nextval,'" + username + "','" + email + "','" + password + "')");
            con.close();
            java.awt.CardLayout cardLayout = (java.awt.CardLayout) (LoginPanel.getLayout());
            cardLayout.show(LoginPanel, "card1");
            UsernameTextField.setText("");
            PasswordField.setText("**********");
            successMessageLabel.setText("Registration successful! Login here.");

        } catch (SQLException se) {
            System.out.println(se);
        }
    }//GEN-LAST:event_NewSubmitButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed

        new Start().setVisible(true);
        this.dispose();

        /*  java.awt.CardLayout cardLayout = (java.awt.CardLayout) (SwitchPanel.getLayout());
         cardLayout.show(SwitchPanel, "card1");
         java.awt.CardLayout cardLayout1 = (java.awt.CardLayout) (BottomPanel.getLayout());
         cardLayout.show(BottomPanel,"");
         if(((javax.swing.table.DefaultTableModel)FlightTable.getModel()).getRowCount()> 0)
         cardLayout1.show(BottomPanel, "card1"); */
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        if (PasswordField.getText().equals("**********")) {
            PasswordField.setText("");
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        if (PasswordField.getText().equals("")) {
            PasswordField.setText("**********");
        }
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed

        String flightno = FlightNoTextField.getText();
        if (flightno.equals("")) {
            return;
        }
        StatusPanel.setVisible(true);
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();

            String from = "", to = "", via = "", status = "";

            ResultSet rs1 = st1.executeQuery("select a.aid, a.city "
                    + "from flight, airport a "
                    + "where flightno='" + flightno + "'"
                    + "  and a.aid in (depID,arrID) "
                    + "group by a.aid,a.city  "
                    + "having count(aid)=1");

            ResultSet rs3 = st2.executeQuery("select status from flight where flightno='" + flightno + "'");
            if (rs3.next()) {
                status = rs3.getString(1);
            } else {
                StatusTextArea.setText("No such flight exists!");
                con.close();
                return;
            }

            while (rs1.next()) {

                ResultSet rs2 = st2.executeQuery("Select a.aid,a.apname,a.iatacode,a.city from airport a, flight f"
                        + " where flightno='" + flightno + "'"
                        + "  and a.aid=depID "
                        + "  and a.aid=" + rs1.getInt(1));

                if (rs2.next()) {
                    from = rs2.getString(2) + " Airport (" + rs2.getString(3) + "), " + rs2.getString(4);
                }

                rs2 = st2.executeQuery("select a.aid,a.apname,a.iatacode,a.city from airport a, flight f"
                        + " where flightno='" + flightno + "'"
                        + "  and a.aid=arrID "
                        + "  and a.aid=" + rs1.getInt(1));

                if (rs2.next()) {
                    to = rs2.getString(2) + " Airport (" + rs2.getString(3) + "), " + rs2.getString(4);
                }

            }
            rs1 = st1.executeQuery("select a.city "
                    + "from flight, airport a "
                    + "where flightno='" + flightno + "'"
                    + "  and a.aid in (depID,arrID) "
                    + "group by a.aid,a.city  "
                    + "having count(aid)=2");
            while (rs1.next()) {
                via += rs1.getString(1) + ", ";
            }

            if (via.equals("")) {
                via = "No Stops";
            } else {
                via = via.substring(0, via.length() - 2);
            }

            StatusTextArea.setText("FROM\t" + from);
            StatusTextArea.append("\nTO\t" + to);
            StatusTextArea.append("\nVIA\t" + via);
            StatusTextArea.append("\nSTATUS:\t" + status);

            con.close();
        } catch (SQLException se) {
            System.out.println(se);
        }


    }//GEN-LAST:event_CheckButtonActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        FlightNoTextField.setText("");
        StatusPanel.setVisible(false);
    }//GEN-LAST:event_ClearActionPerformed

    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed

        jLabel1.setText("");
        ViewTicketButton.setEnabled(false);
        CancelTicketButton.setEnabled(false);
        BookTicketButton.setEnabled(false);
        boolean f = false;

        int n;
        javax.swing.table.DefaultTableModel dm = (javax.swing.table.DefaultTableModel) FlightTable.getModel();
        dm.setRowCount(0);

        String fromplace = (String) fromCombo.getSelectedItem();
        String toplace = (String) toCombo.getSelectedItem();

        if (fromplace.equals("From") || fromplace.equals("-----------------------") || toplace.equals("To")
                || toplace.equals("-----------------------") || fromplace.equals(toplace)
                || FromDateChooser.getDate() == null || (twowayRadio.isSelected() && ToDateChooser.getDate() == null)) {
            jLabel1.setText("All fields are mandatory");
            BottomPanel.setVisible(false);
            return;
        }

        int row = 0;
        int ecoseats, busseats, ecoCost, busCost;
        int fromday = FromDateChooser.getCalendar().get(Calendar.DATE); //day of the month dd
        int frommonth = FromDateChooser.getCalendar().get(Calendar.MONTH) + 1; //mm-1 (jan=0,dec=11)
        int fromyear = FromDateChooser.getCalendar().get(Calendar.YEAR); //yyyy
        String StartDate = fromyear + "-" + frommonth + "-" + fromday;

        String temp;
        String fromiata = fromplace.substring(fromplace.indexOf("(") + 1, fromplace.indexOf(")"));
        String toiata = toplace.substring(toplace.indexOf("(") + 1, toplace.indexOf(")"));

        java.awt.CardLayout cardLayout = (java.awt.CardLayout) (BottomPanel.getLayout());

        int flag = 0;
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");

            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();
            Statement st4 = con.createStatement();
            Statement st5 = con.createStatement();

            do {
                ResultSet rs1 = st1.executeQuery("select f1.fid,f2.fid,f1.flightno,a1.aid,a2.aid"
                        + " from flight f1, flight f2, airport a1, airport a2"
                        + " where f1.flightno=f2.flightno"
                        + " and f1.depid=a1.aid and f2.arrid=a2.aid"
                        + " and a1.iatacode='" + fromiata + "'"
                        + " and a2.iatacode='" + toiata + "'");

                while (rs1.next()) {

                    ecoseats = busseats = ecoCost = busCost = 0;

                    
                    String FlightNo = rs1.getString(3);
                    int fid1 = rs1.getInt(1);
                    int fid2 = rs1.getInt(2);
                    int aid1 = rs1.getInt(4);
                    int aid2 = rs1.getInt(5);

                    ResultSet rs2 = st2.executeQuery("select p1.depdate,p2.arrdate "
                            + "from particularflight p1, particularflight p2 "
                            + "where p1.fid=" + fid1
                            + "  and p2.fid=" + fid2
                            + "  and to_char(p1.depdate,'yyyy-mm-dd')='" + StartDate + "'"
                            + "  and (p2.arrdate-p1.depdate)=(select MIN(p2.ARRDATE-p1.DEPDATE) "
                            + "from particularflight p1, particularflight p2 "
                            + "where p1.fid=" + fid1
                            + "  and p2.fid=" + fid2
                            + "  and p2.ARRDATE-p1.DEPDATE>0)");

                    if (!rs2.next()) {
                        continue;
                    }
                    
                    
                    n = FlightTable.getRowCount() + 1;
                    dm.setRowCount(n);                    
                    BottomPanel.setVisible(true);
                    cardLayout.show(BottomPanel, "card1");
                    BookTicketButton.setEnabled(true);
                    jLabel1.setText("Search Results"); 
                    f = true;

                    String fromTimeStamp = rs2.getString(1).substring(0, 19);
                    String toTimeStamp = rs2.getString(2).substring(0, 19);

                    ResultSet rs3 = st3.executeQuery("select distinct a.city "
                            + "from particularflight natural join flight, airport a "
                            + "where flightno='" + FlightNo + "'"
                            + "  and to_char(depdate,'yyyy-mm-dd hh24:mi:ss')>='" + fromTimeStamp + "'"
                            + "  and to_char(arrdate,'yyyy-mm-dd hh24:mi:ss')<='" + toTimeStamp + "'"
                            + "  and a.aid in (depID,arrID) "
                            + "  and a.aid not in (" + aid1 + "," + aid2 + ")");

                    String via = "";
                    while (rs3.next()) {
                        via = via + rs3.getString(1) + ", ";
                    }
                    if (via.equals("")) {
                        via = "No Stops";
                    } else {
                        via = via.substring(0, via.length() - 2);
                    }

                    ResultSet rs4 = st4.executeQuery("select min(availeco),sum(ecoprice),sum(busprice),min(availbus) "
                            + "from particularflight natural join flight  "
                            + "where to_char(depdate,'yyyy-mm-dd hh24:mi:ss')>='" + fromTimeStamp + "'"
                            + "  and to_char(arrdate,'yyyy-mm-dd hh24:mi:ss')<='" + toTimeStamp + "'"
                            + " group by flightno  "
                            + " having flightno='" + FlightNo + "'");
                    if (rs4.next()) {

                        ecoseats = rs4.getInt(1);
                        ecoCost = rs4.getInt(2);
                        busCost = rs4.getInt(3);
                        busseats = rs4.getInt(4);

                    }

                    ResultSet rs5 = st5.executeQuery("select baseeco,basebus"
                            + " from baseprice"
                            + " where flightno='" + FlightNo + "'");
                    if (rs5.next()) {

                        ecoCost += rs5.getInt(1);
                        busCost += rs5.getInt(2);
                    }

                    FlightTable.getModel().setValueAt(FlightNo, row, 0);
                    FlightTable.getModel().setValueAt(fromiata, row, 1);
                    FlightTable.getModel().setValueAt(toiata, row, 2);
                    FlightTable.getModel().setValueAt(fromTimeStamp.substring(0, 16), row, 3);
                    FlightTable.getModel().setValueAt(toTimeStamp.substring(0, 16), row, 4);
                    FlightTable.getModel().setValueAt(via, row, 5);
                    FlightTable.getModel().setValueAt(ecoseats, row, 6);
                    FlightTable.getModel().setValueAt(busseats, row, 7);
                    FlightTable.getModel().setValueAt(ecoCost, row, 8);
                    FlightTable.getModel().setValueAt(busCost, row, 9);

                    row++;
                }
                if (twowayRadio.isSelected()) {
                    flag++;
                    fromday = ToDateChooser.getCalendar().get(Calendar.DATE); //day of the month dd
                    frommonth = ToDateChooser.getCalendar().get(Calendar.MONTH) + 1; //mm-1 (jan=0,dec=11)
                    fromyear = ToDateChooser.getCalendar().get(Calendar.YEAR); //yyyy
                    StartDate = fromyear + "-" + frommonth + "-" + fromday;
                    temp = fromiata;
                    fromiata = toiata;
                    toiata = temp;
                }
            } while (flag == 1);

            if (!f) {                                                           
                jLabel1.setText("No flights match your search..!");
                BottomPanel.setVisible(false);//additions
            }                                                                  

            con.close();
        } catch (SQLException se) {
            System.out.println(se);
        }


    }//GEN-LAST:event_FindButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        onewayRadio.setSelected(true);
        FromDateChooser.setDate(null);
        ToDateChooser.setVisible(false);
        ToDateLabel.setVisible(false);
        fromCombo.setSelectedIndex(0);
        toCombo.setSelectedIndex(0);

        BottomPanel.setVisible(false);
        jLabel1.setText("");
        ViewTicketButton.setEnabled(false);
        CancelTicketButton.setEnabled(false);
        BookTicketButton.setEnabled(false);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        boolean loginflag = false;
        successMessageLabel.setText("");
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select username,password,user_index from airline_user");
            String username = UsernameTextField.getText();
            String password = PasswordField.getText();
            if (username.equals("") || password.equals("")) {
                successMessageLabel.setText("All fields are mandatory!");
                con.close();
                return;
            }

            while (rs.next()) {
                if (rs.getString(1).equals(username) && rs.getString(2).equals(password)) {

                    if (rs.getString(1).equals("admin") && rs.getString(2).equals("admin")) {
                        java.awt.CardLayout cardLayout = (java.awt.CardLayout) (SwitchPanel.getLayout());
                        cardLayout.show(SwitchPanel, "card3");
                        HelloNameLabel1.setText("Hello, " + username + "!");
                        userID = rs.getInt(3);
                    } else {
                        java.awt.CardLayout cardLayout = (java.awt.CardLayout) (SwitchPanel.getLayout());
                        cardLayout.show(SwitchPanel, "card2");
                        HelloNameLabel.setText("Hello, " + username + "!");
                        userID = rs.getInt(3);
                    }

                    loginflag = true;
                    con.close();
                    return;

                }
            }
            if (!loginflag) {
                successMessageLabel.setText("Invalid username or password");

            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void TicketHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketHistoryButtonActionPerformed
        jLabel1.setText("");
        BookTicketButton.setEnabled(false);
        ViewTicketButton.setEnabled(false);
        CancelTicketButton.setEnabled(false);
        boolean flag = false;

        int n;
        javax.swing.table.DefaultTableModel dm = (javax.swing.table.DefaultTableModel) ViewHistoryTable.getModel();
        dm.setRowCount(0);

        java.awt.CardLayout cardLayout = (java.awt.CardLayout) (BottomPanel.getLayout());

        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");

            PreparedStatement s1 = con.prepareStatement("select tid,transid,pid,dfid,afid from ticket where tid IN "
                    + "(select tid  from userticket where user_index = (select user_index from airline_user where username=? ))");
            s1.setString(1, UsernameTextField.getText());
            ResultSet rs1 = s1.executeQuery();

            Statement s2 = con.createStatement();
            Statement s3 = con.createStatement();
            ResultSet rs2, rs3;
            int row = 0;

            while (rs1.next()) {
                flag = true;
                jLabel1.setText("Ticket History");                              
                ViewTicketButton.setEnabled(true);
                CancelTicketButton.setEnabled(true);
                BottomPanel.setVisible(true);
                cardLayout.show(BottomPanel, "card2");
                n = ViewHistoryTable.getRowCount() + 1;
                dm.setRowCount(n);

                rs2 = s2.executeQuery("select fname||' '||lname from passenger where pid=" + rs1.getInt(3));
                rs3 = s3.executeQuery("select f1.flightno,a1.city ,a2.city "
                        + "from flight f1,flight f2,airport a1,airport a2 "
                        + "where f1.flightno=f2.flightno and "
                        + "a1.aid=f1.depid and a2.aid=f2.arrid and f1.fid=" + rs1.getInt(4) + "and f2.fid=" + rs1.getInt(5));
                rs2.next();
                rs3.next();
                ViewHistoryTable.getModel().setValueAt(rs1.getString(1), row, 0);
                ViewHistoryTable.getModel().setValueAt(rs3.getString(1), row, 1);
                ViewHistoryTable.getModel().setValueAt(rs3.getString(2), row, 2);
                ViewHistoryTable.getModel().setValueAt(rs3.getString(3), row, 3);
                ViewHistoryTable.getModel().setValueAt(rs2.getString(1), row, 4);

                row++;
            }
            if (!flag) {
                jLabel1.setText("No ticket history!");
                BottomPanel.setVisible(false);

            }

            con.close();
        } catch (SQLException se) {
            System.out.println(se);
        }


    }//GEN-LAST:event_TicketHistoryButtonActionPerformed

    private void ViewTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTicketButtonActionPerformed

        
        int selRow = ViewHistoryTable.getSelectedRow();
           
        if (selRow == -1) {
            jLabel1.setText("Please select a ticket to continue");
            return;
        }

        jLabel1.setText("Ticket History");
        String ticketno = (String) ViewHistoryTable.getModel().getValueAt(selRow, 0);
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");

            PreparedStatement s1 = con.prepareStatement("select tid,transid,pid,dfid,afid,seatno,cost,bookdate,ddate,adate "
                    + "from ticket where tid =?");
            s1.setInt(1, Integer.parseInt(ticketno));
            ResultSet rs1 = s1.executeQuery();
            rs1.next();
           

            String transid = rs1.getString(2);
            String flightno = (String) ViewHistoryTable.getModel().getValueAt(selRow, 1);
            Statement s2 = con.createStatement();
            ResultSet rs2 = s2.executeQuery("select a.apname,a.city "
                    + "from flight f,airport a "
                    + "where a.aid=f.depid and f.fid=" + rs1.getInt(4));
            rs2.next();
            String from = rs2.getString(1) + " ," + rs2.getString(2);
            String fromtime = rs1.getString(9);
            rs2 = s2.executeQuery("select a.apname,a.city "
                    + "from flight f,airport a "
                    + "where a.aid=f.arrid and f.fid=" + rs1.getInt(5));
            rs2.next();
            String to = rs2.getString(1) + " ," + rs2.getString(2);
            String totime = rs1.getString(10);
            String bookdate = rs1.getString(8);
            String cost = rs1.getString(7);
            String seatno = rs1.getString(6);
            String name = (String) ViewHistoryTable.getModel().getValueAt(selRow, 4);

            Ticket t = new Ticket(ticketno, transid, flightno, from, fromtime, to, totime, bookdate, cost, seatno, name);
            t.setVisible(true);

            con.close();
        } catch (SQLException se) {
            System.out.println(se);
        }


    }//GEN-LAST:event_ViewTicketButtonActionPerformed

    private void BookTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookTicketButtonActionPerformed

        int selRow = FlightTable.getSelectedRow();

        if (selRow == -1) {
            jLabel1.setText("Please select a flight to continue");
            return;
        }
        
        jLabel1.setText("Search Results");
        String flightno = (String) FlightTable.getModel().getValueAt(selRow, 0);
        String fromiata = (String) FlightTable.getModel().getValueAt(selRow, 1);
        String toiata = (String) FlightTable.getModel().getValueAt(selRow, 2);
        String departuretime = (String) FlightTable.getModel().getValueAt(selRow, 3);
        String arrivaltime = (String) FlightTable.getModel().getValueAt(selRow, 4);
        String via = (String) FlightTable.getModel().getValueAt(selRow, 5);
        int ecoprice = (int) FlightTable.getModel().getValueAt(selRow, 8);
        int busprice = (int) FlightTable.getModel().getValueAt(selRow, 9);
        Booking b = new Booking(flightno, fromiata, toiata, departuretime, arrivaltime, via, ecoprice, busprice, userID);
        b.setVisible(true);


    }//GEN-LAST:event_BookTicketButtonActionPerformed

    private void CancelTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelTicketButtonActionPerformed

        
        int selRow = ViewHistoryTable.getSelectedRow();

        if (selRow == -1) {
            jLabel1.setText("Please select a ticket to continue");
            return;
        }
        
        jLabel1.setText("Ticket History"); 
        String message = "Are you sure you want to delete? ";
        int reply = javax.swing.JOptionPane.showConfirmDialog(this, message, "Warning", javax.swing.JOptionPane.YES_NO_OPTION);
        if (reply == javax.swing.JOptionPane.YES_OPTION) {

            String ticketno = (String) ViewHistoryTable.getModel().getValueAt(selRow, 0);
            try {
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
                PreparedStatement ps = con.prepareStatement("select dfid,afid,ddate,adate,pid,seatingclass "
                        + "from ticket where tid=?");
                ps.setString(1, ticketno);
                ResultSet rs = ps.executeQuery();
                    

                if (rs.next()) {
                    String fromTimeStamp = rs.getString(3).substring(0, 19);
                    String toTimeStamp = rs.getString(4).substring(0, 19);

                    Statement s = con.createStatement();
                    ResultSet r1 = s.executeQuery("select sysdate from dual");
                    r1.next();

                    if (rs.getDate(3).compareTo(r1.getDate(1)) < 0) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Cannot cancel ticket. Travel date is over!");
                        //  con.close();
                        // return;
                    }

                    s = con.createStatement();
                    r1 = s.executeQuery("select flightno from flight where fid=" + rs.getString(1));
                    r1.next();
                    String FlightNo = r1.getString(1);
                    
                    s = con.createStatement();
                    if (rs.getInt(6) == 0) {
                        s.executeUpdate("update particularflight set availeco=availeco+1 "
                                + "where fid IN (select fid from flight where Flightno='" + FlightNo + "')"
                                + "and to_char(depdate,'yyyy-mm-dd hh24:mi:ss')>='" + fromTimeStamp + "' "
                                + "and to_char(arrdate,'yyyy-mm-dd hh24:mi:ss')<='" + toTimeStamp + "'");
                    } else if (rs.getInt(6) == 1) {
                        s.executeUpdate("update particularflight set availbus=availbus+1 "
                                + "where fid IN (select fid from flight where Flightno='" + FlightNo + "')"
                                + "and to_char(depdate,'yyyy-mm-dd hh24:mi:ss')>='" + fromTimeStamp + "' "
                                + "and to_char(arrdate,'yyyy-mm-dd hh24:mi:ss')<='" + toTimeStamp + "'");
                    }

                }

                Statement s = con.createStatement();

                s.executeUpdate("delete from userticket where tid=" + ticketno);
                s.executeUpdate("delete from ticket where tid=" + ticketno);
                s.executeUpdate("delete from passenger where pid=" + rs.getInt(5));

                javax.swing.JOptionPane.showMessageDialog(this, "Deleted");
                con.close();
                TicketHistoryButtonActionPerformed(evt);
            } catch (SQLException se) {
                System.out.println(se);
            }

        } 


    }//GEN-LAST:event_CancelTicketButtonActionPerformed


    private void LogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton1ActionPerformed
        new Start().setVisible(true);
    }//GEN-LAST:event_LogoutButton1ActionPerformed

    private void AddAirlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAirlineActionPerformed
         new tabAirline().setVisible(true);
    }//GEN-LAST:event_AddAirlineActionPerformed

    private void AddAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAirportActionPerformed
         new tabairport().setVisible(true);
    }//GEN-LAST:event_AddAirportActionPerformed

    private void AddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddFlightActionPerformed

    private void ChangeFlightStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeFlightStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeFlightStatusActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException ce) {
            System.out.println(ce);
        }
        new Start().setVisible(true);
    }

    int userID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAirline;
    private javax.swing.JButton AddAirport;
    private javax.swing.JButton AddFlight;
    private javax.swing.JPanel AdminLoggedInPanel;
    private javax.swing.JLabel BackgroundImg;
    private javax.swing.JButton BookTicketButton;
    private javax.swing.JPanel BottomBackGroundPanel;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JButton CancelTicketButton;
    private javax.swing.JButton ChangeFlightStatus;
    private javax.swing.JButton CheckButton;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ClearButton;
    private javax.swing.JPanel ClearCheckButtonPanel;
    private javax.swing.JButton FindButton;
    private javax.swing.JLabel FlightNoLabel;
    private javax.swing.JPanel FlightNoLabelTextFieldPanel;
    private javax.swing.JTextField FlightNoTextField;
    private javax.swing.JTable FlightTable;
    private javax.swing.JPanel FlightTablePanel;
    private com.toedter.calendar.JDateChooser FromDateChooser;
    private javax.swing.JLabel FromDateLabel;
    private javax.swing.JLabel HelloNameLabel;
    private javax.swing.JLabel HelloNameLabel1;
    private javax.swing.JPanel LoggedInPanel;
    private javax.swing.JButton Login;
    private javax.swing.JPanel LoginNewUserButtonPanel;
    private javax.swing.JPanel LoginOuterPannel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel LoginPanelBackGroundPanel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton LogoutButton1;
    private javax.swing.JPasswordField NewConfirmPasswordField;
    private javax.swing.JLabel NewConfirmPasswordLabel;
    private javax.swing.JTextField NewEmaidTextField;
    private javax.swing.JLabel NewEmailLabel;
    private javax.swing.JPasswordField NewPasswordField;
    private javax.swing.JLabel NewPasswordLabel;
    private javax.swing.JButton NewSubmitButton;
    private javax.swing.JButton NewUserButton;
    private javax.swing.JLabel NewUserNameLabel;
    private javax.swing.JTextField NewUserNameTextField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel StatusBackGroundPanel;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JScrollPane StatusScrollPane;
    private javax.swing.JTextArea StatusTextArea;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JPanel SwitchPanel;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JScrollPane TableScrollPane1;
    private javax.swing.JButton TicketHistoryButton;
    private com.toedter.calendar.JDateChooser ToDateChooser;
    private javax.swing.JLabel ToDateLabel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JTable ViewHistoryTable;
    private javax.swing.JPanel ViewHistoryTablePanel;
    private javax.swing.JButton ViewTicketButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel findTab;
    private javax.swing.JComboBox fromCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPanel newuserpanel;
    private javax.swing.JRadioButton onewayRadio;
    private javax.swing.JPanel statusTab;
    private javax.swing.JLabel successMessageLabel;
    private javax.swing.JPanel successMessagePanel;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JComboBox toCombo;
    private javax.swing.JRadioButton twowayRadio;
    private javax.swing.JPanel username_password;
    // End of variables declaration//GEN-END:variables
}
