package Zuo;

public class Homework1 {
    public static void main(String[] args) {
        int score[][] = {{1, 1,}, {1, 1}};
        int age[][] = {{2}, {1}};
        printMatrix(score,age);}
        static void  printMatrix(int score[][],int age[][]){
        int c[][] =new int[score.length][age.length];
        int a, b, o;
        for (a = 0; a <score .length; a++) {
            for (b = 0; b < age[a].length; b++) {
                int temp = 0;
                for (o = 0; o < age.length; o++) {
                    temp += score[a][o] * age[o][b];
                }
                c[a][b] = temp;

            }
        }
        System.out.println("结果");
        for (int m = 0; m < score.length; m++) {
            for (int n = 0; n < age[m].length; n++) {
                System.out.print(c[m][n] + "\t");
            }
            System.out.println();

        }
    }

    public static class Tu {
        static final int X = 100;
        static final int Y = 100;
        static final int HALF_X = X/2;
        static final int HALF_Y =Y/2;
        static final int[] [] COORDINATE =new int[X][Y];

        public static void main(String[] args) {
            for (int y = 0;y < COORDINATE .length;y++ ){
                for (int x=0;x < COORDINATE [0].length;x++){
                    if (y ==HALF_X||x==HALF_Y){
                        System.out.printf("*");
                        continue;}
                        if (yi(x,y))
                            System.out.printf("*");
                    else
                            System.out.printf(" ");
                    }
                System.out.println();
                }
            }
            public static boolean yi(int x,int y){
            return x== y;
        }
    }
}



