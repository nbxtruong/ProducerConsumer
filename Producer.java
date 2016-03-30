public class Producer extends Thread {
	private Buffer buffer;

	private String name;

	public Producer(Buffer buffer, String name) {
		this.buffer = buffer;
		this.name = name;
	}

	public void run() {
		buffer.produce("message1 from " + name, name);
		buffer.produce("message2 from " + name, name);
	}
}