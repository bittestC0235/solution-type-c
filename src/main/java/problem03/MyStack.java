package problem03;

public class MyStack {
	private int count=0;
	private String[] buffer;

	public MyStack( int size ) {
		buffer = new String[size*2];
	}
	
	public void push(String item) {
		buffer[count++] = item;
	}

	public String pop() {
		if(count==0) {
			return null;
		}
		return buffer[--count];
	}

	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return buffer.length;
	}
}