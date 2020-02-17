package com.epsi.calculator;

public class Calculatrice {
 
	public int addition(int v1, int v2) {
		return v1+v2;
	}

	public int soustraction(int v1, int v2) {
		return v1-v2;
	}

	public int multiplication(int v1, int v2) {
		return v1*v2;
	}

	public int division(int v1, int v2) {
		if(v2!=0){
			return v1/v2;
		}else {
			return 0;
		}
	}

}
