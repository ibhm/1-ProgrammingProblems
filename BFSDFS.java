public class Graph{
	
	private HashMap<Integer, Node> lookup = new 	HashSet<Integer> visited = new HashSet<Integer>();

	public static class Node{
		private int id;
		LinkedList<Node> adj = new LinkedList();
		private Node(int id){
			this.id = id;
		}

	}


	private Node getNode(int id){}

	public void addEdge(int source, int destination){}


	public boolean hasDFS(int source, destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();

		return DFS(s,d,visited)

	}

	public DFS(Node source, Node destination, HashSet<Integer> visited){
		if(visited.contains(source.id)){
			return false;
		}
		visited.add(source.id);
		if(source == destination){
			return true;
		}
		for(Node item : source.adjacent){
			DFS(item, distination, visited);
			return true;
		}
		return false;
	}

	public BFS(node source, node destination){
		LinkedList<Node> nextvisit=new LinkedList<Node>();

		HashSet<Integer> visited = new HashSet<Integer>();

		nextvisit.add(source);

		while(!nextvisit.isEmpty()){
			Node node = nextvisit.remove();
			if(node == destination){
				return true;
			}

			else if(visited.contains(node.id)){
				return false;
			}
			visited.add(node.id);

			for(Node child: node.adjacent){
				nexttovisit.add(child);
			}
			return false;
		}
	}
}