package main;
import java.util.*;
import headers.*;
public class App {
    public static void fill_arr(int [] arr ){
        Random rand = new Random();
        for(int i = 0; i<arr.length;i++){
            arr[i] = (rand.nextInt()%100);
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[100];
        fill_arr(arr);
        displays.display_arr(arr);
        num_operations.max(arr);
        num_operations.min(arr);
        num_operations.average(arr);
        ArrayList<Integer> list = new ArrayList<>();
        list = num_operations.even_num(arr);
        displays.display_list(list);
        
        



        

        

        
        
       

    }
}