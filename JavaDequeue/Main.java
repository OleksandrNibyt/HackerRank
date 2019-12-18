package com.company;
import java.util.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> deque     = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i >= m) {
                int old = deque.removeFirst();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.merge(old, -1, Integer::sum);
                }
            }
            int num = in.nextInt();
            deque.addLast(num);
            map.merge(num, 1, Integer::sum);
            max = Math.max(max, map.size());
            if (max == m) {
                break;
            }
        }
        System.out.println(max);

}
}
