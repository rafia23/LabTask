package ProjectCode;

import java.awt.Color;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Instruction implements ActionListener {

	private JButton back;
	private JFrame fr = new JFrame("Rules of Game");
	private Container cr;
	private JLabel imgLabel,label1,label2,label3,label4,label5,label6;
	private Image img;
	
	public Instruction() {
		
	cr = fr.getContentPane();
	cr.setLayout(null);
	cr.setBackground(Color.PINK);
	
	label1 = new JLabel("HOW TO PLAY");
	label1.setForeground(new Color(139, 0, 139));
	label1.setBackground(new Color(102, 205, 170));
	label1.setFont(new Font("Tahoma", Font.BOLD, 28));
	label1.setBounds(141, 68, 208, 27);
	fr.getContentPane().add(label1);
	fr.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
	
	label2 = new JLabel("*Press ← key to move the slider left");
	label2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	label2.setBounds(68, 172, 378, 39);
	fr.getContentPane().add(label2);
	
	label3 = new JLabel("*Press →\r\n key to move the slider right");
	label3.setFont(new Font("Tahoma", Font.PLAIN, 18));
	label3.setBounds(68, 138, 378, 39);
	fr.getContentPane().add(label3);
	
	label4 = new JLabel("*If the ball goes down the bottom of the ");
	label4.setFont(new Font("Tahoma", Font.PLAIN, 18));
	label4.setBounds(68, 206, 378, 46);
	fr.getContentPane().add(label4);
	
	label5 = new JLabel(" screen, you will lose.");
	label5.setFont(new Font("Tahoma", Font.PLAIN, 18));
	label5.setBounds(68, 249, 378, 27);
	fr.getContentPane().add(label5);
	
	
	label6 = new JLabel("*If you can break all the bricks, you will win.");
	label6.setFont(new Font("Tahoma", Font.PLAIN, 18));
	label6.setBounds(64, 279, 371, 39);
	fr.getContentPane().add(label6);
	
	
	back = new JButton("BACK");
	back.setBackground(new Color(135, 206, 235));
	back.setFont(new Font("Tahoma", Font.BOLD, 18));
	back.setBounds(175, 363, 130, 46);
	fr.getContentPane().add(back);
	imgLabel = new JLabel("");
    img = new ImageIcon(this.getClass().getResource("image2.png")).getImage();
	imgLabel.setIcon(new ImageIcon(img));
	imgLabel.setBounds(0, 0, 486, 463);
	fr.getContentPane().add(imgLabel);
	fr.setBackground(Color.cyan);
	back.addActionListener(this);
	
	fr.setBounds(400,100,500,500);
	fr.setVisible(true);
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()==back.getActionCommand())
		{
		    new Welcome();
			fr.dispose();
		}
	}
}
