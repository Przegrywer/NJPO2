import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnZadanie1 = new JButton("Zadanie 1");
		btnZadanie1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Zadanie1 zad1 = new Zadanie1();
			zad1.setVisible(true);	
				
				
			}
		});
		frame.getContentPane().add(btnZadanie1);
		
		JButton btnZadanie2 = new JButton("Zadanie 2");
		btnZadanie2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Zadanie2 zad2 = new Zadanie2();
				zad2.setVisible(true);		
				
			}
		});
		frame.getContentPane().add(btnZadanie2);
		
		JButton btnZadanie3 = new JButton("Zadanie 3");
		btnZadanie3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Zadanie3 zad3 = new Zadanie3();
				zad3.setVisible(true);	
				
			}
		});
		frame.getContentPane().add(btnZadanie3);
		
		JButton btnZadanie4 = new JButton("Zadanie 4");
		btnZadanie4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Zadanie4 zad4 = new Zadanie4();
				zad4.setVisible(true);	
				
			}
		});
		frame.getContentPane().add(btnZadanie4);

	
	}

}
