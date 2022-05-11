package remove_element;

public class RemoveArray {

    public static void main(String[] args) {
        int[] arr = {45, 76, 87, 98, 45, 76};
        System.out.println("remove duplicat element");
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j--) {
                if ((arr[i]==arr[j])&&(i!=j));


                System.out.println( arr[j]+"");
            }
        }
    }
}