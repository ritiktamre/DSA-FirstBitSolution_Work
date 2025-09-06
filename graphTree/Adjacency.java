package graphTree;

import java.util.LinkedList;
import java.util.Scanner;

public class Adjacency {

	private LinkedList<Integer> adj[];
	
	public Adjacency(int a)
	{
		adj=new LinkedList[a];
		
		for(int i=0;i<a;i++)
		{
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	public void insertEdge(int src,int dest)
	{
		adj[src].add(dest);
		adj[dest].add(src);
	}
	
	public void graphPrint()
	{
		for(int r =0;r<adj.length;r++)
		{
			System.out.println(adj[r]);
		}
	}
	public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Nodes and Edges");
	
	int node = sc.nextInt();
	int edges = sc.nextInt();
	
	Adjacency y = new Adjacency(node);
		for(int i=0;i<edges;i++)
		{
			int src= sc.nextInt();
		    int dest = sc.nextInt();
		    
		    y.insertEdge(src, dest);
		}
	
	y.graphPrint();
	sc.close();
	

	
	
		
	}

}
