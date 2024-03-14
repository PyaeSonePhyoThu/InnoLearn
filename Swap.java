public class Swap {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int temp;

        System.out.println("Before Swap x is " + x + " and y is " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swap x is " + x  + " and y is " + y);
    }
}
