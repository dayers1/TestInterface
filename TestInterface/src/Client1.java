
public class Client1 implements Callback {

	public int performCallback(int n){
		return n;
	}
	
	public static void main(String[] args) {
		Client1 test1 = new Client1();
		System.out.println(test1.performCallback(6));
	}
		
}
