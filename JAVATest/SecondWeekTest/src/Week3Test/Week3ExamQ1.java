package Week3Test;

public class Week3ExamQ1 {
	boolean producerFlag=true,consumerFlag=false;
	int producedIntegr=0;
	public synchronized void  waitProducerOrConsumer()
	{
		if(producerFlag&&consumerFlag)
		{
			notifyAll();
		}
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void createThread()
	{
		Runnable producer=new Runnable() {
			
			@Override
			public void run() {
				
				consumerFlag=true;
				waitProducerOrConsumer();
				consumerFlag=false;
				System.out.println("Producer is producing....");
				producedIntegr=(int)(Math.random()*20);
				
				consumerFlag=true;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		};
		Runnable consumer=new  Runnable() {
			
			@Override
			public void run() {
				
				waitProducerOrConsumer();
				producerFlag=false;
				System.out.println("Consumer is consuming "+producedIntegr);
				producerFlag=true;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(producer);
		Thread t2=new Thread(consumer);
		t1.start();
		t2.start();
	}
	public static void main(String args[])
	{
		Week3ExamQ1 q=new Week3ExamQ1();
		System.out.println("Producer is producing....");
		while(true)
		q.createThread();
	}
	}


