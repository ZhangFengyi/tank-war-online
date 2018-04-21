package com.zhangfengyi.tank.test.observer;

public class Test {
	
	public static void main(String[] args) {
		Kid kid = new Kid();
//		kid.o = new HongObserver();
//		kid.o = new BeatObserver();
//		kid.o = new HugObserver();
		kid.observerList.add(new HongObserver());
		kid.observerList.add(new BeatObserver());
		kid.observerList.add(new HugObserver());
		kid.wakeUp();
	}
}
