package com.bhanu.graphs;


// as a list of list

import java.util.*;
public class BFS {

	public static Map<Node, List<Node>> adjectencyMatrix = new HashMap<Node ,List<Node>>();
	
	public static void addEdge(Node v1Node , Node v2Node){
//		Node v1Node = new Node(v1);
//		Node v2Node = new Node(v2);
		
		List<Node> list;
		if(adjectencyMatrix.containsKey(v1Node)){
			list = adjectencyMatrix.get(v1Node);
			if(!list.contains(v2Node))
				list.add(v2Node);
		}else{
			list = new LinkedList<Node>();
			list.add(v2Node);
		}
		adjectencyMatrix.put(v1Node , list);
	}
	
	public static void traverseGraph(){
		Iterator<Map.Entry<Node , List<Node>>> iterator = adjectencyMatrix.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<Node , List<Node>> entry = iterator.next();
			System.out.print(" "+entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		Node node_0 = new Node(0);
		Node node_2 = new Node(2);
		Node node_3 = new Node(3);
		Node node_1 = new Node(1);
		addEdge(node_2,node_3);
		addEdge(node_2,node_0);
		addEdge(node_0,node_2);
		addEdge(node_0,node_1);
		addEdge(node_1,node_2);
		addEdge(node_3,node_3);
		System.out.println("Before");
		traverseGraph();
//		bfs();
//		bfs(node_2);
		dfs(node_2);
		System.out.println();
		System.out.println("After");
		traverseGraph();
	}
	
	public static void bfs(){
		System.out.println("bfs starts");
		Queue<Node> queue = new LinkedList<Node>();
		Map.Entry<Node , List<Node>> rootEntry = adjectencyMatrix.entrySet().iterator().next();
		Node root = rootEntry.getKey();
//		System.out.print(root);
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			temp.setVisited(true);
			System.out.println(temp);
			List<Node> adjectencyList = (List<Node>)adjectencyMatrix.get(temp);
			if(adjectencyList == null){
				continue;
			}
			for(Node node : adjectencyList){
				if(!node.isVisited()){
					queue.add(node);
				}
			}
		}
		System.out.println("ends ");
	}
	public static void bfs(Node root){
		System.out.println("bfs starts");
		Queue<Node> queue = new LinkedList<Node>();
//		Map.Entry<Node , List<Node>> rootEntry = adjectencyMatrix.entrySet().iterator().next();
//		Node root = rootEntry.getKey();
//		System.out.print(root);
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			temp.setVisited(true);
			System.out.println(temp);
			List<Node> adjectencyList = (List<Node>)adjectencyMatrix.get(temp);
			if(adjectencyList == null){
				continue;
			}
			for(Node node : adjectencyList){
				if(!node.isVisited()){
					queue.add(node);
				}
			}
		}
		System.out.println("ends ");
	}
	
	public static void dfs(Node root){
		System.out.println("DFS STARTS");
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty()){
			Node temp = stack.pop();
			temp.setVisited(true);
			System.out.println(temp);
			List<Node> list = (List<Node>)adjectencyMatrix.get(temp);
			for(Node node : list){
				if(!node.isVisited())
					stack.push(node);
			}
		}
		
		System.out.println("DFS ENDS ");
	}
}
