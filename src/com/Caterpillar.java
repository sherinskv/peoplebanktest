package com;

public class Caterpillar implements Animal {
	public Move crawl;
	
	public Caterpillar(Move move) {
		this.crawl = move;
	}

	@Override
	public String movement() throws Exception {
		return crawl.move();
	}

	@Override
	public String communication() throws Exception {
		throw new Exception("Not supported");	
	}

	@Override
	public Move getmovementType() {
		return this.crawl;
	}

	@Override
	public Communicate getCommunicateType() {
		return null;
	}
}
