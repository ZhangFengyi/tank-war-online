package com.zhangfengyi.tank.test.observer;

public class HugObserver implements Observer {

	@Override
	public void handleWakeUp(WakeUpEvent event) {
		if (event.voice > 5 && event.voice < 9) {
			System.out.println("Hug");
		}
	}

}
