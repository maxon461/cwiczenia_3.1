package headers;
import java.util.*;
public class displays {
    public static void display_list(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void display_arr(int [] arr ){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("----------------------------------");
    }
}
