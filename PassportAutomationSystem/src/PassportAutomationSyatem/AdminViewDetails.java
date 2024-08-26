package PassportAutomationSyatem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AdminViewDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminViewDetails frame = new AdminViewDetails();
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
	public AdminViewDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setBounds(214, 10, 344, 22);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JButton btnApprove = new JButton("Approve");
		btnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ban ;
				JOptionPane.showMessageDialog(null,"Approved");
			}
		});
		btnApprove.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnApprove.setBounds(41, 342, 127, 23);
		contentPane.add(btnApprove);
		
		JButton btnDecline = new JButton("Decline");
		btnDecline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ban ;
				JOptionPane.showMessageDialog(null,"Declined");
			}
		});
		btnDecline.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDecline.setBounds(214, 342, 127, 23);
		contentPane.add(btnDecline);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
					    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/passportAutomationSystem", "root", "#REXY*96#1>");
					    
					    String nic = textField_7.getText();
					    String sql = "SELECT full_name FROM applicationForm WHERE nic = ?";
					    PreparedStatement statement = connection.prepareStatement(sql);
					    statement.setString(1, nic); 
					    
					    ResultSet resultSet = statement.executeQuery();
					    
					    if (resultSet.next()) {
					        textField.setText(resultSet.getString("full_name"));
					    } else {
					        textField.setText("No record found"); // Handle case where no record is found
					    }
					    
					    resultSet.close();
					    statement.close();
					    connection.close();
					} catch (SQLException e1) {
					    e1.printStackTrace();
					}
			}
		});
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDisplay.setBounds(384, 342, 127, 23);
		contentPane.add(btnDisplay);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnClose.setBounds(565, 342, 127, 23);
		contentPane.add(btnClose);
		
		textField = new JTextField();
		textField.setBounds(190, 43, 260, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(190, 74, 260, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 105, 260, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(190, 137, 260, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(190, 168, 260, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(190, 199, 260, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(190, 230, 260, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(190, 261, 260, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1 = new JLabel("NIC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(102, 252, 66, 32);
		contentPane.add(lblNewLabel_1);
	}
}
