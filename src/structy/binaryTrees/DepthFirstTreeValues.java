package structy.binaryTrees;

import utils.Node;

import java.util.*;

public class DepthFirstTreeValues {
    public static List<String> depthFirstValues(Node<String> root) {
        Stack<Node<String>> stack = new Stack<>();
        List<String> values = new ArrayList<>();
        if (root == null) return values;
        stack.push(root);
        while (!stack.empty()) {
            Node<String> currentNode = stack.pop();
            values.add(currentNode.val);
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
        return values;
    }
}


