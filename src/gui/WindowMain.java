package gui;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;

public class WindowMain {

	private JFrame frame;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//--------------------------------------------------------------------------------------//
	
	/**
	 * 
	 * @param pswd
	 * @return
	 */
	public static String properPSWD(String pswd) {
		String[] parts = pswd.split(" ");
		String proper = "";
		for(String s : parts) {
			proper += s;
		} 
		return proper;
	}
	
	public static void EncryptFile(String path, String pswd) {
		if(!checkPathToFile(path)) {
			
		}
		
	}
	
	/**
	 * 
	 * @param path
	 * @return if path to file exists
	 */
	public static boolean checkPathToFile(String path) {
		File p = new File(path);
		if(p.exists()) {
			return true;
		}
		return false;
	}
	
	
	

}
