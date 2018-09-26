package com;

public class Bird implements Animal{
	
	public Move fly;
	public Communicate sing;
	
	public Bird(Move move, Communicate communicate) {
		
		this.fly = move;
		this.sing = communicate;
		
	}

	@Override
	public String movement() throws Exception {
		return fly.move();
		
	}

	@Override
	public String communication() throws Exception {
		return sing.speak();
		
	}

	@Override
	public Move getmovementType() {
		return this.fly;
	}

	@Override
	public Communicate getCommunicateType() {
		return this.sing;
	}
	
	
}
