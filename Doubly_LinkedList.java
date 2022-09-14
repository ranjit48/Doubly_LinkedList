public class Doubly_LinkedList {
	private class Node {
		int val = 0;
		Node right, left;

		// Doubly linked list required left and right node address and value ;
		Node(int value) {
			this.val = value;
			this.right = null;
			this.left = null;

		}
	}

	private static Node head;
	private static Node tail;

	private void insert(int item) {
		Node nn = new Node(item);
		if (head == null) {
			// means no node has been created
			// we just have to create node and add the as the first
			head = nn;
			tail = nn;

		} else {

			// means node create already you just have to add the node after the right
			// field;
			nn.left = tail;
			tail.right = nn;
			tail = tail.right;

		}
		// System.out.println(item + " Added in the list");

	}

	private void dispaly() {
		Node current = head;
		while (current != null) {
			System.out.print(current.val + " -> ");
			current = current.right;
		}
		System.out.println();
	}

	private void delete(int value) {
		Node current1 = head;
		while (current1 != null) {
			if (current1.val == value && current1.right == null && current1.left != null) {
				tail = tail.left;
				current1.left.right = null;
				current1.left = null;
			}
			if (current1.val == value && current1.left == null && current1.right != null) {
				head = current1.right;
				current1.right.left = null;
				current1.right = null;
			}
			if (current1.val == value && current1.right != null && current1.left != null) {
				current1.left.right = current1.right;
				current1.right.left = current1.left;
			}
			current1 = current1.right;
		}
	}

	public static void main(String[] args) {
		Doubly_LinkedList l1 = new Doubly_LinkedList();
		l1.insert(12);
		l1.insert(330);
		l1.insert(30);
		l1.insert(20);
		l1.insert(44);
		l1.dispaly();
		l1.delete(44);
		l1.dispaly();
		l1.delete(12);
		l1.dispaly();
		l1.insert(22);
		l1.dispaly();
		l1.delete(30);
		l1.dispaly();
		l1.insert(20);
		l1.dispaly();
		l1.delete(20);
		l1.dispaly();
		l1.insert(11);
		l1.dispaly();

	}

}
