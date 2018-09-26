package com;

public interface Animal {
	String movement() throws Exception;
	String communication() throws Exception;
	Move getmovementType();
	Communicate getCommunicateType();
	
}
