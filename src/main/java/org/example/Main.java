package org.example;


import java.util.*;


public class Main {


    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("blue");
        colors.add("yellow");
        colors.add("brown");
        colors.add("pink");

        for (String color : colors) {
            if (color.startsWith("b"))
                System.out.println(color);
        }

        colors.remove(3);

        System.out.println(colors);

        System.out.println("=============");


        Map<String, String> colorMap = new HashMap<>();
        colorMap.put("white", "白");
        colorMap.put("blue", "青");
        colorMap.put("yellow", "黄");

        for (Map.Entry<String, String> entry : colorMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(colorMap.get("white"));

    }

}