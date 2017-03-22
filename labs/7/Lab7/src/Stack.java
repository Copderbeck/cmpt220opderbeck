public class Stack {
	private int[] numbers;
	private int size;
	public static int reg = 16;

	public Stack() {
		this (reg);
	}

	public Stack(int capacity) {
		numbers = new int[capacity];
	}

	public void push(int value) {
		if (size >= numbers.length) {
			int[] numb = new int[numbers.length * 2];
			System.arraycopy(numbers, 0, numb, 0, numbers.length);
			numbers = numb;
		}

		numbers[size++] = value;
	}

	public int pop() {
		return numbers[--size];
	}
	public int peek() {
		return numbers[size - 1];
	}
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
}