package com.zhangfengyi.tank.test.observer;

public class HugObserver implements Observer {

	@Override
	public void handleWakeUp() {
		System.out.println("Hug");
	}

}
