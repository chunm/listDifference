package com.company;

import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        List<String> dif = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader("file2.txt"));
        try {
            String line = br.readLine();

            while (line != null) {
                hmap.put(line, 1);
                line = br.readLine();
            }
        } finally {
            br.close();
        }

        BufferedReader nbr = new BufferedReader(new FileReader("file1.txt"));
        try {
            String line = nbr.readLine();
            while (line != null) {
                // You might want to change these next 2 lines depending on what you are looking for.
                String[] tokens = line.split("/");
                if((!hmap.containsKey(tokens[tokens.length-1].replaceAll("\\s+","")))){
                    dif.add(tokens[tokens.length-1]);
                }
                line = nbr.readLine();
            }
        } finally {
            br.close();
        }

        System.out.println("DIF:");

        for(int i = 0; i < dif.size(); i++){
            System.out.println(dif.get(i));
        }

        System.out.println(dif.size());
    }
}
