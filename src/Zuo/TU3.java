package Zuo;

public class TU3 {
    static final int A = 50;
    static final int B = 100;
    static final int HALF_A = A / 2;
    static final int HALF_B = B / 2;
    static final int[][] COORDINATE = new int[A][B];

    public static void main(String[] args) {
        for (int y = 0; y < COORDINATE.length; y++) {
            for (int x = 0; x < COORDINATE[0].length; x++) {
                if (y == HALF_A || x == HALF_B) {
                    System.out.print("*" );
                    continue;}
                if (yi(x,y) )
                    System.out.print("**" );
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static boolean yi(int x,int y){
        return (25 - y)*(25 - y) == x - 50;
    }
}
