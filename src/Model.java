
public class Model {
	private int val;
	
	public void add(int first, int second){
		val = first + second;
	}
	
	public void sub(int first, int second){
		val = first - second;
	}
	
	public void mult(int first, int second){
		val = first * second;
	}
	
	public void div(int first, int second){
		val = first / second;
	}
	
	public int getval(){
		return val;
	}
	
	
}
