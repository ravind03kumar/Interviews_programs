package creat_array_lenth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatArray {
    public static void main(String[] args) {
        //arra with duplicate array
        ArrayList<Integer> number List = new ArrayList<>(Arrays.asList(1,5,3,2,4,1,4,6,7,6,4));

        System.out.println(number.List);

        List<Integer>List  =number.stream().distinct().collect(Collectors.toList());
        System.out.println("list without duplicate"+List );
    }
}
