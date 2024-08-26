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

public class PoliceLogin extends JFrame {

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
					PoliceLogin frame = new PoliceLogin();
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
	public PoliceLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(118, 11, 481, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("User Name");
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(49, 102, 127, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(49, 161, 127, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(223, 106, 283, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(223, 165, 283, 20);
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
					 String sql = "SELECT * FROM policeLogin WHERE username ='"+textField.getText() +"' AND password = '"+textField_1.getText()+"'";
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
		btnNewButton.setBounds(49, 287, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PoliceLogin ROCK = new PoliceLogin();
				ROCK.setVisible(true);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReset.setBounds(298, 287, 127, 23);
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
		btnCancel.setBounds(555, 287, 127, 23);
		contentPane.add(btnCancel);
	}

}
