package com.zhangfengyi.tank.test.observer;

public class WakeUpEvent {
	
	public int voice;
	
	public Kid kid;
	
	public WakeUpEvent(int voice, Kid kid) {
		this.voice = voice;
		this.kid = kid;
	}
	
	public Kid getSource() {
		return kid;
	}
}
