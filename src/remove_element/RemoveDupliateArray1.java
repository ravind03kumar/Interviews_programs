package remove_element;

public class RemoveDupliateArray1 {
    public static void main(String[] args) {
        int[] a = {4, 6, 5, 4, 6, 8};
        System.out.println("duplicate element");

        for (int i = 0; i < a.length-1; i++) {

            for (int j=i+1;j<a.length;j--){


                      if ((a[i]==a[j])&&(i!=j));


                    System.out.println(a[j] + ",");

                }



        }
    }
}
