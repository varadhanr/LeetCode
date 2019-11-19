import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// "static void main" must be defined in a public class.

public class CriticalConnections {
    static int time = 0;
    static final int NIL = -1;
    static List<Integer[]> ans1 = new LinkedList<>();
    
    static class Graph{
        private int v;
        private LinkedList<Integer> adj[]; 
        Graph(int V) 
        { 
            v = V; 
            adj = new LinkedList[V+1]; 
            for (int i=0; i<V+1; ++i) 
                adj[i] = new LinkedList(); 
        }
        
        void addEdge(int V, int w) 
        { 
            this.adj[V].add(w);
            this.adj[w].add(V);
        }
    }
    
    static void bridgeDfs(Graph g,int u,boolean visited[], int disc[], int low[], int parent[] )
    {
        visited[u] = true;
        disc[u]=low[u]=++time;
        
        Iterator<Integer> i = (g.adj[u]).iterator();
        while(i.hasNext())
        {
            int v = i.next();
            if(!visited[v])
            {
                parent[v]=u;
                bridgeDfs(g,v,visited,disc,low,parent);
                low[u] = Math.min(low[u],low[v]);
                if(low[v]>disc[u])
                    ans1.add(new Integer[]{u,v});
            }
            else if(v!=parent[u])
            {
                low[u] = Math.min(low[u],disc[v]);
            }
        }
    }
    
    static int[][] bridges(int[][] edges,int v)
    {
        Graph g = new Graph(v);
        for(int i=0;i<edges.length;i++)
        {
            g.addEdge(edges[i][0],edges[i][1]);
        }
        boolean visited[] = new boolean[v+1];
        int disc[] = new int[v+1];
        int low[] = new int[v+1];
        int parent[] = new int[v+1];
        
        for(int i=0;i<v;i++)
        {
            parent[i]=NIL;
            visited[i]=false;
        }
        

        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                bridgeDfs(g,i, visited, disc, low, parent);
            }
        }
        
        int[][] res = new int[ans1.size()][2];
        int index=0;
        for(Integer[] temp: ans1)
        {
            res[index][0]=temp[0];
            res[index][1]=temp[1];
            index++;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=10;
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}, {3, 4}, {3, 6}, {4, 5},{4,6},{5,6},{5,7}, {6, 7}, {7, 8}, {8, 9},{8,10}};
        int[][] ans = bridges(edges,n);
        if(ans.length==0)
            System.out.print("[]");
        for(int[] arr : ans)
            System.out.print(Arrays.toString(arr)+",");
    }
}