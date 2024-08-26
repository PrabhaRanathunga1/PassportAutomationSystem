package PassportAutomationSyatem;

import java.awt.BorderLayout;
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblNewLabel.setBounds(158, 22, 521, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1.setBounds(190, 135, 127, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(347, 139, 283, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(190, 191, 127, 20);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(347, 191, 283, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQLConnection db = new SQLConnection();
				Connection con = db.getConnection();
				Statement stmt;
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					 stmt = con.createStatement();
					 String sql = "SELECT * FROM userLogin2 WHERE username ='"+textField.getText() +"' AND password = '"+textField_1.getText()+"'";
                     ResultSet rs;
                     
                     rs = stmt.executeQuery (sql);
                     if(rs.next ()) {
                    	 dispose ();
                    	 JOptionPane. showMessageDialog(null, "Login Successfull");
                    	 


                     }
                     else {
                    	 JOptionPane. showMessageDialog (null,"username or password Incorrect");
                    	 con.close();
                    	 
                     }
                     

				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				catch(ClassNotFoundException e1) {
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(203, 315, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSignin = new JButton("Sign In");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserRegistration hal = new UserRegistration();
				hal.setVisible(true);
			}
		});
		btnSignin.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSignin.setBounds(552, 299, 127, 23);
		contentPane.add(btnSignin);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose ();
			    BaseFormApplication hal = new BaseFormApplication();
				hal.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(414, 392, 77, 20);
		contentPane.add(btnCancel);
	}
}
