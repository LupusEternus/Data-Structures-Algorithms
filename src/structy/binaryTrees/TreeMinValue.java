package structy.binaryTrees;

import dataStructureImplementations.graph.Node;

import java.util.*;

public class TreeMinValue {
    public static Double treeMinValue(Node<Double> root) {
        if (root.left == null && root.right == null) return root.val;
        Double min = Double.MAX_VALUE;
        Stack<Node<Double>> stack = new Stack<>();
        stack.add(root);
        while (!stack.empty()) {
            Node<Double> currentNode = stack.pop();
            if (currentNode.val < min) {
                min = currentNode.val;
            }
            if (currentNode.left != null) {
                stack.add(currentNode.left);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right);
            }
        }
        return min;
    }
}
