package PassportAutomationSyatem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class DateSelectUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateSelectUser frame = new DateSelectUser();
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
	public DateSelectUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setBounds(150, 10, 481, 30);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please Select A Date For Document Verification");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(150, 75, 506, 25);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("11/01/2024");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = "11/01/2024";
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(33, 143, 133, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("24/01/2024");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = "24/01/2024";
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_1.setBounds(33, 179, 133, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("21/01/2024");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = "21/01/2024";
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_2.setBounds(33, 212, 133, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("14/01/2024");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String date = "14/01/2024";
			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_3.setBounds(33, 248, 133, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("13/01/2024");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_4.setBounds(204, 145, 133, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("15/01/2024");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_5.setBounds(204, 181, 133, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("16/01/2024");
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_6.setBounds(204, 214, 133, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("17/01/2024");
		rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_7.setBounds(204, 250, 133, 23);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("18/01/2024");
		rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_8.setBounds(389, 145, 133, 23);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("19/01/2024");
		rdbtnNewRadioButton_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_9.setBounds(389, 181, 133, 23);
		contentPane.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("21/01/2024");
		rdbtnNewRadioButton_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_10.setBounds(389, 214, 133, 23);
		contentPane.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("22/01/2024");
		rdbtnNewRadioButton_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_11.setBounds(389, 250, 133, 23);
		contentPane.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("23/01/2024");
		rdbtnNewRadioButton_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_12.setBounds(568, 145, 133, 23);
		contentPane.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("25/01/2024");
		rdbtnNewRadioButton_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_13.setBounds(568, 181, 133, 23);
		contentPane.add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("26/01/2024");
		rdbtnNewRadioButton_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_14.setBounds(568, 214, 133, 23);
		contentPane.add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("27/01/2024");
		rdbtnNewRadioButton_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton_15.setBounds(568, 248, 133, 23);
		contentPane.add(rdbtnNewRadioButton_15);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCancel.setBounds(39, 354, 127, 23);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("NIC");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(43, 278, 62, 30);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(95, 285, 177, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUMBIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					String nic = textField.getText ();
					String date = null;
					
					  try {
				        	Class.forName("com.mysql.cj.jdbc.Driver");
				        	SQLConnection ton = new SQLConnection();
				        	Connection con = ton.getConnection();
				        	Statement gon;
				        	gon = con.createStatement();
				        	String pin = "UPDATE applicationForm SET  selectedDate = ? WHERE nic = ? ";
				        	PreparedStatement ps = con.prepareStatement(pin);
				        	
				        	ps.setString (1,date);
				        	ps.setString (2,nic);
				        	
				        	int ban = ps.executeUpdate();
							JOptionPane.showMessageDialog(null,"SUCCESSFULLY APPLIED");
				}
				  
		        catch(ClassNotFoundException e3) {
		        	e3.printStackTrace();
		        }
		        catch(SQLException e3) {
		        	e3.printStackTrace();
		        }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(33, 320, 133, 30);
		contentPane.add(btnNewButton);
	}
}
