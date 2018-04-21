package com.zhangfengyi.tank;

import java.awt.Frame;
import java.awt.Graphics;

public class TankFrame extends Frame {
	
	private static final long serialVersionUID = 1L;
	
	private int x = 50, y = 50;

	public TankFrame() {
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		System.out.println("paint");
		g.fillRect(x, y, 100, 100);
		
		x++;
	}
	
	

}
