package L2;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>ProjectInfo:  XXX项目 </p>
 * <p>Description: *****</p>
 * <p>Create Date: 2017/11/8   15:43</p>
 * <p>Copyright  :ljw</p>
 *
 * @author ljw(liaojianwei@inspur.com)
 * @version 1.0
 */
public class HongBao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=6;
        double money=10;
        String kouling="1";
        System.out.println("红包口令是:"+" '"+kouling+"'");
        System.out.println("请依次输入口令");
        String[] name = {
                "徐大佬", "玩淇女神", "李吉", "站长", "郑大佬", "李展", "里脊学姐", "本菜鸡"
        };
        int [] brr = new int [30];int b=0;
        HB hb = new HB(num,money,kouling);
        double [] arr = new double[num];
        boolean [] flag = new boolean[name.length];
        arr = hb.aver(num,money);
        int i = 0,j=num;
        while (true){

            //徐大佬
            if(flag[0]==false) {
                System.out.println(name[0] + ":");
                String s1 = sc.next();
                if (s1.equals(kouling)) {
                    flag[0] = true;brr[b++]=1;
                    System.out.println(name[0] + "抢了" + arr[i] + "元钱");
                    i++;
                    if (i == j) {
                        break;
                    }
                } else {
                    brr[b++]=0;
                    System.out.println(name[0] + "输入错误");
                }
            }else {
                brr[b++]=0;
            }

            //玩淇女神
            if(flag[1]==false) {
                System.out.println(name[1] + ":");
                String s2 = sc.next();
                if (s2.equals(kouling)) {
                    flag[1] = true;brr[b++]=1;
                    System.out.println(name[1] + "抢了" + arr[i] + "元钱");
                    i++;
                    if (i == j) {
                        break;
                    }
                } else {
                    brr[b++]=0;
                    System.out.println(name[1] + "输入错误");
                }
            }else {
                brr[b++]=0;
            }

            //李吉
            if(flag[2]==false) {
                System.out.println(name[2] + ":");
                String s3 = sc.next();
                if (s3.equals(kouling)) {
                    flag[2] = true;brr[b++]=1;
                    System.out.println(name[2] + "抢了" + arr[i] + "元钱");
                    i++;
                    if (i == j) {
                        break;
                    }
                } else {
                    brr[b++]=0;
                    System.out.println(name[2] + "输入错误");
                }
            }else {
                brr[b++]=0;
            }

            //站长
            if(flag[3]==false) {
                System.out.println(name[3] + ":");
                String s4 = sc.next();
                if (s4.equals(kouling)) {
                    flag[3] = true;brr[b++]=1;
                    System.out.println(name[3] + "抢了" + arr[i] + "元钱");
                    i++;
                    if (i == j) {
                        break;
                    }
                } else {
                    brr[b++]=0;
                    System.out.println(name[3] + "输入错误");
                }
            }else {
                brr[b++]=0;
            }

            //郑大佬
            if(flag[4]==false) {
                System.out.println(name[4] + ":");
                String s5 = sc.next();
                if (s5.equals(kouling)) {
                    flag[4] = true;brr[b++]=1;
                    System.out.println(name[4] + "抢了" + arr[i] + "元钱");
                    i++;
                    if (i == j) {
                        break;
                    }
                } else {
                    brr[b++]=0;
                    System.out.println(name[4] + "输入错误");
                }
            }else {
                brr[b++]=0;
            }

            //李展
            if(flag[5]==false) {
                System.out.println(name[5] + ":");
                String s6 = sc.next();
                if (s6.equals(kouling)) {
                    flag[5] = true;brr[b++]=1;
                    System.out.println(name[5] + "抢了" + arr[i] + "元钱");
                    i++;
                    if (i == j) {
                        break;
                    }
                } else {
                    brr[b++]=0;
                    System.out.println(name[5] + "输入错误");
                }
            }else {
                brr[b++]=0;
            }

            //里脊学姐
            if(flag[6]==false) {
                System.out.println(name[6] + ":");
                String s7 = sc.next();
                if (s7.equals(kouling)) {
                    flag[6] = true;brr[b++]=1;
                    System.out.println(name[6] + "抢了" + arr[i] + "元钱");
                    i++;
                    if (i == j) {
                        break;
                    }
                } else {
                    brr[b++]=0;
                    System.out.println(name[6] + "输入错误");
                }
            }else {
                brr[b++]=0;
            }

            //本菜鸡
            if(flag[7]==false) {
                System.out.println(name[7] + ":");
                String s8 = sc.next();
                if (s8.equals(kouling)) {
                    flag[7] = true;brr[b++]=1;
                    System.out.println(name[7] + "抢了" + arr[i] + "元钱");
                    i++;
                    if (i == j) {
                        break;
                    }
                } else {
                    brr[b++]=0;
                    System.out.println(name[7] + "输入错误");
                }
            }else {
                brr[b++]=0;
            }

        }
        double js=0;
        int max=0;
        int ren=0;
        for(int a = 0; a < arr.length; a++){
            if(arr[a] > js){
                js=arr[a];
                max=a;
            }
        }
        for(int a = 0; a < brr.length; a++){
            int c = -1;
            if(brr[a]==1){
                c++;
                if (c == max){
                    ren = a;
                    break;
                }

            }
        }
        int q =ren%8;
        System.out.println("本次的运气王是"+name[q]+"共抢到"+arr[max]+"元");
    }

}
class HB{
    int num;
    double money;
    String kouling;
    Random r = new Random(25);
    double [] arr= new double[num];
    public HB(int num,double money,String kouling){
        this.num=num;
        this.money=money;
        this.kouling=kouling;
    }

    public double[] aver(int num,double money){
        int j = num;
        double k = 0.01*num;
        double [] arr = new double[num];
        for (int i = 0; i < num; i++){
            arr[i]=r.nextDouble()*(money-k)+0.01;
            money-=arr[i];
            java.text.DecimalFormat df = new  java.text.DecimalFormat("#.00");
            df.format(arr[i]);
        }


        return arr;
    }


}

