package graphTree;

import java.util.LinkedList;
import java.util.Scanner;

public class Demo {

	private LinkedList<Integer> adj[];
	
	public Demo(int a)
	{
		adj =new  LinkedList[a];
		for(int i=0;i<adj.length;i++)
		{
			adj[a] = new LinkedList<Integer>();
		}
	}
	
	public void insertEdge(int src,int dest)
	{
		adj[src].add(dest);
		adj[dest].add(src);
	}
	
	public void printGraph()
	{
		for(int j=0;j<adj.length;j++)
			System.out.println(adj[j]);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nodes and Edges");
		
		int nodes = sc.nextInt();
		int edges = sc.nextInt();
		
		Demo d = new Demo(nodes);
		 
		
		for(int q=0;q<edges;q++)
		{
			int src=sc.nextInt();
			int dest=sc.nextInt();
			
			d.insertEdge(src, dest);
			
		}
		
		d.printGraph();
		sc.close();
	}
}
