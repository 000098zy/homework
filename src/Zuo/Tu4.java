package Zuo;

public class Tu4 {
    static final int A = 200;
    static final int B = 100;
    static final int HALF_A = A / 2;
    static final int HALF_B = B / 2;
    static final int[][] COORDINATE = new int[A][B];

    public static void main(String[] args) {
        for (int y = 0; y < COORDINATE.length; y += 4) {
            for (int x = 0; x < COORDINATE[0].length; x += 1){
                if (y == HALF_A || x == HALF_B) {
                    System.out.print("*" );
                    continue;}
                if (yi(x,y) )
                    System.out.printf("****" );

                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static boolean yi(int x,int y){
        return (x-50)*(x-50) +(100-y)*(100-y) == 2500;
    }

    }
