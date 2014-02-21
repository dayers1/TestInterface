
public class Client2 implements Callback{
	
	public int performCallback(int n){
		return n*2+1;
	}

	public static void main(String[] args) {
		Client2 test2 = new Client2();
		System.out.println(test2.performCallback(6));
		
	}

}
