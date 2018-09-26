package com;

public class ClownFish extends Fish {
	public Move swim;
	
	public ClownFish(Move move) {
		super(move);
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
