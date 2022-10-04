package Graph;

import java.util.*;

public class KruskalAlgorithm {
    static class Node implements Comparable<Node>
    {
        int src;
        int dest;
        int weight;
        Node(int src,int dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
        public int compareTo(Node n)
        {
            return this.weight-n.weight;
        }
    }

    static class SortingWay implements Comparator<Node>
    {
        public int compare(Node p,Node n)
        {
            return p.weight-n.weight;
        }
    }

    public static int findParent(int n,int[] parent)
    {
        if(n==parent[n])
        {
            return n;
        }
        return parent[n]=findParent(parent[n],parent);
    }
    public static void union(int n,int m,int[] parent,int[] rank)
    {
        n=findParent(n,parent);
        m=findParent(m,parent);
        if(rank[n]<rank[m])
        {
            parent[n]=m;
        }else if(rank[n]>rank[m])
        {
            parent[m]=n;
        }else
        {
            parent[m]=n;
            rank[n]++;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n==0)
        {
            System.out.println("0");
            return ;
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int count=1;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[0]);
       for(int i=1;i<n;i++)
       {
           if(arr[i-1]!=arr[i])
           {
               count++;
               ans.add(arr[i]);
           }
       }
       System.out.println(count);
       for(int i:ans)
       {
           System.out.print(i+" ");
       }
//        int V=scan.nextInt();
//        int E=scan.nextInt();
//        ArrayList<Node> graph=new ArrayList<>();
//        for(int i=0;i<E;i++)
//        {
//            int src=scan.nextInt();
//            int dest= scan.nextInt();
//            int weight=scan.nextInt();
//            graph.add(new Node(src,dest,weight));
//            graph.add(new Node(dest,src,weight));
//        }
//        int[] parent=new int[V];
//        int[] rank=new int[V];
//        for(int i=0;i<V;i++)
//        {
//            parent[i]=i;
//        }
//        ArrayList<Node> ans=new ArrayList<>();
//        Collections.sort(graph,new SortingWay());
//        for(Node n:graph)
//        {
//            if(findParent(n.src,parent)!=findParent(n.dest,parent))
//            {
//                union(n.src,n.dest,parent,rank);
//                ans.add(n);
//            }
//        }
//
//        for(Node n:ans)
//        {
//            System.out.println(n.src+" "+n.dest+" "+n.weight);
//        }
    }
}
