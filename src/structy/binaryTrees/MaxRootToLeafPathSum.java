package structy.binaryTrees;

import utils.Node;

import java.util.*;

/*
problem:
Write a method, maxPathSum, that takes in the root of a binary tree that contains number values.
The method should return the maximum sum of any root to leaf path within the tree.
 */

public class MaxRootToLeafPathSum {
    public static Double maxPathSum(Node<Double> root) {
        Double maxPathSum = Double.NEGATIVE_INFINITY;
        Stack<Node<Double>> stack = new Stack<>();
        Stack<Double> sumStack = new Stack<>();

        stack.add(root);
        sumStack.add(root.val);

        while (!stack.empty()) {
            Node<Double> currentNode = stack.pop();
            Double currentSum = sumStack.pop();
            if (currentNode.left != null) {
                stack.add(currentNode.left);
                sumStack.add(currentSum + currentNode.left.val);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right);
                sumStack.add(currentSum + currentNode.right.val);
            }
            if ((currentNode.right == null) && (currentNode.left == null)) {
                if (currentSum > maxPathSum) {
                    maxPathSum = currentSum;
                }
            }
        }
        return maxPathSum;
    }
}
