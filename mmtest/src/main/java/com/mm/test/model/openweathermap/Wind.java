package com.mm.test.model.openweathermap;

public class Wind {
 	private float speed;
 	private int deg;
 	private int var_beg;
 	private int var_end;
 	
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public int getDeg() {
		return deg;
	}
	public void setDeg(int deg) {
		this.deg = deg;
	}
	public int getVar_beg() {
		return var_beg;
	}
	public void setVar_beg(int var_beg) {
		this.var_beg = var_beg;
	}
	public int getVar_end() {
		return var_end;
	}
	public void setVar_end(int var_end) {
		this.var_end = var_end;
	}
}
