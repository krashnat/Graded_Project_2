package com.gl.treeoperation;

public class Skewedtree {
	public static Node node;
	static Node prevNode = null;
	public static Node headNode = null;

	public static void bstToSkewedTree(Node root) {

	
		if (root == null)
			return;

		bstToSkewedTree(root.left);

		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		bstToSkewedTree(rightNode);

	}

	public static void printRightSkewed(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printRightSkewed(root.right);
	}

}
