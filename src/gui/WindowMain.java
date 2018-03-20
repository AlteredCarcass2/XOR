package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class WindowMain implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField txtUseOnlyAscii;
	private JTextField txtTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowMain window = new WindowMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 136);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFilepath = new JLabel("Filepath:");
		lblFilepath.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFilepath.setBounds(10, 11, 58, 14);
		frame.getContentPane().add(lblFilepath);
		
		textField = new JTextField();
		textField.setBounds(78, 9, 208, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEncryptionPassword = new JLabel("Encryption password:");
		lblEncryptionPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEncryptionPassword.setBounds(10, 36, 132, 14);
		frame.getContentPane().add(lblEncryptionPassword);
		
		txtUseOnlyAscii = new JTextField();
		txtUseOnlyAscii.setText("use only ASCII");
		txtUseOnlyAscii.setToolTipText("");
		txtUseOnlyAscii.setBounds(152, 34, 134, 20);
		frame.getContentPane().add(txtUseOnlyAscii);
		txtUseOnlyAscii.setColumns(10);
		
		JLabel lblOutputFilepath = new JLabel("Output filename:");
		lblOutputFilepath.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOutputFilepath.setBounds(10, 61, 101, 14);
		frame.getContentPane().add(lblOutputFilepath);
		
		txtTest = new JTextField();
		txtTest.setText("test");
		txtTest.setBounds(121, 59, 165, 20);
		frame.getContentPane().add(txtTest);
		txtTest.setColumns(10);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setBounds(307, 33, 89, 23);
		frame.getContentPane().add(btnEncrypt);
		btnEncrypt.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.textField.setText(null);
		
	}
}
