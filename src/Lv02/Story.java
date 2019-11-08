package Lv02;

import java.util.Scanner;

public class Story {
    public static void main(String[] args){
        Animals rabbit = new Rabbit("傲娇的兔子",5);
        Animals tortoise = new Tortoise("踏实的乌龟",200);
        Rabbit rabbit1 = (Rabbit) rabbit;
        Tortoise tortoise1 = (Tortoise)tortoise;
        System.out.println("一天"+rabbit1.getName()+"看见"+tortoise1.getName()+tortoise.walk());
        System.out.print(rabbit1.getName()+"想着嘲讽"+tortoise1.getName());
        rabbit.think("这个憨批龟爬的好慢，太菜了!");
        rabbit.speak(tortoise1.getName()+"不如我们来一场跑步比赛吧，看看我们谁先到达终点");
        rabbit.think("这个憨批龟肯定是跑不过我的，它要是敢接受我就让它颜面尽失。");
        tortoise.speak("那好吧");
        System.out.println("他们开始了比赛-----------------------------------------------");
        tortoise.walk();
        rabbit.walk();
        System.out.println("比赛进行了几个小时--------------------------------------------");
        rabbit.think("那个憨批龟应该追不上来了吧，我还可以先睡一觉，等我睡醒了它还不会到这么远的地方。");
        System.out.println(rabbit.sleep());
        System.out.println("时间滴答滴答的过去了,"+tortoise1.getName()+"已经到了兔子睡觉的地方。");
        System.out.println("此时你选择改变故事的剧情，你可以叫醒兔子。如果你想要叫醒兔子请输入1（有且仅有输入1才有效）：");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        Put i2 = new Put();
        try{
            i2.put(s1);
            System.out.println("你没有叫醒兔子。");
        }catch(CanNotChangeException e){
            System.out.println("然而你并不能改变故事的结局。");
            System.out.println(rabbit.sleep());
        }
        tortoise.walk();
        System.out.println(tortoise1.getName()+"快要抵达终点。这个时候如果你叫醒兔子任然可以改变结局。");
        System.out.println("如果你想要叫醒兔子请输入1（有且仅有输入1才有效）：");
        String s2 = input.next();
        try{
            i2.put(s2);
            System.out.println("你没有叫醒兔子。");
        }catch(CanNotChangeException e){
            System.out.println("然而你并不能改变故事的结局。");
            System.out.println(rabbit.sleep());
        }
        System.out.println(tortoise1.getName()+"抵达终点！");
        System.out.println(tortoise1.getName()+"获胜！！！");
    }
}
