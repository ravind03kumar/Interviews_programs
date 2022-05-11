package lemda_exprasion;

import remove_element.RemoveArray;
import revers_string.Reverse_String;

import java.util.*;

public class LemdaWithAyyarlist {

    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("java");
        obj.add("Spring");
        obj.add("Spring boot");
        obj.add("Spring");
        obj.add("microservices");
        obj.add("Spring boot");
        obj.forEach((n) -> {
            System.out.println(n);});
    }

    public void array() {


        // public static void main(String[] args) {
        List<String> list = Arrays.asList("Luke", "tony", "Tony", "luke");
        Set<String> set = new HashSet<>();
        list.stream().map(s -> s.toLowerCase()).filter(s -> !set.contains(s)).forEach(set::add);
        System.out.println(set);
    }

}
