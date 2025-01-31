
public class Stack {

//	push, pop, peek, size, isEmpty, print

	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {
		if (top == 5) {
			System.out.println("Your stack is full!");
		}

		else {

			stack[top] = data;
			top++;
		}

	}

	public int pop() {
		int data = 0;

		if (isEmpty()) {
			System.out.println("Your stack is empty!");
		} else {
			top--;

			data = stack[top];
			stack[top] = 0;

		}
		return data;
	}

	public int peek() {

		int data;
		data = stack[top - 1];

		return data;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public void print() {
		System.out.print("[");
		for (int n : stack) {
			System.out.print(n + ", ");
		}
		System.out.println("]\n");
	}
}
