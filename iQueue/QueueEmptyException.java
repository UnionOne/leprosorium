package iQueue;

@SuppressWarnings("serial")
class QueueEmptyException extends Exception {
	public String toString() {
		return "\nQueue is empty.";
	}
}