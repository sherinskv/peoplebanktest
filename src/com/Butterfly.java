package com;

public class Butterfly implements Animal {
	
	public Move fly;
	
	public Butterfly(Move move){
		this.fly = move;
	}

	@Override
	public String movement() {
		return fly.move();
	}

	@Override
	public String communication() throws Exception {
		throw new Exception("Not supported");		
	}

	@Override
	public Move getmovementType() {
		return this.fly;
	}

	@Override
	public Communicate getCommunicateType() {
		return null;
	}
	

}
