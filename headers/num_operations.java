package headers;

import java.util.*;

public class num_operations {
    public static void max(int[] arr) {
        int res = -100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > res) {
                res = arr[i];
            }
        }
        System.out.println("max is: " + res);
    }

    
    public static void min(int[] arr) {
        int res = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < res) {
                res = arr[i];
            }
        }
        System.out.println("min is: " + res);
    }


    public static void average(int[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        res /= arr.length;
        System.out.println("average is: " + res);
    }


    public static ArrayList<Integer> even_num(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                list.add(arr[i]);
            }

        }
        return list;
    }
}
