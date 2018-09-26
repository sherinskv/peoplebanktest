package com;

public class Duck extends Bird{
	
	public Move swim;
	public Communicate Quack;
		
	public Duck(Move move, Communicate communicate) {
		super(move, communicate);
		this.swim = move;
		this.Quack = communicate;
	}

	@Override
	public String movement() throws Exception {
		return swim.move();
	}

	@Override
	public String communication() throws Exception {
		return Quack.speak();
	}

	@Override
	public Move getmovementType() {
		return this.swim;
	}

	@Override
	public Communicate getCommunicateType() {
		return this.Quack;
	}
	


}
