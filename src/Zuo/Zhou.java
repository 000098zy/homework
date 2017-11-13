package Zuo;

public class Zhou {
    public static void main(String[] args) {
        for (int i = 20171022; ; ) {
            if (suSu(++i)) {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean suSu(int i) {
        for (int a = 2; a <= i / 2; a++) {
            if (i % a == 0) {
                return false;
            }
        }
                return  true;

            }
        }


