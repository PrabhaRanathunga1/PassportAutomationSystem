package PassportAutomationSyatem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ApplicationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationForm frame = new ApplicationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ApplicationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setBounds(212, 11, 344, 22);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(238, 111, 273, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT A COUNTRY"}));
		comboBox_1.setBounds(237, 232, 274, 22);
		contentPane.add(comboBox_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String full_name = textField.getText ();
				String nic = textField_1.getText ();
				String gender = comboBox.getSelectedItem().toString();
				String email = textField_3.getText();
				String address = textField_4.getText ();
				String telephone =textField_5.getText ();
		        String counrtry_of_travel = comboBox_1.getSelectedItem().toString();
		        
		        
		        try {
		        	Class.forName("com.mysql.cj.jdbc.Driver");
		        	SQLConnection ton = new SQLConnection();
		        	Connection con = ton.getConnection();
		        	Statement lon;
		        	lon = con.createStatement();
		        	String sin = "insert into  applicationForm(full_name,nic,gender,email,address,telephone,country_of_travel)values(?,?,?,?,?,?,?)";
		        	PreparedStatement ps = con.prepareStatement(sin);
		        	
		        	ps.setString (1,full_name);
					ps.setString (2,nic);
					ps.setString (3,gender);
					ps.setString (4,email);
					ps.setString (5,address);
					ps.setString (6,telephone);
					ps.setString (7,counrtry_of_travel);
					
					int ban = ps.executeUpdate();
					JOptionPane.showMessageDialog(null,"SUCCESSFULLY APPLIED");
					
		        }
		        catch(ClassNotFoundException e1) {
		        	e1.printStackTrace();
		        }
		        catch(SQLException e1) {
		        	e1.printStackTrace();
		        }
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSubmit.setBounds(54, 319, 127, 23);
		contentPane.add(btnSubmit);
		
		JButton btnReset_1 = new JButton("Reset");
		btnReset_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserRegistration ROCK = new UserRegistration();
				ROCK.setVisible(true);
			}
		});
		btnReset_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReset_1.setBounds(265, 319, 127, 23);
		contentPane.add(btnReset_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserRegistration gal = new UserRegistration();
				gal.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCancel.setBounds(488, 319, 127, 23);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Full name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(68, 59, 113, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("N.I.C");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(68, 82, 113, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(68, 105, 113, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(68, 136, 113, 31);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Address");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(68, 167, 113, 31);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Telephone");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_2.setBounds(68, 195, 113, 31);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Country of Travel");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_3.setBounds(68, 226, 113, 31);
		contentPane.add(lblNewLabel_1_3_3);
		
		textField = new JTextField();
		textField.setBounds(238, 66, 273, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(238, 89, 273, 20);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(238, 143, 273, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(238, 174, 273, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(238, 202, 273, 20);
		contentPane.add(textField_5);
		
		
	}
}
