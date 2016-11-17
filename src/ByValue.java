
public class ByValue {

	public static void add(int a,int b){
	      a = a + b;
		
	}
	public static void main(String[] args) {
		int x,y;
		x = 1;
		y = 2;
		add(x, y);
		System.out.println("X  = "+x);

	}

}
