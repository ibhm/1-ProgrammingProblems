class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def addEdge(self, u , v):
        self.graph[u].append(v)

    def DFSUtil(self, v, visited):
        visited[v] = True

        ##print the path taken by the DFS search so print the vertice
        print v

        ##this function visits the nodes in the graphs, if it hasnt visited them
        for i in self.graph[v]:
            if visited[i] == False:
                self.DFSUtil(i, visited)

    def DFS(self,v):
        ##marks all vertcies as unmarked
        visited = [False] * (len(self.graph))

        ##DFS recursive traversal 
        self.DFSUtil(v,visited)

    def BFS(self, s):

        visited = [False] * (len(self.graph))

        queue = []

        ##BFS u check the first children of the vertex, so put it first in a queue
        queue.append(s)
        
        visited[s] = True

        while queue:
            s = queue.pop(0)
            ##This processes the first vertex only right now
            print(s, end = " ")


            for i in self.graph[s]:
                while visited[i] == False:
                    queue.append[i]
                    visited[i]==True

    def BFS2(int s):
        queue = []
        visited == False * (len(self.graph))
        queue.append[s]
        visited[s] == True

        while queue:
            s = queue.pop(0)
            for i in self.graph[s]:
                if visited[i]==False:
                    queue.append[i]
                    visited[i]==True

    def DFS(self, v, visited):
        visited[v]==True
        for i in self.graph[v]:
            if visited[i]==False
            DFS(i, visited)
    
    def DFS2(self,v):
        visited = [False]*(len(self.graph))
        self.DFS(v,visited)
