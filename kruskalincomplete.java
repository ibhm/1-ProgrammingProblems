public class KruskalMST{
	static class Edge{
		int source, destination, weight;

		public Edge(int source, int desitnation, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
	}

	static class Graph{
		int vertices; 
		ArrayList<Edge> all = new ArrayList<>();

		Graph(int vertices){
			this.vertices = vertices;
		}

		public void addEdge(int source, int destination, int weight){
			Edge edge = new Edge(source, destination ,weight);
			all.add(Edge);

		}
	

		public void kruskal(){
			PriorityQueeue>Edge>pq = new PriorityQueue<>(all.size(),Comparator.comparingInt(o->o.weight));


			for (int i = 0 ; i < all.size();i++){
				pq.add(all.get(i))
			}

			int[] parent = new int[vertices];

			makeset(parent);

			ArrayList<Edge> mst = new ArrayList<>();

			index = 0;

			while(index<vertices - 1){
				Edge edge = pq.remove();
				int xset = find(parent, edge.source);
				int yset = find(parent, edge.destination);

				//if parent has both source and destination as the same vertex value, then a cycle will be formed.
				if(xset = yset){
					continue;
				else{
				}
					mst.add(edge);
					index++;
					//add this value to mst
					//add this value to ????
					union(parent, xset,yset);
				}
			}

			printGraph(mst);
		}

		public void MakeSet(int[] parent){
			for(int i = 0; i < vertices; i ++)
				parent[i]= i;
		}

		//to find if the parent tree already has the vertex value in it. here we make it return vertex which means it was not in the parent cycle, we cud have used false to indicate its not in the parent MST as well
		public int find(Int[] parent , int vertix){
			if(parent[vertex]!=vertex){
				return find(parent,parent[vertex]);;
			}
			return vertex;
		}

		public void union(int[] parent, int x, int y){
			int xparent = find(parent, x);
			int yparent = find(parent, y);
			parent[yparent] = xparent
		}

	}
}