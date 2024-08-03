import algorithms.BreadthFirst;
import algorithms.DepthFirst;
import dataStructureImplementations.MyHashMap;
import dataStructureImplementations.graph.Graph;
import sortingAlgo.QuickSort;

import java.util.Map;

import static utils.MyUtils.print;

public class Main {
    public static void main(String[] args) {

    /*
        Graph graph = new Graph();
        Graph graph1 = new Graph();

        graph.addEdgeDirectional('i','j');
        graph.addEdgeDirectional('i','k');
        graph.addEdgeDirectional('j','i');
        graph.addEdgeDirectional('k','i');
        graph.addEdgeDirectional('k','m');
        graph.addEdgeDirectional('k','l');
        graph.addEdgeDirectional('m','k');
        graph.addEdgeDirectional('l','k');
        graph.addEdgeDirectional('o','n');
        graph.addEdgeDirectional('n','o');


        graph.printGraph();
        System.out.println("----------");

        graph1.addEdgeBidirectional('i','j');
        graph1.addEdgeBidirectional('k','i');
        graph1.addEdgeBidirectional('m','k');
        graph1.addEdgeBidirectional('k','l');
        graph1.addEdgeBidirectional('o','n');



        graph1.printGraph();

        System.out.println(DepthFirst.depthFirstHasPathCyclic(graph,'m','l'));
        System.out.println(BreadthFirst.breadthFirstHasPathCyclic(graph,'m','l'));

        int[] arr = {1,34,5,2,6,73,33,0,13};

        print(arr);
        QuickSort.quickSort(arr,0, arr.length-1);
        System.out.println();
        print(arr);

     */

        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("A", 12);
        myHashMap.put("E", 14);
        myHashMap.put("H", 54);
        myHashMap.put("P", 44);
        myHashMap.put("G", 66);
        myHashMap.put("X", 453);
        myHashMap.put("V", 6);
        myHashMap.put("B", 6436);
        myHashMap.put("N", 3);
        myHashMap.put("O", 3);

        System.out.println(myHashMap);
        //System.out.println(myHashMap.get("A"));
        //System.out.println(myHashMap.remove("A"));
        myHashMap.remove("X");
        System.out.println(myHashMap);

    }

}
