package com.zhangfengyi.tank;

import java.awt.Frame;

public class GameController {
	public static void main(String[] args) {
		Frame f = new TankFrame();
		while (true) {
			try {
				Thread.sleep(1000 / 60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			f.repaint();
		}
	}
}
