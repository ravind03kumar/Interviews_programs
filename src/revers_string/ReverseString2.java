package revers_string;

public class ReverseString2 {
    public static void main(String[] args) {
        String s="  neha  ";
        String revers="" ;
        for (int i=s.length()-1;i>0;i--){
            revers=revers+s.charAt(i);
        }
        System.out.println(revers);
    }
}
