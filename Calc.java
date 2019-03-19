package Calculator;

public class Calc {
	
	private int x;
	private int y;
	
	Calc(int valor1, int valor2){
		this.x = valor1;
		this.y = valor2;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int adicao(int x,int y) {
		return x+y;
	}
	
	public int subtracao() {
		return x=y;
	}
	
	public int produto() {
		return x*y;
	}
	
	public int divisao() {
		return x/y;
		
	}
	

}
