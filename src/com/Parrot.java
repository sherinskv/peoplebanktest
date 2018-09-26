package com;

public class Parrot extends Bird {
	
	public Move fly;
	public Communicate Omlet;

	public Parrot(Move move, Communicate communicate) {
		super(move, communicate);
		this.fly = move;
		this.Omlet = communicate;
	}
	
	@Override
	public String movement() {
		return fly.move();
		
	}

	@Override
	public String communication() {
		return Omlet.speak();
		
	}

	@Override
	public Move getmovementType() {
		return this.fly;
	}

	@Override
	public Communicate getCommunicateType() {
		return this.Omlet;
	}
	
}
