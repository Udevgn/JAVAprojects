import java.util.LinkedList;
import java.util.ArrayList;
public class Graph {
	LinkedList<LinkedList<Integer>> li;
	ArrayList<Integer> visited;
    public void addEdge(int i,int j){
        if(i<li.size() && j<li.size()){
            li.get(i).add(j);
            li.get(j).add(i);
        }
        else
            System.out.println("add more node....");
    }
    public void addNode(int i){
            if(i>(li.size()-1)){
                li.add(new LinkedList<Integer>());
                visited.add(0);
            }    
            else
                System.out.println("already added!!!");
    } 
    public LinkedList<LinkedList<Integer>> initialize(int N){
            LinkedList<LinkedList<Integer>> li = new LinkedList<LinkedList<Integer>>();
            visited = new ArrayList<Integer>();
            for(int i=0;i<N;i++){
                li.add(new LinkedList<Integer>());
                visited.add(0);
            }
            return li;
    } 
    public void reset_visited(ArrayList<Integer> visited){
        for(int i =0;i<visited.size();i++){
            visited.set(i,0);
        }
    }
    public void DFS_util(int i){
            visited.set(i,1);
            System.out.println(i);
            for(Integer node:li.get(i)){
                if(visited.get(node) == 0)
                    DFS_util(node);
            }
    }
    public void DFS(){
        reset_visited(visited);
        for(LinkedList<Integer> adj:li)
            for(Integer node:adj)
                if(visited.get(node) == 0)
                    DFS_util(node);
    }
    public static void main(String args[] ) throws Exception {
    	 Graph graph = new Graph();
         graph.li = graph.initialize(3);
         //addNode(0,li);
         graph.addNode(4);
         graph.addEdge(0,1);
         //graph.addEdge(0,);
         graph.addEdge(2,3);
         System.out.println(graph.li);
         graph.DFS();
    }

    
}