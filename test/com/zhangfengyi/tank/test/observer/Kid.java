package com.zhangfengyi.tank.test.observer;

import java.util.ArrayList;
import java.util.List;

public class Kid {
	public boolean isSleeping = true;
	
	public List<Observer> observerList = new ArrayList<>();
	
	public void wakeUp() {
		WakeUpEvent event = new WakeUpEvent(8, this);
		
		observerList.forEach((observer) -> {
			observer.handleWakeUp(event);
		});
	}
}
