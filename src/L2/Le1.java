package L2;

class Human {
    private String name;
    private int age;
    private  String sex;


    public String getSex() {return
         sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String m) {
        name = m;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a >= 0 && a <= 150) {
            age = a;
        }
    }



    public Human(String name, int age,String sex) {
        this.setName(name);
        this.setAge(age);
        this.sex=sex;
    }

    public void Introduce() {
        System.out.println("姓名;" + getName() + ",年龄:" + getAge() + " 性别:" +getSex());
    }
}

public class Le1 {
    public static void main(String[] args) {
        Human mi = new Human("周媛", 19,"女");
        mi.Introduce();
    }
}
class Test{
    public static void main(String[] args) {
        Human sut1 = new Human("李吉",18,"男");
        Human sut2 = new Human("李展",18,"男");
        Human sut3 = new Human("蒋天星站长",18,"男");
        Human sut4 = new Human("郑大佬",18,"男");
        Human sut5= new Human("徐大佬",18,"男");
        Human sut6 = new Human("姜子来",18,"男");
        sut1.Introduce();
        sut2.Introduce();
        sut3.Introduce();
        sut4.Introduce();
        sut5.Introduce();
        sut6.Introduce();
    }
}

