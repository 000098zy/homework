package L2;

public class Money {
    private int sumnum;//以抢个数
    private int num;//红包总数
    private int money;//单个红包钱数
    private String name;

    public Money(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Money(int num, int money) {
        this.money = money;
        this.num = num;
    }

    public void getBag(String name) {
        if (sumnum < num)

        {
            System.out.println("  " + name + "抢了" + money + "元");
            sumnum++;
        }

    }

    public static void main(String[] args) {
        Money id = new Money(3, 1);
        Money[] m = {new Money("liji 1"), new Money("里脊2"), new Money("李吉"), new Money("李吉学长"), new Money("里脊女神")};
        System.out.println("共" + id.num * id.money + "元" + " " + id.num + "个");
        for (int i = 0; i < m.length; i++) {
            id.getBag(m[i].name);

        }
    }
}
