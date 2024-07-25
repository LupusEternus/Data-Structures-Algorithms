package structy.binaryTrees;

import utils.Node;

import java.util.*;

public class TreeSum {

    public static int treeSum(Node<Integer> root) {
        int sum = 0;
        if (root == null) return 0;
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<Integer> current = queue.poll();
            sum += current.val;
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return sum;
    }
}
