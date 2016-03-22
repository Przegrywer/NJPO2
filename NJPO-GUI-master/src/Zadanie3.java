import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Zadanie3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
    private JButton button = null;
    private Random r = new Random();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadanie3 frame = new Zadanie3();
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
	public Zadanie3() {
		setTitle("Skacz¹cy przycisk");
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100,100,800,600);
        button = new JButton("Kliknij mnie");
        button.setBounds(100,100,150,40);
        add(button);
        button.addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent me)
            {
                button.setBounds(r.nextInt(650),r.nextInt(540),150,40);
            }
        });
        setVisible(true);
	}
	
	
}
