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

	JButton back;
	JFrame fr = new JFrame("Rules of Game");
	Container cr;
	private JLabel imgLabel;
	Image img;
	
	public Instruction() {
		
	cr = fr.getContentPane();
	cr.setLayout(null);
	cr.setBackground(Color.PINK);
	
	JLabel lblNewLabel = new JLabel("HOW TO PLAY");
	lblNewLabel.setForeground(new Color(139, 0, 139));
	lblNewLabel.setBackground(new Color(102, 205, 170));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
	lblNewLabel.setBounds(141, 68, 208, 27);
	fr.getContentPane().add(lblNewLabel);
	fr.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
	
	JLabel lblNewLabel_1_1 = new JLabel("*Press ← key to move the slider left");
	lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel_1_1.setBounds(68, 172, 378, 39);
	fr.getContentPane().add(lblNewLabel_1_1);
	
	JLabel lblNewLabel_1_2 = new JLabel("*If the ball goes down the bottom of the ");
	lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel_1_2.setBounds(68, 206, 378, 46);
	fr.getContentPane().add(lblNewLabel_1_2);
	
	JLabel lblNewLabel_1_3_1 = new JLabel("*If you can break all the bricks, you will win.");
	lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel_1_3_1.setBounds(64, 279, 371, 39);
	fr.getContentPane().add(lblNewLabel_1_3_1);
	
	JLabel lblNewLabel_1_3_2 = new JLabel(" screen, you will lose.");
	lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel_1_3_2.setBounds(68, 249, 378, 27);
	fr.getContentPane().add(lblNewLabel_1_3_2);
	
	JLabel lblNewLabel_1_3_3 = new JLabel("*Press →\r\n key to move the slider right");
	lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel_1_3_3.setBounds(68, 138, 378, 39);
	fr.getContentPane().add(lblNewLabel_1_3_3);
	
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
