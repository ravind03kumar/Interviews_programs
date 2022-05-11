package revers_string;

public class PelandronNumber {
    public static void main(String[] args) {
        String s=" madam ";
        String revers ="";

        for (int i=s.length()-1;i>0;i--)
        {
            revers=revers+s.charAt(i);

        }
        if (s.equals(revers)){
            System.out.println("it is peldrom number");
        }
        else {
            System.out.println("it is not pelodrom number");
        }
    }
}
