package com;

public class Cat implements Animal{
	public Move walk;
	public Communicate meow;
	
	public Cat(Move move, Communicate communicate) {
		this.walk = move;
		this.meow = communicate;
	}

	@Override
	public String movement() throws Exception {
		return walk.move();
	}

	@Override
	public String communication() throws Exception {
		return meow.speak();
	}

	@Override
	public Move getmovementType() {
		return this.walk;
	}

	@Override
	public Communicate getCommunicateType() {
		return this.meow;
	}

}
