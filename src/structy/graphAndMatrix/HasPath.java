package structy.graphAndMatrix;

import java.util.*;

public class HasPath {


    public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {

        Queue<String>  que = new LinkedList<>();
        que.add(src);
        while(!que.isEmpty()){
            String current = que.poll();
            if(current.equals(dst)) return true;
            que.addAll(graph.get(current));
        }
        return false;
    }
}
