package graphTree;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
	
	private ArrayList<Integer> adjacency[];	
	
	public AdjacencyList(int a)
	{
		adjacency = new ArrayList[a];
		for(int i=0;i<a;i++)
			adjacency[i] = new ArrayList<Integer>();
	}

  public void insertEdge(int src,int dest)
  {
	  adjacency[src].add(dest);
	  adjacency[dest].add(src);
  }
  
  public void printGraph()
  {
	  for(int r=0;r<adjacency.length;r++)
		  System.out.println(adjacency[r]);
  }
  
  public static void main(String [] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Nodes And Edges");
	  
	  int node = sc.nextInt();
	  int edges = sc.nextInt();
	  
	  AdjacencyList l = new AdjacencyList(node);
	  
	  for(int i=0;i<edges;i++)
	  {
		  int src=sc.nextInt();
		  int dest=sc.nextInt();
		  
		  l.insertEdge(src, dest);
	  }
	  
	  l.printGraph();
	  sc.close();
  }
  
}