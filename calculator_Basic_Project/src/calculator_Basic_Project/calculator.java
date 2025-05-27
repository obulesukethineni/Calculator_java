package calculator_Basic_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String Answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setBackground(Color.WHITE);
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.getContentPane().setBackground(Color.WHITE);
		frmCalculator.getContentPane().setBounds(new Rectangle(4, 4, 4, 4));
		frmCalculator.getContentPane().setLayout(null);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String backspace=null;
				if(textField.getText().length()>0) 
				{
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}

			
			
		});
		btnbackspace.setFont(new Font("Wingdings", Font.BOLD, 25));
		btnbackspace.setBackground(new Color(255, 0, 0));
		btnbackspace.setBounds(10, 155, 103, 73);
		frmCalculator.getContentPane().add(btnbackspace);
		
		JButton btnseven = new JButton("7");
		btnseven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number = textField.getText()+btnseven.getText();
				textField.setText(number);
			}
		});
		btnseven.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnseven.setBackground(Color.ORANGE);
		btnseven.setBounds(10, 231, 103, 73);
		frmCalculator.getContentPane().add(btnseven);
		
		JButton btnfour = new JButton("4");
		btnfour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number = textField.getText()+btnfour.getText();
				textField.setText(number);
			}
		});
		btnfour.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnfour.setBackground(Color.ORANGE);
		btnfour.setBounds(10, 307, 103, 73);
		frmCalculator.getContentPane().add(btnfour);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBackground(Color.ORANGE);
		btn1.setBounds(10, 383, 103, 73);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnzero.getText();
				textField.setText(number);
			}
		});
		btnzero.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnzero.setBackground(Color.ORANGE);
		btnzero.setBounds(10, 460, 103, 73);
		frmCalculator.getContentPane().add(btnzero);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 textField.setText(null);
			
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBackground(Color.ORANGE);
		btnClear.setBounds(117, 155, 103, 73);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btneight = new JButton("8");
		btneight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{String number = textField.getText()+btneight.getText();
			textField.setText(number);
			}
		});
		btneight.setFont(new Font("Tahoma", Font.BOLD, 25));
		btneight.setBackground(Color.ORANGE);
		btneight.setBounds(117, 231, 103, 73);
		frmCalculator.getContentPane().add(btneight);
		
		JButton btnfive = new JButton("5");
		btnfive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number = textField.getText()+btnfive.getText();
				textField.setText(number);
			}
		});
		btnfive.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnfive.setBackground(Color.ORANGE);
		btnfive.setBounds(117, 307, 103, 73);
		frmCalculator.getContentPane().add(btnfive);
		
		JButton btntwo = new JButton("2");
		btntwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btntwo.getText();
				textField.setText(number);
			}
		});
		btntwo.setFont(new Font("Tahoma", Font.BOLD, 25));
		btntwo.setBackground(Color.ORANGE);
		btntwo.setBounds(117, 383, 103, 73);
		frmCalculator.getContentPane().add(btntwo);
		
		JButton btndote = new JButton(".");
		btndote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btndote.getText();
				textField.setText(number);
			}
		});
		btndote.setFont(new Font("Tahoma", Font.BOLD, 25));
		btndote.setBackground(Color.ORANGE);
		btndote.setBounds(117, 460, 103, 73);
		frmCalculator.getContentPane().add(btndote);
		
		JButton btndoubleZero = new JButton("00");
		btndoubleZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String number = textField.getText()+btndoubleZero.getText();
				textField.setText(number);
			}
		});
		btndoubleZero.setFont(new Font("Tahoma", Font.BOLD, 25));
		btndoubleZero.setBackground(Color.ORANGE);
		btndoubleZero.setBounds(223, 155, 103, 73);
		frmCalculator.getContentPane().add(btndoubleZero);
		
		JButton btnnine = new JButton("9");
		btnnine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number = textField.getText()+btnnine.getText();
				textField.setText(number);
			}
		});
		btnnine.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnnine.setBackground(Color.ORANGE);
		btnnine.setBounds(223, 231, 103, 73);
		frmCalculator.getContentPane().add(btnnine);
		
		JButton btnsix = new JButton("6");
		btnsix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number = textField.getText()+btnsix.getText();
				textField.setText(number);
			}
		});
		btnsix.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnsix.setBackground(Color.ORANGE);
		btnsix.setBounds(223, 307, 103, 73);
		frmCalculator.getContentPane().add(btnsix);
		
		JButton btnthree = new JButton("3");
		btnthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{String number = textField.getText()+btnthree.getText();
			textField.setText(number);
			}
		});
		btnthree.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnthree.setBackground(Color.ORANGE);
		btnthree.setBounds(223, 383, 103, 73);
		frmCalculator.getContentPane().add(btnthree);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=(int) (first+second);
					answer=String.format("%2f",result);
					textField.setText(answer);
					
				}
				else if(operation=="-") {
					result=(int) (first-second);
					answer=String.format("%2f",result);
					textField.setText(answer);
					
				}
				else if(operation=="*") {
					result=(int) (first*second);
					answer=String.format("%2f",result);
					textField.setText(answer);
					
				}
				else if(operation=="/") {
					result=(int) (first/second);
					answer=String.format("%2f",result);
					textField.setText(answer);
					
				}
				else if(operation=="%") {
					result=(int) (first%second);
					answer=String.format("%2f",result);
					textField.setText(answer);
					
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnequal.setBackground(Color.ORANGE);
		btnequal.setBounds(223, 460, 103, 73);
		frmCalculator.getContentPane().add(btnequal);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnplus.setBackground(Color.ORANGE);
		btnplus.setBounds(328, 155, 103, 73);
		frmCalculator.getContentPane().add(btnplus);
		
		JButton btnsubracction = new JButton("-");
		btnsubracction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";;
			}
		});
		btnsubracction.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnsubracction.setBackground(Color.ORANGE);
		btnsubracction.setBounds(328, 231, 103, 73);
		frmCalculator.getContentPane().add(btnsubracction);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnmult.setBackground(Color.ORANGE);
		btnmult.setBounds(328, 307, 103, 73);
		frmCalculator.getContentPane().add(btnmult);
		
		JButton btndevision = new JButton("/");
		btndevision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndevision.setFont(new Font("Tahoma", Font.BOLD, 25));
		btndevision.setBackground(Color.ORANGE);
		btndevision.setBounds(328, 383, 103, 73);
		frmCalculator.getContentPane().add(btndevision);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 36));
		textField.setBounds(10, 56, 421, 89);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(20);
		
		JButton btnmodules = new JButton("%");
		btnmodules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnmodules.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnmodules.setBackground(Color.ORANGE);
		btnmodules.setBounds(328, 460, 103, 73);
		frmCalculator.getContentPane().add(btnmodules);
		frmCalculator.setBounds(100, 100, 464, 593);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	protected StringBuilder StringBuilder(String text) {
		// TODO Auto-generated method stub
		return null;
	}
}
