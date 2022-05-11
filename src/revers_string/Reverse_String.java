package revers_string;

public class Reverse_String {
    public static void main(String[] args) {
        String s="  AKASH KUMAR ";
        String revers="" ;
        for (int i=s.length()-1;i>0;i--){
            revers=revers+s.charAt(i);
        }
        System.out.println(revers);
    }

        }


