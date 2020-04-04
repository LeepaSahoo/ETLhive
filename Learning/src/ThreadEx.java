
public class ThreadEx extends Thread {
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ThreadEx t1=new ThreadEx();
		ThreadEx t2=new ThreadEx();

		t1.start();
		t2.start();
		t1.suspend();
		}

}


