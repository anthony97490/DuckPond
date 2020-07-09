package Duckoon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GraphicsDemo extends JPanel implements ActionListener {
	
	Random random = new Random();
	Timer timer = new Timer(100,this);
	JLabel label;
	int x = 1;
	int y = 1;
	int velocityX = 1;
	int velocityY = 1;
	int randomX = 500;
	int randomY = 500;


	public GraphicsDemo() {
		
		label = new JLabel(new ImageIcon("Duck2.png"));
		label.setSize(227,217);
		label.setLocation(500,500);
		this.setLayout(null);
		this.add(label);
		
		label = new JLabel(new ImageIcon("Duck2.png"));
		label.setSize(227,217);
		label.setLocation(300,300);
		this.setLayout(null);
		this.add(label);
		
		label = new JLabel(new ImageIcon("Frog.png"));
		label.setSize(227,217);
		label.setLocation(20,600);
		this.setLayout(null);
		this.add(label);
		
		label = new JLabel(new ImageIcon("Rock.png"));
		label.setSize(227,217);
		label.setLocation(600,50);
		this.setLayout(null);
		this.add(label);

		
		label = new JLabel(new ImageIcon("Duck.gif"));
		label.setSize(227,217);
		label.setLocation(500,500);
		this.setLayout(null);
		this.add(label);
		timer.start();
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.setBackground(new Color(0,191,255)); 
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.YELLOW);
		//g2D.fillOval(x, 0, 50, 50);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(x>=740 || x<=0) {
			velocityX = -velocityX;
		}
		if(y>=740 || y<=0) {
			velocityY = -velocityY;
		}
		
		randomX = random.nextInt(51)-25;
		randomY = random.nextInt(51)-25;
		
		x=x+randomX;
		y=y+randomY;
		//x=x+velocityX;
		//y=y+velocityY;
		repaint();
		label.setLocation(x,y);

		
	}

}
