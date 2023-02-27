package com.LruCache;

public class Running {

//    [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
    public static void main(String[] args) {
        LRUCache lrucache = new LRUCache(2);
        lrucache.put(1,1);
        lrucache.put(2,2);
        lrucache.get(1);
        System.out.println(lrucache);
        lrucache.put(3,3);
        lrucache.get(2);
        lrucache.put(4,4);
        lrucache.get(3);
        lrucache.get(4);
        System.out.println(lrucache);
    }
}
