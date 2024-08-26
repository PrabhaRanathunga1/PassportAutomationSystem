package PassportAutomationSyatem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;

public class PoliceUserView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PoliceUserView frame = new PoliceUserView();
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
	public PoliceUserView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 426);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AccessMaster Passport Control System");
		lblNewLabel.setBounds(215, 10, 344, 22);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(10, 51, 570, 233);
		contentPane.add(table);
		
		JButton btnApprove = new JButton("Approve");
		btnApprove.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnApprove.setBounds(22, 329, 127, 23);
		contentPane.add(btnApprove);
		
		JButton btnDecline = new JButton("Decline");
		btnDecline.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDecline.setBounds(401, 329, 127, 23);
		contentPane.add(btnDecline);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReset.setBounds(215, 329, 127, 23);
		contentPane.add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnClose.setBounds(580, 329, 127, 23);
		contentPane.add(btnClose);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDisplay.setBounds(609, 261, 127, 23);
		contentPane.add(btnDisplay);
	}

}
