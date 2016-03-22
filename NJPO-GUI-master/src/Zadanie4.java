import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Zadanie4 extends JFrame {

	private JPanel contentPane;
	
	private JTextField textFieldPesel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zadanie4 frame = new Zadanie4();
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
	public void SprawdzCzyPlikIstnieje(){
        File plik = new File("log.txt");
        if( plik.isFile() == true){
        }
        else{
            try{
                boolean b = plik.createNewFile();
            }
            catch(IOException e){
            	JOptionPane.showMessageDialog(null, "Nie mozna utworzyc pliku." );
            }
        }
    }
	public void DopiszDoPliku(String s){
		try{
		FileWriter file = new FileWriter("log.txt", true);
		BufferedWriter out = new BufferedWriter(file);
		out.write(s);
		out.close();
		JOptionPane.showMessageDialog(null, "Operacja zakoñczona sukcesem!" );
		}
        catch(IOException e){
        	JOptionPane.showMessageDialog(null, "B³ad przy zapisie do pliku." );
        }
		
	}

	
	public Zadanie4() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
		DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
		decimalFormat.setGroupingUsed(false);
		textFieldPesel = new JFormattedTextField(decimalFormat);
		textFieldPesel.setColumns(15);
		
		JButton btnNewButton = new JButton("Akceptuj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SprawdzCzyPlikIstnieje();
				
				
				if(textFieldPesel.getText().hashCode() != 0){
				
				//konwersja liczby do tablicy
				
				int [] digits = new int[12];
				
				
			
				long liczba = Long.valueOf(textFieldPesel.getText()).longValue();
				
				for(int i =10; i>=0; i--){
					if(liczba>0){
						digits[i] = (int) (liczba % 10);
				        liczba /= 10;
					}

				}
    
				
				//dodanie liczby kontrolnej
				
				
				
			    int sum = 0;
			    boolean alt = true;
			    
			    for(int i = 0; i < digits.length; i++)
			    {
			      int temp = digits[i];
			      if(alt)
			      {  
			        temp *= 2;
			        if(temp > 9)
			        {
			          temp -= 9; //równowa¿ne dodaniu cyfr do siebie np. 1+6 = 7, 16-9 = 7
			        }
			      }
			      sum += temp;
			      alt = !alt;
			    }
			    
			    if(sum % 10!=0){
			    	digits[11] = 10 - (sum%10);
			    }
				    
			    
			    //sprawdzenie
			    
			    sum = 0;
			    alt = false;
			    
			    for(int i = digits.length - 1; i >= 0; i--)
			    {
			      int temp = digits[i];
			      if(alt)
			      {  
			        temp *= 2;
			        if(temp > 9)
			        {
			          temp -= 9; //równowa¿ne dodaniu cyfr do siebie np. 1+6 = 7, 16-9 = 7
			        }
			      }
			      sum += temp;
			      alt = !alt;
			    }
			    
			    
			 int miesiac = digits[2]*10 + digits[3];			 
			 int dzien = digits[4]*10 + digits[5];
			 
			 if(miesiac>12 || dzien>31 || sum %10!=0){
				 JOptionPane.showMessageDialog(null, "B³êdny PESEL." );
			 }
			 else{
				 String numerPesel = "";
				 
				 for(int i = 0; i < 11; i++){
					 numerPesel += Integer.toString(digits[i]);					 
				 }
				 numerPesel+=" ";
				 DopiszDoPliku(numerPesel);
				 
			 }
			    
			 //JOptionPane.showMessageDialog(null, miesiac + " " + dzien);   
			 
				}else{
					JOptionPane.showMessageDialog(null, "WprowadŸ PESEL" );
				}
			 
			}
		});
		
		JLabel lblPodajSwjPesel = new JLabel("Podaj Sw\u00F3j PESEL");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(131)
							.addComponent(textFieldPesel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(150)
							.addComponent(lblPodajSwjPesel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(153)
							.addComponent(btnNewButton)))
					.addContainerGap(167, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblPodajSwjPesel)
					.addGap(18)
					.addComponent(textFieldPesel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnNewButton)
					.addContainerGap(124, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}

}
