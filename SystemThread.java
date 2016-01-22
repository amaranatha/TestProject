package thread;

public class SystemThread {
	public static void main(String[] args){
		int x=0;
		Thread t1 = new Thread();
		t1.setName("java");
		Thread t2 = new Thread();
		t2.setName("Sql");
		
		for(int i=0; i<=10; i++){
			
			x++;
			if ( x <=10);
		
		System.out.println(t1.getName());
		
		try {
			t1.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(t2.getName() +x);
	}
}
}
