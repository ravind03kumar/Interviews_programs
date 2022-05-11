package fectorial;


public class Fectorial1 {
    public static void main(String[] args) {
        int no =8;
       int Factorial=1;
        for (int i=1;i<=no;i++)
        //for (int i=no;i<=1;i--) increse of fectorial
        {
            Factorial=Factorial*i;
        }
        System.out.println("factorial  "+no+"  is  " +Factorial);
    }
}
