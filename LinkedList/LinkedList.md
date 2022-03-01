# Assignment 1: Creating a Linked List

Your first mission, should you choose to accept it, is to create a linked list. 

If you think you already know how to create a Linked List, give it a shot. If you have trouble completing it, see the file `LinkedListSolution` in the previous file for the solution. If you're having trouble understanding, feel free to contact me on discord at Rylan#2507 or by mobile at 865-384-3968.

## What is a Linked List?

A Linked List is a `Data Structure`, similar to Arrays or ArrayLists. Each element in a LinkedList is called a `Node`. Each Node contains two variables; `Data` and `Next`; where `Data` is any type and `Next` is a Node. (yes, the Node type contains a variable of type Node)

Another name for `Data` is `Value`, and I will be calling it that from now on. 

![image](https://user-images.githubusercontent.com/76256852/156243074-d321def3-215f-46ed-9231-e6b38f088018.png)

Above: A visualization of what a Linked List looks like. (Credit to GeeksForGeeks.com)

TLDR; A LinkedList is a Data Structure where each element in the list contains a reference to the next element. 

# Instructions

Fire up Java to make a LinkedList. 

To make a LinkedList, you will need TWO classes. 

- public class Node

- public class LinkedList

Note: it is very important to realize the end of the LinkedLists' `Next` variable will always be null. You can tell if a Node is the end by checking if its `Next` is null.

Over the course of these instructions, you will create an Insert() and Display() method. Optionally, you could implement a Get() (retrieves an item by index) method, an InsertLast() method, or an InsertIndex() (inserts by index) method, if you're feeling adventurous. 

## class Node

A Node needs 2 Instance Variables - Their default value should be NULL. 

- A public var named `Value`. This can be any type; int, String, double, etc. `int Value;`

- A public var named `Next`. This must be of type Node.  `Node Next;`

You also need a Constructor.

- A constructor that takes a `Value`. The constructor should NOT take a Node for Next.

## class LinkedList

### Instance Variables

LinkedList only needs 1 Instance Variable.

- `Node Root;` - its default value is null. 

### Instance Methods

This is where it gets hard. 
For now, we will have only 2 Instance Methods, but we will add more in the future. 

- public void Insert(int Value);

- public void Display();

The Insert method will take a new Value, create a new Node with the Value, and insert the node at the FRONT of the LinkedList. If Root is null `if (root == null)` then you need to add your new node to root. See the "Hints" section if you're having trouble. 

The Display method will print out every Value in the linked list.

# Testing your Linked List

```java
public class App {
    public static void main(String[] args) throws Exception {
        LinkedList link = new LinkedList();
        link.Insert(5);
        link.Insert(10);
        link.Insert(3);
        link.Insert(2);
        link.Display();
    }
}
```

The output of the above code should be `2 3 10 5`, in that order. 

## Hints

### About the insert method. 

When implementing your Insert() method, you must first check if root is null. if it is, you instantiate it. 
```java
if (root == null) root = new Node(value);
```

The new node you create in the Insert method shoulld become the new Root. 

### About the display method.

While loops are very useful when working with LinkedLists. How can you stop when you reach the end of a LinkedList?

Sometimes you have to make temporary variables. 

### About the Node

Did you know you can nest classes inside classes?

```java
public class LinkedList {
	public class Node {
		int Value;
		int Node;
		public Node (int value) {
			this.Value = value;
		}
	}
}
```
this formatted really weirdly in Github. just ignore it. imagine it looks normal. 

Kinda just gave you the solution there but wasnt sure how to hint that. 

### More Help

Contact me on Discord at Rylan#2507 or on my phone at 865-384-3968




