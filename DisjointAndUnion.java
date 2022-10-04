package Graph;

public class DisjointAndUnion {
    int size;
    int[] parent;
    int[] rank;
    DisjointAndUnion(int size)
    {
        this.size=size;
        this.parent=new int[size];
        this.rank=new int[size];
        for(int i=0;i<size;i++)
        {
            parent[i]=i;
        }
    }
    public int findParent(int n)
    {
        if(n==parent[n])
        {
            return n;
        }
        return parent[n]=findParent(parent[n]);
    }
    public void union(int n,int m)
    {
        n=findParent(n);
        m=findParent(m);
        if(rank[n]<rank[m])
        {
            parent[n]=m;
        }else if(rank[m]<rank[n])
        {
            parent[m]=n;
        }else {
            parent[m]=n;
            rank[n]++;
        }
    }
    public static void main(String[] args) {
        DisjointAndUnion du=new DisjointAndUnion(8);
        du.union(1,2);
        du.union(3,4);
        du.union(2,4);
        du.union(5,7);
        du.union(3,7);
        for(int i=0;i<8;i++)
        {
            System.out.println(i+" "+du.parent[i]+" "+du.rank[i]);
        }
    }
}
