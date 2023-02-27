package com.LruCache;


import org.junit.Test;

public class UnitTest {

    @Test
    public static void main(String[] args) {
        LRUCache lrucache = new LRUCache(2);
        lrucache.put(2,2);
        assert(lrucache.get(2)==2);
    }


}
