package PassportAutomationSyatem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BaseFormApplication extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseFormApplication frame = new BaseFormApplication();
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
	public BaseFormApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 431);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(131, 11, 481, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UserLogin hal = new UserLogin();
				hal.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(296, 90, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAdministrator = new JButton("Administrator");
		btnAdministrator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin hal = new AdminLogin();
				hal.setVisible(true);
			}
		});
		btnAdministrator.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnAdministrator.setBounds(266, 153, 210, 23);
		contentPane.add(btnAdministrator);
		
		JButton btnPolice = new JButton("Police");
		btnPolice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PoliceLogin hal = new PoliceLogin();
				hal.setVisible(true);
			}
		});
		btnPolice.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPolice.setBounds(296, 207, 127, 23);
		contentPane.add(btnPolice);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnExit.setBounds(296, 276, 127, 23);
		contentPane.add(btnExit);
	}

}
