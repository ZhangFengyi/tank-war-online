package com.zhangfengyi.tank.test.observer;

public class BeatObserver implements Observer {

	@Override
	public void handleWakeUp() {
		System.out.println("Beat");
	}

}
