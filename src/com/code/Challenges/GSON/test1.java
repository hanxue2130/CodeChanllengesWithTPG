package com.code.Challenges.GSON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class test1 {
    static int PageN = 1;
    static int totalPage = Integer.MAX_VALUE;
    static class Item {
        String     title;
        String     story_title;
    }
    static class Page {
        String total_pages;
        List<Item> data;
    }
    public static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);
            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
//    public static ArrayList<String> findData() throws Exception {
//        ArrayList<String> titleStore = new ArrayList<>();
//        while (PageN <= totalPage) {
//            String json = readUrl("https://jsonmock.hackerrank.com/api/articles?" + "page=" + PageN); //I want this one change
//            Gson gson = new Gson();
//            Page page = gson.fromJson(json, Page.class);
//            totalPage = Integer.valueOf(page.total_pages);
//            for (Item item : page.data) {
//                if ("".equals(item.title)){
//                    titleStore.add(item.story_title);
//                } else {
//                    titleStore.add(item.title);
//                }
//            }
//            PageN++;
//        }
//        return titleStore;
//    }
//    public static void main(String[] args) throws Exception {
//        ArrayList<String> test = findData();
//        for (int i = 0; i < test.size(); i++) {
//            System.out.println(test.get(i));
//        }
//        System.out.println(test.size());
//    }
}
