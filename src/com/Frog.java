package com;

public class Frog implements Animal{
	
	public Move jump;
	public Communicate croak;
		
	public Frog(Move move, Communicate communicate) {
		this.jump = move;
		this.croak = communicate;
	}

	@Override
	public String movement() throws Exception {
		return jump.move();
	}

	@Override
	public String communication() throws Exception {
		return croak.speak();  
	}

	@Override
	public Move getmovementType() {
		return this.jump;
	}

	@Override
	public Communicate getCommunicateType() {
		return this.croak;
	}

}
