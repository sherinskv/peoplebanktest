package com;

public class Dog implements Animal {

	public Move walk;
	public Communicate bark;
	
	public Dog(Move move, Communicate communicate) {
		this.walk = move;
		this.bark = communicate;
	}

	@Override
	public String movement() throws Exception {
		return walk.move();
	}

	@Override
	public String communication() throws Exception {
		return bark.speak();
	}

	@Override
	public Move getmovementType() {
		return this.walk;
	}

	@Override
	public Communicate getCommunicateType() {
		return this.bark;
	}



}
