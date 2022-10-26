import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

class deposit extends JFrame implements ActionListener {


	public static void main(String[] args) {      
        try {
                deposit frame = new deposit();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
         
    }

    private JPanel contentPanel;
    public JTextField fName,accNo,amount,pNo;
    public JComboBox type;
    JCheckBox subject1,subject2,subject3;
     JRadioButton male,female;
     ButtonGroup bg;
     JButton submit;



    deposit(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        //********************LABELS************************

        JLabel lblNewLabel = new JLabel("Deposit");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 10, 273, 93);
        contentPanel.add(lblNewLabel);



        JLabel lb2NewLabel = new JLabel("Acc_no");
        lb2NewLabel.setForeground(Color.BLACK);
        lb2NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb2NewLabel.setBounds(20, 150, 100, 30);
        contentPanel.add(lb2NewLabel);



		JLabel lb3NewLabel = new JLabel("Name");
        lb3NewLabel.setForeground(Color.BLACK);
        lb3NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb3NewLabel.setBounds(20, 200, 100, 30);
        contentPanel.add(lb3NewLabel);

        JLabel lb4NewLabel = new JLabel("Amount");
        lb4NewLabel.setForeground(Color.BLACK);
        lb4NewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lb4NewLabel.setBounds(20, 250, 100, 30);
        contentPanel.add(lb4NewLabel);



        //********************TextFields************************


        accNo = new JTextField();
        accNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        accNo.setBounds(100, 150, 150, 30);
        contentPanel.add(accNo);
        accNo.setColumns(15);

        fName = new JTextField();
        fName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        fName.setBounds(100, 200, 150, 30);
        contentPanel.add(fName);
        fName.setColumns(15);


        amount = new JTextField();
        amount.setFont(new Font("Tahoma", Font.PLAIN, 14));
        amount.setBounds(100, 250, 150, 30);
        contentPanel.add(amount);
        amount.setColumns(15);




		submit=new JButton("Submit");
		submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        submit.setBounds(400, 250, 150, 30);
        contentPanel.add(submit);


        submit.addActionListener(this);



    }

    public void actionPerformed(ActionEvent ae){
    	String fName=this.fName.getText();
    	int accNo=Integer.parseInt(this.accNo.getText());
    	String amount=this.amount.getText();

    	

    	
    	System.out.println(fName);
    	System.out.println(accNo);
    	System.out.println(amount);
    	



        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root", "root123");

                PreparedStatement st = (PreparedStatement) connection.prepareStatement("Insert into deposit values(?,?,?,?)");

                st.setInt(1, accNo);
                st.setString(2, );
                st.setString(3,fName );
                st.setString(4,amount );
                

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                     dispose();
                  
                   new Menu();
                    
                    // this.dispose();
                   
                } else {
                    JOptionPane.showMessageDialog(btnNewButton, "Something went wrong");
                }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }






    }



}

