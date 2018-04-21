package com.zhangfengyi.tank.test.observer;

public class HongObserver implements Observer {

	@Override
	public void handleWakeUp() {
		System.out.println("Hong");
	}

}
