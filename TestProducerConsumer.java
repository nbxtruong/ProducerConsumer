public class TestProducerConsumer {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		new Producer(buffer, "p1").start();
		new Consumer(buffer, "c1").start();
		new Producer(buffer, "p2").start();
	}
}