package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
    /*
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
        }

        */


        //Using BufferedReader since it is faster

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            String name = br.readLine();
            int phone = Integer.parseInt(br.readLine());
            map.put(name, phone);
        }


        String s;
        while ((s = br.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        br.close();




    }
}
