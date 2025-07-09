
interface operation{
    int add(int a, int b);
}


public class Java8Recap {

    public static void main(String[] args) {

        operation addtion = (a,b) -> a+b;

        System.out.println("Addition :"+addtion.add(4,5));

        Addition add = new Addition();


    }
}
