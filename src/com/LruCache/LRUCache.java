package com.LruCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {


    private LinkedHashMap<Integer, Integer> lru = new LinkedHashMap<>();
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer val = lru.get(key);

        if (val == null) return -1;
        else {
            lru.remove(key);
            lru.put(key, val);
            return val;
        }
//        if (!map.containsKey(key)) return -1;
//        int val = map.get(key);
//        set(key, val);
//        return val;

    }

    public void put(int key, int value) {
        Integer val = lru.get(key);

        if (val == null) lru.put(key, value);
        else {
            lru.remove(key);
            lru.put(key, value);
        }
         if (lru.size() > capacity) {
             Map.Entry<Integer, Integer> entry = lru.entrySet().iterator().next();
             lru.remove(entry.getKey());
         }
//        if (!map.containsKey(key) && (map.size() == capacity)) {
//            map.remove(map.keySet().iterator().next());
//        }
//        map.remove(key);
//        map.put(key, value);
    }

    @Override
    public String toString() {
        return "LRUCache{" +
                "lru=" + lru +
                ", capacity=" + capacity +
                '}';
    }
}
