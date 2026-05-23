package datastructures.graphs;

public class Main {

    public static void main(String[] args) {
        Graph myGraph = new Graph() ;
        myGraph.addVertext("A") ;
        myGraph.addVertext("B") ;
        myGraph.addVertext("C") ;

        myGraph.addEdge("A" , "C");
//        myGraph.addEdge("A" , "B");
//        myGraph.addEdge("B" , "C");

//        myGraph.removeEdge("A" , "B") ;

        myGraph.printAdjList();
    }
}
