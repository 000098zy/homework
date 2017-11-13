package Zuo;

public class Tu1 {
    static final int A = 100;
    static final int B = 100;
    static final int HALF_A = A / 2;
    static final int HALF_B = B / 2;
    static final int[][] COORDINATE = new int[A][B];

    public static void main(String[] args) {
        for (int y = 0; y < COORDINATE.length; y += 1) {
            for (int x = 0; x < COORDINATE[0].length; x++) {
                if (y == HALF_A || x == HALF_B) {
                    System.out.print("*" );
                    continue;}
                if (yi(x,y) )
                    System.out.print("*" );
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static boolean yi(int x,int y){

        return (x - 50)*(x - 50) == (50 - y);


    }
    }
