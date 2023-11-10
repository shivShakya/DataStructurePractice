import java.util.*;

public class AdjacencyList{

    public static class Edges{
             int src ;
             int des;

            public Edges(int src , int des){
                   this.src = src;
                   this.des = des;
            }
    }

    public static void createGraph(ArrayList<Edges>graph[]){

        for(int i = 0 ; i < graph.length ; i++){
               graph[i] = new ArrayList<Edges>();        
        }

         graph[0].add(new Edges(0,2));

               graph[1].add(new Edges(1,2));
               graph[1].add(new Edges(1,3));

               graph[2].add(new Edges(2, 0));
               graph[2].add(new Edges(2,1));
               graph[2].add(new Edges(2,3));

               graph[3].add(new Edges(3,2));
               graph[3].add(new Edges(3,1));
    }

    public static void BFS(ArrayList<Edges>graph[], int V){
             
          Queue<Integer> q = new LinkedList<>();

          boolean vis[] = new boolean[V];

          q.add(0);

          while(!q.isEmpty()){
                 int curr = q.remove();

                 if(vis[curr] == false){
                        System.out.print(curr + " ");
                        vis[curr] = true;
                        
                        for(int i = 0 ; i < graph[curr].size() ; i++){
                                 Edges E = graph[curr].get(i);
                                 q.add(E.des);
                        }
                 }
                 
          }       
    }

    public static void DFS(ArrayList<Edges>graph[],int curr,boolean vis[]){
          System.out.print(curr + " ");
          vis[curr] = true;
          
          for(int i = 0 ; i < graph[curr].size() ; i++){
                  Edges E = graph[curr].get(i);
                  DFS(graph,E.des,vis);
          }
    }
            

    public static void main(String [] args){
             
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no. of vertices :  ");
            int V = sc.nextInt();
            
            ArrayList<Edges>graph[] = new ArrayList[V];
            createGraph(graph);
            boolean vis[] = new boolean[V];

            DFS(graph,0,vis);
            sc.close();
    }
} 