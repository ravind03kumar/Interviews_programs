package shorting;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.util.*;
import java.util.stream.Collectors;

public class Arraylist_shorting {

    public static void main(String[] args) {
      List<Integer> list=Arrays.asList(23,4,23,55,1,23,67,45,867,90,100);
      List<Integer> sort=list.stream().sorted().collect(Collectors.toList());
        System.out.println(sort
        );





      //  List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

    }


}
