package main.java;

import java.util.HashMap;
import java.util.Map;

public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        FindCenterOfStarGraph findCenterOfStarGraph = new FindCenterOfStarGraph();
//        [[1,2],[2,3],[4,2]]
    }

    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < edges.length; i++) {
            map.put(edges[i][0], map.getOrDefault(edges[i][0], 0) + 1);
            map.put(edges[i][1], map.getOrDefault(edges[i][1], 0) + 1);
        }
        int max = -1;
        int maxVertex = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                maxVertex = entry.getKey();
                max = entry.getValue();
            }
        }

        return maxVertex;
    }
}
