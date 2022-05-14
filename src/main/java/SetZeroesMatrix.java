package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetZeroesMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        A.add(new ArrayList<>(new ArrayList<Integer>(Arrays.asList(1,0,1))));
        A.add(new ArrayList<>(new ArrayList<Integer>(Arrays.asList(1,1,1))));
        A.add(new ArrayList<>(new ArrayList<Integer>(Arrays.asList(1,1,1))));
//        for(int i = 0; i < A.size() -1; i++) {
//            List<Integer> tempList = new ArrayList<>();
//            A.set(i,tempList)
//        }
        System.out.println(A);
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < A.get(i).size(); j++) {
                System.out.print(A.get(i).get(j) + " ");
            }
            System.out.print("\n");
        }

        SetZeroesMatrix setZeroesMatrix = new SetZeroesMatrix();
        setZeroesMatrix.setZeroes(A);
    }

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        List<Integer> iList = new ArrayList<>();
        List<Integer> jList = new ArrayList<>();
        for(int i = 0; i < a.size(); i++) {
            boolean flag1 = false;
            for(int j = 0; j < a.get(i).size(); j++) {
                if(a.get(i).get(j) == 0 && !flag1) {
                    flag1 = true;
//                    result.add(new ArrayList<Integer>(Arrays.asList(new Integer[a.get(i).size()]) {0}));
                }
            }
            if(!flag1) {
                result.add(a.get(i));
            }
        }
        System.out.println(result);
    }
}
