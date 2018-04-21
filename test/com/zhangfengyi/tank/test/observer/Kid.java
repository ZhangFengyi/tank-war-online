package com.zhangfengyi.tank.test.observer;

public class Kid {
	private boolean isSleeping = true;
	
	public Observer o;
	
	public void wakeUp() {
		o.handleWakeUp();
	}
}
