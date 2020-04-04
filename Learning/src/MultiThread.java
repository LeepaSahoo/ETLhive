
public class MultiThread extends Thread {
	
	public void run()
	{
		System.out.println("Thread is running");
	}
	

	public static void main(String[] args) {
		MultiThread t1=new MultiThread();
		MultiThread t2=new MultiThread();
		
		t1.start();
		System.out.println(t1.getName());
		
		t1.setName("first thread");
		System.out.println(t1.getName());

		t2.start();
		System.out.println(t2.getName());
		
		t2.setName("second thread");
		System.out.println(t2.getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

	}

}
