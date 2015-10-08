import java.util.Iterator;

public class CircularArray<T> implements Iterable<T>{
	private T [] array;
	private int head = 0;
	
	public CircularArray(int size) {
		array = (T [])new Object[size];
	}
	// Use this method to covert the input index with new head
	private int convert(int index) {
		if(index < 0) {
			index += array.length;
		}
		return (head + index) % array.length;
	}
	public void rotate(int shiftLeft) {
		head = convert(shiftLeft);
	}
	public T get(int index) {
		if(index < 0 || index >= array.length) {
			throw new java.lang.IndexOutOfBoundsException("Out of Bound");
		}
		return array[convert(index)];
	}
	public void set(int index, T input) {
		array[convert(index)] = input;
	}
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new CircularArrayIterator<T>(this);
	}
	
	// Use an inner class to implement Iterator
	private class CircularArrayIterator<T> implements Iterator<T>{
		// Trick: current index starts from -1
		private int curIndex = -1;
		private T [] array;
		
		public CircularArrayIterator(CircularArray<T> ca) {
			array = ca.array;
		}

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (curIndex + 1) < array.length;
		}

		public T next() {
			// TODO Auto-generated method stub
			curIndex++;
			T element = array[convert(curIndex)];
			return element;
		}
	}
}
