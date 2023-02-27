package com;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*This particular snippet is the json version from the interview with company H Requirements as followed

Write an HTTP GET method to retrieve information from an articles'database.
The query response is paginated and can be further access by appending to the query string&page=num
where num is the page number

Given a string of author,get the artcile title must perform the following tasks:
1 Query
2 Initialize the titles array to store a list of string elements
3 store the name of each article returned in the data filed to the titles array
(if title is not null, use title as the name)
(if title is null, and sotry title is not null, use story_title as the name)
(if both title and story_are null, ignore)
(based on the total-pages count,fetch all the data)
(return the array)

the solution conduct with the Json and using inbuilt method to screen out the desired result.
*/
public class test {
    public static void main(String[] args) {
        List<String> test = getMovieTitles();
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        System.out.println(test.size());
    }
    public static List<String> getMovieTitles() {
        String response;
        int Page = 1;
        int totalPages = Integer.MAX_VALUE;
        List<String> titles = new ArrayList<>();
        while (Page <= totalPages) {
            try {
                //url
                URL obj = new URL("https://jsonmock.hackerrank.com/api/articles/?" + "page=" + Page);
                //http
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                //method
                con.setRequestMethod("GET");
                //buffer
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((response = in.readLine()) != null) {
                    JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
                    totalPages = convertedObject.get("total_pages").getAsInt();
                    JsonArray data = convertedObject.getAsJsonArray("data");
                    for (int i = 0; i < data.size(); i++) {
                        if (data.get(i).getAsJsonObject().get("title").isJsonNull()) {
                            String story_title = data.get(i).getAsJsonObject().get("story_title").getAsString();
                            titles.add(story_title);
                        } else {
                            String title = data.get(i).getAsJsonObject().get("title").getAsString();
                            titles.add(title);
                        }
                    }
                }
                Page++;
                in.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        Collections.sort(titles);
        return titles;
    }
}
