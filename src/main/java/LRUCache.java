package main.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    Map<Integer, Integer> cache;

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        System.out.println("null");
        lRUCache.put(1, 1); // cache is {1=1}
        System.out.println("null");
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println("null");
        int val = lRUCache.get(1);    // return 1
        System.out.println(val);
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println("null");
        val = lRUCache.get(2);    // returns -1 (not found)
        System.out.println(val);
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println("null");
        val = lRUCache.get(1);    // return -1 (not found)
        System.out.println(val);
        val = lRUCache.get(3);    // return 3
        System.out.println(val);
        val = lRUCache.get(4);    // return 4
        System.out.println(val);
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
            cache.put(key, value);
    }
}
