package PassportAutomationSyatem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setBackground(new Color(255, 51, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(147, 10, 481, 30);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1.setBounds(35, 81, 127, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(35, 143, 127, 20);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(184, 85, 283, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(184, 143, 283, 20);
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
					 String sql = "SELECT * FROM adminLogin WHERE username ='"+textField.getText() +"' AND password = '"+textField_1.getText()+"'";
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
		btnNewButton.setBounds(35, 277, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin ROCK = new AdminLogin();
				ROCK.setVisible(true);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReset.setBounds(265, 277, 127, 23);
		contentPane.add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				 BaseFormApplication ROCK = new  BaseFormApplication();
				ROCK.setVisible(true);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCancel.setBounds(522, 282, 127, 23);
		contentPane.add(btnCancel);
	}

}
