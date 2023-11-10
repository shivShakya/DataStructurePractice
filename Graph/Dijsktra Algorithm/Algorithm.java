import java.util.*;

public class Algorithm{
        
       static class Edge {
             int src ;
             int dest ;
             int wt ;
             

             public Edge(int s , int d , int w){
                   this.src = s ;
                   this.dest = d ;
                   this.wt = w;
             }
       }
    
     public static void createGraph(ArrayList<Edge> graph[]){
            
           for(int i = 0 ; i < graph.length ; i++){
                 graph[i] = new ArrayList<Edge>();        
           }

           graph[0].add(new Edge(0,1,10));
           graph[0].add(new Edge(0,2,15));
           graph[0].add(new Edge(0,3,30));
           
           graph[1].add(new Edge(1,0,10));
           graph[1].add(new Edge(1,3,40));

           graph[2].add(new Edge(2,0,15));
           graph[2].add(new Edge(2,3,50));

           graph[3].add(new Edge(3,1,40));
           graph[3].add(new Edge(3,0,30));
           graph[3].add(new Edge(3,2,50));
           
           System.out.println("Graph has been created.");

     }

     public static class Pair implements Comparable<Pair>{
            int node ; 
            int dest ;

            public Pair(int n , int d ){
                   this.node = n;
                   this.dest = d;
            }

            @Override
            public int compareTo(Pair p2){
                   return this.dest - p2.dest;
            }


     }

     public static void dijkstra(ArrayList<Edge> graph[] , int src , int V){
             PriorityQueue<Pair>pq = new PriorityQueue<>();

             int dist[] = new int[V];

             for(int i = 0; i < V ; i++){
                      if( i != src){
                              dist[i] = Integer.MAX_VALUE;
                      }

             }

             boolean vis[] = new boolean[V];
             pq.add(new Pair(0,0));


             while(!pq.isEmpty()){

                  Pair curr = pq.remove();
                  if(!vis[curr.node]){
                       vis[curr.node] = true;

                       for(int i = 0 ; i < graph[curr.node].size() ; i++){
                              
                             Edge e = graph[curr.node].get(i);

                             int u = e.src;
                             int v = e.dest;

                             if( dist[u] + e.wt < dist[v]){
                                    dist[v] = dist[u] + e.wt;
                                    pq.add(new Pair(v,dist[v]));
                             }
                       }
                  }
             }

             for(int i = 0 ; i < V ; i++){
                   System.out.print(dist[i]+ " ");
             }
             System.out.println();
     }

     public static void Prim(ArrayList<Edge> graph[] , int V){
            PriorityQueue <Pair> pq = new PriorityQueue<>();

            boolean vis[] = new boolean[V];

            ArrayList<Edge> mstEdges = new ArrayList<>();
            pq.add(new Pair(0,0));

            int mstCost = 0;
            while(!pq.isEmpty()){
                     Pair curr = pq.remove();

                     if(!vis[curr.node]){
                           vis[curr.node] = true;
                           mstCost += curr.dest;

                           for(int i = 0 ;  i < graph[curr.node].size(); i++){
                                   Edge e = graph[curr.node].get(i);
                                   mstEdges.add(new Edge(e.src,e.dest,e.wt));
                                   if(!vis[e.dest]){
                                          pq.add(new Pair(e.dest,e.wt));
                                   }
                           }
                     }
            }

            for(int i = 0 ; i < mstEdges.size() ; i++){
                    Edge e = mstEdges.get(i);
                    System.out.println(e.src + " " + e.dest + " " + e.wt);
            }
            System.out.println("Number of Edges in MST : " + mstEdges.size()/2);
            System.out.println(mstCost);
     }

     public static void main(String [] args){
           int V = 4 ;

           ArrayList<Edge> graph[] = new ArrayList[V];
           createGraph(graph);

           dijkstra(graph, 0, V);
           Prim(graph,V);
     }
}