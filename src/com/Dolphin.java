package com;

public class Dolphin implements Animal {

	
	public Move swim;
	
	public Dolphin(Move move) {
		this.swim = move;
	}
	
	@Override
	public String movement() throws Exception {
		return swim.move();
	}

	@Override
	public String communication() throws Exception {
		throw new Exception("Not supported");		
	}

	@Override
	public Move getmovementType() {
		return this.swim;
	}

	@Override
	public Communicate getCommunicateType() {
		return null;
	}
}
