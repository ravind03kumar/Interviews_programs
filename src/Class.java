import static javafx.scene.input.KeyCode.X;

public class Class {
    public static void main(String[] args) {
        int result=0;
        short s=42;
        Long x=new Long("42");
        Long y=new Long(42);
        Short z=new Short("42");
        Short X2=new Short(s);
        Integer Y2=new Integer("42");
        Integer z2=new Integer(42);

        if(x==y)
            result=1;
        if(X.equals(y))
            result=result+10;
        if(x.equals(z))
            result=result+100;
        if(x.equals(X2))
            result=result+1000;
        if(x.equals(z2))
            result=result+10000;
        System.out.println("result="+result);


    }

}
