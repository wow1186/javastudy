package thread;

public class AlphabetTread  extends Thread {
	
	public static void main(String[] args) {

	}

	@Override
	public void run() {
		for(char i = 'a' ; i < 'z'; i++) {
			System.out.print(i +"");
			try {
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
