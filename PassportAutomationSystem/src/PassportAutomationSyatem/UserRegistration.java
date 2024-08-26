package PassportAutomationSyatem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
					UserRegistration frame = new UserRegistration();
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
	public UserRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(153, 50, 87, 26);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setBounds(254, 22, 344, 22);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(341, 55, 311, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("LastName");
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(153, 88, 87, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("User Name");
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(153, 191, 87, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("E mail");
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(153, 154, 87, 26);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Telephone");
		lblNewLabel_1_1_1_2.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1_1_2.setBounds(153, 125, 87, 26);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Password");
		lblNewLabel_1_1_1_3.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel_1_1_1_3.setBounds(153, 228, 87, 26);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(341, 88, 311, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(341, 120, 311, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(341, 154, 311, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(341, 185, 311, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(341, 233, 311, 20);
		contentPane.add(textField_5);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserRegistration ROCK = new UserRegistration();
				ROCK.setVisible(true);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReset.setBounds(287, 345, 127, 23);
		contentPane.add(btnReset);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = textField.getText ();
				String lastName = textField_1.getText ();
				String telephone = textField_2.getText();
				String email = textField_3.getText ();
				String username =textField_4.getText () ;
				String password = textField_5.getText();
			
			    try {
			    	Class.forName("com.mysql.cj.jdbc.Driver");
			    	
			    	SQLConnection c = new SQLConnection();
					Connection con = c.getConnection();
					
					String query = "INSERT INTO userLogin(firstName,lastName,telephone,email,username,password) VALUES (?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					
					ps.setString (1,firstName);
					ps.setString (2,lastName);
					ps.setString (3,telephone);
					ps.setString (4,email);
					ps.setString (5,username);
					ps.setString (6,password);
					
					
					int i = ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "YOU HAVE BEEN SUCCESSFULLY REGISTERED");
					con.close();
					
					
			    }
			    	
			    	catch(SQLException e1){
			    			e1.printStackTrace();
			    			
			    		} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    	
		
				
			}
			
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnRegister.setBounds(536, 345, 127, 23);
		contentPane.add(btnRegister);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCancel.setBounds(701, 405, 127, 23);
		contentPane.add(btnCancel);
	}
}
