package com;

public class Chicken extends Bird {	
	
	public Communicate Cluck;
		
	public Chicken(Communicate communicate) {
		super(null, communicate);		
		this.Cluck = communicate;
	}

	@Override
	public String movement() throws Exception {
		throw new Exception("Not supported");
	}

	@Override
	public String communication() throws Exception {
		return Cluck.speak();
	}

	@Override
	public Move getmovementType() {
		return this.fly;
	}

	@Override
	public Communicate getCommunicateType() {
		return this.Cluck;
	}
	
}
