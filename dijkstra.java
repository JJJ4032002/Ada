/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureex;

/**
 *
 * @author Rohan
 */
public class dijkstra {
     private static final int V = 5; 
    
    int minKey(int key[], Boolean mstSet[]) 
    { 
        
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < V; v++) 
            if (mstSet[v] == false && key[v] < min) { 
                min = key[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
  
      
    void printDij( int key[]) 
    { 
        System.out.println("Shortest path"); 
        for (int i = 1; i < V; i++) 
            System.out.println(i + "\t\t\t" + key[i]); 
    } 
  
    
    void dijMST(int graph[][],int src_node) 
    { 
         
        int parent[] = new int[V]; 
  
          
        int key[] = new int[V]; 
  
      
        Boolean mstSet[] = new Boolean[V]; 
  
         
        for (int i = 0; i < V; i++) { 
            key[i] = Integer.MAX_VALUE; 
            mstSet[i] = false; 
        } 
  
        
        key[src_node] = 0;  
       
         
  
        
        for (int count = 0; count < V - 1; count++) { 
             
            int u = minKey(key, mstSet); 
  
            
            mstSet[u] = true; 
  
            
            for (int v = 0; v < V; v++) 
  
                
                if (graph[u][v] != 0 && mstSet[v] == false && key[u] 
                            + graph[u][v] < key[v]) { 
                    parent[v] = u; 
                    key[v] = graph[u][v]; 
                } 
        } 
  
         
        printDij(key); 
    } 
  
    public static void main(String[] args) 
    { 
         
        dijkstra t = new dijkstra(); 
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 
                                      { 2, 0, 3, 8, 5 }, 
                                      { 0, 3, 0, 0, 7 }, 
                                      { 6, 8, 0, 0, 9 }, 
                                      { 0, 5, 7, 9, 0 } }; 
  
        
        t.dijMST(graph,0); 
    } 
}
