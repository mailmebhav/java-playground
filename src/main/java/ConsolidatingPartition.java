package main.java;

import java.util.*;

public class ConsolidatingPartition {

    /*
     * Complete the 'minPartitions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY used
     *  2. INTEGER_ARRAY total
     */

    public static int minPartitions(List<Integer> used, List<Integer> total) {
        // Write your code here
        Collections.sort(used);
        Collections.sort(total);
        System.out.println(used);
        System.out.println(total);
        int count = 0;
        int sum = 0;
        for(int i =0;i<total.size(); i++) {
            sum = 0;
            String s = "";
//            foreach(c:s) {
//Set sa = new HashSet();
//sa.containsAll(s);
//s.contains((CharSequence) sa);
//            }
            for(int j = i; j < used.size(); j++) {
                if(used.get(j) > 0) {
                    sum += used.get(j);
                    if(sum == total.get(i)) {
                        used.set(j, 0);
                        count++;
                        System.out.println("Equal");
                        break;
                    } else if(sum < total.get(i)) {
                        used.set(j, 0);
                    } else {
                        System.out.println("Greater");
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ConsolidatingPartition c = new ConsolidatingPartition();
        List<Integer> used = new ArrayList<Integer>();
        used.add(3);
        used.add(2);
        used.add(1);
        used.add(3);
        used.add(1);
        List<Integer> total = new ArrayList<Integer>();
        total.add(3);
        total.add(5);
        total.add(3);
        total.add(5);
        total.add(5);
        System.out.println(c.minPartitions(used, total));
    }

}
