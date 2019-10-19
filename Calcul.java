package calculator;

import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Calcul extends JFrame {
	int count=1 ;
	int pls ;
	int min;
	int mul;
	int div;
	int calculations;
	double num, num_1 ,ans;
	private JPanel contentPane;
	private static JTextField textField;
	private static JButton btnNewButton_1;
	private static JButton btnNewButton_2;
	private static JButton btnNewButton_3;
	private static JButton btnNewButton_4;
	private static JButton btnNewButton_5;
	private static JButton btnNewButton_6;
	private static JButton btnNewButton_7;
	private static JButton btnNewButton_8;
	private static JButton btnNewButton_9;
	private static JButton btnNewButton_10;
	private static JButton btnNewButton_11;
	private static JButton btnNewButton_12;
	private static JButton btnNewButton_13;
	private static JButton btnNewButton_14;
	private static JButton btnNewButton_15;
	private static JButton btnNewButton;
	private static JButton btnNewButton_16;
	private JRadioButton rdbtnOn;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private static JTextField textField_1;
	String textdata;
	String textdata_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcul frame = new Calcul();
					frame.setVisible(true);
					btnNewButton.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					btnNewButton_2.setEnabled(false);
					btnNewButton_3.setEnabled(false);
					btnNewButton_4.setEnabled(false);
					btnNewButton_5.setEnabled(false);
					btnNewButton_6.setEnabled(false); 
					btnNewButton_7.setEnabled(false);
					btnNewButton_8.setEnabled(false);
					btnNewButton_9.setEnabled(false);
					btnNewButton_10.setEnabled(false);
					btnNewButton_11.setEnabled(false);
					btnNewButton_12.setEnabled(false);
					btnNewButton_13.setEnabled(false);
					btnNewButton_14.setEnabled(false);
					btnNewButton_15.setEnabled(false);
					btnNewButton_16.setEnabled(false);
					textField.setText(" ");
					textField_1.setText(" ");

					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calcul() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 50, 521, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
	    btnNewButton = new JButton("1");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	textdata =textField.getText(); 
	    	textField.setText(textdata+"1");
	    	
	    	pls=1;
	    	min=1;
	    	div=1;
	    	mul=1;
	    	
	    	}
	    });
		btnNewButton.setBounds(12, 90, 62, 62);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    textdata =textField.getText(); 
		    	textField.setText(textdata+"2"); 
		    	
		    	pls=1;
		    	min=1;
		    	div=1;
		    	mul=1;
				
				
			}
		});
		btnNewButton_1.setBounds(100, 90, 68, 62);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textdata =textField.getText(); 
		    	textField.setText(textdata+"3");		    	
		    	
		    	pls=1;
		    	min=1;
		    	div=1;
		    	mul=1;
			}
		});
		btnNewButton_2.setBounds(191, 90, 68, 62);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textdata =textField.getText(); 
		    	textField.setText(textdata+"4");		    	
		    	
		    	pls=1;
		    	min=1;
		    	div=1;
		    	mul=1;
				
			}
		});
		btnNewButton_3.setBounds(12, 165, 62, 62);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textdata =textField.getText(); 
		    	textField.setText(textdata+"5");
		    	min=1;
		    	div=1;
		    	mul=1;
     	    	pls=1;

			}
		});
		btnNewButton_4.setBounds(100, 165, 68, 62);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textdata =textField.getText(); 
		    	textField.setText(textdata+"6");
		   
		    	pls=1;
		    	min=1;
		    	div=1;
		    	mul=1;
				
			}
		});
		btnNewButton_5.setBounds(191, 165, 68, 62);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textdata =textField.getText(); 
		    	textField.setText(textdata+"7");
		    	
		    	pls=1;
		    	min=1;
		    	div=1;
		    	mul=1;
			}
		});
		btnNewButton_6.setBounds(12, 236, 62, 62);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textdata =textField.getText(); 
		    	textField.setText(textdata+"8");

		    	div=1; 
                pls=1;
		    	min=1;
		    	mul=1;
			}
		});
		btnNewButton_7.setBounds(100, 240, 68, 58);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textdata =textField.getText(); 
		    	textField.setText(textdata+"9");
		    	
		    	pls=1;
		    	min=1;
		    	div=1;
		    	mul=1;
			}
		});
		btnNewButton_8.setBounds(191, 240, 68, 58);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(pls==1)
				{
					
				 textdata =textField.getText(); 
				 textdata_1 =textField_1.getText();
			    num =Double.valueOf(textdata);

		    	textField_1.setText(textdata_1+textdata+"+");	
		    	textField.setText("");
		      	
		    	pls++;
		    	calculations= 1;
		    	System.out.println(num);
		    	pls=0;
		    	min=0;
		    	div=0;
		    	mul=0;
				}
				
				}
		});
		btnNewButton_9.setBounds(271, 90, 97, 62);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(min==1)
				{	
					 textdata =textField.getText(); 
					 textdata_1 =textField_1.getText(); 
					  num =Double.valueOf(textdata);
			    	textField_1.setText(textdata_1+textdata+"-");	
			      	textField.setText("");	
		    	min++;
		        calculations = 2;
		        
		    	pls=0;
		    	min=0;
		    	div=0;
		    	mul=0;
				}
				
				
			}
		});
		btnNewButton_10.setBounds(271, 165, 97, 62);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(mul==1)
				{	
					 textdata =textField.getText(); 
					 textdata_1 =textField_1.getText();
					  num =Double.valueOf(textdata);
			    	textField_1.setText(textdata_1+textdata+"*");	
			      	textField.setText("");	
		    	mul++;
                calculations =3;
                
		    	pls=0;
		    	min=0;
		    	div=0;
		    	mul=0;
				}
			}
		});
		btnNewButton_11.setBounds(274, 240, 97, 58);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(div==1)
				{	
					 textdata =textField.getText(); 
					 textdata_1 =textField_1.getText(); 
					  num =Double.valueOf(textdata);
			    	textField_1.setText(textdata_1+textdata+"/");	
			      	textField.setText(" ");		
		    	div++;
                calculations = 4;
		    	pls=0;
		    	min=0;
		    	div=0;
		    	mul=0;
				}
			}
		});
		btnNewButton_12.setBounds(274, 311, 97, 58);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textdata =textField.getText(); 
		    	textField.setText(textdata+"0");
			}
		});
		btnNewButton_13.setBounds(12, 312, 62, 57);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 textdata =textField.getText(); 
				 textdata_1 =textField_1.getText(); 
				 switch (calculations)
				 {
				 case 1:
					 num_1= Double.valueOf(textdata);
					 ans = num + num_1;
					break; 
				 case 2:
					 num_1= Double.valueOf(textdata);
					 ans =num - num_1 ;
					 
					 System.out.println("hello - "+ans);
					 System.out.println(num);
					 System.out.println(num_1);
					 break;
				 case 3:
					 num_1= Double.valueOf(textdata);
					 ans = num * num_1;
					 System.out.println("hello * "+ans);
					 System.out.println(num);
					 System.out.println(num_1);
					 break;
				 case 4:
					 num_1= Double.valueOf(textdata);
					 ans = num / num_1;
					 System.out.println("hello / "+ans);
					 System.out.println(num);
					 System.out.println(num_1);
				     

				 }
				
		    	textField_1.setText(textdata_1+textdata);
		    	 String Ans= Double.toString(ans);
		    	 
		    	 textField.setText(Ans);
			

		    	
		    	
			 
		}
		});
		btnNewButton_14.setBounds(191, 311, 68, 58);
		contentPane.add(btnNewButton_14);
		
		JRadioButton rdbtnOff = new JRadioButton("off");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false); 
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnNewButton_9.setEnabled(false);
				btnNewButton_10.setEnabled(false);
				btnNewButton_11.setEnabled(false);
				btnNewButton_12.setEnabled(false);
				btnNewButton_13.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnNewButton_16.setEnabled(false);
				textField.setText(" ");
				textField_1.setText(" ");

			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(465, 109, 68, 25);
		contentPane.add(rdbtnOff);
		
		rdbtnOn = new JRadioButton("on");
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnOn==e.getSource())
				{
					btnNewButton.setEnabled(true);
					btnNewButton_1.setEnabled(true);
					btnNewButton_2.setEnabled(true);
					btnNewButton_3.setEnabled(true);
					btnNewButton_4.setEnabled(true);
					btnNewButton_5.setEnabled(true);
					btnNewButton_14.setEnabled(true);
					btnNewButton_6.setEnabled(true); 
					btnNewButton_7.setEnabled(true);
					btnNewButton_8.setEnabled(true);
					btnNewButton_9.setEnabled(true);
					btnNewButton_10.setEnabled(true);
					btnNewButton_11.setEnabled(true);
					btnNewButton_12.setEnabled(true);
					btnNewButton_13.setEnabled(true);	
					btnNewButton_15.setEnabled(true);
					btnNewButton_16.setEnabled(true);
				}
				
				
			}
		});
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setBounds(393, 109, 68, 25);
		contentPane.add(rdbtnOn);
		
	    btnNewButton_15 = new JButton(".");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(count ==1) {
				 textdata =textField.getText(); 
		    	textField.setText(textdata+".");
				count++;
				}
				}
		});
		btnNewButton_15.setBounds(100, 311, 68, 58);
		contentPane.add(btnNewButton_15);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 13, 521, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
	    btnNewButton_16 = new JButton("Delete");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    textField_1.setText(" ");
				textField.setText(" ");
			    
			}
		});
		btnNewButton_16.setBounds(393, 235, 104, 65);
		contentPane.add(btnNewButton_16);
		
		JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {}
		});
		button.setBounds(387, 155, 97, 25);
		contentPane.add(button);
	
	}
}