package com.zhangfengyi.tank.test.observer;

public class HongObserver implements Observer {

	@Override
	public void handleWakeUp(WakeUpEvent event) {
		System.out.println("Hong");
	}

}
