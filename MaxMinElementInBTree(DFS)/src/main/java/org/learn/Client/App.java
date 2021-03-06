package org.learn.Client;

import org.learn.Question.MaxMinElementInBTree;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(60);
		// Level 1
		Node B = Node.createNode(50);
		Node C = Node.createNode(90);
		// Level 2
		Node D = Node.createNode(25);
		Node E = Node.createNode(80);
		Node F = Node.createNode(75);
		Node G = Node.createNode(45);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;

		int maxElement = MaxMinElementInBTree.maxElementInBTree(A);
		System.out.println("Maximum element in a binary tree: " + maxElement);

		int minElement = MaxMinElementInBTree.minElementInBTree(A);
		System.out.println("Minimum element in a binary tree: " + minElement);
	}
}
