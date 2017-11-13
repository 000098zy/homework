package L2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Redpacket {
    private String name;
    private int sumnum = 0;//已抢的红包数
    private int num = 0;//红包总数
    private double maxLucky = 0;//手气最佳的钱数
    private String maxLuckyPerson = "";//运气王
    double money;//红包钱数
    private List<Double> array = new ArrayList<>();//红包随机分配的list

    public Redpacket(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Redpacket(int num, double money) {
        this.num = num;
        this.money = money;
        Random r = new Random();
        double sum = 0;
        for (int i = 0; i < num; i++) {
            array.add(r.nextDouble() * money + 0.01 * num * money);//经过小小的计算，这样使最小的钱尽量接近0.01；num越大，此计算越没有用
            sum += array.get(i);
        }
        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i) / sum * money);
        }
        Collections.sort(array);
        //double z=1.0*money;
        for (int i = 0; i < array.size(); i++) {//将钱进行分配；
            if (array.get(i) <= 0.01) {//不足0.01的直接给0.01；
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
            }
        }
    }


    public static void main(String[] args) {
        Command lb = new Command(6, 10.0);
        Redpacket[] red = {new Redpacket("站长"), new Redpacket("郑大佬"), new Redpacket("李吉"),
                new Redpacket("里脊学姐"), new Redpacket("徐大佬"), new Redpacket("菜鸡"), new Redpacket("李展")
        };
        System.out.println("共" + lb.money + "元" + "   " + lb.num + "个");
        for (int i = 0; i < red.length; i++) {
            Random r = new Random();
            lb.getBag(red[i].name);
            try {
                Thread.sleep(r.nextInt(3000));//模拟抢红包的过程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}