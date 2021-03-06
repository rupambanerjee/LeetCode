/**
 * LeetCode
 * Problem_07_Test.java
 */
package com.deepak.leetcode.Trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.deepak.leetcode.Library.TreeNode;

/**
 * Test cases for Problem 07
 * 
 * @author Deepak
 */
public class Problem_07_Test {

	TreeNode<Integer> root;

	/**
	 * Setting up the tree
	 * 			 3
	 * 			/ \
	 * 		   5   5
	 * 		  /     \
	 * 		20       20
	 */
	@Before
	public void setup() {
		root = new TreeNode<Integer>(3);
		TreeNode<Integer> node1 = new TreeNode<Integer>(5);
		TreeNode<Integer> node2 = new TreeNode<Integer>(5);
		TreeNode<Integer> node3 = new TreeNode<Integer>(20);
		TreeNode<Integer> node4 = new TreeNode<Integer>(20);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node2.setRight(node4);
	}

	/**
	 * Test case to check symmetric tree
	 */
	@Test
	public void testSymmetricTree() {
		Assert.assertEquals(Problem_07.isSymmetric_Recursive(null), true);
		Assert.assertEquals(Problem_07.isSymmetric_Iterative(null), true);
		Assert.assertEquals(Problem_07.isSymmetric_Recursive(root), true);
		Assert.assertEquals(Problem_07.isSymmetric_Iterative(root), true);
	}

}
