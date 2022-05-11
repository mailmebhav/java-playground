package com.company;

public class QuickFindUF {
    private int[] id;
    public QuickFindUF(int N) {
        System.out.println("Inside Constructor");
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int temp = id[p];
        int qid = id[q];
        if(id[p] != id[q]) {
            for(int i = 0; i < id.length; i++) {
                if (id[i] == temp) {
                    id[i] = qid;
                }
            }
        }
    }

    public static void main(String args[]) {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        quickFindUF.union(4,3);
        quickFindUF.union(3,8);
        quickFindUF.union(6,5);
        quickFindUF.union(9,4);
        quickFindUF.union(2,1);
        System.out.println(quickFindUF.connected(0,7));
        System.out.println(quickFindUF.connected(8,9));
        quickFindUF.union(5,0);
        quickFindUF.union(7,2);
        quickFindUF.union(6,1);
        quickFindUF.union(1,0);
        System.out.println(quickFindUF.connected(0,7));
    }
}
