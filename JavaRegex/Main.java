package com.company;
import java.util.Scanner;
public class Main {




    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new JRegex().pattern));
        }

    }
}
class JRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;
}