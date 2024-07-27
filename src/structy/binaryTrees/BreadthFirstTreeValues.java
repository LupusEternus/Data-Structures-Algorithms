package structy.binaryTrees;

import dataStructureImplementations.graph.Node;
import java.util.*;

public class BreadthFirstTreeValues {

    public static List<String> breadthFirstValues(Node<String> root) {
        List<String> values = new ArrayList<>();
        Queue<Node<String>> que = new LinkedList<>();
        if (root == null) return values;
        que.add(root);
        while (!que.isEmpty()) {
            Node<String> current = que.poll();
            values.add(current.val);
            if (current.left != null) {
                que.add(current.left);
            }
            if (current.right != null) {
                que.add(current.right);
            }
        }
        return values;
    }
}
