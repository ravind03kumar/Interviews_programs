package max_int;

import java.util.Arrays;
import java.util.Collections;

public class Array_max {
    //main method
    public static void main(String[] args) {

        int [] arr={32,4,34,56,43,67,98,60,75,4,6,8,97,6,54};

        int max= Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
   


}
