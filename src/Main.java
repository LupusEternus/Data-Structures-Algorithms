import algorithms.BreadthFirst;
import algorithms.DepthFirst;
import dataStructureImplementations.Graph;

public class Main {
    public static void main(String[] args) {


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


    }

}
