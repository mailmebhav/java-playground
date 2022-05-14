package main.java;

public class QuickUnion {
    int[] id;
    public QuickUnion(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int p) {
        while(p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public static void main(String args[]) {
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.union(4,3);
        quickUnion.union(3,8);
        quickUnion.union(6,5);
        quickUnion.union(9,4);
        quickUnion.union(2,1);
        System.out.println(quickUnion.connected(0,7));
        System.out.println(quickUnion.connected(8,9));
        quickUnion.union(5,0);
        quickUnion.union(7,2);
        quickUnion.union(6,1);
        quickUnion.union(1,0);
        System.out.println(quickUnion.connected(0,7));
    }
}
