package thread;

// 쓰레드 알아보기 
public class ThreadMain {
	public static void main(String[] args) {
		Thread thread1 = new TreadExtend();
		
		Runnable threadImpl = new TreadInterface();
		Thread thread2 = new Thread(threadImpl);
		
		// 실행 시 새 쓰레디에서 실행된다.(실행순서는 매번 다르다.)
		thread1.start();
		thread2.start();
	}

}

// Thread클래스를 상속 (상속으로 받으면 다른 클래스를 상속받을 수 없다.)
class TreadExtend extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("thread1");
		}
	}
	
}

// Runnable 인터페이스를 구현 (다른 클래스를 상속받을 수 있으므로 바람직하다.)
class TreadInterface implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("thread2");
		}
	}
	
}
