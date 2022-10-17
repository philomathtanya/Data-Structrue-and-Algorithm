import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph_Implementation_Adjacency_List
{

   private LinkedList<Integer> adjacency[];
   public Graph_Implementation_Adjacency_List(int v){
       adjacency = new LinkedList[v];
       for (int i = 0; i < v; i++) {
           adjacency[i]= new LinkedList<Integer>();
       }
   }

   public void insertedge(int s, int d)
   {
       adjacency[s].add(d);
       adjacency[d].add(s);

//        System.out.print(adjacency[d]);
//        System.out.print(adjacency[s]);
   }

   public void bfs(int source)
   {
       boolean visited_nodes[]=new boolean[adjacency.length];
       int parent_node[]= new int[adjacency.length];
       Queue<Integer> q = new LinkedList<>();
       q.add(source);
       visited_nodes[source]=true;
       parent_node[source]=-1;
       while (!q.isEmpty())
       {
           int p = q.poll();
           System.out.println(p);
           for (int i = 0: adjacency[p])
           {if (visited_nodes[i] !=true) {
               visited_nodes[i] = true;
               q.add(i);
               parent_node[i] = p;
           }
           }
       }

   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number of vertices");
       int v = sc.nextInt();
       System.out.println("enter number of edges");
       int e = sc.nextInt();
       Graph_Implementation_Adjacency_List g = new Graph_Implementation_Adjacency_List(v);
       System.out.println("enter edges");
       System.out.println("enter source and destination:--");
       for (int i = 0; i <e; i++)
       {
           int s = sc.nextInt();
           int d = sc.nextInt();

           g.insertedge(s,d);
       }
       System.out.println("enter sourse for bfs");
       int source = sc.nextInt();
       g.bfs(source);
   }
}
