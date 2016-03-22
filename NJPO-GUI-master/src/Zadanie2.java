import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class Zadanie2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLiczba1;
	private JTextField textFieldLiczba2;
	private JRadioButton rdbtnDodawanie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadanie2 frame = new Zadanie2();
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
	public Zadanie2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 458, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		rdbtnDodawanie = new JRadioButton("Dodawanie");
		
		JRadioButton rdbtnOdejmowanie = new JRadioButton("Odejmowanie");
		
		JRadioButton rdbtnMnozenie = new JRadioButton("Mno\u017Cenie");
		
		JRadioButton rdbtnDzielenie = new JRadioButton("Dzielenie");
		
		ButtonGroup bg1 = new ButtonGroup( );

		bg1.add(rdbtnDodawanie);
		bg1.add(rdbtnOdejmowanie);
		bg1.add(rdbtnMnozenie);
		bg1.add(rdbtnDzielenie);

		
		
		textFieldLiczba1 = new JTextField();		
		textFieldLiczba2 = new JTextField();
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
		decimalFormat.setGroupingUsed(false);
		textFieldLiczba1 = new JFormattedTextField(decimalFormat);
		textFieldLiczba1.setColumns(10);
		textFieldLiczba2 = new JFormattedTextField(decimalFormat);
		textFieldLiczba2.setColumns(10);
		
		
		JLabel labelWynikValue = new JLabel("0");
		
		JLabel lblLiczba = new JLabel("Liczba 1");
		
		JLabel lblLiczba_1 = new JLabel("Liczba 2");
		
		JLabel lblWynik = new JLabel("Wynik");
		
		JButton btnNewButton = new JButton("Oblicz!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldLiczba1.getText().hashCode() != 0 && textFieldLiczba2.getText().hashCode() != 0){
					int liczba1 = Integer.parseInt(textFieldLiczba1.getText());
					int liczba2 = Integer.parseInt(textFieldLiczba2.getText());
					int wynik;
					if(rdbtnDodawanie.isSelected()){
						wynik = liczba1+liczba2;
						labelWynikValue.setText(Integer.toString(wynik));						
					}
					else if(rdbtnOdejmowanie.isSelected()){
						wynik = liczba1-liczba2;
						labelWynikValue.setText(Integer.toString(wynik));						
					}
					else if(rdbtnMnozenie.isSelected()){
						wynik = liczba1*liczba2;
						labelWynikValue.setText(Integer.toString(wynik));						
					}
					else if(rdbtnDzielenie.isSelected()){
						wynik = liczba1/liczba2;
						labelWynikValue.setText(Integer.toString(wynik));						
					}
					else{
						JOptionPane.showMessageDialog(null, "Wybierz dzia≥anie programu." );
					}
				}
				else{	
					JOptionPane.showMessageDialog(null, "Wprowadü liczby." );
				}

				
			}
		});
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addComponent(lblLiczba)
							.addGap(104)
							.addComponent(lblLiczba_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(41)
							.addComponent(textFieldLiczba1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(textFieldLiczba2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(55)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(labelWynikValue, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblWynik)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnOdejmowanie)
								.addComponent(rdbtnDodawanie)
								.addComponent(rdbtnMnozenie))
							.addPreferredGap(ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(rdbtnDzielenie)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addComponent(rdbtnDodawanie)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnOdejmowanie)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnMnozenie))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnDzielenie)
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLiczba)
						.addComponent(lblLiczba_1)
						.addComponent(lblWynik))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldLiczba1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldLiczba2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelWynikValue, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(59))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
