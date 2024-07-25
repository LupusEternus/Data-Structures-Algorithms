package structy.binaryTrees;

import utils.Node;

import java.util.*;

public class TreeIncludes {
    public static boolean treeIncludes(Node<String> root, String target) {
        if (root == null) return false;
        if (root.val.equals(target)) return true;
        Stack<Node<String>> stack = new Stack<>();
        stack.add(root);
        while (!stack.empty()) {
            Node<String> currentNode = stack.pop();
            if (currentNode.val.equals(target)) return true;
            if (currentNode.left != null) {
                stack.add(currentNode.left);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right);
            }
        }
        return false;
    }
    
}
