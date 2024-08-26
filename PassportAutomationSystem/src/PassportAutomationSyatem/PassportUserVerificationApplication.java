package PassportAutomationSyatem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class PassportUserVerificationApplication extends JFrame {

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
					PassportUserVerificationApplication frame = new PassportUserVerificationApplication();
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
	public PassportUserVerificationApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setBounds(141, 10, 481, 30);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please Login Before Viewing the Application");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(158, 69, 524, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("User Name");
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(44, 141, 127, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(44, 196, 127, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(206, 145, 283, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 196, 283, 20);
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
					 String sql = "SELECT * FROM userLogin WHERE username ='"+textField.getText() +"' AND password = '"+textField_1.getText()+"'";
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
				}dispose();
				ApplicationForm hal = new ApplicationForm();
				hal.setVisible(true);
			
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(44, 293, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ApplicationForm ROCK = new ApplicationForm();
				ROCK.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCancel.setBounds(495, 293, 127, 23);
		contentPane.add(btnCancel);
	}
}
