package ProjectCode;
import java.awt.Color;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;


public class Welcome implements ActionListener{

	private JFrame window = new JFrame("Welcome");
	private JLabel label1 = new JLabel(" Enter your name: ");
	private JButton enter;
	private JButton instructions;
	private JLabel label2;
	private Container c;
	
	private JTextField textField;
	
	
	public Welcome(){
		
		c = window.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		window.setBackground(Color.cyan);	
		label1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label1.setBounds(58,139,166,56);
        c.add(label1);
		
		
		label1.setOpaque(true);
		label1.setBackground(new Color(255, 99, 71));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBackground(new Color(211, 211, 211));
		textField.setBounds(261, 141, 189, 56);
		c.add(textField);
		textField.setColumns(10);
		
		enter = new JButton("CLICK HERE TO PLAY");
		enter.setBackground(new Color(221, 160, 221));
		enter.setFont(new Font("Tahoma", Font.BOLD, 14));
		enter.setBounds(145, 266,202, 56);
		c.add(enter);
		
		instructions = new JButton("INSTRUCTIONS");
		instructions.setBackground(new Color(221, 160, 221));
		instructions.setFont(new Font("Tahoma", Font.BOLD, 15));
		instructions.setBounds(145, 351, 202, 56);
		c.add(instructions);
		
		label2 = new JLabel("WELCOME TO BRICK BREAKER GAME");
		label2.setBackground(new Color(154, 205, 50));
		label2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label2.setBounds(86, 50, 310, 41);
		c.add(label2);
		enter.addActionListener(this);
		instructions.addActionListener(this);


		
		window.setBounds(400,100,500,500);
		window.setBackground(Color.pink);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand()==enter.getActionCommand()) {
				
			if(textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter your name", "Error", JOptionPane.ERROR_MESSAGE);
		
		}
			else {
				JFrame frame = new JFrame();
				Gameplay gamePlay = new Gameplay();
				frame.setBounds(10,10,700,600);
				frame.setTitle("Brick Breaker Game");
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(gamePlay);
				Player.setName(textField.getText());
				window.dispose();
				}
			}
		
		if(e.getActionCommand()==instructions.getActionCommand()) {
			Instruction ins = new Instruction();
			window.dispose();
		}
		
	}
}

		
