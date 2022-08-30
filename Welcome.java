package ProjectCode;

import java.awt.Color;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;


public class Welcome implements ActionListener{

	private JFrame window = new JFrame("Welcome");
	private JLabel label1 = new JLabel(" Enter your name: ");
	private JButton enter;
	private Container c;
	
	private JTextField textField;
	
	
	public Welcome(){
		
		c = window.getContentPane();
		c.setLayout(null);
		window.getContentPane().setBackground(Color.PINK);
		window.setBackground(Color.cyan);	
		label1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label1.setBounds(59,116,166,56);
        c.add(label1);
		
		
		label1.setOpaque(true);
		label1.setBackground(new Color(255, 99, 71));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBackground(new Color(211, 211, 211));
		textField.setBounds(255, 116, 189, 56);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		enter = new JButton("CLICK HERE TO PLAY");
		enter.setBackground(new Color(165, 42, 42));
		enter.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		enter.setBounds(144, 275,200, 80);
		window.getContentPane().add(enter);
		enter.addActionListener(this);


		
		window.setBounds(400,100,500,500);
		window.setBackground(Color.pink);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand()==enter.getActionCommand()) {
				
				JFrame frame = new JFrame();
				Gameplay gamePlay = new Gameplay();
				frame.setBounds(10,10,700,600);
				frame.setTitle("Brick Breaker Game");
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(gamePlay);
				Player.setName(textField.getText());
				window.dispose();
		}
		
	}
}

		
