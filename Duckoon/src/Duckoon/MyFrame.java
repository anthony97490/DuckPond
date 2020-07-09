package Duckoon;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	GraphicsDemo graphic = new GraphicsDemo();
	
	
	public MyFrame() {
		this.setSize(840,840);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(graphic);
		this.setVisible(true);
	}

}
