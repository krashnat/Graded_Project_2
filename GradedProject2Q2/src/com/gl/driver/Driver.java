package com.gl.driver;

import com.gl.treeoperation.Node;
import com.gl.treeoperation.Skewedtree;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Skewedtree.node = new Node(50);
		Skewedtree.node.left = new Node(30);
		Skewedtree.node.right = new Node(60);
		Skewedtree.node.left.left = new Node(10);
		Skewedtree.node.right.left = new Node(55);

		Skewedtree.bstToSkewedTree(Skewedtree.node);

		Skewedtree.printRightSkewed(Skewedtree.headNode);

	}

}
