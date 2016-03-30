public class Consumer extends Thread {
	private Buffer buffer;

	private String name;

	public Consumer(Buffer buffer, String name) {
		this.buffer = buffer;
		this.name = name;
	}

	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
		}
		buffer.consume(name);
		try {
			sleep(1000);
		} catch (InterruptedException e) {
		}
		buffer.consume(name);
		buffer.consume(name);
		buffer.consume(name);
	}
}