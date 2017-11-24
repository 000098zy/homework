package Zuo;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second=sc.nextInt();
        int [] ar = {31,28,31,30,31,30,31,31,30,31,30,31};
        int [] arr = {31,29,31,30,31,30,31,31,30,31,30,31};
        int year=second/(365*24*60*60);
        int run = year/4;
        int month = 0;
        int day=second%(365*24*60*60)/(24*60*60)-run;
        int hour=second%(24*60*60)/(60*60);
        int min = second%3600/60;
        int sec =  second%60;
        if ((1970+year) % 4 == 0 && (1970+year) % 100!= 0||(year+1970) % 400 == 0){
                for (int i = 0;i < arr.length;i++){
                    if (day <= arr[i]) {
                        month = i+1;
                        break;
                    }
                    day -= ar[i];
                }
        }else {
            for (int i = 0; i < ar.length; i++) {
                if (day <= ar[i]) {
                    month = i + 1;
                    break;
                }
                day -= ar[i];
            }
        }
        System.out.println(1970+year+"年"+month+"月"+day+"日"+ hour+":"+min+":"+sec);
    }
}
