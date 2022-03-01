public class LinkedList {
    // The root of the LinkedList, or the 
    // first node in the list. 
    Node root;

    // A Node for our LinkedList
    private class Node {
        // Each node needs its value and the next node in the list. 
        int Value;
        Node Next;
        public Node(int value) {
            this.Value = value;
        }
    }

	// Insert method will add a new element to our Linked List
    public void Insert(int value) {
		// If the root is null, we need to fill it. 
        if (root == null) {
            root = new Node(value);
        }
		// else create a new node and assign
		// its next to root. then assign root to the new node. 
        else {
            Node result = new Node(value);
            result.Next = root;
            root = result;
        }
    }

	// Display the Linked List. 
    public void Display() {
		// Temporary Variable so we dont 
		// overwrite our root. 
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.Value + " ");
            temp = temp.Next;
        }
    }
}
