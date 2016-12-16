package com.bhanu.graphs;

public final class Node {

	int index;
	boolean isVisited;
	public Node(int index){
		this.index = index;
	}
	

	public boolean isVisited() {
		return isVisited;
	}


	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (index != other.index)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Node [index=" + index + ", isVisited=" + isVisited + "]";
	}
	
	
	
}
