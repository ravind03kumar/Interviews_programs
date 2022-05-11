package revers_string;

public class Demo2 {
    public static void main(String[] args) {
        String s = "khushboo";
        String revers1 = "";
        for (int i = s.length() - 1; i > 0; i--) {

            revers1 = revers1 + s.charAt(i);
            System.out.println(revers1);


        }
    }
}