package com.company;

public class QuickUnionWeighted {
    int id[];
    public QuickUnionWeighted(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {

    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int p) {
        while(p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public static void main(String args[]) {
        QuickUnionWeighted quickUnionWeighted = new QuickUnionWeighted(10);
        quickUnionWeighted.union(4,3);
        quickUnionWeighted.union(3,8);
        quickUnionWeighted.union(6,5);
        quickUnionWeighted.union(9,4);
        quickUnionWeighted.union(2,1);
        System.out.println(quickUnionWeighted.connected(0,7));
        System.out.println(quickUnionWeighted.connected(8,9));
        quickUnionWeighted.union(5,0);
        quickUnionWeighted.union(7,2);
        quickUnionWeighted.union(6,1);
        quickUnionWeighted.union(1,0);
        System.out.println(quickUnionWeighted.connected(0,7));

    }
}
