package com.code.Challenges.GSON;


import java.util.HashMap;

public class test2 {
    static int index = 0;
    static class employee{
        int id;
        String name;
        String add;
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAdd() {
            return add;
        }

        public void setAdd(String add) {
            this.add = add;
        }


        @Override
        public String toString() {
            return "employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", add='" + add + '\'' +
                    '}';
        }


    }

    public static void main(String[] args) {

        HashMap<Integer,employee> hm = new HashMap<>();
        employee e = new employee();
        e.setId(2);
        e.setName("sdsd");
        hm.put(index,e);
        System.out.println(hm.get(0).getId());
    };
}
