package L2;

import java.math.BigDecimal;
import java.util.*;


public class Command {
    private String name;
    static String k = "1";
    private int sumnum = 0;//已抢的红包数
    int  num = 0;//红包总数
    private double maxLucky = 0;//手气最佳的钱数
    private String maxLuckyPerson = "";//运气王
    double money;// e double money;//红包钱数
    private List<Double> array = new ArrayList<>();//红包随机分配的list

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Command(int num, double money) {
        this.num = num;
        this.money = money;
        Random r = new Random();
        double sum = 0;
        for (int i = 0; i < num; i++) {
            array.add(r.nextDouble() * money + 0.01 * num * money);
            sum += array.get(i);
        }
        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i) / sum * money);
        }
        Collections.sort(array);
        //double z=1.0*money;
        for (int i = 0; i < array.size(); i++) {//将钱进行分配；
            if (array.get(i) <= 0.01) {
                //z-=0.01;
                array.set(i, 0.01);
            } else if (i == array.size() - 1) {
                //array.set(i, (int)(z*100)*1.0/100);//将剩余的一点money给最后一个人，因为排序，最后一个人最大份，所以最后分配的肯定是正数
                BigDecimal he = new BigDecimal("0");
                for (int j = 0; j < array.size() - 1; j++) {
                    BigDecimal b = new BigDecimal(Double.toString(array.get(j)));
                    he = he.add(b);
                }
                BigDecimal moneyb = new BigDecimal(Double.toString(money));
                array.set(i, moneyb.subtract(he).doubleValue());
                maxLucky = Math.max(array.get(i), array.get(i - 1));
            } else {
                array.set(i, (int) (array.get(i) * 100) * 1.0 / 100);
                //z-=array.get(i);
            }
        }

//      for(Double a:array){
//          System.out.println(a);
//      }
//      System.out.println(array.contains(0.02));
    }

    public void getBag(String name) {

        if (sumnum < num) {

            if (array.get(sumnum) == maxLucky) {
                maxLuckyPerson = name;
            }
            System.out.println("  " + name + "抢了" + array.get(sumnum) + "元");
            sumnum++;
        } else {
            System.out.println("  红包已被抢完" + '\n' + "     运气王是" + maxLuckyPerson + " 抢了" + maxLucky + "元");
        }
    }

    public static void main(String[] args) {
        System.out.println("口令是：1");
        Scanner s = new Scanner(System.in);
        System.out.println("请输入口令");

        while (true) {
            String line = s.nextLine();
            if (line.equals(k)) {

                Command lb = new Command(6, 10.0);
                Command[] com = {new Command("徐大佬"), new Command("琬淇女神"), new Command("菜鸡"),
                        new Command("站长"), new Command("李吉"), new Command("郑大佬"), new Command("里脊学姐"),
                        new Command("李展")
                };
                System.out.println("共" + lb.money + "元" + "   " + lb.num + "个");
                for (int i = 0; i < com.length; i++) {
                    lb.getBag(com[i].name);
                    Random r = new Random();
                    try {
                        Thread.sleep(r.nextInt(3000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            } else {
                System.out.println("口令错误");
            }
        }
    }
}